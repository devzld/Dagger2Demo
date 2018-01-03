package com.zld.dagger2demo.base;

/**
 * Created by lingdong on 2018/1/2.
 */

public interface IBasePresenter<T extends IBaseView> {

    void attachView(T view);

    void detachView();

}
