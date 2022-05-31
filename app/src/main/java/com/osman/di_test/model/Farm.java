package com.osman.di_test.model;

import android.util.Log;

import com.osman.di_test.di.scope.ActivityScope;

import javax.inject.Inject;

@ActivityScope
public class Farm {
    private static final String TAG = "Farm";

    @Inject
    public Farm() {
        Log.e(TAG, "Mahmoud Farm");
    }

    public String getBeans() {
        return "Beans";
    }
}
