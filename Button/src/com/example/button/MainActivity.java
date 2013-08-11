package com.example.button;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		 Button btnuno=(Button)findViewById(R.id.button1);    
	     Button btndue=(Button)findViewById(R.id.button2);  

	        btnuno.setOnClickListener(new OnClickListener(){    
	                                       public void onClick(View arg0) {    
	                                       Intent openPage1 = new Intent(MainActivity.this,Page1.class);  
	                 
	                      startActivity(openPage1);  
	                    
	                      }
	        });    
	    
	     
	        btndue.setOnClickListener(new OnClickListener(){    
	                                       public void onClick(View arg0) {    
	                                       Intent openPage2 = new Intent(MainActivity.this,Page2.class);  
	                  
	                      startActivity(openPage2); 
	                    
	                    }    
	        });    
	    }

	
             
	
}
