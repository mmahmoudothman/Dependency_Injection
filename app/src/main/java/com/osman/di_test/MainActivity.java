package com.osman.di_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.osman.di_test.model.Coffee;
import com.osman.di_test.model.Farm;
import com.osman.di_test.model.River;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeComponent component = DaggerCoffeeComponent.create();
        component.getCoffee();
    }
}