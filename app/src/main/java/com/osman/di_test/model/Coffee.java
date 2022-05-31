package com.osman.di_test.model;

import android.util.Log;

import com.osman.di_test.di.scope.ActivityScope;
import com.osman.di_test.di.qualifiers.Milk;
import com.osman.di_test.di.qualifiers.Sugar;

import javax.inject.Inject;

@ActivityScope
public class Coffee {
    private static final String TAG = "Coffee";
    @Inject
    public Farm farm;
    public River river;
    int sugar;
    int milk;

    @Inject
    public Coffee(River river, @Sugar int sugar, @Milk int milk) {
        this.river = river;
        this.sugar = sugar;
        this.milk = milk;
    }

    @Inject
    public void connectElectricity() {
        Log.e(TAG, " Mahmoud connectElectricity: connecting...");
    }

    public String getCoffeeCup() {
        return farm.getBeans() + " + " + river.getWater() + "sugar: " + sugar + "  milk: " + milk;
    }
}
