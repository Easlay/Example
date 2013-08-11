package com.example.menuitem;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
		}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case R.id.setting:
	        setting();
	        return true;
	    case R.id.about:
	        about();
	        return true;
	    case R.id.credit:
	    	credit();
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}

	private void credit() {
		 Intent credit = new Intent(MainActivity.this, Credit.class);
         startActivity(credit);
		
	}

	private void about() {
		 Intent about = new Intent(MainActivity.this, About.class);
         startActivity(about);
		
	}

	private void setting() {
		 Intent setting = new Intent(MainActivity.this, Setting.class);
         startActivity(setting);
		
	}}