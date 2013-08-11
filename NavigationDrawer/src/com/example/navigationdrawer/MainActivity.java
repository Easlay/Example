package com.example.navigationdrawer;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;



public class MainActivity extends Activity {
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;
    private ActionBarDrawerToggle mDrawerToggle;

    private CharSequence mDrawerTitle;
    @SuppressWarnings("unused")
	private CharSequence mTitle;
    private String[] mGalaxyTitles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
        mTitle = mDrawerTitle = getTitle();
        mGalaxyTitles = getResources().getStringArray(R.array.items_array);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        
        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
        mDrawerList.setAdapter(new ArrayAdapter<String>(this,
                R.layout.list_item, mGalaxyTitles));
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

        
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);

        
    	
       
        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  
                mDrawerLayout,         
                R.drawable.ic_drawer,  
                R.string.drawer_open,  
                R.string.drawer_close  
                ) {
            public void onDrawerClosed(View view) {
                getActionBar().setTitle(mDrawerTitle);
                invalidateOptionsMenu(); 
            }

            public void onDrawerOpened(View drawerView) {
                getActionBar().setTitle(mDrawerTitle);
                invalidateOptionsMenu(); 
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        if (savedInstanceState == null) {
            selectItem(0);
        }
    }

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
              
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
		return false;
       
        
        
    }

	

   

    
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        	switch(position){
        case 0:
        	selectItem(position);
        case 1: 
        	selectItem(position);
        case 2: 
        	selectItem(position);
    }
    }    
}
        
        
	private void selectItem(int position) {
		switch(position){
    	
        case 0:
        	
        	Fragment fragment = new Page0();
            Bundle args = new Bundle();
            fragment.setArguments(args);

        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.main, fragment).commit();

        
        mDrawerList.setItemChecked(position, true);
        setTitle(mGalaxyTitles[position]);
        mDrawerLayout.closeDrawer(mDrawerList);
        return;
        
        case 1:
        Fragment fragment1 = new Page1();
        Bundle args1 = new Bundle();
        fragment1.setArguments(args1);
        FragmentManager fragmentManager1 = getFragmentManager();
        fragmentManager1.beginTransaction().replace(R.id.main, fragment1).commit();

        
        mDrawerList.setItemChecked(position, true);
        setTitle(mGalaxyTitles[position]);
        mDrawerLayout.closeDrawer(mDrawerList);
        return;
        
        case 2:
            Fragment fragment2 = new Page2();
            Bundle args2 = new Bundle();
            fragment2.setArguments(args2);
            FragmentManager fragmentManager2 = getFragmentManager();
            fragmentManager2.beginTransaction().replace(R.id.main, fragment2).commit();

            
            mDrawerList.setItemChecked(position, true);
            setTitle(mGalaxyTitles[position]);
            mDrawerLayout.closeDrawer(mDrawerList);
            return;
    }
	 }
    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getActionBar().setTitle(mDrawerTitle);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
       
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

    
}
