package com.bokecc.ccsskt.example;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * 闪屏界面
 *
 * @author wy
 */
@SuppressLint("NonConstantResourceId")
public class SplashActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        findViewById(R.id.nullPointer).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.nullPointer:

                break;
            default:
                break;
        }
    }
}
