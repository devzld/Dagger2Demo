package com.zld.dagger2demo;

/**
 * Created by lingdong on 2018/1/2.
 */

public interface ILoginListener {
    void loginSuccess(String msg);
    void loginFail(String msg);
}
