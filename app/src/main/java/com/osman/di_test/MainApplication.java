package com.osman.di_test;

import android.app.Application;

import com.osman.di_test.di.component.AppComponent;
import com.osman.di_test.di.component.DaggerAppComponent;

public class MainApplication extends Application {
    AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
