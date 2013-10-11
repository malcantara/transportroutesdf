package com.discere.transportroutesdf;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;

public class TransportRoutes extends FragmentActivity {

  private GoogleMap mMap;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_transport_routes);

    mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(
        R.id.map)).getMap();

    // Sets the map type to be "normal"
    mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

    // Enable location
    mMap.setMyLocationEnabled(true);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.transport_routes, menu);
    return true;
  }

}
