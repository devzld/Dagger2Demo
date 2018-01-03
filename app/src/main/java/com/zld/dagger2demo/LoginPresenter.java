package com.zld.dagger2demo;

import com.zld.dagger2demo.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by lingdong on 2018/1/2.
 */

public class LoginPresenter extends BasePresenter<ILoginView> {

    private LoginModel mLoginModel;

    @Inject
    public LoginPresenter() {
        mLoginModel = new LoginModel();
    }


    public void login(String userName,String pwd){
        mLoginModel.login(userName, pwd, new ILoginListener() {
            @Override
            public void loginSuccess(String msg) {
                mView.onLoginSuccess(msg);
            }

            @Override
            public void loginFail(String msg) {
                mView.showMsg(msg);
            }
        });
    }
}
