package com.osman.di_test.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.osman.di_test.MainApplication;
import com.osman.di_test.R;
import com.osman.di_test.di.component.AppComponent;
import com.osman.di_test.di.component.CoffeeComponent;
import com.osman.di_test.model.Coffee;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Inject
    Coffee coffee, coffee2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppComponent component = ((MainApplication) getApplication()).getAppComponent();
        CoffeeComponent coffeeComponent = component.getCoffeeComponentBuilder().sugar(2).milk(5).build();
        coffeeComponent.inject(this);
        Log.e(TAG + " Mahmoud ",
                "\n coffee: " + coffee
                        + "\n coffee: " + coffee2 + "\nfarm for coffee1: : " + coffee.river + "\nfarm for coffee1: : " + coffee2.river);
    }
}