//This is source code of favorite. Copyright?. Tarks. All Rights Reserved.
package com.cym5240.pis;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;

public class info extends SherlockActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
      //?‘?λ°λ°±λ²νΌκ°?? Έ?€κΈ?
        getSupportActionBar().setDisplayHomeAsUpEnabled(true); 
       
    }
      //λΉ½λ°±?€ ??¨?‘?λ°?
 	   @Override
 	    public boolean onOptionsItemSelected(MenuItem item) {
 	    switch (item.getItemId()) {
 	        case android.R.id.home:
 	            onBackPressed();
 	            return true;
 	        default:
 	            return super.onOptionsItemSelected(item);
 	    }
 	    
 	    
 	   }
    
}
