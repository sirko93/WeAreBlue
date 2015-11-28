package eu.execom.hackaton.beacon.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.Receiver;
import org.androidannotations.annotations.ViewById;

import eu.execom.hackaton.beacon.R;
import eu.execom.hackaton.beacon.adapter.LocationListAdapter;
import eu.execom.hackaton.beacon.service.BeaconDiscoveryService;
import eu.execom.hackaton.beacon.service.BeaconDiscoveryService_;

@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewById
    ListView locationList;

    @ViewById
    Toolbar toolbar;

    @Bean
    LocationListAdapter adapter;

    @AfterViews
    void startService() {
        BeaconDiscoveryService_.intent(this).start();
    }

    @AfterViews
    void setViews() {
        setSupportActionBar(toolbar);
        locationList.setAdapter(adapter);
    }

    @Receiver(actions = BeaconDiscoveryService.NEW_BEACON_SIGHTING)
    void onBeaconSighted() {
        adapter.update(BeaconDiscoveryService.getLocations());
    }

    @Click
    void button()
    {
        Intent intent = new Intent(this, StartingActivity.class);
        startActivity(intent);

    }

}
