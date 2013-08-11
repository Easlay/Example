package com.example.alertdialog;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
	final Context context = this;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}
	
	
	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
	       super.onPrepareOptionsMenu(menu);
	      
	     
	       return true;
	   }
	   
	 @Override
	 public boolean onCreateOptionsMenu(Menu menu) {
				getMenuInflater().inflate(R.menu.main, menu);
				return true;
				}
	  
	   @Override
			public boolean onOptionsItemSelected(MenuItem item) {
			    switch (item.getItemId()) {
			   
			    case R.id.alert:
			        alert();
			        return true;
			  
			    default:
			        return super.onOptionsItemSelected(item);
			    }
			}

private void alert() {
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
 
			// settare il titolo
			alertDialogBuilder.setTitle("Title");
			alertDialogBuilder.setIcon(R.drawable.ic_launcher);
 
			// settare il messaggio 
			alertDialogBuilder
				.setMessage("Message")
				.setCancelable(false)
				.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						
						
						// Intento 
						Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
		                myWebLink.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.Lunar.HD"));
		                    startActivity(myWebLink);
					}
				  })
				.setNegativeButton("No",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						// close AlertDialog
						dialog.cancel();
						Toast.makeText(getApplicationContext(), 
	                               "Close", Toast.LENGTH_LONG).show();
					}
				});
 
				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();
 
				// show it
				alertDialog.show();
		
	}


}
