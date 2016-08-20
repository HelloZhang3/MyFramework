package com.zyd.myframework;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Handler postHandler = new Handler();

    private Handler sendHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            if (msg.what == 1) {

                // do sth
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        //-------------sendMessage---------------
                        Message message = new Message();
                        message.what = 1;
                        sendHandler.sendMessage(message);
                        //发送空消息
                        //sendHandler.sendEmptyMessage(1);


                        //--------------post----------------------
                        postHandler.post(new Runnable() {
                            @Override
                            public void run() {
                                //do sth
                            }
                        });

//                        //延迟2s
//                        postHandler.postDelayed(new Runnable() {
//                            @Override
//                            public void run() {
//
//                            }
//                        },2000);
                    }
                }

        ).start();


    }

    /**
     * 自定义Looper线程
     */
    public class LooperThread extends Thread {
        @Override
        public void run() {
            // 将当前线程初始化为Looper线程
            Looper.prepare();

            // ...其他处理，如实例化handler

            // 开始循环处理消息队列
            Looper.loop();
        }
    }

}
