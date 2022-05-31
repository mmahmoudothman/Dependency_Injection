package com.osman.di_test.di.component;

import com.osman.di_test.model.River;
import com.osman.di_test.di.module.RiverModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = RiverModule.class)
public interface AppComponent {
    River getRiver();
}