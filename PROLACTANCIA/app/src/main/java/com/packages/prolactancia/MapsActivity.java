package com.packages.prolactancia;

import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
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

        // Add a marker in Sydney and move the camera
        LatLng hosp_guasmo = new LatLng(-2.278339, -79.895838);
        mMap.addMarker(new MarkerOptions().position(hosp_guasmo).title("Hospital General Guasmo Sur"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(hosp_guasmo));

        LatLng hosp_univ = new LatLng(-2.096141, -79.946781);
        mMap.addMarker(new MarkerOptions().position(hosp_univ).title("Hospital Universitario"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(hosp_univ));

        LatLng hosp_icaza = new LatLng(-2.2032727, -79.8953945);
        mMap.addMarker(new MarkerOptions().position(hosp_icaza).title("Hospital del Niño, Dr Fransisco de Icaza Bustamante"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(hosp_icaza));

        LatLng hosp_ceibos = new LatLng(-2.1762186, -79.9407821);
        mMap.addMarker(new MarkerOptions().position(hosp_ceibos).title("Hospital del IESS Los Ceibos"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(hosp_ceibos));

        LatLng hosp_gilbert = new LatLng(-2.1778518, -79.8850402);
        mMap.addMarker(new MarkerOptions().position(hosp_gilbert).title("Hospital de Niños Dr. Roberto Gilbert E."));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(hosp_gilbert));

        LatLng hosp_leon = new LatLng(-2.1289721, -79.9645355);
        mMap.addMarker(new MarkerOptions().position(hosp_leon).title("Hospital De Niños Leon Becerra"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(hosp_leon));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hosp_ceibos,11));
    }

    @Override
    public void onBackPressed() {
        Intent atras = new Intent(MapsActivity.this, Donacion.class);
        this.finish();
        startActivity(atras);
    }
}