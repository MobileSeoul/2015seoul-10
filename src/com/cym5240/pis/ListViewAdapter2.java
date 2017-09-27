package com.cym5240.pis;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.cym5240.web.websan;
import com.cym5240.web.websan10;
import com.cym5240.web.websan11;
import com.cym5240.web.websan12;
import com.cym5240.web.websan13;
import com.cym5240.web.websan14;
import com.cym5240.web.websan15;
import com.cym5240.web.websan16;
import com.cym5240.web.websan17;
import com.cym5240.web.websan18;
import com.cym5240.web.websan19;
import com.cym5240.web.websan2;
import com.cym5240.web.websan20;
import com.cym5240.web.websan21;
import com.cym5240.web.websan22;
import com.cym5240.web.websan23;
import com.cym5240.web.websan24;
import com.cym5240.web.websan25;
import com.cym5240.web.websan26;
import com.cym5240.web.websan27;
import com.cym5240.web.websan28;
import com.cym5240.web.websan29;
import com.cym5240.web.websan3;
import com.cym5240.web.websan30;
import com.cym5240.web.websan4;
import com.cym5240.web.websan5;
import com.cym5240.web.websan6;
import com.cym5240.web.websan7;
import com.cym5240.web.websan8;
import com.cym5240.web.websan9;



public class ListViewAdapter2 extends BaseAdapter {

	// Declare Variables
	Context mContext;
	LayoutInflater inflater;
	private List<WorldPopulation2> worldpopulationlist = null;
	private ArrayList<WorldPopulation2> arraylist;

	public ListViewAdapter2(Context context, List<WorldPopulation2> worldpopulationlist) {
        mContext = context;
        this.worldpopulationlist = worldpopulationlist;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<WorldPopulation2>();
        this.arraylist.addAll(worldpopulationlist);
        
        
    }


	public class ViewHolder {
		TextView rank;
		TextView country;
		TextView population;
	}

	

	@Override
	public int getCount() {
		return worldpopulationlist.size();
	}

	@Override
	public WorldPopulation2 getItem(int position) {
		return worldpopulationlist.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public View getView(final int position, View view, ViewGroup parent) {
		final ViewHolder holder;
		if (view == null) {
			holder = new ViewHolder();
			view = inflater.inflate(R.layout.listview_item2, null);
			// Locate the TextViews in listview_item.xml
			holder.rank = (TextView) view.findViewById(R.id.rank);
			holder.country = (TextView) view.findViewById(R.id.country);
			holder.population = (TextView) view.findViewById(R.id.population);
	
			
			holder.rank.setTextColor(Color.parseColor("#0099FF"));
			holder.country.setTextColor(Color.parseColor("#669900"));
			holder.population.setTextColor(Color.parseColor("#6666FF"));
			holder.rank.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 16);
			holder.country.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);
			holder.population.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 14);


			view.setTag(holder);
		} else {
			holder = (ViewHolder) view.getTag();
		}
		// Set the results into TextViews
		holder.rank.setText(worldpopulationlist.get(position).getRank());
		holder.country.setText(worldpopulationlist.get(position).getCountry());
		holder.population.setText(worldpopulationlist.get(position).getpopulation());
		
		
		// Listen for ListView Item Click
		view.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				
				if(worldpopulationlist.get(position).getRank().equals("유달산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan.class);
				// Pass all data rank
				//intent.putExtra("rank",(worldpopulationlist.get(position).getRank()));
				// Pass all data country
				//intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
				mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("양을산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan2.class);
				// Pass all data rank
				//intent.putExtra("rank",(worldpopulationlist.get(position).getRank()));
				// Pass all data country
				//intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
				mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("고락산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan3.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("구봉산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan4.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("난봉산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan5.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("봉화산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan6.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("가야산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan7.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("금성산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan8.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("비봉산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan9.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("가야산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan10.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("쫓비산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan11.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("백운산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan12.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("국수봉"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan13.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("수양산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan14.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("동악산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan15.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("설산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan16.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("견두산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan17.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("오산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan18.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getRank().equals("천등산"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, websan19.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("마복산"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan20.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("일림산"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan21.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("초암산"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan22.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("만연산"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan23.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("백아산"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan24.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("모후산"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan25.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("억불산"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan26.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("수인산"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan27.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("제암산"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan28.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("달마산"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan29.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getRank().equals("가학산"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, websan30.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}
				
			}
			
		});

		return view;
	}

	// Filter Class
	public void filter(String charText) {
		charText = charText.toLowerCase(Locale.getDefault());
		worldpopulationlist.clear();
		if (charText.length() == 0) {
			worldpopulationlist.addAll(arraylist);
		} 
		else 
		{
			for (WorldPopulation2 wp : arraylist) 
			{
				if (wp.getRank().toLowerCase(Locale.getDefault()).contains(charText)) 
				{
					worldpopulationlist.add(wp);
				}else if(wp.getCountry().toLowerCase(Locale.getDefault()).contains(charText)) {
					worldpopulationlist.add(wp);
				}else if(wp.getpopulation().toLowerCase(Locale.getDefault()).contains(charText)) {
					worldpopulationlist.add(wp);
			}
		}
		notifyDataSetChanged();
	}

	}
}
