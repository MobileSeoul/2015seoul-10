package com.cym5240.pis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;

public class random extends SherlockActivity {  
	  
    private WebView mWebView;  
    
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
	 
	 String temp;
	 String temp2;
	 String temp3;
	 String temp4;
	 String temp5;
	 String temp6;
	 String temp7;
	 String temp8;
	 String temp9;
	 String temp10;
	 String temp11;
	 String temp12;
	 String temp13;
	 String temp14;
	 String temp15;
	 String temp16;
	 String temp17;
	 String temp18;
	 String temp19;
	 String temp20;
	 String temp21;
	 String temp22;
	 String temp23;
	 String temp24;

    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Used to put dark icons on light action bar
    	
    	getActionBar().setTitle("  ¹«ÀÛÀ§ ¼¯±â");
    	getActionBar().setDisplayShowHomeEnabled(false);
    	getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    	
    	
        boolean isLight = SampleList.THEME == R.style.Theme_Favorite;
 
        return true;
    }
  
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.fragmenttab1);  
        
        ibtn24 = (ImageView)findViewById(R.id.imageView1);
 
        
        
       ibtn = (ImageView)findViewById(R.id.imageView1); 
   	   ibtn2 = (ImageView)findViewById(R.id.imageView2); 
   	   ibtn3 = (ImageView)findViewById(R.id.imageView3); 
   	   ibtn4 = (ImageView)findViewById(R.id.imageView4); 
   	   ibtn5 = (ImageView)findViewById(R.id.imageView5); 
   	   ibtn6 = (ImageView)findViewById(R.id.imageView6); 
   	   ibtn7 = (ImageView)findViewById(R.id.imageView7); 
   	   ibtn8 = (ImageView)findViewById(R.id.imageView8); 
   	   ibtn9 = (ImageView)findViewById(R.id.imageView9); 
   	   ibtn10 = (ImageView)findViewById(R.id.imageView10); 
   	   ibtn11 = (ImageView)findViewById(R.id.imageView11); 
   	   ibtn12 = (ImageView)findViewById(R.id.imageView12); 
   	   ibtn13 = (ImageView)findViewById(R.id.imageView13); 
   	   ibtn14 = (ImageView)findViewById(R.id.imageView14); 
   	   ibtn15 = (ImageView)findViewById(R.id.imageView15); 
   	   ibtn16 = (ImageView)findViewById(R.id.imageView16); 
   	   ibtn17 = (ImageView)findViewById(R.id.imageView17); 
   	   ibtn18 = (ImageView)findViewById(R.id.imageView18); 
   	   ibtn19 = (ImageView)findViewById(R.id.imageView19); 
   	   ibtn20 = (ImageView)findViewById(R.id.imageView20);
   	   ibtn21 = (ImageView)findViewById(R.id.imageView21);
   	   ibtn22 = (ImageView)findViewById(R.id.imageView22);
   	   ibtn23 = (ImageView)findViewById(R.id.imageView23);
   	   ibtn24 = (ImageView)findViewById(R.id.imageView24);
        
        String strs[] = {"1", "2", "3", "4", "5", "6", "7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24"}; 
        List<String> list = Arrays.asList(strs); 
        Collections.shuffle(list); 
        
        
        
        temp=list.get(0);
        temp2=list.get(1);
        temp3=list.get(2);
        temp4=list.get(3);
        temp5=list.get(4);
        temp6=list.get(5);
        temp7=list.get(6);
        temp8=list.get(7);
        temp9=list.get(8);
        temp10=list.get(9);
        temp11=list.get(10);
        temp12=list.get(11);
        temp13=list.get(12);
        temp14=list.get(13);
        temp15=list.get(14);
        temp16=list.get(15);
        temp17=list.get(16);
        temp18=list.get(17);
        temp19=list.get(18);
        temp20=list.get(19);
        temp21=list.get(20);
        temp22=list.get(21);
        temp23=list.get(22);
        temp24=list.get(23);
        
        
   
        if(temp.equals("1")){
        ibtn.setImageResource(R.drawable.naksan);
		ibtn.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				
				Intent intent2 = new Intent(random.this, actionbar.class);
				startActivity(intent2);

				

			}
		});
        }else if(temp.equals("2")){
            ibtn.setImageResource(R.drawable.namsan);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar2.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("3")){
            ibtn.setImageResource(R.drawable.world);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar3.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("4")){
            ibtn.setImageResource(R.drawable.gyeong);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar4.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("5")){
            ibtn.setImageResource(R.drawable.gahi);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar5.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("6")){
            ibtn.setImageResource(R.drawable.lover);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar6.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("7")){
            ibtn.setImageResource(R.drawable.noryang);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar7.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("8")){
            ibtn.setImageResource(R.drawable.noryang);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar8.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("9")){
            ibtn.setImageResource(R.drawable.hangang);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar9.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("10")){
            ibtn.setImageResource(R.drawable.heoi);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar10.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("11")){
            ibtn.setImageResource(R.drawable.cheong);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar11.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("12")){
            ibtn.setImageResource(R.drawable.design);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar12.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("13")){
            ibtn.setImageResource(R.drawable.sangam);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar13.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("14")){
            ibtn.setImageResource(R.drawable.yeon);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar14.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("15")){
            ibtn.setImageResource(R.drawable.sajik);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar15.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("16")){
            ibtn.setImageResource(R.drawable.doldam);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar16.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("17")){
            ibtn.setImageResource(R.drawable.apgu);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar17.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("18")){
            ibtn.setImageResource(R.drawable.chang);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar18.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("19")){
            ibtn.setImageResource(R.drawable.wee);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar19.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("20")){
            ibtn.setImageResource(R.drawable.station);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar20.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("21")){
            ibtn.setImageResource(R.drawable.dae);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar21.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("22")){
            ibtn.setImageResource(R.drawable.dongd);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar22.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("23")){
            ibtn.setImageResource(R.drawable.yeoi);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar23.class);
    				startActivity(intent2);

    				

    			}
    		});
        }else if(temp.equals("24")){
            ibtn.setImageResource(R.drawable.yeong);
    		ibtn.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar24.class);
    				startActivity(intent2);

    				

    			}
    		});
        }
       

        
        
        
        
        
        
        if(temp2.equals("1")){
            ibtn2.setImageResource(R.drawable.naksan);
    		ibtn2.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp2.equals("2")){
                ibtn2.setImageResource(R.drawable.namsan);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("3")){
                ibtn2.setImageResource(R.drawable.world);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("4")){
                ibtn2.setImageResource(R.drawable.gyeong);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("5")){
                ibtn2.setImageResource(R.drawable.gahi);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("6")){
                ibtn2.setImageResource(R.drawable.lover);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("7")){
                ibtn2.setImageResource(R.drawable.noryang);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("8")){
                ibtn2.setImageResource(R.drawable.yeong);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("9")){
                ibtn2.setImageResource(R.drawable.hangang);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("10")){
                ibtn2.setImageResource(R.drawable.heoi);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("11")){
                ibtn2.setImageResource(R.drawable.cheong);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("12")){
                ibtn2.setImageResource(R.drawable.design);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("13")){
                ibtn2.setImageResource(R.drawable.sangam);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("14")){
                ibtn2.setImageResource(R.drawable.yeon);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("15")){
                ibtn2.setImageResource(R.drawable.sajik);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("16")){
                ibtn2.setImageResource(R.drawable.doldam);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("17")){
                ibtn2.setImageResource(R.drawable.apgu);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("18")){
                ibtn2.setImageResource(R.drawable.chang);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("19")){
                ibtn2.setImageResource(R.drawable.wee);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("20")){
                ibtn2.setImageResource(R.drawable.station);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("21")){
                ibtn2.setImageResource(R.drawable.dae);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("22")){
                ibtn2.setImageResource(R.drawable.dongd);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("23")){
                ibtn2.setImageResource(R.drawable.yeoi);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp2.equals("24")){
                ibtn2.setImageResource(R.drawable.yeong);
        		ibtn2.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        
        
        
        
        if(temp3.equals("1")){
            ibtn3.setImageResource(R.drawable.naksan);
    		ibtn3.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp3.equals("2")){
                ibtn3.setImageResource(R.drawable.namsan);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("3")){
                ibtn3.setImageResource(R.drawable.world);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("4")){
                ibtn3.setImageResource(R.drawable.gyeong);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("5")){
                ibtn3.setImageResource(R.drawable.gahi);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("6")){
                ibtn3.setImageResource(R.drawable.lover);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("7")){
                ibtn3.setImageResource(R.drawable.noryang);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("8")){
                ibtn3.setImageResource(R.drawable.yeong);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("9")){
                ibtn3.setImageResource(R.drawable.hangang);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("10")){
                ibtn3.setImageResource(R.drawable.heoi);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("11")){
                ibtn3.setImageResource(R.drawable.cheong);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("12")){
                ibtn3.setImageResource(R.drawable.design);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("13")){
                ibtn3.setImageResource(R.drawable.sangam);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("14")){
                ibtn3.setImageResource(R.drawable.yeon);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("15")){
                ibtn3.setImageResource(R.drawable.sajik);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("16")){
                ibtn3.setImageResource(R.drawable.doldam);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("17")){
                ibtn3.setImageResource(R.drawable.apgu);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("18")){
                ibtn3.setImageResource(R.drawable.chang);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("19")){
                ibtn3.setImageResource(R.drawable.wee);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("20")){
                ibtn3.setImageResource(R.drawable.station);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("21")){
                ibtn3.setImageResource(R.drawable.dae);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("22")){
                ibtn3.setImageResource(R.drawable.dongd);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("23")){
                ibtn3.setImageResource(R.drawable.yeoi);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp3.equals("24")){
                ibtn3.setImageResource(R.drawable.yeong);
        		ibtn3.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        if(temp4.equals("1")){
            ibtn4.setImageResource(R.drawable.naksan);
    		ibtn4.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp4.equals("2")){
                ibtn4.setImageResource(R.drawable.namsan);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("3")){
                ibtn4.setImageResource(R.drawable.world);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("4")){
                ibtn4.setImageResource(R.drawable.gyeong);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("5")){
                ibtn4.setImageResource(R.drawable.gahi);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("6")){
                ibtn4.setImageResource(R.drawable.lover);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("7")){
                ibtn4.setImageResource(R.drawable.noryang);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("8")){
                ibtn4.setImageResource(R.drawable.yeong);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("9")){
                ibtn4.setImageResource(R.drawable.hangang);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("10")){
                ibtn4.setImageResource(R.drawable.heoi);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("11")){
                ibtn4.setImageResource(R.drawable.cheong);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("12")){
                ibtn4.setImageResource(R.drawable.design);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("13")){
                ibtn4.setImageResource(R.drawable.sangam);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("14")){
                ibtn4.setImageResource(R.drawable.yeon);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("15")){
                ibtn4.setImageResource(R.drawable.sajik);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("16")){
                ibtn4.setImageResource(R.drawable.doldam);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("17")){
                ibtn4.setImageResource(R.drawable.apgu);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("18")){
                ibtn4.setImageResource(R.drawable.chang);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("19")){
                ibtn4.setImageResource(R.drawable.wee);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("20")){
                ibtn4.setImageResource(R.drawable.station);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("21")){
                ibtn4.setImageResource(R.drawable.dae);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("22")){
                ibtn4.setImageResource(R.drawable.dongd);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("23")){
                ibtn4.setImageResource(R.drawable.yeoi);
        		ibtn4.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp4.equals("24")){
                ibtn4.setImageResource(R.drawable.yeong);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        


        
        
        
        
        if(temp5.equals("1")){
            ibtn5.setImageResource(R.drawable.naksan);
    		ibtn5.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp5.equals("2")){
                ibtn5.setImageResource(R.drawable.namsan);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("3")){
                ibtn5.setImageResource(R.drawable.world);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("4")){
                ibtn5.setImageResource(R.drawable.gyeong);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("5")){
                ibtn5.setImageResource(R.drawable.gahi);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("6")){
                ibtn5.setImageResource(R.drawable.lover);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("7")){
                ibtn5.setImageResource(R.drawable.noryang);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("8")){
                ibtn5.setImageResource(R.drawable.yeong);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("9")){
                ibtn5.setImageResource(R.drawable.hangang);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("10")){
                ibtn5.setImageResource(R.drawable.heoi);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("11")){
                ibtn5.setImageResource(R.drawable.cheong);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("12")){
                ibtn5.setImageResource(R.drawable.design);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("13")){
                ibtn5.setImageResource(R.drawable.sangam);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("14")){
                ibtn5.setImageResource(R.drawable.yeon);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("15")){
                ibtn5.setImageResource(R.drawable.sajik);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("16")){
                ibtn5.setImageResource(R.drawable.doldam);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("17")){
                ibtn5.setImageResource(R.drawable.apgu);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("18")){
                ibtn5.setImageResource(R.drawable.chang);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("19")){
                ibtn5.setImageResource(R.drawable.wee);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("20")){
                ibtn5.setImageResource(R.drawable.station);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("21")){
                ibtn5.setImageResource(R.drawable.dae);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("22")){
                ibtn5.setImageResource(R.drawable.dongd);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("23")){
                ibtn5.setImageResource(R.drawable.yeoi);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp5.equals("24")){
                ibtn5.setImageResource(R.drawable.yeong);
        		ibtn5.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        
        if(temp6.equals("1")){
            ibtn6.setImageResource(R.drawable.naksan);
    		ibtn6.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp6.equals("2")){
                ibtn6.setImageResource(R.drawable.namsan);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("3")){
                ibtn6.setImageResource(R.drawable.world);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("4")){
                ibtn6.setImageResource(R.drawable.gyeong);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("5")){
                ibtn6.setImageResource(R.drawable.gahi);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("6")){
                ibtn6.setImageResource(R.drawable.lover);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("7")){
                ibtn6.setImageResource(R.drawable.noryang);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("8")){
                ibtn6.setImageResource(R.drawable.yeong);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("9")){
                ibtn6.setImageResource(R.drawable.hangang);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("10")){
                ibtn6.setImageResource(R.drawable.heoi);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("11")){
                ibtn6.setImageResource(R.drawable.cheong);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("12")){
                ibtn6.setImageResource(R.drawable.design);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("13")){
                ibtn6.setImageResource(R.drawable.sangam);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("14")){
                ibtn6.setImageResource(R.drawable.yeon);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("15")){
                ibtn6.setImageResource(R.drawable.sajik);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("16")){
                ibtn6.setImageResource(R.drawable.doldam);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("17")){
                ibtn6.setImageResource(R.drawable.apgu);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("18")){
                ibtn6.setImageResource(R.drawable.chang);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("19")){
                ibtn6.setImageResource(R.drawable.wee);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("20")){
                ibtn6.setImageResource(R.drawable.station);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("21")){
                ibtn6.setImageResource(R.drawable.dae);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("22")){
                ibtn6.setImageResource(R.drawable.dongd);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("23")){
                ibtn6.setImageResource(R.drawable.yeoi);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp6.equals("24")){
                ibtn6.setImageResource(R.drawable.yeong);
        		ibtn6.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        
        
        if(temp7.equals("1")){
            ibtn7.setImageResource(R.drawable.naksan);
    		ibtn7.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp7.equals("2")){
                ibtn7.setImageResource(R.drawable.namsan);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("3")){
                ibtn7.setImageResource(R.drawable.world);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("4")){
                ibtn7.setImageResource(R.drawable.gyeong);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("5")){
                ibtn7.setImageResource(R.drawable.gahi);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("6")){
                ibtn7.setImageResource(R.drawable.lover);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("7")){
                ibtn7.setImageResource(R.drawable.noryang);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("8")){
                ibtn7.setImageResource(R.drawable.yeong);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("9")){
                ibtn7.setImageResource(R.drawable.hangang);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("10")){
                ibtn7.setImageResource(R.drawable.heoi);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("11")){
                ibtn7.setImageResource(R.drawable.cheong);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("12")){
                ibtn7.setImageResource(R.drawable.design);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("13")){
                ibtn7.setImageResource(R.drawable.sangam);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("14")){
                ibtn7.setImageResource(R.drawable.yeon);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("15")){
                ibtn7.setImageResource(R.drawable.sajik);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("16")){
                ibtn7.setImageResource(R.drawable.doldam);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("17")){
                ibtn7.setImageResource(R.drawable.apgu);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("18")){
                ibtn7.setImageResource(R.drawable.chang);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("19")){
                ibtn7.setImageResource(R.drawable.wee);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("20")){
                ibtn7.setImageResource(R.drawable.station);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("21")){
                ibtn7.setImageResource(R.drawable.dae);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("22")){
                ibtn7.setImageResource(R.drawable.dongd);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("23")){
                ibtn7.setImageResource(R.drawable.yeoi);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp7.equals("24")){
                ibtn7.setImageResource(R.drawable.yeong);
        		ibtn7.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        


        
        
        
        if(temp8.equals("1")){
            ibtn8.setImageResource(R.drawable.naksan);
    		ibtn8.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp8.equals("2")){
                ibtn8.setImageResource(R.drawable.namsan);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("3")){
                ibtn8.setImageResource(R.drawable.world);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("4")){
                ibtn8.setImageResource(R.drawable.gyeong);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("5")){
                ibtn8.setImageResource(R.drawable.gahi);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("6")){
                ibtn8.setImageResource(R.drawable.lover);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("7")){
                ibtn8.setImageResource(R.drawable.noryang);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("8")){
                ibtn8.setImageResource(R.drawable.yeong);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("9")){
                ibtn8.setImageResource(R.drawable.hangang);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("10")){
                ibtn8.setImageResource(R.drawable.heoi);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("11")){
                ibtn8.setImageResource(R.drawable.cheong);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("12")){
                ibtn8.setImageResource(R.drawable.design);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("13")){
                ibtn8.setImageResource(R.drawable.sangam);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("14")){
                ibtn8.setImageResource(R.drawable.yeon);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("15")){
                ibtn8.setImageResource(R.drawable.sajik);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("16")){
                ibtn8.setImageResource(R.drawable.doldam);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("17")){
                ibtn8.setImageResource(R.drawable.apgu);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("18")){
                ibtn8.setImageResource(R.drawable.chang);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("19")){
                ibtn8.setImageResource(R.drawable.wee);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("20")){
                ibtn8.setImageResource(R.drawable.station);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("21")){
                ibtn8.setImageResource(R.drawable.dae);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("22")){
                ibtn8.setImageResource(R.drawable.dongd);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("23")){
                ibtn8.setImageResource(R.drawable.yeoi);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp8.equals("24")){
                ibtn8.setImageResource(R.drawable.yeong);
        		ibtn8.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        if(temp9.equals("1")){
            ibtn9.setImageResource(R.drawable.naksan);
    		ibtn9.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp9.equals("2")){
                ibtn9.setImageResource(R.drawable.namsan);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("3")){
                ibtn9.setImageResource(R.drawable.world);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("4")){
                ibtn9.setImageResource(R.drawable.gyeong);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("5")){
                ibtn9.setImageResource(R.drawable.gahi);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("6")){
                ibtn9.setImageResource(R.drawable.lover);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("7")){
                ibtn9.setImageResource(R.drawable.noryang);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("8")){
                ibtn9.setImageResource(R.drawable.yeong);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("9")){
                ibtn9.setImageResource(R.drawable.hangang);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("10")){
                ibtn9.setImageResource(R.drawable.heoi);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("11")){
                ibtn9.setImageResource(R.drawable.cheong);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("12")){
                ibtn9.setImageResource(R.drawable.design);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("13")){
                ibtn9.setImageResource(R.drawable.sangam);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("14")){
                ibtn9.setImageResource(R.drawable.yeon);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("15")){
                ibtn9.setImageResource(R.drawable.sajik);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("16")){
                ibtn9.setImageResource(R.drawable.doldam);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("17")){
                ibtn9.setImageResource(R.drawable.apgu);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("18")){
                ibtn9.setImageResource(R.drawable.chang);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("19")){
                ibtn9.setImageResource(R.drawable.wee);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("20")){
                ibtn9.setImageResource(R.drawable.station);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("21")){
                ibtn9.setImageResource(R.drawable.dae);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("22")){
                ibtn9.setImageResource(R.drawable.dongd);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("23")){
                ibtn9.setImageResource(R.drawable.yeoi);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp9.equals("24")){
                ibtn9.setImageResource(R.drawable.yeong);
        		ibtn9.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        if(temp10.equals("1")){
            ibtn10.setImageResource(R.drawable.naksan);
    		ibtn10.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp10.equals("2")){
                ibtn10.setImageResource(R.drawable.namsan);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("3")){
                ibtn10.setImageResource(R.drawable.world);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("4")){
                ibtn10.setImageResource(R.drawable.gyeong);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("5")){
                ibtn10.setImageResource(R.drawable.gahi);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("6")){
                ibtn10.setImageResource(R.drawable.lover);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("7")){
                ibtn10.setImageResource(R.drawable.noryang);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("8")){
                ibtn10.setImageResource(R.drawable.yeong);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("9")){
                ibtn10.setImageResource(R.drawable.hangang);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("10")){
                ibtn10.setImageResource(R.drawable.heoi);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("11")){
                ibtn10.setImageResource(R.drawable.cheong);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("12")){
                ibtn10.setImageResource(R.drawable.design);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("13")){
                ibtn10.setImageResource(R.drawable.sangam);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("14")){
                ibtn10.setImageResource(R.drawable.yeon);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("15")){
                ibtn10.setImageResource(R.drawable.sajik);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("16")){
                ibtn10.setImageResource(R.drawable.doldam);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("17")){
                ibtn10.setImageResource(R.drawable.apgu);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("18")){
                ibtn10.setImageResource(R.drawable.chang);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("19")){
                ibtn10.setImageResource(R.drawable.wee);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("20")){
                ibtn10.setImageResource(R.drawable.station);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("21")){
                ibtn10.setImageResource(R.drawable.dae);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("22")){
                ibtn10.setImageResource(R.drawable.dongd);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("23")){
                ibtn10.setImageResource(R.drawable.yeoi);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp10.equals("24")){
                ibtn10.setImageResource(R.drawable.yeong);
        		ibtn10.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        
        if(temp11.equals("1")){
            ibtn11.setImageResource(R.drawable.naksan);
    		ibtn11.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp11.equals("2")){
                ibtn11.setImageResource(R.drawable.namsan);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("3")){
                ibtn11.setImageResource(R.drawable.world);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("4")){
                ibtn11.setImageResource(R.drawable.gyeong);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("5")){
                ibtn11.setImageResource(R.drawable.gahi);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("6")){
                ibtn11.setImageResource(R.drawable.lover);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("7")){
                ibtn11.setImageResource(R.drawable.noryang);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("8")){
                ibtn11.setImageResource(R.drawable.yeong);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("9")){
                ibtn11.setImageResource(R.drawable.hangang);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("10")){
                ibtn11.setImageResource(R.drawable.heoi);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("11")){
                ibtn11.setImageResource(R.drawable.cheong);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("12")){
                ibtn11.setImageResource(R.drawable.design);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("13")){
                ibtn11.setImageResource(R.drawable.sangam);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("14")){
                ibtn11.setImageResource(R.drawable.yeon);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("15")){
                ibtn11.setImageResource(R.drawable.sajik);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("16")){
                ibtn11.setImageResource(R.drawable.doldam);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("17")){
                ibtn11.setImageResource(R.drawable.apgu);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("18")){
                ibtn11.setImageResource(R.drawable.chang);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("19")){
                ibtn11.setImageResource(R.drawable.wee);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("20")){
                ibtn11.setImageResource(R.drawable.station);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("21")){
                ibtn11.setImageResource(R.drawable.dae);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("22")){
                ibtn11.setImageResource(R.drawable.dongd);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("23")){
                ibtn11.setImageResource(R.drawable.yeoi);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp11.equals("24")){
                ibtn11.setImageResource(R.drawable.yeong);
        		ibtn11.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        if(temp12.equals("1")){
            ibtn12.setImageResource(R.drawable.naksan);
    		ibtn12.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp12.equals("2")){
                ibtn12.setImageResource(R.drawable.namsan);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("3")){
                ibtn12.setImageResource(R.drawable.world);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("4")){
                ibtn12.setImageResource(R.drawable.gyeong);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("5")){
                ibtn12.setImageResource(R.drawable.gahi);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("6")){
                ibtn12.setImageResource(R.drawable.lover);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("7")){
                ibtn12.setImageResource(R.drawable.noryang);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("8")){
                ibtn12.setImageResource(R.drawable.yeong);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("9")){
                ibtn12.setImageResource(R.drawable.hangang);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("10")){
                ibtn12.setImageResource(R.drawable.heoi);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("11")){
                ibtn12.setImageResource(R.drawable.cheong);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("12")){
                ibtn12.setImageResource(R.drawable.design);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("13")){
                ibtn12.setImageResource(R.drawable.sangam);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("14")){
                ibtn12.setImageResource(R.drawable.yeon);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("15")){
                ibtn12.setImageResource(R.drawable.sajik);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("16")){
                ibtn12.setImageResource(R.drawable.doldam);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("17")){
                ibtn12.setImageResource(R.drawable.apgu);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("18")){
                ibtn12.setImageResource(R.drawable.chang);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("19")){
                ibtn12.setImageResource(R.drawable.wee);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("20")){
                ibtn12.setImageResource(R.drawable.station);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("21")){
                ibtn12.setImageResource(R.drawable.dae);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("22")){
                ibtn12.setImageResource(R.drawable.dongd);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("23")){
                ibtn12.setImageResource(R.drawable.yeoi);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp12.equals("24")){
                ibtn12.setImageResource(R.drawable.yeong);
        		ibtn12.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        if(temp13.equals("1")){
            ibtn13.setImageResource(R.drawable.naksan);
    		ibtn13.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp13.equals("2")){
                ibtn13.setImageResource(R.drawable.namsan);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("3")){
                ibtn13.setImageResource(R.drawable.world);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("4")){
                ibtn13.setImageResource(R.drawable.gyeong);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("5")){
                ibtn13.setImageResource(R.drawable.gahi);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("6")){
                ibtn13.setImageResource(R.drawable.lover);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("7")){
                ibtn13.setImageResource(R.drawable.noryang);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("8")){
                ibtn13.setImageResource(R.drawable.yeong);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("9")){
                ibtn13.setImageResource(R.drawable.hangang);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("10")){
                ibtn13.setImageResource(R.drawable.heoi);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("11")){
                ibtn13.setImageResource(R.drawable.cheong);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("12")){
                ibtn13.setImageResource(R.drawable.design);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("13")){
                ibtn13.setImageResource(R.drawable.sangam);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("14")){
                ibtn13.setImageResource(R.drawable.yeon);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("15")){
                ibtn13.setImageResource(R.drawable.sajik);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("16")){
                ibtn13.setImageResource(R.drawable.doldam);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("17")){
                ibtn13.setImageResource(R.drawable.apgu);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("18")){
                ibtn13.setImageResource(R.drawable.chang);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("19")){
                ibtn13.setImageResource(R.drawable.wee);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("20")){
                ibtn13.setImageResource(R.drawable.station);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("21")){
                ibtn13.setImageResource(R.drawable.dae);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("22")){
                ibtn13.setImageResource(R.drawable.dongd);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("23")){
                ibtn13.setImageResource(R.drawable.yeoi);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp13.equals("24")){
                ibtn13.setImageResource(R.drawable.yeong);
        		ibtn13.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        if(temp14.equals("1")){
            ibtn14.setImageResource(R.drawable.naksan);
    		ibtn14.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp14.equals("2")){
                ibtn14.setImageResource(R.drawable.namsan);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("3")){
                ibtn14.setImageResource(R.drawable.world);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("4")){
                ibtn14.setImageResource(R.drawable.gyeong);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("5")){
                ibtn14.setImageResource(R.drawable.gahi);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("6")){
                ibtn14.setImageResource(R.drawable.lover);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("7")){
                ibtn14.setImageResource(R.drawable.noryang);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("8")){
                ibtn14.setImageResource(R.drawable.yeong);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("9")){
                ibtn14.setImageResource(R.drawable.hangang);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("10")){
                ibtn14.setImageResource(R.drawable.heoi);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("11")){
                ibtn14.setImageResource(R.drawable.cheong);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("12")){
                ibtn14.setImageResource(R.drawable.design);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("13")){
                ibtn14.setImageResource(R.drawable.sangam);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("14")){
                ibtn14.setImageResource(R.drawable.yeon);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("15")){
                ibtn14.setImageResource(R.drawable.sajik);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("16")){
                ibtn14.setImageResource(R.drawable.doldam);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("17")){
                ibtn14.setImageResource(R.drawable.apgu);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("18")){
                ibtn14.setImageResource(R.drawable.chang);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("19")){
                ibtn14.setImageResource(R.drawable.wee);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("20")){
                ibtn14.setImageResource(R.drawable.station);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("21")){
                ibtn14.setImageResource(R.drawable.dae);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("22")){
                ibtn14.setImageResource(R.drawable.dongd);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("23")){
                ibtn14.setImageResource(R.drawable.yeoi);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp14.equals("24")){
                ibtn14.setImageResource(R.drawable.yeong);
        		ibtn14.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        
        
        
        if(temp15.equals("1")){
            ibtn15.setImageResource(R.drawable.naksan);
    		ibtn15.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp15.equals("2")){
                ibtn15.setImageResource(R.drawable.namsan);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("3")){
                ibtn15.setImageResource(R.drawable.world);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("4")){
                ibtn15.setImageResource(R.drawable.gyeong);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("5")){
                ibtn15.setImageResource(R.drawable.gahi);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("6")){
                ibtn15.setImageResource(R.drawable.lover);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("7")){
                ibtn15.setImageResource(R.drawable.noryang);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("8")){
                ibtn15.setImageResource(R.drawable.yeong);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("9")){
                ibtn15.setImageResource(R.drawable.hangang);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("10")){
                ibtn15.setImageResource(R.drawable.heoi);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("11")){
                ibtn15.setImageResource(R.drawable.cheong);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("12")){
                ibtn15.setImageResource(R.drawable.design);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("13")){
                ibtn15.setImageResource(R.drawable.sangam);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("14")){
                ibtn15.setImageResource(R.drawable.yeon);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("15")){
                ibtn15.setImageResource(R.drawable.sajik);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("16")){
                ibtn15.setImageResource(R.drawable.doldam);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("17")){
                ibtn15.setImageResource(R.drawable.apgu);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("18")){
                ibtn15.setImageResource(R.drawable.chang);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("19")){
                ibtn15.setImageResource(R.drawable.wee);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("20")){
                ibtn15.setImageResource(R.drawable.station);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("21")){
                ibtn15.setImageResource(R.drawable.dae);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("22")){
                ibtn15.setImageResource(R.drawable.dongd);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("23")){
                ibtn15.setImageResource(R.drawable.yeoi);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp15.equals("24")){
                ibtn15.setImageResource(R.drawable.yeong);
        		ibtn15.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        
        
        
        
        if(temp16.equals("1")){
            ibtn16.setImageResource(R.drawable.naksan);
    		ibtn16.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp16.equals("2")){
                ibtn16.setImageResource(R.drawable.namsan);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("3")){
                ibtn16.setImageResource(R.drawable.world);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("4")){
                ibtn16.setImageResource(R.drawable.gyeong);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("5")){
                ibtn16.setImageResource(R.drawable.gahi);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("6")){
                ibtn16.setImageResource(R.drawable.lover);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("7")){
                ibtn16.setImageResource(R.drawable.noryang);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("8")){
                ibtn16.setImageResource(R.drawable.yeong);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("9")){
                ibtn16.setImageResource(R.drawable.hangang);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("10")){
                ibtn16.setImageResource(R.drawable.heoi);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("11")){
                ibtn16.setImageResource(R.drawable.cheong);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("12")){
                ibtn16.setImageResource(R.drawable.design);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("13")){
                ibtn16.setImageResource(R.drawable.sangam);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("14")){
                ibtn16.setImageResource(R.drawable.yeon);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("15")){
                ibtn16.setImageResource(R.drawable.sajik);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("16")){
                ibtn16.setImageResource(R.drawable.doldam);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("17")){
                ibtn16.setImageResource(R.drawable.apgu);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("18")){
                ibtn16.setImageResource(R.drawable.chang);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("19")){
                ibtn16.setImageResource(R.drawable.wee);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("20")){
                ibtn16.setImageResource(R.drawable.station);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("21")){
                ibtn16.setImageResource(R.drawable.dae);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("22")){
                ibtn16.setImageResource(R.drawable.dongd);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("23")){
                ibtn16.setImageResource(R.drawable.yeoi);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp16.equals("24")){
                ibtn16.setImageResource(R.drawable.yeong);
        		ibtn16.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        if(temp17.equals("1")){
            ibtn17.setImageResource(R.drawable.naksan);
    		ibtn17.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp17.equals("2")){
                ibtn17.setImageResource(R.drawable.namsan);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("3")){
                ibtn17.setImageResource(R.drawable.world);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("4")){
                ibtn17.setImageResource(R.drawable.gyeong);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("5")){
                ibtn17.setImageResource(R.drawable.gahi);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("6")){
                ibtn17.setImageResource(R.drawable.lover);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("7")){
                ibtn17.setImageResource(R.drawable.noryang);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("8")){
                ibtn17.setImageResource(R.drawable.yeong);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("9")){
                ibtn17.setImageResource(R.drawable.hangang);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("10")){
                ibtn17.setImageResource(R.drawable.heoi);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("11")){
                ibtn17.setImageResource(R.drawable.cheong);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("12")){
                ibtn17.setImageResource(R.drawable.design);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("13")){
                ibtn17.setImageResource(R.drawable.sangam);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("14")){
                ibtn17.setImageResource(R.drawable.yeon);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("15")){
                ibtn17.setImageResource(R.drawable.sajik);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("16")){
                ibtn17.setImageResource(R.drawable.doldam);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("17")){
                ibtn17.setImageResource(R.drawable.apgu);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("18")){
                ibtn17.setImageResource(R.drawable.chang);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("19")){
                ibtn17.setImageResource(R.drawable.wee);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("20")){
                ibtn17.setImageResource(R.drawable.station);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("21")){
                ibtn17.setImageResource(R.drawable.dae);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("22")){
                ibtn17.setImageResource(R.drawable.dongd);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("23")){
                ibtn17.setImageResource(R.drawable.yeoi);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp17.equals("24")){
                ibtn17.setImageResource(R.drawable.yeong);
        		ibtn17.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
       }
        
        
        
        
        
        
        if(temp18.equals("1")){
            ibtn18.setImageResource(R.drawable.naksan);
    		ibtn18.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp18.equals("2")){
                ibtn18.setImageResource(R.drawable.namsan);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("3")){
                ibtn18.setImageResource(R.drawable.world);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("4")){
                ibtn18.setImageResource(R.drawable.gyeong);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("5")){
                ibtn18.setImageResource(R.drawable.gahi);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("6")){
                ibtn18.setImageResource(R.drawable.lover);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("7")){
                ibtn18.setImageResource(R.drawable.noryang);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("8")){
                ibtn18.setImageResource(R.drawable.yeong);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("9")){
                ibtn18.setImageResource(R.drawable.hangang);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("10")){
                ibtn18.setImageResource(R.drawable.heoi);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("11")){
                ibtn18.setImageResource(R.drawable.cheong);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("12")){
                ibtn18.setImageResource(R.drawable.design);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("13")){
                ibtn18.setImageResource(R.drawable.sangam);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("14")){
                ibtn18.setImageResource(R.drawable.yeon);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("15")){
                ibtn18.setImageResource(R.drawable.sajik);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("16")){
                ibtn18.setImageResource(R.drawable.doldam);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("17")){
                ibtn18.setImageResource(R.drawable.apgu);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("18")){
                ibtn18.setImageResource(R.drawable.chang);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("19")){
                ibtn18.setImageResource(R.drawable.wee);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("20")){
                ibtn18.setImageResource(R.drawable.station);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("21")){
                ibtn18.setImageResource(R.drawable.dae);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("22")){
                ibtn18.setImageResource(R.drawable.dongd);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("23")){
                ibtn18.setImageResource(R.drawable.yeoi);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp18.equals("24")){
                ibtn18.setImageResource(R.drawable.yeong);
        		ibtn18.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        
        
        
        
        
        if(temp19.equals("1")){
            ibtn19.setImageResource(R.drawable.naksan);
    		ibtn19.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp19.equals("2")){
                ibtn19.setImageResource(R.drawable.namsan);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("3")){
                ibtn19.setImageResource(R.drawable.world);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("4")){
                ibtn19.setImageResource(R.drawable.gyeong);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("5")){
                ibtn19.setImageResource(R.drawable.gahi);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("6")){
                ibtn19.setImageResource(R.drawable.lover);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("7")){
                ibtn19.setImageResource(R.drawable.noryang);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("8")){
                ibtn19.setImageResource(R.drawable.yeong);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("9")){
                ibtn19.setImageResource(R.drawable.hangang);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("10")){
                ibtn19.setImageResource(R.drawable.heoi);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("11")){
                ibtn19.setImageResource(R.drawable.cheong);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("12")){
                ibtn19.setImageResource(R.drawable.design);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("13")){
                ibtn19.setImageResource(R.drawable.sangam);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("14")){
                ibtn19.setImageResource(R.drawable.yeon);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("15")){
                ibtn19.setImageResource(R.drawable.sajik);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("16")){
                ibtn19.setImageResource(R.drawable.doldam);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("17")){
                ibtn19.setImageResource(R.drawable.apgu);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("18")){
                ibtn19.setImageResource(R.drawable.chang);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("19")){
                ibtn19.setImageResource(R.drawable.wee);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("20")){
                ibtn19.setImageResource(R.drawable.station);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("21")){
                ibtn19.setImageResource(R.drawable.dae);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("22")){
                ibtn19.setImageResource(R.drawable.dongd);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("23")){
                ibtn19.setImageResource(R.drawable.yeoi);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp19.equals("24")){
                ibtn19.setImageResource(R.drawable.yeong);
        		ibtn19.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        
        if(temp20.equals("1")){
            ibtn20.setImageResource(R.drawable.naksan);
    		ibtn20.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp20.equals("2")){
                ibtn20.setImageResource(R.drawable.namsan);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("3")){
                ibtn20.setImageResource(R.drawable.world);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("4")){
                ibtn20.setImageResource(R.drawable.gyeong);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("5")){
                ibtn20.setImageResource(R.drawable.gahi);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("6")){
                ibtn20.setImageResource(R.drawable.lover);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("7")){
                ibtn20.setImageResource(R.drawable.noryang);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("8")){
                ibtn20.setImageResource(R.drawable.yeong);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("9")){
                ibtn20.setImageResource(R.drawable.hangang);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("10")){
                ibtn20.setImageResource(R.drawable.heoi);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("11")){
                ibtn20.setImageResource(R.drawable.cheong);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("12")){
                ibtn20.setImageResource(R.drawable.design);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("13")){
                ibtn20.setImageResource(R.drawable.sangam);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("14")){
                ibtn20.setImageResource(R.drawable.yeon);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("15")){
                ibtn20.setImageResource(R.drawable.sajik);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("16")){
                ibtn20.setImageResource(R.drawable.doldam);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("17")){
                ibtn20.setImageResource(R.drawable.apgu);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("18")){
                ibtn20.setImageResource(R.drawable.chang);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("19")){
                ibtn20.setImageResource(R.drawable.wee);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("20")){
                ibtn20.setImageResource(R.drawable.station);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("21")){
                ibtn20.setImageResource(R.drawable.dae);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("22")){
                ibtn20.setImageResource(R.drawable.dongd);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("23")){
                ibtn20.setImageResource(R.drawable.yeoi);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp20.equals("24")){
                ibtn20.setImageResource(R.drawable.yeong);
        		ibtn20.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        
        if(temp21.equals("1")){
            ibtn21.setImageResource(R.drawable.naksan);
    		ibtn21.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp21.equals("2")){
                ibtn21.setImageResource(R.drawable.namsan);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("3")){
                ibtn21.setImageResource(R.drawable.world);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("4")){
                ibtn21.setImageResource(R.drawable.gyeong);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("5")){
                ibtn21.setImageResource(R.drawable.gahi);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("6")){
                ibtn21.setImageResource(R.drawable.lover);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("7")){
                ibtn21.setImageResource(R.drawable.noryang);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("8")){
                ibtn21.setImageResource(R.drawable.yeong);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("9")){
                ibtn21.setImageResource(R.drawable.hangang);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("10")){
                ibtn21.setImageResource(R.drawable.heoi);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("11")){
                ibtn21.setImageResource(R.drawable.cheong);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("12")){
                ibtn21.setImageResource(R.drawable.design);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("13")){
                ibtn21.setImageResource(R.drawable.sangam);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("14")){
                ibtn21.setImageResource(R.drawable.yeon);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("15")){
                ibtn21.setImageResource(R.drawable.sajik);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("16")){
                ibtn21.setImageResource(R.drawable.doldam);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("17")){
                ibtn21.setImageResource(R.drawable.apgu);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("18")){
                ibtn21.setImageResource(R.drawable.chang);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("19")){
                ibtn21.setImageResource(R.drawable.wee);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("20")){
                ibtn21.setImageResource(R.drawable.station);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("21")){
                ibtn21.setImageResource(R.drawable.dae);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("22")){
                ibtn21.setImageResource(R.drawable.dongd);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("23")){
                ibtn21.setImageResource(R.drawable.yeoi);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp21.equals("24")){
                ibtn21.setImageResource(R.drawable.yeong);
        		ibtn21.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        if(temp22.equals("1")){
            ibtn22.setImageResource(R.drawable.naksan);
    		ibtn22.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp22.equals("2")){
                ibtn22.setImageResource(R.drawable.namsan);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("3")){
                ibtn22.setImageResource(R.drawable.world);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("4")){
                ibtn22.setImageResource(R.drawable.gyeong);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("5")){
                ibtn22.setImageResource(R.drawable.gahi);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("6")){
                ibtn22.setImageResource(R.drawable.lover);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("7")){
                ibtn22.setImageResource(R.drawable.noryang);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("8")){
                ibtn22.setImageResource(R.drawable.yeong);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("9")){
                ibtn22.setImageResource(R.drawable.hangang);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("10")){
                ibtn22.setImageResource(R.drawable.heoi);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("11")){
                ibtn22.setImageResource(R.drawable.cheong);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("12")){
                ibtn22.setImageResource(R.drawable.design);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("13")){
                ibtn22.setImageResource(R.drawable.sangam);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("14")){
                ibtn22.setImageResource(R.drawable.yeon);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("15")){
                ibtn22.setImageResource(R.drawable.sajik);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("16")){
                ibtn22.setImageResource(R.drawable.doldam);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("17")){
                ibtn22.setImageResource(R.drawable.apgu);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("18")){
                ibtn22.setImageResource(R.drawable.chang);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("19")){
                ibtn22.setImageResource(R.drawable.wee);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("20")){
                ibtn22.setImageResource(R.drawable.station);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("21")){
                ibtn22.setImageResource(R.drawable.dae);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("22")){
                ibtn22.setImageResource(R.drawable.dongd);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("23")){
                ibtn22.setImageResource(R.drawable.yeoi);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp22.equals("24")){
                ibtn22.setImageResource(R.drawable.yeong);
        		ibtn22.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        
        
        if(temp23.equals("1")){
            ibtn23.setImageResource(R.drawable.naksan);
    		ibtn23.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp23.equals("2")){
                ibtn23.setImageResource(R.drawable.namsan);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("3")){
                ibtn23.setImageResource(R.drawable.world);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("4")){
                ibtn23.setImageResource(R.drawable.gyeong);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("5")){
                ibtn23.setImageResource(R.drawable.gahi);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("6")){
                ibtn23.setImageResource(R.drawable.lover);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("7")){
                ibtn23.setImageResource(R.drawable.noryang);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("8")){
                ibtn23.setImageResource(R.drawable.yeong);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("9")){
                ibtn23.setImageResource(R.drawable.hangang);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("10")){
                ibtn23.setImageResource(R.drawable.heoi);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("11")){
                ibtn23.setImageResource(R.drawable.cheong);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("12")){
                ibtn23.setImageResource(R.drawable.design);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("13")){
                ibtn23.setImageResource(R.drawable.sangam);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("14")){
                ibtn23.setImageResource(R.drawable.yeon);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("15")){
                ibtn23.setImageResource(R.drawable.sajik);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("16")){
                ibtn23.setImageResource(R.drawable.doldam);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("17")){
                ibtn23.setImageResource(R.drawable.apgu);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("18")){
                ibtn23.setImageResource(R.drawable.chang);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("19")){
                ibtn23.setImageResource(R.drawable.wee);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("20")){
                ibtn23.setImageResource(R.drawable.station);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("21")){
                ibtn23.setImageResource(R.drawable.dae);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("22")){
                ibtn23.setImageResource(R.drawable.dongd);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("23")){
                ibtn23.setImageResource(R.drawable.yeoi);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp23.equals("24")){
                ibtn23.setImageResource(R.drawable.yeong);
        		ibtn23.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
        
        
        
        
        
        
        if(temp24.equals("1")){
            ibtn24.setImageResource(R.drawable.naksan);
    		ibtn24.setOnClickListener(new OnClickListener(){
    			@Override
    			public void onClick(View v){
    				
    				Intent intent2 = new Intent(random.this, actionbar.class);
    				startActivity(intent2);

    				

    			}
    		});
            }else if(temp24.equals("2")){
                ibtn24.setImageResource(R.drawable.namsan);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar2.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("3")){
                ibtn24.setImageResource(R.drawable.world);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar3.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("4")){
                ibtn24.setImageResource(R.drawable.gyeong);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar4.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("5")){
                ibtn24.setImageResource(R.drawable.gahi);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar5.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("6")){
                ibtn24.setImageResource(R.drawable.lover);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar6.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("7")){
                ibtn24.setImageResource(R.drawable.noryang);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar7.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("8")){
                ibtn24.setImageResource(R.drawable.yeong);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar8.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("9")){
                ibtn24.setImageResource(R.drawable.hangang);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar9.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("10")){
                ibtn24.setImageResource(R.drawable.heoi);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar10.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("11")){
                ibtn24.setImageResource(R.drawable.cheong);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar11.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("12")){
                ibtn24.setImageResource(R.drawable.design);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar12.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("13")){
                ibtn24.setImageResource(R.drawable.sangam);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar13.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("14")){
                ibtn24.setImageResource(R.drawable.yeon);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar14.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("15")){
                ibtn24.setImageResource(R.drawable.sajik);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar15.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("16")){
                ibtn24.setImageResource(R.drawable.doldam);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar16.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("17")){
                ibtn24.setImageResource(R.drawable.apgu);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar17.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("18")){
                ibtn24.setImageResource(R.drawable.chang);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar18.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("19")){
                ibtn24.setImageResource(R.drawable.wee);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar19.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("20")){
                ibtn24.setImageResource(R.drawable.station);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar20.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("21")){
                ibtn24.setImageResource(R.drawable.dae);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar21.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("22")){
                ibtn24.setImageResource(R.drawable.dongd);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar22.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("23")){
                ibtn24.setImageResource(R.drawable.yeoi);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar23.class);
        				startActivity(intent2);

        				

        			}
        		});
            }else if(temp24.equals("24")){
                ibtn24.setImageResource(R.drawable.yeong);
        		ibtn24.setOnClickListener(new OnClickListener(){
        			@Override
        			public void onClick(View v){
        				
        				Intent intent2 = new Intent(random.this, actionbar24.class);
        				startActivity(intent2);

        				

        			}
        		});
            }
    }  
  

}  