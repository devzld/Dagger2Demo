package com.zld.dagger2demo;

import com.zld.dagger2demo.base.IBaseView;

/**
 * Created by lingdong on 2018/1/2.
 */

public interface ILoginView extends IBaseView {

    void onLoginSuccess(String msg);
    void showMsg(String msg);
}
