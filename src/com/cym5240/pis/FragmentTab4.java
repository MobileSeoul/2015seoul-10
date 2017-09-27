package com.cym5240.pis;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

import com.actionbarsherlock.app.SherlockFragment;

public class FragmentTab4 extends SherlockFragment {
	
	 public Button ibtn = null; 
	 
	 
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.welcome, container,
				
				false);
		
		Intent intent = new Intent(getActivity(), MainActivity2.class);
		startActivity(intent);
		

		ibtn = (Button) rootView.findViewById(R.id.button1); 
		ibtn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), MainActivity2.class);
				startActivity(intent2);

				

			}
		});
		
		return rootView;
	}

	
}
