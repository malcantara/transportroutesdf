package com.discere.transportroutesdf;

import java.util.HashMap;
import java.util.Map;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.discere.transportroutesdf.model.TransportStation;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class TransportMapFragment extends Fragment {

  private GoogleMap mMap;
  private View mView;
  private Map<String, TransportStation> mMetrobusStations;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {
    mView = inflater.inflate(R.layout.transport_map_fragment, null, false);
    return mView;
  }

  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mMap = ((SupportMapFragment) getFragmentManager()
        .findFragmentById(R.id.map)).getMap();

    // Sets the map type to be "normal"
    mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

    // Enable location
    mMap.setMyLocationEnabled(true);

    // Init data model
    initDataModel();

    // Add markers
    addMarkers();
  }

  private void initDataModel() {
    mMetrobusStations = new HashMap<String, TransportStation>();
    TransportStation transportStation = new TransportStation();
    transportStation.setName("Colonia del Valle");
    transportStation.setLatitude(19.385506);
    transportStation.setLongitude(-99.175281);
    transportStation.setId("1");
    transportStation.setIconName("ic_mb_l1_colonia_del_valle");
    mMetrobusStations.put(transportStation.getId(), transportStation);

    transportStation = new TransportStation();
    transportStation.setName("N‡poles");
    transportStation.setLatitude(19.389858);
    transportStation.setLongitude(-99.173682);
    transportStation.setId("2");
    transportStation.setIconName("ic_mb_l1_napoles");
    mMetrobusStations.put(transportStation.getId(), transportStation);

    transportStation = new TransportStation();
    transportStation.setName("Poliforum");
    transportStation.setLatitude(19.393623);
    transportStation.setLongitude(-99.172459);
    transportStation.setId("3");
    transportStation.setIconName("ic_mb_l1_poliforum");
    mMetrobusStations.put(transportStation.getId(), transportStation);

    transportStation = new TransportStation();
    transportStation.setName("La Piedad");
    transportStation.setLatitude(19.397873);
    transportStation.setLongitude(-99.171301);
    transportStation.setId("4");
    transportStation.setIconName("ic_mb_l1_la_piedad");
    mMetrobusStations.put(transportStation.getId(), transportStation);

    transportStation = new TransportStation();
    transportStation.setName("Nuevo Le—n");
    transportStation.setLatitude(19.40187);
    transportStation.setLongitude(-99.169959);
    transportStation.setId("5");
    transportStation.setIconName("ic_mb_l1_nuevo_leon");
    mMetrobusStations.put(transportStation.getId(), transportStation);

    transportStation = new TransportStation();
    transportStation.setName("Chilpancingo");
    transportStation.setLatitude(19.406485);
    transportStation.setLongitude(-99.1685);
    transportStation.setId("6");
    transportStation.setIconName("ic_mb_l1_chilpancingo");
    mMetrobusStations.put(transportStation.getId(), transportStation);

    transportStation = new TransportStation();
    transportStation.setName("Campeche");
    transportStation.setLatitude(19.409693);
    transportStation.setLongitude(-99.167318);
    transportStation.setId("7");
    transportStation.setIconName("ic_mb_l1_campeche");
    mMetrobusStations.put(transportStation.getId(), transportStation);

    transportStation = new TransportStation();
    transportStation.setName("Sonora");
    transportStation.setLatitude(19.413143);
    transportStation.setLongitude(-99.166245);
    transportStation.setId("8");
    transportStation.setIconName("ic_mb_l1_sonora");
    mMetrobusStations.put(transportStation.getId(), transportStation);
  }

  private void addMarkers() {

    for (TransportStation transportStation : mMetrobusStations.values()) {
      mMap.addMarker(new MarkerOptions()
          .position(
              new LatLng(transportStation.getLatitude(), transportStation
                  .getLongitude()))
          .icon(
              BitmapDescriptorFactory.fromResource(getActivity()
                  .getApplicationContext()
                  .getResources()
                  .getIdentifier(transportStation.getIconName(), "drawable",
                      getActivity().getPackageName())))
          .title(transportStation.getName()));
    }
  }

}
