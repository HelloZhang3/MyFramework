package com.zyd.myframework.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

/**
 * activity的基类
 * Created by Administrator on 2016/5/2 0002.
 */
public abstract class BaseActivity extends AppCompatActivity {


    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);//取消默认顶部title

        int layoutId = this.bindLayout();
        if (layoutId != 0) {

            setContentView(this.bindLayout());

            this.initView();
        }

        this.initialize();

        this.initEvent();
    }

    /**
     * 绑定布局ID
     */
    public abstract int bindLayout();

    /**
     * 初始化找到控件
     */
    public abstract void initView();

    /**
     * 初始化监听
     */
    public abstract void initEvent();


    /**
     * 初始化
     */
    public abstract void initialize();


    /**
     * activity意外销毁时保存数据
     *
     * @param outState
     * @param outPersistentState
     */
    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    /**
     * 取回activity意外销毁时保存的数据
     *
     * @param savedInstanceState
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

}
