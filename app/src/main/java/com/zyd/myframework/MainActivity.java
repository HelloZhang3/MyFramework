package com.zyd.myframework;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

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
                        //sendMessage
                        sendHandler.sendEmptyMessage(1);

                        //post
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

}
