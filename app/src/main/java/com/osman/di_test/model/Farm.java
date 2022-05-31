package com.osman.di_test.model;

import android.util.Log;

import javax.inject.Inject;

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
