//This is source code of favorite. Copyright?ìí. Tarks. All Rights Reserved.
package com.cym5240.pis.connect;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import com.cym5240.pis.ModApplication;
import com.cym5240.pis.pij.global.Globalvariable;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class AsyncHttpTask extends AsyncTask<String, Void, String> {
	private Handler handler;
	private Exception exception;
	int DataContent;
	String responseData;
	String fileName;
	String url, myResult;
	Context context;
	ArrayList<String> paramNames, paramValues, files;
	int handlernum = 1;
	// String[] files;

	// ModApplication
	static ModApplication mod = ModApplication.getInstance();

	// Upload
	private static FileInputStream mFileInputStream = null;
	private static URL connectUrl = null;

	public AsyncHttpTask(Context cx, String urls, Handler handler,
			ArrayList pNames, ArrayList pValues, ArrayList fe, int hnum, int Data) {
		//Log.i("Test", "asyc callec");
		Globalvariable.okbutton = false;
		// Set handler
		this.handler = handler;
		// Set context
		context = cx;
		// set url
		url = urls;
		// Arraylists
		paramNames = pNames;
		paramValues = pValues;
		files = fe;
		// set hanler return number
		handlernum = hnum;
		DataContent = Data;

		// doInBackground("");

		super.execute("");
	}
	


	@Override
	protected String doInBackground(String... urls) {

		// urls[0]?ùò URLÎ∂??Ñ∞ ?ç∞?ù¥?Ñ∞Î•? ?ùΩ?ñ¥?? String?úºÎ°? Î¶¨ÌÑ¥
		// Log.i("URL", url);
		return Task(url);

	}

	@Override
	public void onPreExecute() {
		// Log.i("Test", "onPreExecute Called on global");

	}

	@Override
	protected void onPostExecute(String responseData) {
		// Log.i("Message", "Post");

		// Log.i("Message", "1");
		
		Message msg = handler.obtainMessage();
		msg.what = handlernum;
		msg.obj = myResult;
		msg.arg1 = DataContent;
		handler.sendMessage(msg);
		// Log.i("hey", myResult);
		Globalvariable.okbutton = true;
	}

	public String Task(String url) {

		String lineEnd = "\r\n";
		String twoHyphens = "--";
		String boundary = "*****";

		try {

			connectUrl = new URL(url);

			// open connection
			HttpURLConnection conn = (HttpURLConnection) connectUrl
					.openConnection();
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setUseCaches(false);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Connection", "Keep-Alive");
			conn.setRequestProperty("Content-Type",
					"multipart/form-data;boundary=" + boundary);

			// write data
			DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
			OutputStreamWriter out = new OutputStreamWriter(
					conn.getOutputStream(), "UTF-8");// EUC-KR");

			// Check it is null
			if (paramNames != null && paramValues != null) {
				for (int i = 0; i < paramNames.size(); i++) {
				//	Log.i("value", paramNames.get(i).toString());
					out.write(twoHyphens + boundary + lineEnd); // ?ïÑ?ìú Íµ¨Î∂Ñ?ûê
																// ?ãú?ûë
					out.write("Content-Disposition: form-data; name=\""
							+ paramNames.get(i) + "\"" + lineEnd);
					out.write(lineEnd);
					out.write(paramValues.get(i).toString());
			//		Log.i("value", paramValues.get(i).toString());
					out.write(lineEnd);

				}

			}

			if (files != null) {
				// Log.i("Access", "We can access to files");
				for (int i = 0; i < files.size(); i++) {
					// ======================start
					// fis = new FileInputStream(files.get(files.size()-1));
					mFileInputStream = new FileInputStream(files.get(i)
							.toString());
				//	Log.d("Test", "mFileInputStream  is " + mFileInputStream);
					dos.writeBytes(twoHyphens + boundary + lineEnd);
					dos.writeBytes("Content-Disposition: form-data; name=\"uploadedfile\";filename=\""
							+ files.get(i).toString() + "\"" + lineEnd);
					dos.writeBytes(lineEnd);

					int bytesAvailable = mFileInputStream.available();
					int maxBufferSize = 1024;
					int bufferSize = Math.min(bytesAvailable, maxBufferSize);

					byte[] buffer = new byte[bufferSize];
					int bytesRead = mFileInputStream
							.read(buffer, 0, bufferSize);

					// Log.d("Test", "image byte is " + bytesRead);

					// read image
					while (bytesRead > 0) {
						dos.write(buffer, 0, bufferSize);
						bytesAvailable = mFileInputStream.available();
						bufferSize = Math.min(bytesAvailable, maxBufferSize);
						bytesRead = mFileInputStream
								.read(buffer, 0, bufferSize);
					}

					dos.writeBytes(lineEnd);
					// ======================end
				}
			}

			dos.writeBytes(twoHyphens + boundary + twoHyphens + lineEnd);

			if (files != null) {
				mFileInputStream.close();
			}
			// close streams
			// Log.e("Test" , "File is written");

			dos.flush(); // finish upload...
			out.flush(); // finish upload...

			// get response
			int ch;
			InputStreamReader tmp = new InputStreamReader(
					conn.getInputStream(), "UTF-8");
			BufferedReader reader = new BufferedReader(tmp);
			StringBuilder builder = new StringBuilder();
			String str;

			while ((str = reader.readLine()) != null) { // ?ÑúÎ≤ÑÏóê?Ñú ?ùº?ù∏?ã®?úÑÎ°? Î≥¥ÎÇ¥Ï§?
				// Í≤ÉÏù¥ÎØ?Î°? ?ùº?ù∏?ã®?úÑÎ°? ?ùΩ?äî?ã§
				builder.append(str); // View?óê ?ëú?ãú?ïòÍ∏? ?úÑ?ï¥ ?ùº?ù∏ Íµ¨Î∂Ñ?ûê Ï∂îÍ?
			}

			myResult = builder.toString(); // ?†Ñ?Ü°Í≤∞Í≥ºÎ•? ?†Ñ?ó≠ Î≥??àò?óê ???û•
			// Log.e("Test", "result = " + myResult);
        //   Log.i("Result value",  myResult + ".");
			dos.close();
			out.close();
			// onPostExecute(myResult);

		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			// Infoalert(context, mod.getString(R.string.error),
			// mod.getString(R.string.error_des), mod.getString(R.string.yes));
//Change to error code
			handlernum = -1;

		}

		return null;

	}

}
