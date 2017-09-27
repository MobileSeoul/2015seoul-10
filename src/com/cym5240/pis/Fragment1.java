package com.cym5240.pis;

import java.lang.reflect.Field;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;

public class Fragment1 extends SherlockFragment {
	// Declare Variable
	private FragmentTabHost mTabHost;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Create FragmentTabHost
		mTabHost = new FragmentTabHost(getSherlockActivity());
		// Locate fragment1.xml to create FragmentTabHost
		mTabHost.setup(getSherlockActivity(), getChildFragmentManager(), R.layout.fragment1);
		// Create Tab 1
		mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("����in����"), FragmentTab1.class, null);
		// Create Tab 2
		mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("��ġ���"), FragmentTab2.class, null);	
		// Create Tab 3
		mTabHost.addTab(mTabHost.newTabSpec("tab3").setIndicator("�ּұ��"), FragmentTab3.class, null);
		// Create Tab 4
		mTabHost.addTab(mTabHost.newTabSpec("tab4").setIndicator("Ŀ�´�Ƽ"), FragmentTab4.class, null);
		
		return mTabHost;
	}
	
	// Detach FragmentTabHost
	@Override
	public void onDetach() {
		super.onDetach();

		try {
			Field childFragmentManager = Fragment.class
					.getDeclaredField("mChildFragmentManager");
			childFragmentManager.setAccessible(true);
			childFragmentManager.set(this, null);

		} catch (NoSuchFieldException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	// Remove FragmentTabHost 
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		mTabHost = null;
	}

}
