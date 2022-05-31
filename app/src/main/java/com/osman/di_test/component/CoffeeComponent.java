package com.osman.di_test.component;

import com.osman.di_test.ActivityScope;
import com.osman.di_test.MainActivity;
import com.osman.di_test.Milk;
import com.osman.di_test.Sugar;
import com.osman.di_test.model.Coffee;

import dagger.BindsInstance;
import dagger.Component;

@ActivityScope
@Component(dependencies = AppComponent.class)
public interface CoffeeComponent {
    Coffee getCoffee();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder sugar(@Sugar int sugar);

        @BindsInstance
        Builder milk(@Milk int milk);

        Builder appComponent(AppComponent appComponent);

        CoffeeComponent build();
    }
}
