package com.hackathon.onpar;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity {

	public ArrayList<Station> stationList;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button listButton;
        Button mapButton;
      //Initialize Station List
      		
      		StationExcelReader excelReader = new StationExcelReader();
      		InputStream is;
      		try {
				is = getResources().getAssets().open("locations.xls");
				stationList = excelReader.start(is);
				Log.d("test", stationList.toString());
				
				//Gather Station Available Parking Data
	      		//Generate gen = new Generate();
	      		//gen.GenerateData(stationList, 100);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
      		
      		listButton = (Button)findViewById(R.id.listButton);
      		listButton.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					openListActivity(v);
				}
			});
      		
      		mapButton = (Button)findViewById(R.id.mapbutton);
      		mapButton.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					openMapActivity(v);
				}
			});
      		
        
    }
    
    public void openListActivity(View view)	{
    	Intent intent = new Intent(this, StationListActivity.class);
	    intent.putParcelableArrayListExtra("ONPAR_DATA", stationList);
	    startActivity(intent);
    }
    
    public void openMapActivity(View view)	{
    	Intent intent = new Intent(this, MapsActivity.class);
	    intent.putParcelableArrayListExtra("ONPAR_DATA", stationList);
	    startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
