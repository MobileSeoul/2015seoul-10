package com.cym5240.pis;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class FragmentTab2 extends Fragment implements OnMyLocationChangeListener  {
	
	
	private static final String HALLOWEEN_ORANGE = "#FF7F27";
    private static final String ARG_POSITION = "position";
    private int position;
    GoogleMap mGoogleMap;
    GoogleMap mGoogleMap1;
    
    MarkerOptions optSecond=new MarkerOptions();
    LatLng loc;
	CameraPosition cp;
	MarkerOptions marker = new MarkerOptions().position(loc); // 구글맵에 기본마커 표시
	final MarkerOptions op1 = new MarkerOptions();

	 Marker m;
	static View rootView;
	
	double distance;
	 String tempadd[]= {"낙산공원","남산타워 야경","서울월드컵경기장","경복궁","가회동","석촌호수","성산대교","수산시장","원효대교","회현동","청계천","디자인플라자","빛내림","연등축제","청계천에서","덕수궁 돌담길","압구정동","창덕궁","위례성길","서울역","대림동","디자인플라자 야경","윤중로","남산육교"};



	TextView a1;
	TextView a2;
	TextView a3;
	TextView a4;
	TextView a5;
	TextView a6;
	
	
	TextView ok;
	TextView no;
	
	ImageView e1;
	ImageView e2;
	ImageView e3;
	ImageView e4;
	ImageView e5;
	ImageView e6;
	
	
	String test;
	double [] address=new double[24];
	double [] address2=new double[24];
	
	double temp1;
	double temp2;
	double temp3;
	double temp4;
	double temp5;
	double temp6;
	
	


	


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	
    	

        // 키보드 끄기 //
        //getActivity().getWindow().setSoftInputMode(
              //  WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        // 구글맵을 사용하는 프래그먼트에서 현재 객채 파괴
       
        try{
        rootView = inflater.inflate(R.layout.maptest, container, false);
        }catch (InflateException e){             
        	// 구글맵 View가 이미 inflate되어 있는 상태이므로, 에러를 무시합니다.         } 
        }
        
        a1 = (TextView) rootView.findViewById(R.id.textView1);
        a2 = (TextView) rootView.findViewById(R.id.textView2);
        a3 = (TextView) rootView.findViewById(R.id.textView3);
        a4 = (TextView) rootView.findViewById(R.id.textView4);
        a5 = (TextView) rootView.findViewById(R.id.textView5);
        a6 = (TextView) rootView.findViewById(R.id.textView6);
        
        e1 = (ImageView) rootView.findViewById(R.id.imageView1);
        e2 = (ImageView) rootView.findViewById(R.id.imageView2);
        e3 = (ImageView) rootView.findViewById(R.id.imageView3);
        e4 = (ImageView) rootView.findViewById(R.id.imageView4);
        e5 = (ImageView) rootView.findViewById(R.id.imageView5);
        e6 = (ImageView) rootView.findViewById(R.id.imageView6);
        
        
    



        
           
       
        
        
        mGoogleMap = ((SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.maptest)).getMap(); 
    	// 화면에 구글맵 표시
    	      // 지정위치로 이동
    	     
    	     mGoogleMap.getUiSettings().setZoomControlsEnabled(true);

       	  // Enabling MyLocation Layer of Google Map
       	     mGoogleMap.setMyLocationEnabled(true);
       	     locationTag=true;
       	  // Setting event handler for location change
       	     mGoogleMap.setOnMyLocationChangeListener(this);
       	     
       	  // 현재 프래그먼트에서 실행할
         	
             //보일 때 실행할 문장 
        	  String context = Context.LOCATION_SERVICE;
           LocationManager mgr = 
           		(LocationManager)getActivity().getSystemService(Context.LOCATION_SERVICE);
           if(!mgr.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
              alertCheckGPS();
           
           
         } else{ 

             //안보일 때 실행할 문장 

         } 

              
        return rootView;
        
        
    }
    
    
    
    
      


    @Override
    public void onDestroyView() {     
    	super.onDestroyView();     
    	if(rootView!=null){         
    		ViewGroup parent = (ViewGroup)rootView.getParent();         
    		if(parent!=null){             
    			parent.removeView(rootView);         
    			}     
    		} 
    	}
   
    private void alertCheckGPS() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getActivity());;
        builder.setMessage("Google의 위치 서비스에서 익명의 위치 정보를 수집할 수 있도록 합니다. 위치 정보데이터는 서버또는 개인기기에 저장하지 않으며 단순히 활용하여 현재 위치에서 가까운 출사지를 검색하기위해 사용됩니다.")
                .setCancelable(false)
                .setPositiveButton("거절",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            	 dialog.cancel();
                                
                            }
                    })
                .setNegativeButton("연결",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            	moveConfigGPS();
                            }
                    });
        AlertDialog alert = builder.create();
        alert.show();
    }

    // GPS 설정화면으로 이동
    private void moveConfigGPS() {
         Intent gpsOptionsIntent = new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS);
         startActivity(gpsOptionsIntent);
     }

    
    boolean locationTag=true;
    
    @Override
    
	public void onMyLocationChange(Location location) {
    	
    	if(locationTag){
		// TODO Auto-generated method stub
    	
		 // 현재 위도
        double latitude = location.getLatitude(); 

        // 현재 경도
        double longitude = location.getLongitude(); 

        // latLng변수에 현재 위도, 경도를 저장
         loc = new LatLng(latitude, longitude); 

        // 현재 위치로 구글맵 이동
        //mGoogleMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));       
        // 확대 및 축소(Zoom)
      // mGoogleMap.animateCamera(CameraUpdateFactory.zoomTo(17));        
        
    	
        
        //마커,타이틀, 스니핏 표시
         if(m!=null){
        	 m.remove(); //기존마커지우기
         }
         cp = new CameraPosition.Builder().target((loc)).zoom(9).build();
    	 mGoogleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cp));
        marker=new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.map_picker_blue_36dp)).position(loc).title("현재위치");
        m = mGoogleMap.addMarker(marker); 
        mGoogleMap.addMarker(marker).showInfoWindow();
        mGoogleMap.getUiSettings().setZoomControlsEnabled(true);
        
        Location locationA = new Location("point A");
        
        locationA.setLatitude(latitude);
        locationA.setLongitude(longitude);
        
        Location location0 = new Location("point B");
        Location location1 = new Location("point B");
        Location location2 = new Location("point B");
        Location location3 = new Location("point B");
        Location location4 = new Location("point B");
        Location location5 = new Location("point B");
        Location location6= new Location("point B");
        Location location7 = new Location("point B");
        Location location8 = new Location("point B");
        Location location9 = new Location("point B");
        Location location10 = new Location("point B");
        Location location11 = new Location("point B");
        Location location12 = new Location("point B");
        Location location13 = new Location("point B");
        Location location14 = new Location("point B");
        Location location15 = new Location("point B");
        Location location16 = new Location("point B");
        Location location17 = new Location("point B");
        Location location18 = new Location("point B");
        Location location19 = new Location("point B");
        Location location20 = new Location("point B");
        Location location21 = new Location("point B");
        Location location22 = new Location("point B");
        Location location23 = new Location("point B");
        
        
        
        location0.setLatitude(37.580435);
        location0.setLongitude(127.007459);
        location1.setLatitude(37.510090);
        location1.setLongitude(127.065318);
        location2.setLatitude(37.568659);
        location2.setLongitude(126.894928);
        location3.setLatitude(37.579766);
        location3.setLongitude(126.974794);
        location4.setLatitude(37.580230);
        location4.setLongitude(126.985356);
        location5.setLatitude(37.509764);
        location5.setLongitude(127.102890);
        location6.setLatitude(37.555849);
        location6.setLongitude(126.894220);
        location7.setLatitude(37.515200);
        location7.setLongitude(126.940842);
        location8.setLatitude(37.526871);
        location8.setLongitude(126.945531);
        location9.setLatitude(37.554707);
        location9.setLongitude(126.984221);
        location10.setLatitude(37.569793);
        location10.setLongitude(127.001987);
        location11.setLatitude(37.566942);
        location11.setLongitude(127.010172);
        location12.setLatitude(37.575105);
        location12.setLongitude(126.866665);
        location13.setLatitude(37.575526);
        location13.setLongitude(126.976920);
        location14.setLatitude(37.568954);
        location14.setLongitude(126.982583);
        location15.setLatitude(37.565695);
        location15.setLongitude(126.975463);
        location16.setLatitude(37.526294);
        location16.setLongitude(127.026559);
        location17.setLatitude(37.579434);
        location17.setLongitude(126.991043);
        location18.setLatitude(37.514988);
        location18.setLongitude(127.120096);
        location19.setLatitude(37.555262);
        location19.setLongitude(126.970453);
        location20.setLatitude(37.500095);
        location20.setLongitude(126.893515);
        location21.setLatitude(37.567846);
        location21.setLongitude(127.012459);
        location22.setLatitude(37.532281);
        location22.setLongitude(126.920238);
        location23.setLatitude(37.557560);
        location23.setLongitude(126.976754);
      
        
        
        distance = locationA.distanceTo(location0);
        distance=distance/1000;
        address[0]= distance;
        address2[0]=address[0];
        		
        distance = locationA.distanceTo(location1);
        distance=distance/1000;
        address[1]= distance;
        address2[1]=address[1];
        
        distance = locationA.distanceTo(location2);
        distance=distance/1000;
        address[2]= distance;
        address2[2]=address[2];
        
        distance = locationA.distanceTo(location3);
        distance=distance/1000;
        address[3]= distance;
        address2[3]=address[3];

        distance = locationA.distanceTo(location4);
        distance=distance/1000;
        address[4]= distance;
        address2[4]=address[4];
        
        distance = locationA.distanceTo(location5);
        distance=distance/1000;
        address[5]= distance;
        address2[5]=address[5];
        
        distance = locationA.distanceTo(location6);
        distance=distance/1000;
        address[6]= distance;
        address2[6]=address[6];
        
        distance = locationA.distanceTo(location7);
        distance=distance/1000;
        address[7]= distance;
        address2[7]=address[7];
        
        distance = locationA.distanceTo(location8);
        distance=distance/1000;
        address[8]= distance;
        address2[8]=address[8];
        
        distance = locationA.distanceTo(location9);
        distance=distance/1000;
        address[9]= distance;
        address2[9]=address[9];
        
        distance = locationA.distanceTo(location10);
        distance=distance/1000;
        address[10]= distance;
        address2[10]=address[10];
        
        distance = locationA.distanceTo(location11);
        distance=distance/1000;
        address[11]= distance;
        address2[11]=address[11];
        
        distance = locationA.distanceTo(location12);
        distance=distance/1000;
        address[12]= distance;
        address2[12]=address[12];
        
        distance = locationA.distanceTo(location13);
        distance=distance/1000;
        address[13]= distance;
        address2[13]=address[13];
        
        distance = locationA.distanceTo(location14);
        distance=distance/1000;
        address[14]= distance;
        address2[14]=address[14];
        
        distance = locationA.distanceTo(location15);
        distance=distance/1000;
        address[15]= distance;
        address2[15]=address[15];
        
        distance = locationA.distanceTo(location16);
        distance=distance/1000;
        address[16]= distance;
        address2[16]=address[16];
        
        distance = locationA.distanceTo(location17);
        distance=distance/1000;
        address[17]= distance;
        address2[17]=address[17];
        
        distance = locationA.distanceTo(location18);
        distance=distance/1000;
        address[18]= distance;
        address2[18]=address[18];
        
        distance = locationA.distanceTo(location19);
        distance=distance/1000;
        address[19]= distance; 
        address2[19]=address[19];
        
        distance = locationA.distanceTo(location20);
        distance=distance/1000;
        address[20]= distance; 
        address2[20]=address[20];
        
        distance = locationA.distanceTo(location21);
        distance=distance/1000;
        address[21]= distance; 
        address2[21]=address[21];
        
        distance = locationA.distanceTo(location22);
        distance=distance/1000;
        address[22]= distance; 
        address2[22]=address[22];
        
        distance = locationA.distanceTo(location23);
        distance=distance/1000;
        address[23]= distance; 
        address2[23]=address[23];
        
     
        
        
        
        double temp = 0;
        
        for (int i = 0; i < address.length; i++) {
            for (int j = i+1; j < address.length; j++) {
                if(address[i] > address[j]) {
                    temp = address[j];
                    address[j] = address[i];
                    address[i] = temp;
                }
            }
        }
 
        
        
        temp1=address[0];
        temp2=address[1];
        temp3=address[2];
        temp4=address[3];
        temp5=address[4];
        temp6=address[5];
        
        
        
        test=Double.toString(address[0]);
        test = String.format("%.2f", address[0]);
        a1.setText(test+"Km");
        
      
        
        if(temp1==address2[0]){
        	e1.setImageResource(R.drawable.naksan);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[1]){
        	e1.setImageResource(R.drawable.namsan);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar2.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[2]){
        	e1.setImageResource(R.drawable.world);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar3.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[3]){
        	e1.setImageResource(R.drawable.gyeong);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar4.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[4]){
        	e1.setImageResource(R.drawable.gahi);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar5.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[5]){
        	e1.setImageResource(R.drawable.lover);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar6.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[6]){
        	e1.setImageResource(R.drawable.seong);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar7.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[7]){
        	e1.setImageResource(R.drawable.noryang);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar8.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[8]){
        	e1.setImageResource(R.drawable.hangang);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar9.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[9]){
        	e1.setImageResource(R.drawable.heoi);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar10.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[10]){
        	e1.setImageResource(R.drawable.cheong);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar11.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[11]){
        	e1.setImageResource(R.drawable.design);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar12.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[12]){
        	e1.setImageResource(R.drawable.sangam);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar13.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[13]){
        	e1.setImageResource(R.drawable.yeon);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar14.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[14]){
        	e1.setImageResource(R.drawable.sajik);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar15.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[15]){
        	e1.setImageResource(R.drawable.doldam);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar16.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[16]){
        	e1.setImageResource(R.drawable.apgu);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar17.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[17]){
        	e1.setImageResource(R.drawable.chang);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar18.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[18]){
        	e1.setImageResource(R.drawable.wee);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar19.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[19]){
        	e1.setImageResource(R.drawable.station);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar20.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[20]){
        	e1.setImageResource(R.drawable.dae);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar21.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[21]){
        	e1.setImageResource(R.drawable.dongd);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar22.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp1==address2[22]){
        	e1.setImageResource(R.drawable.yeoi);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar23.class);
    				startActivity(intent2);
    			}

    		});
        }
        else if(temp1==address2[23]){
        	e1.setImageResource(R.drawable.yeong);
        	e1.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar24.class);
    				startActivity(intent2);
    			}

    		});
        }
        
        test=Double.toString(address[1]);
        test = String.format("%.2f", address[1]);
        a2.setText(test+"Km");
        
        if(temp2==address2[0]){
        	e2.setImageResource(R.drawable.naksan);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[1]){
        	e2.setImageResource(R.drawable.namsan);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar2.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[2]){
        	e2.setImageResource(R.drawable.world);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar3.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[3]){
        	e2.setImageResource(R.drawable.gyeong);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar4.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[4]){
        	e2.setImageResource(R.drawable.gahi);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar5.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[5]){
        	e2.setImageResource(R.drawable.lover);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar6.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[6]){
        	e2.setImageResource(R.drawable.seong);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar7.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[7]){
        	e2.setImageResource(R.drawable.noryang);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar8.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[8]){
        	e2.setImageResource(R.drawable.hangang);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar9.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[9]){
        	e2.setImageResource(R.drawable.heoi);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar10.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[10]){
        	e2.setImageResource(R.drawable.cheong);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar11.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[11]){
        	e2.setImageResource(R.drawable.design);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar12.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[12]){
        	e2.setImageResource(R.drawable.sangam);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar13.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[13]){
        	e2.setImageResource(R.drawable.yeon);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar14.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[14]){
        	e2.setImageResource(R.drawable.sajik);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar15.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[15]){
        	e2.setImageResource(R.drawable.doldam);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar16.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[16]){
        	e2.setImageResource(R.drawable.apgu);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar17.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[17]){
        	e2.setImageResource(R.drawable.chang);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar18.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[18]){
        	e2.setImageResource(R.drawable.wee);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar19.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[19]){
        	e2.setImageResource(R.drawable.station);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar20.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[20]){
        	e2.setImageResource(R.drawable.dae);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar21.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[21]){
        	e2.setImageResource(R.drawable.dongd);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar22.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp2==address2[22]){
        	e2.setImageResource(R.drawable.yeoi);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar23.class);
    				startActivity(intent2);
    			}

    		});
        }
        else if(temp2==address2[23]){
        	e2.setImageResource(R.drawable.yeong);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar24.class);
    				startActivity(intent2);
    			}

    		});
        }
        
        test=Double.toString(address[2]);
        test = String.format("%.2f", address[2]);
        a3.setText(test+"Km");
        if(temp3==address2[0]){
        	e3.setImageResource(R.drawable.naksan);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[1]){
        	e3.setImageResource(R.drawable.namsan);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar2.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[2]){
        	e3.setImageResource(R.drawable.world);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar3.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[3]){
        	e3.setImageResource(R.drawable.gyeong);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar4.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[4]){
        	e3.setImageResource(R.drawable.gahi);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar5.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[5]){
        	e3.setImageResource(R.drawable.lover);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar6.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[6]){
        	e3.setImageResource(R.drawable.seong);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar7.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[7]){
        	e3.setImageResource(R.drawable.noryang);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar8.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[8]){
        	e3.setImageResource(R.drawable.hangang);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar9.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[9]){
        	e3.setImageResource(R.drawable.heoi);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar10.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[10]){
        	e3.setImageResource(R.drawable.cheong);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar11.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[11]){
        	e3.setImageResource(R.drawable.design);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar12.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[12]){
        	e3.setImageResource(R.drawable.sangam);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar13.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[13]){
        	e3.setImageResource(R.drawable.yeon);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar14.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[14]){
        	e3.setImageResource(R.drawable.sajik);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar15.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[15]){
        	e3.setImageResource(R.drawable.doldam);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar16.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[16]){
        	e3.setImageResource(R.drawable.apgu);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar17.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[17]){
        	e3.setImageResource(R.drawable.chang);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar18.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[18]){
        	e3.setImageResource(R.drawable.wee);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar19.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[19]){
        	e3.setImageResource(R.drawable.station);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar20.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[20]){
        	e3.setImageResource(R.drawable.dae);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar21.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[21]){
        	e3.setImageResource(R.drawable.dongd);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar22.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp3==address2[22]){
        	e3.setImageResource(R.drawable.yeoi);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar23.class);
    				startActivity(intent2);
    			}

    		});
        }
        else if(temp3==address2[23]){
        	e3.setImageResource(R.drawable.yeong);
        	e3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar24.class);
    				startActivity(intent2);
    			}

    		});
        }
        
        
        test=Double.toString(address[3]);
        test = String.format("%.2f", address[3]);
        a4.setText(test+"Km");
        if(temp4==address2[0]){
        	e4.setImageResource(R.drawable.naksan);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[1]){
        	e4.setImageResource(R.drawable.namsan);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar2.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[2]){
        	e4.setImageResource(R.drawable.world);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar3.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[3]){
        	e4.setImageResource(R.drawable.gyeong);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar4.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[4]){
        	e4.setImageResource(R.drawable.gahi);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar5.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[5]){
        	e4.setImageResource(R.drawable.lover);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar6.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[6]){
        	e4.setImageResource(R.drawable.seong);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar7.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[7]){
        	e4.setImageResource(R.drawable.noryang);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar8.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[8]){
        	e4.setImageResource(R.drawable.hangang);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar9.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[9]){
        	e4.setImageResource(R.drawable.heoi);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar10.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[10]){
        	e4.setImageResource(R.drawable.cheong);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar11.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[11]){
        	e4.setImageResource(R.drawable.design);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar12.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[12]){
        	e4.setImageResource(R.drawable.sangam);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar13.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[13]){
        	e4.setImageResource(R.drawable.yeon);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar14.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[14]){
        	e4.setImageResource(R.drawable.sajik);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar15.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[15]){
        	e4.setImageResource(R.drawable.doldam);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar16.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[16]){
        	e4.setImageResource(R.drawable.apgu);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar17.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[17]){
        	e4.setImageResource(R.drawable.chang);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar18.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[18]){
        	e4.setImageResource(R.drawable.wee);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar19.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[19]){
        	e4.setImageResource(R.drawable.station);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar20.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[20]){
        	e4.setImageResource(R.drawable.dae);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar21.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[21]){
        	e4.setImageResource(R.drawable.dongd);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar22.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp4==address2[22]){
        	e4.setImageResource(R.drawable.yeoi);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar23.class);
    				startActivity(intent2);
    			}

    		});
        }
        else if(temp4==address2[23]){
        	e4.setImageResource(R.drawable.yeong);
        	e4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar24.class);
    				startActivity(intent2);
    			}

    		});
        }
        
        test=Double.toString(address[4]);
        test = String.format("%.2f", address[4]);
        a5.setText(test+"Km");
        if(temp5==address2[0]){
        	e5.setImageResource(R.drawable.naksan);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[1]){
        	e5.setImageResource(R.drawable.namsan);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar2.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[2]){
        	e5.setImageResource(R.drawable.world);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar3.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[3]){
        	e5.setImageResource(R.drawable.gyeong);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar4.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[4]){
        	e5.setImageResource(R.drawable.gahi);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar5.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[5]){
        	e5.setImageResource(R.drawable.lover);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar6.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[6]){
        	e5.setImageResource(R.drawable.seong);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar7.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[7]){
        	e5.setImageResource(R.drawable.noryang);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar8.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[8]){
        	e5.setImageResource(R.drawable.hangang);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar9.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[9]){
        	e5.setImageResource(R.drawable.heoi);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar10.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[10]){
        	e5.setImageResource(R.drawable.cheong);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar11.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[11]){
        	e5.setImageResource(R.drawable.design);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar12.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[12]){
        	e5.setImageResource(R.drawable.sangam);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar13.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[13]){
        	e5.setImageResource(R.drawable.yeon);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar14.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[14]){
        	e5.setImageResource(R.drawable.sajik);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar15.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[15]){
        	e5.setImageResource(R.drawable.doldam);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar16.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[16]){
        	e5.setImageResource(R.drawable.apgu);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar17.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[17]){
        	e5.setImageResource(R.drawable.chang);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar18.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[18]){
        	e5.setImageResource(R.drawable.wee);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar19.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[19]){
        	e5.setImageResource(R.drawable.station);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar20.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[20]){
        	e5.setImageResource(R.drawable.dae);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar21.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[21]){
        	e5.setImageResource(R.drawable.dongd);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar22.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp5==address2[22]){
        	e2.setImageResource(R.drawable.yeoi);
        	e2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar23.class);
    				startActivity(intent2);
    			}

    		});
        }
        else if(temp5==address2[23]){
        	e5.setImageResource(R.drawable.yeong);
        	e5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar24.class);
    				startActivity(intent2);
    			}

    		});
        }
        
        test=Double.toString(address[5]);
        test = String.format("%.2f", address[5]);
        a6.setText(test+"Km");
        if(temp6==address2[0]){
        	e6.setImageResource(R.drawable.naksan);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[1]){
        	e6.setImageResource(R.drawable.namsan);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar2.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[2]){
        	e6.setImageResource(R.drawable.world);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar3.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[3]){
        	e6.setImageResource(R.drawable.gyeong);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar4.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[4]){
        	e6.setImageResource(R.drawable.gahi);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar5.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[5]){
        	e6.setImageResource(R.drawable.lover);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar6.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[6]){
        	e6.setImageResource(R.drawable.seong);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar7.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[7]){
        	e6.setImageResource(R.drawable.noryang);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar8.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[8]){
        	e6.setImageResource(R.drawable.hangang);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar9.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[9]){
        	e6.setImageResource(R.drawable.heoi);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar10.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[10]){
        	e6.setImageResource(R.drawable.cheong);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar11.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[11]){
        	e6.setImageResource(R.drawable.design);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar12.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[12]){
        	e6.setImageResource(R.drawable.sangam);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar13.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[13]){
        	e6.setImageResource(R.drawable.yeon);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar14.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[14]){
        	e6.setImageResource(R.drawable.sajik);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar15.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[15]){
        	e6.setImageResource(R.drawable.doldam);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar16.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[16]){
        	e6.setImageResource(R.drawable.apgu);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar17.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[17]){
        	e6.setImageResource(R.drawable.chang);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar18.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[18]){
        	e6.setImageResource(R.drawable.wee);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar19.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[19]){
        	e6.setImageResource(R.drawable.station);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar20.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[20]){
        	e6.setImageResource(R.drawable.dae);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar21.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[21]){
        	e6.setImageResource(R.drawable.dongd);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar22.class);
    				startActivity(intent2);
    			}

    		});
        }else if(temp6==address2[22]){
        	e6.setImageResource(R.drawable.yeoi);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar23.class);
    				startActivity(intent2);
    			}

    		});
        }
        else if(temp6==address2[23]){
        	e6.setImageResource(R.drawable.yeong);
        	e6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(getActivity(), actionbar24.class);
    				startActivity(intent2);
    			}

    		});
        }
        
       
        
        
    
        mGoogleMap.addMarker(optSecond.position(new LatLng(37.580435, 127.007459)).title("낙산공원").snippet("서울특별시 종로구 동숭동 산2-10..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.510090, 127.065318)).title("남산타워 야경").snippet("서울특별시 강남구 삼성1동 169-25..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.568659, 126.894928)).title("서울월드컵경기장").snippet("서울특별시 마포구 성산2동..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.579766, 126.974794)).title("경복궁").snippet("서울특별시 종로구 세종로 1-84..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.580230, 126.985356)).title("가회동").snippet("서울특별시 종로구 가회동 206..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.509764, 127.102890)).title("석촌호수").snippet("서울특별시 송파구 신천동 ..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.555849, 126.894220)).title("성산대교").snippet("서울특별시 마포구 망원2동..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.515200, 126.940842)).title("수산시장").snippet("서울특별시 동작구 노들로 688..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.526871, 126.945531)).title("원효대교").snippet("서울특별시 영등포구 여의도동 ..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.554707, 126.984221)).title("회현동").snippet("서울특별시 중구 회현동1가..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.569793, 127.001987)).title("청계천").snippet("서울특별시 종로구 종로5가..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.566942, 127.010172)).title("디자인플라자").snippet("서울특별시 중구 을지로..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.575105, 126.866665)).title("빛내림").snippet("서울특별시 마포구 상암동..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.575526, 126.976920)).title("연등축제").snippet("서울특별시 종로구 세종로 ..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.568954, 126.982583)).title("청계천에서").snippet("서울특별시 종로구 서린동..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.565695, 126.975463)).title("덕수궁 돌담길").snippet("서울특별시 중구 세종대로..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.526294, 127.026559)).title("압구정동").snippet("서울특별시 강남구 압구정동..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.579434, 126.991043)).title("창덕궁").snippet("서울특별시 종로구 율곡로 99..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.514988, 127.120096)).title("위례성길").snippet("서울특별시 송파구 방이2동..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.555262, 126.970453)).title("서울역").snippet("서울특별시 용산구 한강대로..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.500095, 126.893515)).title("대림동").snippet("서울특별시 영등포구 대림3동..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.567846, 127.012459)).title("디자인플라자 야경").snippet("서울특별시 중구 신당1동 ..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.532281, 126.920238)).title("윤중로").snippet("서울특별시 영등포구 여의동..   √자세히"));
        mGoogleMap.addMarker(new MarkerOptions().position(new LatLng(37.557560, 126.976754)).title("남산육교").snippet("서울특별시 중구 남창동..   √자세히"));

   	 
        
     

       

 
        
		mGoogleMap.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {

        @Override

        public void onInfoWindowClick(Marker marker) {
        	
      		if(tempadd[0].equals(marker.getTitle())){
      			Intent intent2 = new Intent(getActivity(), actionbar.class);
				startActivity(intent2);
      	   		}else if(tempadd[1].equals(marker.getTitle())){
          			Intent intent2 = new Intent(getActivity(), actionbar2.class);
    				startActivity(intent2);
          	   		}else if(tempadd[2].equals(marker.getTitle())){
              			Intent intent2 = new Intent(getActivity(), actionbar3.class);
        				startActivity(intent2);
              	   		}else if(tempadd[3].equals(marker.getTitle())){
                  			Intent intent2 = new Intent(getActivity(), actionbar4.class);
            				startActivity(intent2);
                  	   		}else if(tempadd[4].equals(marker.getTitle())){
                      			Intent intent2 = new Intent(getActivity(), actionbar5.class);
                				startActivity(intent2);
                      	   		}else if(tempadd[5].equals(marker.getTitle())){
                          			Intent intent2 = new Intent(getActivity(), actionbar6.class);
                    				startActivity(intent2);
                          	   		}else if(tempadd[6].equals(marker.getTitle())){
                              			Intent intent2 = new Intent(getActivity(), actionbar7.class);
                        				startActivity(intent2);
                              	   		}else if(tempadd[7].equals(marker.getTitle())){
                                  			Intent intent2 = new Intent(getActivity(), actionbar8.class);
                            				startActivity(intent2);
                                  	   		}else if(tempadd[8].equals(marker.getTitle())){
                                      			Intent intent2 = new Intent(getActivity(), actionbar9.class);
                                				startActivity(intent2);
                                      	   		}else if(tempadd[9].equals(marker.getTitle())){
                                          			Intent intent2 = new Intent(getActivity(), actionbar10.class);
                                    				startActivity(intent2);
                                          	   		}else if(tempadd[10].equals(marker.getTitle())){
                                              			Intent intent2 = new Intent(getActivity(), actionbar11.class);
                                        				startActivity(intent2);
                                              	   		}else if(tempadd[11].equals(marker.getTitle())){
                                                  			Intent intent2 = new Intent(getActivity(), actionbar12.class);
                                            				startActivity(intent2);
                                                  	   		}else if(tempadd[12].equals(marker.getTitle())){
                                                      			Intent intent2 = new Intent(getActivity(), actionbar13.class);
                                                				startActivity(intent2);
                                                      	   		}else if(tempadd[13].equals(marker.getTitle())){
                                                          			Intent intent2 = new Intent(getActivity(), actionbar14.class);
                                                    				startActivity(intent2);
                                                          	   		}else if(tempadd[14].equals(marker.getTitle())){
                                                              			Intent intent2 = new Intent(getActivity(), actionbar15.class);
                                                        				startActivity(intent2);
                                                              	   		}else if(tempadd[15].equals(marker.getTitle())){
                                                                  			Intent intent2 = new Intent(getActivity(), actionbar16.class);
                                                            				startActivity(intent2);
                                                                  	   		}else if(tempadd[16].equals(marker.getTitle())){
                                                                      			Intent intent2 = new Intent(getActivity(), actionbar17.class);
                                                                				startActivity(intent2);
                                                                      	   		}else if(tempadd[17].equals(marker.getTitle())){
                                                                          			Intent intent2 = new Intent(getActivity(), actionbar18.class);
                                                                    				startActivity(intent2);
                                                                          	   		}else if(tempadd[18].equals(marker.getTitle())){
                                                                              			Intent intent2 = new Intent(getActivity(), actionbar19.class);
                                                                        				startActivity(intent2);
                                                                              	   		}else if(tempadd[19].equals(marker.getTitle())){
                                                                                  			Intent intent2 = new Intent(getActivity(), actionbar20.class);
                                                                            				startActivity(intent2);
                                                                                  	   		}else if(tempadd[20].equals(marker.getTitle())){
                                                                                      			Intent intent2 = new Intent(getActivity(), actionbar21.class);
                                                                                				startActivity(intent2);
                                                                                      	   		}else if(tempadd[21].equals(marker.getTitle())){
                                                                                          			Intent intent2 = new Intent(getActivity(), actionbar22.class);
                                                                                    				startActivity(intent2);
                                                                                          	   		}else if(tempadd[22].equals(marker.getTitle())){
                                                                                              			Intent intent2 = new Intent(getActivity(), actionbar23.class);
                                                                                        				startActivity(intent2);
                                                                                              	   		}else if(tempadd[23].equals(marker.getTitle())){
                                                                                                  			Intent intent2 = new Intent(getActivity(), actionbar24.class);
                                                                                            				startActivity(intent2);
                                                                                                  	   		}

        //click한 infowindow의 marker가 전달 된다.

        }

        });



   //마커를 클릭했을 때 호출됨
   mGoogleMap.setOnMarkerClickListener(new OnMarkerClickListener() {

   	@Override

   	public boolean onMarkerClick(Marker marker) {
   		
   		
 

   	// TODO Auto-generated method stub

   	return false;

   	}

   	});
    	}
    	 locationTag=false;
	}
    
   
    
    
}