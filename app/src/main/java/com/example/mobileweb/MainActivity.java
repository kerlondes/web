package com.example.mobileweb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private WebView web;
    private EditText Serch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onBackPressed(){
        if(web.canGoBack()) {
            web.goBack();
        }else super.onBackPressed();
    }

    public void search(View view) {
        web = (WebView)findViewById(R.id.WebView);
        Serch = (EditText)findViewById(R.id.serch);
        WebSettings ws = web.getSettings();
        ws.setJavaScriptEnabled(true);
        web.loadUrl("https://www.google.com/search?q="+Serch.getText());
        web.setWebViewClient(new WebViewClient());
    }

    public void onBack(View view) {
        if(web.canGoBack()) {
            web.goBack();
        }else super.onBackPressed();
    }
}