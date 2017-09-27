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



public class ListViewAdapter extends BaseAdapter {

	// Declare Variables
	Context mContext;
	LayoutInflater inflater;
	private List<WorldPopulation> worldpopulationlist = null;
	private ArrayList<WorldPopulation> arraylist;

	public ListViewAdapter(Context context, List<WorldPopulation> worldpopulationlist) {
        mContext = context;
        this.worldpopulationlist = worldpopulationlist;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = new ArrayList<WorldPopulation>();
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
	public WorldPopulation getItem(int position) {
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
			view = inflater.inflate(R.layout.listview_item, null);
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
				
				if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ���α� ������ ��2-10"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar.class);
				// Pass all data rank
				//intent.putExtra("rank",(worldpopulationlist.get(position).getRank()));
				// Pass all data country
				//intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
				mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ������ �Ｚ1�� 169-25"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar2.class);
				// Pass all data rank
				//intent.putExtra("rank",(worldpopulationlist.get(position).getRank()));
				// Pass all data country
				//intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
				mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ������ ����2�� 512-5"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar3.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ���α� ������ 1-84"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar4.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ���α� ��ȸ�� 206"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar5.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ���ı� ��õ�� 31"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar6.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ������ ����2�� 294-8"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar7.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ���۱� ���� 688"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar8.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� �������� ���ǵ���"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar9.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� �߱� ȸ����1�� ��1-31"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar10.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ���α� ����5�� 398-6"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar11.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� �߱� ������ 281"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar12.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ������ ��ϵ� 496-198"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar13.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ���α� ������ 47-2"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar14.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ���α� ������ 1-9"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar15.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� �߱� ������� 99"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar16.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ������ �б����� 427"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar17.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ���α� ����� 99"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar18.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}
				else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ���ı� ����2�� 18"))
				{
				// Send single item click data to SingleItemView Class
				Intent intent = new Intent(mContext, actionbar19.class);
				// Pass all data rank
				
				mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� ��걸 �Ѱ���� 405"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, actionbar20.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� �������� �븲3�� 646"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, actionbar21.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� �߱� �Ŵ�1�� 193-10"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, actionbar22.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� �������� ���ǵ� 13-26"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, actionbar23.class);
				// Pass all data rank
				///intent.putExtra("rank",(worldpopulationlist.get(position).getCountry()));
				// Pass all data country
				///intent.putExtra("country",(worldpopulationlist.get(position).getCountry()));
				// Pass all data population
			
				// Pass all data flag
				// Start SingleItemView Class
					mContext.startActivity(intent);
				}else if(worldpopulationlist.get(position).getCountry().equals("����Ư���� �߱� ��â�� 236-2"))
				{
				// Send single item click data to SingleItemView Class
					Intent intent = new Intent(mContext, actionbar24.class);
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
			for (WorldPopulation wp : arraylist) 
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
