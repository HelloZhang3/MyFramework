package com.zyd.myframework.interf;

import android.net.Uri;

/**
 * Description: Fragment与Activity沟通的listener
 * Author: zyd
 * Date: 2016/8/25  09:49
 * E-mail: zhangyadong@rockmobile.com.cn
 * <p>
 * This interface must be implemented by activities that contain this
 * fragment to allow an interaction in this fragment to be communicated
 * to the activity and potentially other fragments contained in that
 * activity.
 * <p>
 * See the Android Training lesson <a href=
 * "http://developer.android.com/training/basics/fragments/communicating.html"
 * >Communicating with Other Fragments</a> for more information.
 */
public interface OnFragmentInteractionListener {

    void onFragmentInteraction(Uri uri);
}
