package com.testapp;


import androidx.annotation.Nullable;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

public class NestedReactManager extends SimpleViewManager<NestedReactViewWrapper> {
    public static final String REACT_CLASS = "RCTNestedView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public NestedReactViewWrapper createViewInstance(ThemedReactContext context) {
        return new NestedReactViewWrapper(context);
    }

    @ReactProp(name = "miniapp")
    public void setMiniapp(NestedReactViewWrapper view, @Nullable Boolean sources) {
        view.setupMiniApp();
    }
}
