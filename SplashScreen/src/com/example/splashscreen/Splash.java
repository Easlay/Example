package com.example.splashscreen;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class Splash extends Activity {
	   
	   private static final int STOPSPLASH = 0;
	   private static final long SPLASHTIME = 3000;
	   private ImageView splash;
	   
	   @Override
	    public void onCreate(Bundle icicle) {
	        super.onCreate(icicle);
	        setContentView(R.layout.splash);
	         splash = (ImageView) findViewById(R.id.splash);
	         Message msg = new Message();
	         msg.what = STOPSPLASH;
	         splashHandler.sendMessageDelayed(msg, SPLASHTIME); }
	   
	   private Handler splashHandler = new Handler() {
	     
	      @Override
	      public void handleMessage(Message msg) {
	         switch (msg.what) {
	         case STOPSPLASH:
	            stop();
	            splash.setVisibility(View.GONE);
	            break;
	         }
	         super.handleMessage(msg);
	      }

		private void stop() {
			Intent stop = new Intent(Splash.this, MainActivity.class);
			startActivity(stop);
		}


		 
	   };
	
	   }
	