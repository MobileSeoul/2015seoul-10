package com.cym5240.pis;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockFragment;


public class FragmentTab1 extends SherlockFragment {
	
	 public ImageView ibtn = null; 
	 public ImageView ibtn2 = null; 
	 public ImageView ibtn3 = null; 
	 public ImageView ibtn4 = null; 
	 public ImageView ibtn5 = null; 
	 public ImageView ibtn6 = null; 
	 public ImageView ibtn7 = null; 
	 public ImageView ibtn8 = null; 
	 public ImageView ibtn9 = null; 
	 public ImageView ibtn10 = null; 
	 public ImageView ibtn11 = null; 
	 public ImageView ibtn12 = null; 
	 public ImageView ibtn13 = null; 
	 public ImageView ibtn14 = null; 
	 public ImageView ibtn15 = null; 
	 public ImageView ibtn16 = null; 
	 public ImageView ibtn17 = null; 
	 public ImageView ibtn18 = null; 
	 public ImageView ibtn19 = null; 
	 public ImageView ibtn20 = null;
	 public ImageView ibtn21 = null;
	 public ImageView ibtn22 = null;
	 public ImageView ibtn23 = null;
	 public ImageView ibtn24 = null;
	 
	 
	    
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		
		 
		View rootView = inflater.inflate(R.layout.fragmenttab1, container, false);
		ibtn = (ImageView) rootView.findViewById(R.id.imageView1); 
		ibtn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar.class);
				startActivity(intent2);

				

			}
		});
		
		ibtn2 = (ImageView) rootView.findViewById(R.id.imageView2); 
		ibtn2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar2.class);
				startActivity(intent2);

				

			}
		});
		
		ibtn3 = (ImageView) rootView.findViewById(R.id.imageView3);
		ibtn3.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar3.class);
				startActivity(intent2);

				

			}
		});
		
		ibtn4 = (ImageView) rootView.findViewById(R.id.imageView4); 
		ibtn4.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar4.class);
				startActivity(intent2);

			}
			
			
		});
		
		ibtn5 = (ImageView) rootView.findViewById(R.id.imageView5); 
		ibtn5.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar5.class);
				startActivity(intent2);

			}
			
			
		});
		
		ibtn6 = (ImageView) rootView.findViewById(R.id.imageView6); 
		ibtn6.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar6.class);
				startActivity(intent2);

			}
			
			
		});
		
		
		ibtn7 = (ImageView) rootView.findViewById(R.id.imageView7); 
		ibtn7.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar7.class);
				startActivity(intent2);

			}
			
			
		});
		
		ibtn8 = (ImageView) rootView.findViewById(R.id.imageView8); 
		ibtn8.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar8.class);
				startActivity(intent2);

			}
			
			
		});
		
		ibtn9 = (ImageView) rootView.findViewById(R.id.imageView9); 
		ibtn9.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar9.class);
				startActivity(intent2);

			}
			
			
		});
		
		ibtn10 = (ImageView) rootView.findViewById(R.id.imageView10); 
		ibtn10.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar10.class);
				startActivity(intent2);

			}
			
			
		});
		
		ibtn11 = (ImageView) rootView.findViewById(R.id.imageView11); 
		ibtn11.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar11.class);
				startActivity(intent2);

			}
			
			
		});
		
		ibtn12 = (ImageView) rootView.findViewById(R.id.imageView12); 
		ibtn12.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar12.class);
				startActivity(intent2);

			}
			
			
		});
		
		
		ibtn13 = (ImageView) rootView.findViewById(R.id.imageView13); 
		ibtn13.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar13.class);
				startActivity(intent2);

			}
			
			
		});
		
		ibtn14 = (ImageView) rootView.findViewById(R.id.imageView14); 
		ibtn14.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar14.class);
				startActivity(intent2);

			}
			
			
			
			
		});
		
		ibtn15 = (ImageView) rootView.findViewById(R.id.imageView15); 
		ibtn15.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar15.class);
				startActivity(intent2);

			}
			
			
			
			
		});
		
		ibtn16 = (ImageView) rootView.findViewById(R.id.imageView16); 
		ibtn16.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar16.class);
				startActivity(intent2);

			}
			
			
			
			
		});
		
		ibtn17 = (ImageView) rootView.findViewById(R.id.imageView17); 
		ibtn17.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar17.class);
				startActivity(intent2);

			}
			
			
			
			
		});
		
		ibtn18 = (ImageView) rootView.findViewById(R.id.imageView18); 
		ibtn18.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar18.class);
				startActivity(intent2);

			}
			
			
			
			
		});
		
		ibtn19 = (ImageView) rootView.findViewById(R.id.imageView19); 
		ibtn19.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar19.class);
				startActivity(intent2);

			}
			
			
			
			
		});
		
		
		ibtn20 = (ImageView) rootView.findViewById(R.id.imageView20); 
		ibtn20.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar20.class);
				startActivity(intent2);

			}
			
			
			
			
		});
		
		ibtn21 = (ImageView) rootView.findViewById(R.id.imageView21); 
		ibtn21.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar21.class);
				startActivity(intent2);

			}
			
			
			
			
		});
		
		ibtn22 = (ImageView) rootView.findViewById(R.id.imageView22); 
		ibtn22.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar22.class);
				startActivity(intent2);

			}
			
			
			
			
		});
		
		
		ibtn23 = (ImageView) rootView.findViewById(R.id.imageView23); 
		ibtn23.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar23.class);
				startActivity(intent2);

			}
			
			
			
			
		});
		
		ibtn24 = (ImageView) rootView.findViewById(R.id.imageView24); 
		ibtn24.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(getActivity(), actionbar24.class);
				startActivity(intent2);

			}
			
			
			
			
		});
		return rootView;
		
		
	
		
		
	}
	
	

}
