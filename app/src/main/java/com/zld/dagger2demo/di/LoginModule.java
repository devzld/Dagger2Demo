package com.zld.dagger2demo.di;

import com.zld.dagger2demo.ILoginView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by lingdong on 2018/1/2.
 */
@Module
public class LoginModule {

    private ILoginView view;

    public LoginModule(ILoginView view) {
        this.view = view;
    }

    @Provides
    ILoginView provideILoginView(){
        return view;
    }
}
