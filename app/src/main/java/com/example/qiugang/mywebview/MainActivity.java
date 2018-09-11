package com.example.qiugang.mywebview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView textView;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text);
        webView=findViewById(R.id.wv);
         //获取webSettings
        WebSettings settings = webView.getSettings();
        //让webView支持JS
        settings.setJavaScriptEnabled(true);
        //加载百度网页
        webView.loadUrl("http://www.baidu.com/");
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,TestActivityWithTheme.class));
                overridePendingTransition(R.anim.open_in, R.anim.open_out);
            }
        });
    }
}
