package com.osman.di_test.module;

import com.osman.di_test.model.River;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    @Provides
    River provideRiver() {
        return new River();
    }
}