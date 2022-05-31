package com.osman.di_test.module;

import com.osman.di_test.model.River;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    @Singleton
    @Provides
    River provideRiver() {
        return new River();
    }
}