package com.cym5240.pis;

import java.util.ArrayList;
import java.util.Locale;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListView;



public class noseon_all extends Fragment {

    private static final String ARG_POSITION = "position";
    private int position;
    ListView list;
	ListViewAdapter adapter;
	EditText editsearch;
	String[] rank;
	String[] country;
	String[] population;
	ArrayList<WorldPopulation> arraylist = new ArrayList<WorldPopulation>();
	static View rootView;
	
    public static noseon_all newInstance(int position) {
    	noseon_all f = new noseon_all();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        position = getArguments().getInt(ARG_POSITION);
       
        	rootView = inflater.inflate(R.layout.listview_main, container, false);
        
        
        
     // Generate sample data
     		rank = new String[] { "100번", "왕정교", "공설시장(원협쪽)", "공설시장(건강원쪽)", "공설시장(시장쪽)", "공설시장(시장건너편)", "추어삼거리", "추어삼거리(부산집쪽)", "남원초교", "보호관찰소","조산동","메카센트럴APT","보건소","노암주민센터","노암주공APT","한신APT","제일고","노암삼거리","남문4가","삽다리4가","죽항동주민센터"};

     		country = new String[] { ">>101,110~140 노선", ">>공설시장 방향", ">>상행,하행",
     				"Indonesia", "Brazil", "Pakistan", "Nigeria", "Bangladesh",
     				"Russia", "Japan","","","","","","","","","","","" };

     	

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