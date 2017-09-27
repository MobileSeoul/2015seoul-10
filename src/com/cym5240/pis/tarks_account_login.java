//This is source code of favorite. Copyright?ìí. Tarks. All Rights Reserved.
package com.cym5240.pis;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.Window;
import com.cym5240.pis.connect.AsyncHttpTask;
import com.cym5240.pis.pij.global.Global;
import com.cym5240.pis.pij.global.Globalvariable;

public class tarks_account_login extends SherlockActivity {
	Button bt;
	Button bt2;
	String myId, myPWord, myTitle, mySubject;
	String myResult = null;
	EditText edit1, edit2;
	String s1, s2;
//	boolean okbutton = true;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Can use progress
		requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
		setContentView(R.layout.tarks_account);
		setSupportProgressBarIndeterminateVisibility(false);

		// define edittext
		edit1 = (EditText) findViewById(R.id.editText1);
		edit2 = (EditText) findViewById(R.id.editText2);

		bt = (Button) findViewById(R.id.button1);
		bt.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Uri uri = Uri
						.parse("https://tarks.net/index.php?mid=main&act=dispMemberFindAccount");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		});

		bt2 = (Button) findViewById(R.id.button2);
		bt2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Uri uri = Uri
						.parse("https://tarks.net/index.php?mid=main&act=dispMemberSignUpForm");
				Intent intent = new Intent(Intent.ACTION_VIEW, uri);
				startActivity(intent);
			}
		});
	}
	
	public void ConnectionError(){
		Global.ConnectionError(this);
	}

	protected Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			//Stop progressbar
			setSupportProgressBarIndeterminateVisibility(false);
			
			if (msg.what == -1) {
				ConnectionError();
				
			}

			if (msg.what == 1) {
				myResult = msg.obj.toString();
				if (myResult.matches("")) {
					// Error Login
					AlertDialog.Builder builder1 = new AlertDialog.Builder(
							tarks_account_login.this);
					builder1.setMessage(getString(R.string.error_login))
							.setPositiveButton(getString(R.string.yes), null)
							.setTitle(getString(R.string.error));
					builder1.show();
				} else {
					// Save auth key to temp

					// Intent ?Éù?Ñ±
					Intent intent = new Intent();
					// ?Éù?Ñ±?ïú Intent?óê ?ç∞?ù¥?Ñ∞ ?ûÖ?†•
					intent.putExtra("id", edit1.getText().toString());
					intent.putExtra("auth_code", myResult);
					// Í≤∞Í≥ºÍ∞? ?Ñ§?†ï(Í≤∞Í≥º ÏΩîÎìú, ?ù∏?Öê?ä∏)
					tarks_account_login.this.setResult(RESULT_OK, intent);
					// Î≥? Activity Ï¢ÖÎ£å
					finish();
				}

			}

		}
	};

	public void TarksAccountLogin() throws NoSuchAlgorithmException {
		// Set Progress
		setSupportProgressBarIndeterminateVisibility(true);

		// import EditText string

		String s1 = edit1.getText().toString();
		String s2 = edit2.getText().toString();

		// md5 password value
		String src = s2;
		String enc = Global.getMD5Hash(src);
		
	//	Log.i("password", enc);

		ArrayList<String> Paramname = new ArrayList<String>();
		Paramname.add("authcode");
		Paramname.add("id");
		Paramname.add("password");

		ArrayList<String> Paramvalue = new ArrayList<String>();
		Paramvalue.add("642979");
		Paramvalue.add(s1);
		Paramvalue.add(enc);

		new AsyncHttpTask(this, getString(R.string.server_path)
				+ "member/tarks_account_check.php", mHandler, Paramname,
				Paramvalue, null, 1,0);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Î©îÎâ¥ Î≤ÑÌäº Íµ¨ÌòÑÎ∂?Î∂?
		MenuInflater inflater = getSupportMenuInflater();
		inflater.inflate(R.menu.accept, menu);
		return true;

	}

	public boolean onOptionsItemSelected(MenuItem item) {

		if (item.getItemId()==R.id.yes) {
		 
			// Check okbutton
		if (Globalvariable.okbutton == true) {
				Globalvariable.okbutton = false;
				edit1 = (EditText) findViewById(R.id.editText1);
				s1 = edit1.getText().toString();

				// no err
				try {
					// import EditText

					// edit2 = (EditText) findViewById(R.id.editText2);
					// String s2 = edit2.getText().toString();

					if (s1.matches("")) {
						// Show type id noti
						Global.Infoalert(this,
								getString(R.string.notification),
								getString(R.string.type_id),
								getString(R.string.yes));
					} else {
						// TODO Auto-generated method stub
						TarksAccountLogin();
					}
				} catch (Exception e) {
					// Log.i("ERROR", "App has been error");
					// System.out.println();
					// Not Connected To Internet
					ConnectionError();

				}
			}
			return true;

		
		}
		
			return super.onOptionsItemSelected(item);
		
	}

}
