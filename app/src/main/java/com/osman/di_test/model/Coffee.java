package com.osman.di_test.model;

import android.util.Log;

import javax.inject.Inject;

public class Coffee {
    private static final String TAG = "Coffee";
    @Inject
    public Farm farm;
    public River river;

    @Inject
    public Coffee(River river) {
        this.river = river;
    }

    @Inject
    public void connectElectricity() {
        Log.e(TAG, " Mahmoud connectElectricity: connecting...");
    }

    public String getCoffeeCup() {
        return farm.getBeans() + " + " + river.getWater();
    }
}
