package com.cym5240.pis;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.TextExtractor;
import android.os.Bundle;
import android.widget.TextView;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.cym5240.pis.fadingactionbar.extras.actionbarsherlock.FadingActionBarHelper;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.kakao.kakaolink.KakaoLink;
import com.kakao.kakaolink.KakaoTalkLinkMessageBuilder;
import com.kakao.util.KakaoParameterException;



public class actionbar17 extends SherlockActivity {
	
	
	/* 파싱 */
	TextView textView;  // 제목을 표시해줄 텍스트뷰

	private static Thread thread = null;

	String parsing_url;  // 파싱해오고자 하는 URL

	String get_data;  // 파싱해서 가져온 데이터를 저장할 스트링 변수
	
	String parsing;

	ArrayList<String> array;  // get_data 변수의 값을 순차적으로 저장할 배열
	/* 파싱 */
	
	
	
	
	
	 GoogleMap  googleMap;
	 GoogleMap  food1;

	    /**

	     * 위치 값 new LatLng(북위,동경);

	     * 특정 지점의 북위와 동경값을 알고 싶다면, http://maps.google.com/에서 위치를 검색한뒤,원하는 위치의 마커를 클릭한다 

	     * 그리고 마우스 오른쪽을 누르면 나오는 "이곳이 궁금한가요?" 를 누르면 위도와 경도가 나온다.

	     * 

	     * 아니면 마커를 클릭한뒤 링크를 복사하면 그 링크에 북위와 동경이 찍혀 나온다

	     * 

	     */

	    LatLng location = new LatLng(37.526294, 127.026559);
	    
	    /**

	     * CameraPosition을 이용하여 보이는 맵에서 보일 화면의 설정을 한다.

	     * zoom은 20이 가장 가까이 보는것, 1이 전세계지도이다.

	     */

	    CameraPosition cp = new CameraPosition.Builder().target(location).zoom(13).build();
	    


	    //메뉴옵션

	    final int MAPMENU_GEO = 1;

	    final int MAPMENU_NORMAL = 2;

	    final int MAPMENU_HYBRID = 3;

	    final int MAPMENU_TERRAIN = 4;
	    
	    private KakaoLink kakaoLink;
	    private KakaoTalkLinkMessageBuilder kakaoTalkLinkMessageBuilder;
	    private final String imgSrcLink = "http://cafeptthumb1.phinf.naver.net/20151017_223/yil8853_1445027312054UnF8h_PNG/pij_logo.png?type=w740";


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Used to put dark icons on light action bar
    	
    	getActionBar().setTitle("     ");
    	getActionBar().setDisplayShowHomeEnabled(false);
    	getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    	
    	
        boolean isLight = SampleList.THEME == R.style.Theme_Favorite;

    
        super.onCreateOptionsMenu(menu);
        getSupportMenuInflater().inflate(R.menu.menu2, menu);

 
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
       //setTheme(SampleList.THEME); //Used for theme switching in samples
        super.onCreate(savedInstanceState);
      

        FadingActionBarHelper helper = new FadingActionBarHelper()
        .actionBarBackground(R.drawable.ab_background)
        .headerLayout(R.layout.header2_16)
        .contentLayout(R.layout.actionbar17);
    setContentView(helper.createView(this));
    helper.initActionBar(this);
    
    /**

     *  xml에 정의된 GoogleMap Fragment로 부터 GoogleMap을 가져온다.

     */
    googleMap = ((MapFragment)getFragmentManager().findFragmentById(R.id.map)).getMap();

