package com.osman.di_test;

import com.osman.di_test.model.Coffee;
import com.osman.di_test.module.CoffeeModule;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = CoffeeModule.class)
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder sugar(@Sugar int sugar);

        @BindsInstance
        Builder milk(@Milk int milk);

        CoffeeComponent build();
    }
}
