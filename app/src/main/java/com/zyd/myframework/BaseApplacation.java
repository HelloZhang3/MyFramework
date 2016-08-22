package com.zyd.myframework;

import android.app.Application;

/**
 * Created by Administrator on 2016/5/1 0001.
 */
public class BaseApplacation extends Application {

    private static BaseApplacation instance = null;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    /**
     * 得到BaseApplacation的实例
     *
     * @return
     */
    public static BaseApplacation getInstance() {
        return instance;
    }

}
