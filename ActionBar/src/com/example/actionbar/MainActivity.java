package com.example.actionbar;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
	
	 @Override
	    public void onCreate(Bundle icicle) {
	        super.onCreate(icicle);
	        setContentView(R.layout.activity_main);
	        
	        // Setta Action Bar
	        ActionBar actionbar = getActionBar();
	        actionbar.setTitle("Titolo");
	        actionbar.setSubtitle("Sottotitolo");
	 }
	 }
