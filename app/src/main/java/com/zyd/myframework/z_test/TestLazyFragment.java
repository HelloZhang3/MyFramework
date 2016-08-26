package com.zyd.myframework.z_test;

import android.os.Bundle;

import com.zyd.myframework.R;
import com.zyd.myframework.base.BaseLazyFragment;

/**
 * 懒加载Fragment测试类
 * Created by Administrator on 2016/8/23 0023.
 */
public class TestLazyFragment extends BaseLazyFragment {


    @Override
    protected void onCreateView(Bundle savedInstanceState) {
        setOnContentView(R.layout.activity_main);

        isPrepared = true;
        lazyLoad();
    }



    @Override
    protected void lazyLoad() {
        //在调用了onCreateView后并且fragment的UI是可见的就填充数据
        //如果是要下载网络数据，不是给view填充数据之类的，就不需要isPrepared参数了
        if (!isPrepared || !isVisible) {
            return;
        }
        //填充各控件的数据
    }
}
