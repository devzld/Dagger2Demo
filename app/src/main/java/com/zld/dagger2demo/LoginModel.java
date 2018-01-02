package com.zld.dagger2demo;


import android.os.Handler;
import android.os.Looper;

/**
 * Created by lingdong on 2018/1/2.
 */

public class LoginModel {

    private Handler mHandler;

    public LoginModel() {
        mHandler = new Handler(Looper.getMainLooper());
    }

    public void login(final String userName, final String pwd, final ILoginListener listener){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        if(userName.equals("admin")&&pwd.equals("12345")){
                            listener.loginSuccess("登录成功");
                        }else {
                            listener.loginFail("登录失败");
                        }
                    }
                });
            }
        }).start();
    }
}
