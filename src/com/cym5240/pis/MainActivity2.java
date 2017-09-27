//This is source code of favorite. Copyright?ìí. Tarks. All Rights Reserved.
package com.cym5240.pis;

import java.lang.reflect.Field;
import java.util.ArrayList;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.ViewConfiguration;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockActivity;
import com.cym5240.pis.connect.AsyncHttpTask;
import com.cym5240.pis.connect.ImageDownloader;
import com.cym5240.pis.pij.global.Global;
import com.cym5240.pis.start.welcome;

public class MainActivity2 extends SherlockActivity {
	// ?Üµ?ã† ?ä§?ä∏Îß?

	String sVersion; // ?õπ?éò?ù¥Ïß??óê?Ñú Í∞??†∏?ò® Î≤ÑÏ†º?ù¥ ???û•?ê®
	String myId, myPWord, myTitle, mySubject, myResult;
	String infoResult;
	String REGid;
	// Notice Result
	String NoticeResult;
	String user_srl;
	// Allow Load
	boolean load = true;
	boolean updated = false;

	// Connect timeout boolean
	boolean ConnectTimeout = true;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		try {
	        ViewConfiguration config = ViewConfiguration.get(this);
	        Field menuKeyField = ViewConfiguration.class.getDeclaredField("sHasPermanentMenuKey");
	        if(menuKeyField != null) {
	            menuKeyField.setAccessible(true);
	            menuKeyField.setBoolean(config, false);
	        }
	    } catch (Exception ex) {
	        // Ignore
	    }

		


		
		// ?ûê?ã†?ùò ?ã†Î∂? ?Ñ§?†ïÍ∞íÏùÑ Î∂àÎü¨?òµ?ãà?ã§.
		SharedPreferences prefs = getSharedPreferences("setting", MODE_PRIVATE);
		String frist_use = prefs.getString("frist_use_app", "true");

		ConnectTimeout();

