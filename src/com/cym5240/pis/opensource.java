package com.cym5240.pis;


import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;

public class opensource extends SherlockActivity {  
  
    private WebView mWebView;  
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Used to put dark icons on light action bar
    	
    	getActionBar().setTitle("뒤로가기");
    	getActionBar().setDisplayShowHomeEnabled(false);
    	getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    	
    	
        boolean isLight = SampleList.THEME == R.style.Theme_Favorite;
 
        return true;
    }
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_mini_web);  
  
        mWebView = (WebView)findViewById(R.id.webView);  
        mWebView.getSettings().setJavaScriptEnabled(true);  
        mWebView.loadUrl("http://photoinjeonnam.tistory.com/3");  
        mWebView.setWebViewClient(new WebViewClientClass());  
       

    }  
  
    private class WebViewClientClass extends WebViewClient {  
        @Override  
        public boolean shouldOverrideUrlLoading(WebView view, String url) {  
            view.loadUrl(url);  
            return true;
        }  
    }  
}  
