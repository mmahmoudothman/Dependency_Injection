package com.osman.di_test;

import com.osman.di_test.model.Coffee;

import dagger.Component;

@Component
public interface CoffeeComponent {
    Coffee getCoffee();
}
