package com.testapp;

import android.app.Activity;
import android.widget.FrameLayout;

import com.facebook.react.PackageList;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.uimanager.ThemedReactContext;

import java.util.List;

public class NestedReactViewWrapper extends FrameLayout {
    ThemedReactContext mContext;
    ReactInstanceManager manager;

    NestedReactViewWrapper(ThemedReactContext context) {
        super(context);
        mContext = context;
        Activity activity = context.getCurrentActivity();
        MainApplication application = (MainApplication)activity.getApplication();
        List<ReactPackage> packages = new PackageList(application).getPackages();
        manager = ReactInstanceManager.builder()
                .setApplication(application)
                .setCurrentActivity(activity)
                .setJSBundleFile("assets://hermes_main.jsbundle") // hermes bytecode
//                .setJSBundleFile("assets://main.jsbundle") // minified js
//                .setJSBundleFile("assets://test.js") // console log
                .setJSMainModulePath("index")
                .addPackages(packages)
                .setInitialLifecycleState(LifecycleState.BEFORE_CREATE)
                .build();
    }

    public void setupMiniApp() {
        Activity activity = mContext.getCurrentActivity();
        NestedReactView miniApp = new NestedReactView(activity);
        this.addView(miniApp);
        miniApp.startReactApplication(manager, "MiniApp");
    }
}
