package com.hackathon.onpar;
import java.util.ArrayList;
import java.util.Random;

import android.util.Log;

public class Generate	{

		int microsec;
		int sec;
		int minutes;
		int hour;
		boolean reserved;
		boolean entry;
		boolean value;
		
		public Generate()	{
			
		}
		
		public void GenerateData(ArrayList<Station> stationList, int points){
			Station s;
			int stNum, tempNum;
			for	(int h = 5; h < 6; h++){ //hour
			for (int k = 0; k<points; k++){ //minute
				for (int j = 0; j < 1; j++){ //second
					for(int l = 0; l < 1; l++){ //microsecond
						stNum = 0 + (int)(Math.random() * ((27 - 0)+1));
						reserved = getRandomBoolean(0.5f);
						entry = getRandomBoolean(0.98f);
						s = stationList.get(stNum);
						
						if (reserved && entry)	{
							tempNum = s.getReservedAvailable();
							if (tempNum > 0)	{
								s.setReservedAvailable(tempNum-1);
								//Log.d("Test", s.getName()+" Reserved added a car! "+s.getReservedAvailable()+" spots available.");
							}
							//else
								//Log.d("Test", s.getName()+" Reserved is full! Go away!");
						}
						else if (reserved && !entry)	{
							tempNum = s.getReservedAvailable();
							if (tempNum<s.getReserved())	{
								s.setReservedAvailable(tempNum+1);
								//Log.d("Test", s.getName()+" Reserved car left! "+s.getReservedAvailable()+" spots available.");
							}
							//else
								//Log.d("Test", s.getName()+"Reserved is already empty, how did you get in?");
						}
						else if (!reserved && entry)	{
							tempNum = s.getFreeAvailable();
							if (tempNum>0)	{
								s.setFreeAvailable(tempNum-1);
								//Log.d("Test", s.getName()+" Free added a car! "+s.getFreeAvailable()+" spots available.");
							}
							//else
								//Log.d("Test", s.getName()+"Free is full! Go away!");
						}
						else if (!reserved && !entry)	{
							tempNum = s.getFreeAvailable();
							if (tempNum<s.getPublic())	{
								s.setFreeAvailable(tempNum+1);
								//Log.d("Test", s.getName()+" Free car left! "+s.getFreeAvailable()+" spots available.");
							}
							//else
								//Log.d("Test", s.getName()+"Free is already empty, how did you get in?");
						}
						//else
							//Log.d("Test", "Your code is broken. :(");
					}
					
					
					
					//wait
					//refresh gui
				}
			}
		}
	}
	
	public boolean getRandomBoolean(float min) {
		Random random = new Random();
		float rng = random.nextFloat();
		if(rng < min){
			value = true;
		}
		else {value = false;}
		return value;
	}
}