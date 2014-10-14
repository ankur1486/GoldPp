package com.gold;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.gold.fragment.LoginFragment;

public class DashboardActivity extends ActionBarActivity {

	ActionBar.Tab tab1, tab2, tab3, tab4, tab5, tab6;

	Fragment fragmentTab1 = new LoginFragment();
	Fragment fragmentTab2 = new LoginFragment();
	Fragment fragmentTab3 = new LoginFragment();
	Fragment fragmentTab4 = new LoginFragment();
	Fragment fragmentTab5 = new LoginFragment();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dashboard);
		creatingTabs();
	}

	private void creatingTabs() {
		ActionBar actionBar = getActionBar();
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

		tab1 = actionBar.newTab().setText("Home");
		tab2 = actionBar.newTab().setText("Gold");
		tab3 = actionBar.newTab().setText("Diamond");
		tab4 = actionBar.newTab().setText("Platinum");
		tab5 = actionBar.newTab().setText("Silver");

		tab1.setTabListener(new MyTabListener(fragmentTab1));
		tab2.setTabListener(new MyTabListener(fragmentTab2));
		tab3.setTabListener(new MyTabListener(fragmentTab3));
		tab4.setTabListener(new MyTabListener(fragmentTab4));
		tab5.setTabListener(new MyTabListener(fragmentTab5));

		actionBar.addTab(tab1);
		actionBar.addTab(tab2);
		actionBar.addTab(tab3);
		actionBar.addTab(tab4);
		actionBar.addTab(tab5);
	}

	public class MyTabListener implements ActionBar.TabListener {
		Fragment fragment;

		public MyTabListener(Fragment fragment) {
			this.fragment = fragment;
		}

		public void onTabSelected(Tab tab, FragmentTransaction ft) {
			ft.replace(R.id.fragment_container, fragment);
		}

		public void onTabUnselected(Tab tab, FragmentTransaction ft) {
			ft.remove(fragment);
		}

		public void onTabReselected(Tab tab, FragmentTransaction ft) {
			// nothing done here
		}

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.action_settings:
//			openSettings();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu items for use in the action bar
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.gold_main, menu);
		return super.onCreateOptionsMenu(menu);
	}

}
