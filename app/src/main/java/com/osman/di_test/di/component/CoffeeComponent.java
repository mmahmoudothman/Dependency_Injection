package com.osman.di_test.di.component;

import com.osman.di_test.di.scope.ActivityScope;
import com.osman.di_test.ui.MainActivity;
import com.osman.di_test.di.qualifiers.Milk;
import com.osman.di_test.di.qualifiers.Sugar;
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
