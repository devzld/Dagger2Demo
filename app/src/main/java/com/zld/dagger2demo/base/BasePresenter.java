package com.zld.dagger2demo.base;

/**
 * Created by lingdong on 2018/1/3.
 */

public class BasePresenter<T extends IBaseView> implements IBasePresenter<T> {

    protected T mView;

    @Override
    public void attachView(T view) {
        mView = view;
    }

    @Override
    public void detachView() {
        mView = null;
    }
}
