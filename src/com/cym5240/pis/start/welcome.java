//This is source code of favorite. Copyright?. Tarks. All Rights Reserved.
package com.cym5240.pis.start;

import java.text.NumberFormat;
import java.util.StringTokenizer;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockActivity;
import com.cym5240.pis.R;
import com.cym5240.pis.pij.global.Globalvariable;




public class welcome extends SherlockActivity {
	Button bt;
    String myId, myResult;
	Message msg;
	String ToonDataList;
	
//	 private class Downloader extends AsyncTask<String, Void, Bitmap> {
//
//			protected Bitmap doInBackground(String... param) {
//				// TODO Auto-generated method stub
//				  //Error Login
//				
//				return downloadBitmap(myId);
//			}
//
//			@Override
//			protected void onPreExecute() {
//				Log.i("Async-Example", "onPreExecute Called");
//
//			}
//
//			protected void onPostExecute(Bitmap result) {
//				Log.i("Async-Example", "onPostExecute Called");
//				
//				
//				msg = Message.obtain();
//				msg.what = 0;
//				mHandler.sendMessage(msg);
//				
//			}
//
//			private Bitmap downloadBitmap(String url ) {
//				try {
//
//
//	    			
//	    				// --------------------------
//	    				// URL ?€? ?κ³? ? ??κΈ?
//	    				// --------------------------
//	    				URL url1 = new URL(
//	    						getString(R.string.server_path) + "statistics.php"); // URL
//	    																				// ?€? 
//	    				HttpURLConnection http = (HttpURLConnection) url1
//	    						.openConnection(); // ? ?
//	    				// --------------------------
//	    				// ? ?‘ λͺ¨λ ?€?  - κΈ°λ³Έ? ?Έ ?€? ?΄?€
//	    				// --------------------------
//	    				http.setDefaultUseCaches(false);
//	    				http.setDoInput(true); // ?λ²μ? ?½κΈ? λͺ¨λ μ§?? 
//	    				http.setDoOutput(true); // ?λ²λ‘ ?°κΈ? λͺ¨λ μ§?? 
//	    				http.setRequestMethod("POST"); // ? ?‘ λ°©μ?? POST
//
//	    				// ?λ²μκ²? ?Ή?? <Form>?Όλ‘? κ°μ΄ ??΄?¨ κ²κ³Ό κ°μ? λ°©μ?Όλ‘? μ²λ¦¬??Ό? κ±? ?? €μ€??€
//	    				http.setRequestProperty("content-type",
//	    						"application/x-www-form-urlencoded");
//	    				// --------------------------
//	    				// ?λ²λ‘ κ°? ? ?‘
//	    				// --------------------------
//	    				StringBuffer buffer = new StringBuffer();
//	    				buffer.append("authcode").append("=").append("642979");
//
//	    				OutputStreamWriter outStream = new OutputStreamWriter(
//	    						http.getOutputStream(), "EUC-KR");
//	    				PrintWriter writer = new PrintWriter(outStream);
//	    				writer.write(buffer.toString());
//	    				writer.flush();
//	    				// --------------------------
//	    				// ?λ²μ? ? ?‘λ°κΈ°
//	    				// --------------------------
//	    				 InputStreamReader tmp = new InputStreamReader(http.getInputStream(), "EUC-KR");  
//	    	              BufferedReader reader = new BufferedReader(tmp); 
//	    	              StringBuilder builder = new StringBuilder(); 
//	    	              String str; 
//	    	              
//	    	              while ((str = reader.readLine()) != null) {       // ?λ²μ? ?Ό?Έ?¨?λ‘? λ³΄λ΄μ€? κ²μ΄λ―?λ‘? ?Ό?Έ?¨?λ‘? ?½??€ 
//	    	                   builder.append(str);  //κ΅¬λΆ? μΆκ? ??¨
//	    	                  // builder.append(str + "\n"); 
//	    	                   // View? ???κΈ? ??΄ ?Ό?Έ κ΅¬λΆ? μΆκ? 
//	    	              } 
//	    	              myResult = builder.toString();                       // ? ?‘κ²°κ³Όλ₯? ? ?­ λ³??? ???₯
//	    	//	Log.i("dfd", myResult);
//	    			} catch (MalformedURLException e) { 
//	    	                // 
//	    	         } catch (IOException e) { 
//	    	                //  
//	    	         }
//
//				return null;
//			}
//
//	    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
       // Global.getCountryValue();

	
	
        //Let's Start!
    	bt = (Button) findViewById(R.id.button1);
		bt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(welcome.this, join.class); 
				startActivity(intent);
				finish();
			}
		});
   
    }
    

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == 1) {
			if (resultCode == Activity.RESULT_OK) {
		     	  //Save auth key to temp
		           //Setting Editor
				Globalvariable.temp_id = data.getStringExtra("id");
				Globalvariable.temp_id_auth = data.getStringExtra("auth_code");
//		 			SharedPreferences edit = getSharedPreferences("temp",
//		 					MODE_PRIVATE);
//		 			SharedPreferences.Editor editor = edit.edit();
//		 			editor.putString("temp_id",  data.getStringExtra("id"));			
//		 			editor.putString("temp_id_auth",  data.getStringExtra("auth_code"));			
//		 			editor.commit();
		 			
		 			Intent intent = new Intent(welcome.this, join.class); 
					startActivity(intent);
					finish();
					
					
			}
		}
		
		
	}

    
 
	protected Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			if (msg.what == 0) {
				// Cut Result Value
				StringTokenizer st = new StringTokenizer(myResult, "/LINE/.");
				int users = Integer.parseInt(st.nextToken());
				int check = Integer.parseInt(st.nextToken());
				int request = Integer.parseInt(st.nextToken());
				int message = Integer.parseInt(st.nextToken());
				//number cut
				NumberFormat nf = NumberFormat.getInstance();
				//  nf.setMaximumIntegerDigits(5); //μ΅λ?? μ§?? 
				 String users_result = nf.format(users);
				 String request_result = nf.format(request);
				//make value
				Resources res = getResources();
		//		String value = String.format(res.getString(R.string.statistics_des), users_result, request_result); 
			//setText
				
				TextView text = (TextView) findViewById(R.id.textView1);
		//		text.setText(value);
				return;
			}
			
			
			if (msg.what == 1) {
				Log.i("Success", "Congratulation you can sleep keke");
				Log.i("Success", msg.obj.toString());
			}
			
		}
	};
	
    
    	
    }
    

