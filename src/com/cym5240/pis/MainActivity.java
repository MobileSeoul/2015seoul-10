package com.cym5240.pis;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.kakao.kakaolink.KakaoLink;
import com.kakao.kakaolink.KakaoTalkLinkMessageBuilder;
import com.kakao.util.KakaoParameterException;

public class MainActivity extends SherlockFragmentActivity {

	// Declare Variable
	DrawerLayout mDrawerLayout;
	ListView mDrawerList;
	ActionBarDrawerToggle mDrawerToggle;
	MenuListAdapter mMenuAdapter;
	String[] title;
	String[] subtitle;
	int[] icon;
	Fragment fragment1 = new Fragment1();
	Fragment fragment2 = new Fragment2();
	
	private KakaoLink kakaoLink;
    private KakaoTalkLinkMessageBuilder kakaoTalkLinkMessageBuilder;
    private final String imgSrcLink = "http://cafeptthumb1.phinf.naver.net/20151025_72/yil8853_1445741347415YsBMF_PNG/PISER.png?type=w740";


    
    
	 public boolean onCreateOptionsMenu(Menu menu) {
	        //Used to put dark icons on light action bar
	    	
			getActionBar().setTitle("카테고리");
	    	getActionBar().setDisplayShowHomeEnabled(false);
	    	getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	
	    	
	    	
	        boolean isLight = SampleList.THEME == R.style.Theme_Favorite;
	    
	        super.onCreateOptionsMenu(menu);
	        getSupportMenuInflater().inflate(R.menu.menu3, menu);
	   

	    
	   /* menu.add("Refresh")
	        .setIcon(isLight ? R.drawable.social_share : R.drawable.social_share)
	        .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);*/
	        
	        
	    
	    try {
            kakaoLink = KakaoLink.getKakaoLink(getApplicationContext());
            kakaoTalkLinkMessageBuilder = kakaoLink.createKakaoTalkLinkMessageBuilder();
        } catch (KakaoParameterException e) {
            e.getMessage();
        }


	 
	        return true;
	    }
	 
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.drawer_main);


		/*FadingActionBarHelper helper = new FadingActionBarHelper()
	    .actionBarBackground(R.drawable.ab_background)
	    .headerLayout(R.layout.profile)
	    .contentLayout(R.layout.drawer_main);
	setContentView(helper.createView(this));
	helper.initActionBar(this);*/


    	    
    	    
    	   
    	    
    	    
		// Generate title
		title = new String[] { "공지사항", "업데이트확인", "날씨정보","문의","오픈소스", "서울공원 정보","서울축제 정보","버전정보"};

		// Generate subtitle
		subtitle = new String[] { "", "", "","http://yil8855.tistory.com/guestbook","","네이버 서울 공원정보 포털 서비스 기반","네이버 서울 축제정보 포털 서비스 기반","버전 : Beta_1.0.1" + "\n"+"최종 업데이트일 : 2015.10.25"};
		
		

		// Generate icon
		icon = new int[] { R.drawable.gong, R.drawable.up,R.drawable.nal2,R.drawable.moon,R.drawable.open,R.drawable.ic_place_grey,R.drawable.ic_map_grey,R.drawable.version};

		// Locate DrawerLayout in drawer_main.xml
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

		// Locate ListView in drawer_main.xml
		mDrawerList = (ListView) findViewById(R.id.left_drawer);

		// Set a custom shadow that overlays the main content when the drawer
		// opens
		/*mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow,
				GravityCompat.START);*/
		
		// Pass results to MenuListAdapter Class
		mMenuAdapter = new MenuListAdapter(this, title, subtitle, icon);

		// Set the MenuListAdapter to the ListView
		mDrawerList.setAdapter(mMenuAdapter);

		// Capture button clicks on side menu
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

		// Enable ActionBar app icon to behave as action to toggle nav drawer
		getSupportActionBar().setHomeButtonEnabled(true);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		// ActionBarDrawerToggle ties together the the proper interactions
		// between the sliding drawer and the action bar app icon
		mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout,
				R.drawable.ic_drawer, R.string.drawer_open,
				R.string.drawer_close) {

			public void onDrawerClosed(View view) {
				// TODO Auto-generated method stub
				super.onDrawerClosed(view);
			}

			public void onDrawerOpened(View drawerView) {
				// TODO Auto-generated method stub
				super.onDrawerOpened(drawerView);
			}
		};

		mDrawerLayout.setDrawerListener(mDrawerToggle);

		if (savedInstanceState == null) {
			selectItem(0);
		}
	}

	/*@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getSupportMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}*/

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		if (item.getItemId() == android.R.id.home) {

			if (mDrawerLayout.isDrawerOpen(mDrawerList)) {
				mDrawerLayout.closeDrawer(mDrawerList);
			} else {
				mDrawerLayout.openDrawer(mDrawerList);
			}
		}
		
		if (item.getItemId() == R.id.social){
			
			
			/* Toast.makeText(MainActivity.this, "Got click: " + item, Toast.LENGTH_SHORT).show();*/
			
			
			try {
				
				kakaoLink = KakaoLink.getKakaoLink(getApplicationContext());  
				kakaoTalkLinkMessageBuilder = kakaoLink.createKakaoTalkLinkMessageBuilder();     
		        kakaoTalkLinkMessageBuilder.addText("Photograph IN 서울!" +"\n"+"서울의 멋진 사진을 공유하세요!" );
		        
		        int width = 269;
		        int height = 95;

		        kakaoTalkLinkMessageBuilder.addImage(imgSrcLink, width , height);
		        kakaoTalkLinkMessageBuilder.addAppButton("앱으로 이동");
//		      kakaoTalkLinkMessageBuilder.addWebButton("웹으로 이동");
		        kakaoLink.sendMessage(kakaoTalkLinkMessageBuilder.build(), this);
		       
		        
		    } catch (KakaoParameterException e) {
		        e.getMessage();
		       
		    }
			
			
	    }
		
		if (item.getItemId() == R.id.shuffle){
			
			Intent intent7 = new Intent(MainActivity.this, random.class);
			startActivity(intent7);
			
		}


		return super.onOptionsItemSelected(item);
		
	}

	// The click listener for ListView in the navigation drawer
	private class DrawerItemClickListener implements
			ListView.OnItemClickListener {
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			selectItem(position);
			switch(position){
			case 0:
				Intent intent2 = new Intent(MainActivity.this, MiniWebActivity.class);
				startActivity(intent2);
				break;
				
			case 1:
				Intent intent3 = new Intent(MainActivity.this, MiniWebActivity.class);
				startActivity(intent3);
				break;
				
			case 2:
				
				Intent intent4 = new Intent(MainActivity.this, MiniWebActivity2.class);
				startActivity(intent4);
				break;
				
			case 3:
				
				Intent intent5 = new Intent(MainActivity.this, MiniWebActivity3.class);
				startActivity(intent5);
				break;
				
			case 4:
				
				Intent intent6 = new Intent(MainActivity.this, MiniWebActivity4.class);
				startActivity(intent6);
				break;
				
			case 5:
				
				Intent intent7 = new Intent(MainActivity.this, MiniWebActivity4.class);
				startActivity(intent7);
				break;
				
			case 6:
				
				Intent intent8 = new Intent(MainActivity.this, MiniWebActivity5.class);
				startActivity(intent8);
				break;
				
			case 7:
				
				Intent intent9 = new Intent(MainActivity.this, MiniWebActivity.class);
				startActivity(intent9);
				break;
				
				
				
				
			}
		}
	}

	private void selectItem(int position) {

		FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
		// Locate Position
		switch (position) {
		case 0:
			ft.replace(R.id.content_frame, fragment1);
			break;
		/*case 1:
			ft.replace(R.id.content_frame, fragment2);
			break;*/
		}
		ft.commit();
		mDrawerList.setItemChecked(position, true);
		// Close drawer
		mDrawerLayout.closeDrawer(mDrawerList);
	}

	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		// Pass any configuration change to the drawer toggles
		mDrawerToggle.onConfigurationChanged(newConfig);
	}
	


}
