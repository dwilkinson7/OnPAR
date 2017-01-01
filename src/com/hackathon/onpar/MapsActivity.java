package com.hackathon.onpar;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private Handler UI_HANDLER;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a markers in Calgary and move the camera
        LatLng calgary = new LatLng(51.0486, -114.0708); //central location

        LatLng centre36 = new LatLng (51.08472274570503 ,-114.0628359009854);
        LatLng centre78 = new LatLng (51.123001422110484, -114.0722720159407);
        LatLng brentwood = new LatLng (51.0869363 ,-114.1337764);
        LatLng crowfoot = new LatLng (51.1227005, -114.2094271);
        //LatLng dalhousie = new LatLng (51.1049660015397 ,-114.1586120004513);
        LatLng npointe = new LatLng (51.15801082593261 ,-114.06885398931763);
        LatLng sandstone = new LatLng (51.134489610125556 ,-114.08867025156093);
        LatLng tuscany = new LatLng (51.13338975730694, -114.2366116100654);
        LatLng barlow = new LatLng (51.042420961477006, -114.00401940624374);
        LatLng franklin = new LatLng (51.046279798914675, -113.99399303607153);
        LatLng marlborough = new LatLng (51.0563343, -113.987265);
        LatLng mcknight = new LatLng (51.1087507909901, -113.9751364923307);
        LatLng saddletowne = new LatLng (51.12570011140946, -113.9490316807718);
        LatLng whitehorne = new LatLng (51.087705, -113.982619);
        LatLng ave39 = new LatLng (51.01732224271488, -114.06091819350775);
        LatLng st69park = new LatLng (51.037243, -114.189081);
        LatLng st69surf = new LatLng (51.037253, -114.186133);
        LatLng anderson = new LatLng (50.95363635473005, -114.07268123787662);
        LatLng canyon = new LatLng (50.93694300436085, -114.06767406573361);
        LatLng chinook = new LatLng (50.996666978764324, -114.06702501634622);
        LatLng fishcreek = new LatLng (50.922733436198584, -114.07417327359944);
        LatLng heritage = new LatLng (50.97823034633179, -114.07534359350774);
        LatLng shawnessy = new LatLng (50.90943812435285, -114.06982643607152);
        LatLng sirokko = new LatLng (51.03798857560531, -114.16662112908222);
        LatLng somerset = new LatLng (50.899226057274205, -114.06752192974106);
        LatLng southland = new LatLng (50.963244345195214, -114.07739947649881);
        LatLng douglas = new LatLng (50.9525611, -113.99635098265969);
        LatLng mckenzie = new LatLng (50.91494841509323, -113.9578777474821);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(calgary, 10f));
        //int stNum = (int)(Math.random()*200);
        mMap.addMarker(new MarkerOptions().position(centre36).title("Centre St & 36 Ave N").snippet("Spots available:" + (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(centre78).title("Centre St & 78 Ave N").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(brentwood).title("Brentwood").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(crowfoot).title("Crowfoot").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(barlow).title("Barlow").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(npointe).title("North Pionte").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(sandstone).title("Sandstone Dr").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(tuscany).title("Tuscany").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(franklin).title("Franklin").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(mcknight).title("McKnight").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(saddletowne).title("Saddletowne").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(whitehorne).title("Whitehorne").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(ave39).title("39 Avenue").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(st69park).title("69 Ave Parkade").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(st69surf).title("69 Ave Surface").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(anderson).title("Anderson").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(canyon).title("Canyon Meadows").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(chinook).title("Chinook").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(fishcreek).title("Fish Creek - Lacombe").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(heritage).title("Heritage").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(shawnessy).title("Shawnessy").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(sirokko).title("Sirocco Station").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(somerset).title("Somerset - Bridlewood").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(southland).title("Southland").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(douglas).title("Douglas Glen").snippet("Spots available:"+ (int)(Math.random()*200)));
        mMap.addMarker(new MarkerOptions().position(mckenzie).title("McKenzie Towne").snippet("Spots available:"+ (int)(Math.random()*200)));
        
        //UI_HANDLER = new Handler();
        //UI_HANDLER.postDelayed(UI_UPDATE_RUNNABLE, 15000);
    }
    
    Runnable UI_UPDATE_RUNNABLE = new Runnable() {

        @Override
        public void run() {
            
        	drawAllMarker();
            UI_HANDLER.postDelayed(UI_UPDATE_RUNNABLE, 15000);
        }

		private void drawAllMarker() {
			// TODO Auto-generated method stub
			mMap.clear();
			LatLng centre36 = new LatLng (51.08472274570503 ,-114.0628359009854);
	        LatLng centre78 = new LatLng (51.123001422110484, -114.0722720159407);
	        LatLng brentwood = new LatLng (51.0869363 ,-114.1337764);
	        LatLng crowfoot = new LatLng (51.1227005, -114.2094271);
	        //LatLng dalhousie = new LatLng (51.1049660015397 ,-114.1586120004513);
	        LatLng npointe = new LatLng (51.15801082593261 ,-114.06885398931763);
	        LatLng sandstone = new LatLng (51.134489610125556 ,-114.08867025156093);
	        LatLng tuscany = new LatLng (51.13338975730694, -114.2366116100654);
	        LatLng barlow = new LatLng (51.042420961477006, -114.00401940624374);
	        LatLng franklin = new LatLng (51.046279798914675, -113.99399303607153);
	        LatLng marlborough = new LatLng (51.0563343, -113.987265);
	        LatLng mcknight = new LatLng (51.1087507909901, -113.9751364923307);
	        LatLng saddletowne = new LatLng (51.12570011140946, -113.9490316807718);
	        LatLng whitehorne = new LatLng (51.087705, -113.982619);
	        LatLng ave39 = new LatLng (51.01732224271488, -114.06091819350775);
	        LatLng st69park = new LatLng (51.037243, -114.189081);
	        LatLng st69surf = new LatLng (51.037253, -114.186133);
	        LatLng anderson = new LatLng (50.95363635473005, -114.07268123787662);
	        LatLng canyon = new LatLng (50.93694300436085, -114.06767406573361);
	        LatLng chinook = new LatLng (50.996666978764324, -114.06702501634622);
	        LatLng fishcreek = new LatLng (50.922733436198584, -114.07417327359944);
	        LatLng heritage = new LatLng (50.97823034633179, -114.07534359350774);
	        LatLng shawnessy = new LatLng (50.90943812435285, -114.06982643607152);
	        LatLng sirokko = new LatLng (51.03798857560531, -114.16662112908222);
	        LatLng somerset = new LatLng (50.899226057274205, -114.06752192974106);
	        LatLng southland = new LatLng (50.963244345195214, -114.07739947649881);
	        LatLng douglas = new LatLng (50.9525611, -113.99635098265969);
	        LatLng mckenzie = new LatLng (50.91494841509323, -113.9578777474821);
			mMap.addMarker(new MarkerOptions().position(centre36).title("Centre St & 36 Ave N").snippet("Spots available:" + (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(centre78).title("Centre St & 78 Ave N").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(brentwood).title("Brentwood").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(crowfoot).title("Crowfoot").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(barlow).title("Barlow").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(npointe).title("North Pionte").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(sandstone).title("Sandstone Dr").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(tuscany).title("Tuscany").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(franklin).title("Franklin").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(mcknight).title("McKnight").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(saddletowne).title("Saddletowne").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(whitehorne).title("Whitehorne").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(ave39).title("39 Avenue").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(st69park).title("69 Ave Parkade").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(st69surf).title("69 Ave Surface").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(anderson).title("Anderson").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(canyon).title("Canyon Meadows").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(chinook).title("Chinook").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(fishcreek).title("Fish Creek - Lacombe").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(heritage).title("Heritage").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(shawnessy).title("Shawnessy").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(sirokko).title("Sirocco Station").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(somerset).title("Somerset - Bridlewood").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(southland).title("Southland").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(douglas).title("Douglas Glen").snippet("Spots available:"+ (int)(Math.random()*200)));
	        mMap.addMarker(new MarkerOptions().position(mckenzie).title("McKenzie Towne").snippet("Spots available:"+ (int)(Math.random()*200)));
		}
    };
}
