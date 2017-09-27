package com.cym5240.pis;

import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;


public class MiniWebActivity4 extends SherlockActivity {  
  
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
        mWebView.loadUrl("http://m.search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&ie=utf8&query=%EC%84%9C%EC%9A%B8%EC%8B%9C+%EA%B3%B5%EC%9B%90");  
        mWebView.setWebViewClient(new WebViewClientClass());  
        mWebView.scrollTo(5000,425);
        

    }  
  
    private class WebViewClientClass extends WebViewClient {  
        @Override  
        public boolean shouldOverrideUrlLoading(WebView view, String url) {  
            view.loadUrl(url);  
            return true;
        }  
    }  
    
    public boolean onKeyDown(int keyCode, KeyEvent event) {
		if ((keyCode == KeyEvent.KEYCODE_BACK) && mWebView.canGoBack()) {
			mWebView.goBack();
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}  