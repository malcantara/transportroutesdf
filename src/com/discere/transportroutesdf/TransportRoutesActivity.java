package com.discere.transportroutesdf;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;

public class TransportRoutesActivity extends ActionBarActivity {

 
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_transport_routes);

  }



  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.transport_routes, menu);
    return true;
  }

}
