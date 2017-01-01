package com.hackathon.onpar;

import android.os.Parcel;
import android.os.Parcelable;

public class Station implements Parcelable{

	private String id;
	private String stationName;
	private int total;
	private int reserved;
	private int free;
	private int reservedavail;
	private int freeavail;
	
	//constructors
	public Station (){
		
	}
	
	public Station (String giveid, String name, int tot, int res, int pub){
		this.id = giveid;
		this.stationName = name;
		this.total = tot;
		this.reserved = res;
		this.free = pub;
		this.reservedavail = res;
		this.freeavail = pub;
		
	}
	
	public Station(Parcel parcel)	{
		this.id = parcel.readString();
		this.stationName = parcel.readString();
		this.total = parcel.readInt();
		this.reserved = parcel.readInt();
		this.free = parcel.readInt();
		this.reservedavail = parcel.readInt();
		this.freeavail = parcel.readInt();
	}
	
	//setters
	public void setName(String name){
		this.stationName = name;
	}
	
	public void setTotal(int tot){
		this.total = tot;
	}
	
	public void setReserved(int res){
		this.reserved = res;
	}
	
	public void setPublic(int pub){
		this.free = pub;
	}
	
	public void setReservedAvailable(int resavail)	{
		this.reservedavail = resavail;
	}
	
	public void setFreeAvailable(int freeavail)	{
		this.freeavail = freeavail;
	}
	
	public void setID(String givenid)	{
		this.id = givenid;
	}
	
	
	//getters
	public String getName(){
		return this.stationName;
	}
	
	public int getTotal(){
		return this.total;
	}
	
	public int getReserved(){
		return this.reserved;
	}
	
	public int getPublic(){
		return this.free;
	}
	public int getReservedAvailable()	{
		return this.reservedavail;
	}
	
	public int getFreeAvailable()	{
		return this.freeavail;
	}
	
	public String getID()	{
		return this.id;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(this.id);
		dest.writeString(this.stationName);
		dest.writeInt(this.total);
		dest.writeInt(this.reserved);
		dest.writeInt(this.free);
		dest.writeInt(this.reservedavail);
		dest.writeInt(this.freeavail);
		
	}
	
	public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
	
		public Station createFromParcel(Parcel in){
			return new Station(in);
		}
		
		public Station[] newArray(int size)	{
			return new Station[size];
		}
	
	};

}