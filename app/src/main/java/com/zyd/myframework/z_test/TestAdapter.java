package com.zyd.myframework.z_test;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

import com.zyd.myframework.base.BaseAbsAdapter;

/**
 * Description: TODO
 * Author: zyd
 * Date: 2016/8/22  10:19
 * E-mail: zhangyadong@rockmobile.com.cn
 */
public class TestAdapter extends BaseAbsAdapter {


    public TestAdapter(Context context) {
        super(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

    }
}
