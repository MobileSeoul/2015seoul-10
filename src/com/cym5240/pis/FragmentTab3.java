package com.cym5240.pis;

import java.util.ArrayList;
import java.util.Locale;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;

import com.actionbarsherlock.app.SherlockFragment;


public class FragmentTab3 extends SherlockFragment {

    //private static final String ARG_POSITION = "position";
   // private int position;
    ListView list;
	ListViewAdapter adapter;
	EditText editsearch;
	String[] rank;
	String[] country;
	String[] population;
	ArrayList<WorldPopulation> arraylist = new ArrayList<WorldPopulation>();
	static View rootView;
	


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        
    	/*position = getArguments().getInt(ARG_POSITION);*/
       
        View rootView = inflater.inflate(R.layout.listview_main, container, false);
        	
        arraylist.clear();
        
     // Generate sample data
     		rank = new String[] { "종로구", "강남구", "마포구","종로구","종로구","송파구","마포구","동작구","영등포구","중구","종로구","중구","마포구","종로구","종로구","중구","강남구","종로구","송파구","용산구","영등포구","중구","영등포구","중구"};

     		country = new String[] { "서울특별시 종로구 동숭동 산2-10", "서울특별시 강남구 삼성1동 169-25", "서울특별시 마포구 성산2동 512-5","서울특별시 종로구 세종로 1-84","서울특별시 종로구 가회동 206","서울특별시 송파구 신천동 31",
     				"서울특별시 마포구 망원2동 294-8","서울특별시 동작구 노들로 688","서울특별시 영등포구 여의도동","서울특별시 중구 회현동1가 산1-31","서울특별시 종로구 종로5가 398-6","서울특별시 중구 을지로 281","서울특별시 마포구 상암동 496-198","서울특별시 종로구 세종로 47-2"
     				,"서울특별시 종로구 서린동 1-9","서울특별시 중구 세종대로 99","서울특별시 강남구 압구정동 427","서울특별시 종로구 율곡로 99","서울특별시 송파구 방이2동 18","서울특별시 용산구 한강대로 405","서울특별시 영등포구 대림3동 646","서울특별시 중구 신당1동 193-10","서울특별시 영등포구 여의동 13-26","서울특별시 중구 남창동 236-2"};

     		population = new String[] { "낙산공원", "남산타워 야경", "서울월드컵경기장","경복궁","가회동","석촌호수 러버덕","성산대교","수산시장","원효대교","회현동","청계천","디자인플라자","빛내림","연등축제","청계천에서","덕수궁 돌담길","압구정동","창덕궁","위례성길","서울역","대림동","디자인플라자의 야경","윤중로","남산육교"};

     		// Locate the ListView in listview_main.xml
     		list = (ListView) rootView.findViewById(R.id.listview);

     		for (int i = 0; i < rank.length; i++) 
     		{
     			WorldPopulation wp = new WorldPopulation(rank[i], country[i], population[i]);
     			// Binds all strings into an array
     			arraylist.add(wp);
     			
     		}

     		// Pass results to ListViewAdapter Class
     		adapter = new ListViewAdapter(getActivity(), arraylist);

     		
     		// Binds the Adapter to the ListView
     		list.setAdapter(adapter);
     		
     		// Locate the EditText in listview_main.xml
     		editsearch = (EditText) rootView.findViewById(R.id.search);
     		editsearch.setTextColor(Color.parseColor("#000000"));
     		// Capture Text in EditText
     		editsearch.addTextChangedListener(new TextWatcher() {

     			@Override
     			public void afterTextChanged(Editable arg0) {
     				// TODO Auto-generated method stub
     				String text = editsearch.getText().toString().toLowerCase(Locale.getDefault());
     				adapter.filter(text);
     			}

     			@Override
     			public void beforeTextChanged(CharSequence arg0, int arg1,
     					int arg2, int arg3) {
     				// TODO Auto-generated method stub
     			}

     			@Override
     			public void onTextChanged(CharSequence arg0, int arg1, int arg2,
     					int arg3) {
     				// TODO Auto-generated method stub
     			}
     		});
       
       
        return rootView;
    }
    
    @Override
    public void onDestroyView() {     
    	super.onDestroyView();     
    	if(rootView!=null){         
    		ViewGroup parent = (ViewGroup)rootView.getParent();   
    		arraylist.clear();
    		if(parent!=null){             
    			parent.removeView(rootView);   
    			arraylist.clear();
    			}     
    		} 
    	}
}
