package com.zld.dagger2demo.di;

import com.zld.dagger2demo.LoginActivity;

import dagger.Component;

/**
 * Created by lingdong on 2018/1/2.
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {


    public void inject(LoginActivity activity);

}
