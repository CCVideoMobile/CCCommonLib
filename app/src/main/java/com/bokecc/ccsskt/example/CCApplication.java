package com.bokecc.ccsskt.example;

import androidx.multidex.MultiDexApplication;

import com.bokecc.common.application.ApplicationData;

/**
 * Application
 */
public class CCApplication extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        //公共库初始化
        ApplicationData.getInstance().init(this,true);
    }

    /**
     * 程序终止的时候执行
     */
    @Override
    public void onTerminate() {
        super.onTerminate();
        ApplicationData.getInstance().onTerminate();
    }

}
