package com.testapp;

import android.content.Context;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
public class NestedReactView extends ReactRootView {
    public NestedReactView(Context context) {
        super(context);
    }

    @Override
    public void startReactApplication(ReactInstanceManager reactInstanceManager, String moduleName) {
        super.startReactApplication(reactInstanceManager, moduleName);
    }
}