     // 미리 정의한 CameraPosition 을 GoogleMap에 적용한다.
    googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cp));
    googleMap.getUiSettings().setZoomControlsEnabled(true);
    /**

     * 내가 찾은 위치에 마커를 찍는다.

     * 그리고 해당 마커를 눌렀을때 띄울 타이틀을 지정한다.

     */
    googleMap.addMarker(new MarkerOptions().position(location).title("압구정동").snippet("서울특별시 강남구 압구정동 427")).showInfoWindow();
    /*googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.snack_bar3)).position(new LatLng(34.719326, 126.813657)).title("홍교관-한식당").snippet("전라남도 강진군 병영면 성남리 184"));
    googleMap.addMarker(new MarkerOptions().icon(BitmapDescriptorFactory.fromResource(R.drawable.snack_bar3)).position(new LatLng(34.715961, 126.814780)).title("보명식당-식당").snippet("전라남도 강진군 병영면 성남리 140-7"));*/

    
    
    
    /* 파싱 */
    
    textView = (TextView)findViewById(R.id.textView2);	

	parsing_url = "http://www.androidside.com/bbs/board.php?bo_table=B49&wr_id=154287&page=10";

	

	Runnable task = new Runnable(){

		public void run(){

			getData(parsing_url);

		}

	};

	

	thread = new Thread(task);

	thread.start();  // 반드시 쓰레드를 해줘야함 그 이유는 아래에서 설명

	

	try{

		thread.join();  // 쓰레드 작업 끝날때까지 다른 작업들은 대기

	}catch(Exception e){

		

	}

	 if (parsing==null) {
		textView.append("서버 연결 실패" + "\n");  // 쓰레드 작업 끝나면 텍스트뷰에 가져온 데이터를 입력
	 }else{
		textView.append(parsing + "회" + "\n");  // 쓰레드 작업 끝나면 텍스트뷰에 가져온 데이터를 입력
	 }
	

}

    @Override
   	public boolean onOptionsItemSelected(MenuItem item) {

   	
   		if (item.getItemId() == R.id.social){
   			
   			
   			/* Toast.makeText(MainActivity.this, "Got click: " + item, Toast.LENGTH_SHORT).show();*/
   			
   			
   			try {
   				
   				kakaoLink = KakaoLink.getKakaoLink(getApplicationContext());  
   				kakaoTalkLinkMessageBuilder = kakaoLink.createKakaoTalkLinkMessageBuilder();     
   		        kakaoTalkLinkMessageBuilder.addText("Photograph IN 서울!" +"\n"+"서울의 멋진 사진을 공유하세요!" );
   		        
   		        int width = 269;
   		        int height = 81;

   		        kakaoTalkLinkMessageBuilder.addImage(imgSrcLink, width , height);
   		        kakaoTalkLinkMessageBuilder.addAppButton("앱으로 이동");
//   		      kakaoTalkLinkMessageBuilder.addWebButton("웹으로 이동");
   		        kakaoLink.sendMessage(kakaoTalkLinkMessageBuilder.build(), this);
   		       
   		        
   		    } catch (KakaoParameterException e) {
   		        e.getMessage();
   		       
   		    }
   			
   			
   	    }


   		return super.onOptionsItemSelected(item);
   		
   	}

// 파싱 작업을 하는 메서드

public ArrayList<String> getData(String strURL){

	Source source;

	get_data = "";

	array = new ArrayList();

	try{

		URL url = new URL(strURL);

		source = new Source(url);  // 쓰레드를 사용 안하면 여기에서 예외 발생함 그 이유는 아래에서 설명

		Element element = null;

		

		List<Element> list = source.getAllElements(HTMLElementName.SPAN); // title 태그의 엘리먼트 가져옴

		

		for(int i = 0; i < list.size(); i++){

			element = list.get(i);

			String attributevalue = element.getAttributeValue("CLASS");  // title 태그의 속성값이 type을 찾는다

			if(attributevalue != null){

				if(attributevalue.equalsIgnoreCase("mw_basic_view_hit")){  // type의 값이 text 이면

					TextExtractor textExtractor = element.getTextExtractor();  // 해당 문자값을 가져온다

					get_data = textExtractor.toString();  // 가져온 값을 스트링으로 변환후

					array.add(get_data);  // ArrayList에 추가한다
					parsing=get_data;
				}

			}

		}

	}catch(Exception e){

		

	}

	return array;  // 입력된 배열값을 리턴

}

    
    }

  
