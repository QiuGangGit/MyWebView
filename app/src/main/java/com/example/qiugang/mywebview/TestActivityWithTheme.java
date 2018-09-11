package com.example.qiugang.mywebview;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by qiustart on 2018/6/28.
 */
public class TestActivityWithTheme extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mains);

    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.close_in, R.anim.close_out);
    }
}