		// Check Network Connection
		try {

			// Log.d("==============", regId);
			REGid = Global.GCMReg();
			// Let's Call Information
			// Connection Start
			// Ï≤òÏùå ?Ç¨?ö©?ûêÍ∞? ?ïÑ?ãê?ãú?óê
			if (frist_use.matches("true")) {
				// ?ù¥?èô?ïú?ã§. ?ôò?òÅ?ï©?ãà?ã§Î°?.
				BreakTimeout();
				Intent intent = new Intent(MainActivity2.this, welcome.class);
				startActivity(intent);
				finish();
			} else {
				// First Notice Download
				InfoDown();

			}

		} catch (Exception e) {
			// If No Network Connection
			// Î°úÎî© ?ôîÎ©¥Ï? Ï¢ÖÎ£å?ïò?ùº.
			finish();
			// ?ù¥?èô?ïú?ã§. Î©îÏù∏?úºÎ°?
			Intent intent = new Intent(MainActivity2.this, main2.class);
			startActivity(intent);

		}

	}

	public void InfoDown() {

		// get user_srl
		// ?Ñ§?†ï Í∞? Î∂àÎü¨?ò§Í∏?
		// SharedPreferences prefs = getSharedPreferences("setting",
		// MODE_PRIVATE);
		user_srl = Global.getSetting("user_srl", "");
		String user_srl_auth = Global.getSetting("user_srl_auth", "");

		ArrayList<String> Paramname = new ArrayList<String>();
		Paramname.add("authcode");
		Paramname.add("lang");
		Paramname.add("user_srl");
		Paramname.add("user_srl_auth");
		Paramname.add("member_info");

		ArrayList<String> Paramvalue = new ArrayList<String>();
		Paramvalue.add("642979");
		Paramvalue.add(getString(R.string.lang));
		Paramvalue.add(user_srl);
		Paramvalue.add(user_srl_auth);
		Paramvalue
				.add("tarks_account//name_1//name_2//permission//profile_pic//profile_update//reg_id//key//like_me//favorite");

		new AsyncHttpTask(this, getString(R.string.server_path) + "load.php",
				mHandler, Paramname, Paramvalue, null, 1,0);

	}

	public void ConnectTimeout() {
		new Thread(new Runnable() {
			public void run() {
				int time = 0;
				while (true) {

					try {
						// 15 seconds
						if (time != 14) {
							Thread.sleep(1000);
							time = time + 1;
							Log.i("Timeout", time + "load");
							if (ConnectTimeout == false) {
								break;
							}
						} else {
							if (this != null) {
								Message msg = mHandler.obtainMessage();
								msg.arg1 = 0;
								mHandler.sendMessage(msg);
							}
							break;
						}
						// break;
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}).start();
	}

	public void BreakTimeout() {
		ConnectTimeout = false;
	}

	public void PermissionError() {
		// Alert
		AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
		builder.setMessage(getString(R.string.permission_denied)).setTitle(
				getString(R.string.error));
		builder.setPositiveButton(getString(R.string.check_service_status),
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {
						Global.Feedback(MainActivity2.this);

					}
				});
		builder.setNegativeButton(getString(R.string.yes),
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {

						finish();

					}
				});
		builder.show();

	}

	public void IPError() {
		// Alert
		AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity2.this);
		builder.setMessage(getString(R.string.ip_error_des)).setTitle(
				getString(R.string.error));
		builder.setPositiveButton(getString(R.string.enquire),
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {
						Global.Feedback(MainActivity2.this);
					}
				});
		builder.setNegativeButton(getString(R.string.yes),
				new DialogInterface.OnClickListener() {

					public void onClick(DialogInterface dialog, int which) {

						finish();

					}
				});
		builder.show();
	}

	public void ConnectionError() {
		// If No Network Connection
		// Check Internet Connection

		// Check Network Connection
		if (Global.InternetConnection(1) == true
				|| Global.InternetConnection(0) == true) {
			// Show Alert
			AlertDialog.Builder alert = new AlertDialog.Builder(
					MainActivity2.this);
			alert.setTitle(getString(R.string.error));
			alert.setMessage(getString(R.string.server_connection_error_des));
			alert.setIcon(R.drawable.ic_launcher);
			alert.setPositiveButton(getString(R.string.check_service_status),
					new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface dialog, int which) {

							Uri uri = Uri
									.parse("https://sites.google.com/site/tarksservicesstatus/");
							Intent it = new Intent(Intent.ACTION_VIEW, uri);
							startActivity(it);
						}
					});
			alert.setNegativeButton(getString(R.string.yes),
					new DialogInterface.OnClickListener() {

						public void onClick(DialogInterface dialog, int which) {

							finish();

						}
					});
			alert.show();

		} else {
			// Î°úÎî© ?ôîÎ©¥Ï? Ï¢ÖÎ£å?ïò?ùº.
			Toast.makeText(MainActivity2.this,
					getString(R.string.networkerrord), 0).show();
			finish();
			// ?ù¥?èô?ïú?ã§. Î©îÏù∏?úºÎ°?
			Intent intent = new Intent(MainActivity2.this, main2.class);
			startActivity(intent);
		}
	}

	public void StartApp() {
		try {
			// Global.toast(infoResult);
			// Check mySql Error
			if (infoResult.matches("db_error")) {
				load = false;
				ConnectionError();
			}
			// Check IP Error
			if (infoResult.matches("ip_error")) {
				load = false;
				IPError();
			}

			if (infoResult.startsWith("/LINE/.")) {
				// Account Changed
				// Alert
				AlertDialog.Builder alert = new AlertDialog.Builder(
						MainActivity2.this);
				alert.setTitle(getString(R.string.error));
				alert.setMessage(getString(R.string.reg_id_error));
				alert.setIcon(R.drawable.ic_launcher);
				alert.setPositiveButton(getString(R.string.yes),
						new DialogInterface.OnClickListener() {

							public void onClick(DialogInterface dialog,
									int which) {
								// Clear Old Settings
								getSharedPreferences("setting", 0).edit()
										.clear().commit();
								getSharedPreferences("temp", 0).edit().clear()
										.commit();

								// New Start
								// Î°úÎî© ?ôîÎ©¥Ï? Ï¢ÖÎ£å?ïò?ùº.
								finish();
								// ?ù¥?èô?ïú?ã§. Î©îÏù∏?úºÎ°?
								Intent intent = new Intent(MainActivity2.this,
										MainActivity2.class);
								startActivity(intent);

							}
						});
				alert.show();
			} else {

				// Check Permission Error
				if (infoResult.matches("permission_error")) {
					load = false;
					PermissionError();
				}
				// Log.i("Result value",infoResult);
				String[] array = infoResult.split("/LINE/.");
				// Global.dumpArray(array);

				String tarks_account = array[0];
				String name_1 = array[1];
				String name_2 = array[2];
				String permission = array[3];
				String profile_pic = array[4];
				String profile_update = array[5];
				String reg_id = array[6];
				String key = array[7];
				String like_me = array[8];
				String favorite = array[9];

				// if(!profile_update.matches(Global.getSetting("profile_update",
				// "") || getCacheDir().toString(), "/profile.jpg")){
				// Global.DownloadImageToFile(getString(R.string.server_path)
				// + "files/profile/" + user_srl ,
				// getCacheDir().toString(), "/profile.jpg");
				// }

				if (Global.UpdateMemberFileCache(user_srl, profile_update, profile_pic)) {
					Global.SaveUserSetting(user_srl, profile_update, null,  profile_pic);
					//Download image
					new ImageDownloader(this, getString(R.string.server_path)
							+ "files/profile/" + user_srl + ".jpg", mHandler, 2, 0);
					// Log.i("test", "Let s profile image download");

				}
				
			

				// ?Ñ§?†ï Í∞? ???û•
				// Setting Editor
				SharedPreferences edit = getSharedPreferences("setting",
						MODE_PRIVATE);
				SharedPreferences.Editor editor = edit.edit();
				editor.putString("name_1", name_1);
				editor.putString("name_2", name_2);
				editor.putString("permission", permission);
				editor.putString("profile_pic", profile_pic);
				editor.putString("profile_update", profile_update);
				editor.putString("key", key);
				editor.putString("like_me", like_me);
				editor.putString("favorite", favorite);
				
				
				//Version Check
				PackageInfo pinfo = getPackageManager().getPackageInfo(getPackageName(), 0);
				String versionNumber = String.valueOf(pinfo.versionCode);
				//Check Version
				if(!Global.getSetting("verCode", "0").matches(versionNumber)){
					updated = true;
					editor.putString("verCode", versionNumber);
					
				}
				
				//Commit
				editor.commit();

				// Kind of Load Stop


				// Reg IDÍ∞? Í∏∞Ï°¥Í≥? ?ã§Î•? ?ïå
				if (!REGid.startsWith(reg_id) && !reg_id.matches("null") && updated == false ) {
			
					load = false;
					// Alert
					AlertDialog.Builder alert = new AlertDialog.Builder(
							MainActivity2.this);
					alert.setTitle(getString(R.string.error));
					alert.setMessage(getString(R.string.reg_id_error));
					alert.setIcon(R.drawable.ic_launcher);
					alert.setPositiveButton(getString(R.string.yes),
							new DialogInterface.OnClickListener() {

								public void onClick(DialogInterface dialog,
										int which) {
									// Clear Old Settings
									getSharedPreferences("setting", 0).edit()
											.clear().commit();
									getSharedPreferences("temp", 0).edit()
											.clear().commit();

									// New Start
									// Î°úÎî© ?ôîÎ©¥Ï? Ï¢ÖÎ£å?ïò?ùº.
									finish();
									// ?ù¥?èô?ïú?ã§. Î©îÏù∏?úºÎ°?
									Intent intent = new Intent(
											MainActivity2.this,
											MainActivity2.class);
									startActivity(intent);

								}
							});
					alert.show();
				}

				// Permission Denied
				// if (permission.matches("4")) {
				// load = false;
				// PermissionError();
				// }
				// ?†ú?ïú?Ç¨?ï≠?ù¥ ?óÜ?ùÑ Í≤ΩÏö∞
				
		
				if (load == true) {
					// Î°úÎî© ?ôîÎ©¥Ï? Ï¢ÖÎ£å?ïò?ùº.

					finish();
					// ?ù¥?èô?ïú?ã§. Î©îÏù∏?úºÎ°?
					Intent intent = new Intent(MainActivity2.this, main2.class);
					startActivity(intent);

				}

			}
		} catch (Exception e) {
			Global.ConnectionError(this);
		}

	}

	protected Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			// IF Sucessfull no timeout
			if (msg.what != 0) {
				BreakTimeout();
			}

			if (msg.what == -1) {
				ConnectionError();
			}

			if (msg.what == 0) {
				ConnectionError();
			}

			if (msg.what == 1) {
				try{
				infoResult = msg.obj.toString();
				Log.i("InfoResult", infoResult + "null");
				StartApp();
				} catch (Exception e){}

			}

			if (msg.what == 2) {
				Global.SaveBitmapToFileCache((Bitmap) msg.obj, getCacheDir().toString() , "/member/" + user_srl + ".jpg");
				Global.createThumbnail((Bitmap) msg.obj, getCacheDir().toString() , "/member/thumbnail/" + user_srl + ".jpg");

			}

		}
	};

}