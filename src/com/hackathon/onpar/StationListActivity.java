package com.hackathon.onpar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

public class StationListActivity extends Activity {
		 
	    ExpandableListAdapter listAdapter;
	    ExpandableListView expListView;
	    List<String> listDataHeader;
	    HashMap<String, List<String>> listDataChild;
	    ArrayList<Station> stationList;
	    Button refreshButton;
	    final Handler myHandler = new Handler();
	    Context tempcontext;
	    int min, max;
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_stationlist);
	        
	        min = 22;
	        max = 30;
	        
	        // get the listview
	        expListView = (ExpandableListView) findViewById(R.id.lvExp);
	 
	        stationList = getIntent().getParcelableArrayListExtra("ONPAR_DATA");
	        // preparing list data
	        prepareListData(min, max);

	        tempcontext = this;
	        listAdapter = new MyListAdapter(this, listDataHeader, listDataChild);
	        // setting list adapter
	        expListView.setAdapter(listAdapter);
	        

	        Timer myTimer = new Timer();
	        myTimer.schedule(new TimerTask() {
	           @Override
	           public void run() {UpdateGUI();}
	        }, 0, 3000);
	        
	    }
	    
	    private void prepareListData(int min, int max) {
	        listDataHeader = new ArrayList<String>();
	        List<String> temp;
	        listDataChild = new HashMap<String, List<String>>();
	        for (Station stn : stationList)	{
	        	listDataHeader.add(stn.getName());
	        	temp = new ArrayList<String>();
	        	temp.add("Remaining Spots: " +stn.getFreeAvailable());
	        	if (stn.getFreeAvailable() == 0)
	        		temp.add("Estimated Full Time: FULL");
	        	else if(min < 0 || max <0)	{
	        		min = min+3;
	        		max = max+3;
	        		temp.add("Estimated Full Time: " +Math.abs(((int)(Math.random()*(max-min))+min))+" minutes");
	        	}
	        	else	
	        		temp.add("Estimated Full Time: " +Math.abs(((int)(Math.random()*(max-min))+min))+" minutes");
	        	listDataChild.put(stn.getName(), temp);
	        }
	        
	    }
	    
	    private void UpdateGUI() {
	        myHandler.post(myRunnable);
	     }

	     final Runnable myRunnable = new Runnable() {
	        public void run() {
	        	Generate gen = new Generate();
	      		gen.GenerateData(stationList, 100);
	      		
		        prepareListData(--min, --max);
		        listAdapter = new MyListAdapter(tempcontext, listDataHeader, listDataChild);
		        expListView.setAdapter(listAdapter);
	        }
	     };

}