package com.zld.dagger2demo.di;

import com.zld.dagger2demo.MainActivity;

import dagger.Component;

/**
 * Created by lingdong on 2018/1/2.
 */
@Component(modules = LoginModule.class)
public interface LoginComponent {

    public void inject(MainActivity activity);
}
