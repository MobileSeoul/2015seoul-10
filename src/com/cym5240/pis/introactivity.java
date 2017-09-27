package com.cym5240.pis;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.actionbarsherlock.app.SherlockActivity;


public class introactivity extends SherlockActivity {

	/* 스플레시 이미지 출력 */
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.splash2);
	
	/*지연 쓰레드와 함께 메인메뉴 표시 */
	
	new Handler().postDelayed(new Thread(){
		@Override
		public void run(){
			Intent Mainmenu = new Intent(introactivity.this,MainActivity.class);
			introactivity.this.startActivity(Mainmenu);
			introactivity.this.finish();
			
			
			
		}
	}, 3000);
	
	
	
	}
	 public void onBackPressed()
	    {
	     finish(); 
	     }
}

