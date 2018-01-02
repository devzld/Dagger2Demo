package com.zld.dagger2demo;

import javax.inject.Inject;

/**
 * Created by lingdong on 2018/1/2.
 */

public class LoginPresenter {

    private ILoginView mLoginView;
    private LoginModel mLoginModel;

    @Inject
    public LoginPresenter(ILoginView mLoginView) {
        this.mLoginView = mLoginView;
        mLoginModel = new LoginModel();
    }

    public void login(String userName,String pwd){
        mLoginModel.login(userName, pwd, new ILoginListener() {
            @Override
            public void loginSuccess(String msg) {
                mLoginView.onLoginSuccess(msg);
            }

            @Override
            public void loginFail(String msg) {
                mLoginView.showMsg(msg);
            }
        });
    }
}
