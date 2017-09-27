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
     		rank = new String[] { "���α�", "������", "������","���α�","���α�","���ı�","������","���۱�","��������","�߱�","���α�","�߱�","������","���α�","���α�","�߱�","������","���α�","���ı�","��걸","��������","�߱�","��������","�߱�"};

     		country = new String[] { "����Ư���� ���α� ������ ��2-10", "����Ư���� ������ �Ｚ1�� 169-25", "����Ư���� ������ ����2�� 512-5","����Ư���� ���α� ������ 1-84","����Ư���� ���α� ��ȸ�� 206","����Ư���� ���ı� ��õ�� 31",
     				"����Ư���� ������ ����2�� 294-8","����Ư���� ���۱� ���� 688","����Ư���� �������� ���ǵ���","����Ư���� �߱� ȸ����1�� ��1-31","����Ư���� ���α� ����5�� 398-6","����Ư���� �߱� ������ 281","����Ư���� ������ ��ϵ� 496-198","����Ư���� ���α� ������ 47-2"
     				,"����Ư���� ���α� ������ 1-9","����Ư���� �߱� ������� 99","����Ư���� ������ �б����� 427","����Ư���� ���α� ����� 99","����Ư���� ���ı� ����2�� 18","����Ư���� ��걸 �Ѱ���� 405","����Ư���� �������� �븲3�� 646","����Ư���� �߱� �Ŵ�1�� 193-10","����Ư���� �������� ���ǵ� 13-26","����Ư���� �߱� ��â�� 236-2"};

     		population = new String[] { "�������", "����Ÿ�� �߰�", "��������Ű����","�溹��","��ȸ��","����ȣ�� ������","����뱳","�������","��ȿ�뱳","ȸ����","û��õ","�������ö���","������","��������","û��õ����","������ �����","�б�����","â����","���ʼ���","���￪","�븲��","�������ö����� �߰�","���߷�","��������"};

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
