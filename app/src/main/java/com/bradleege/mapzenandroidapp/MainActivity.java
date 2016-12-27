package com.bradleege.mapzenandroidapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mapzen.android.graphics.MapFragment;
import com.mapzen.android.graphics.MapzenMap;
import com.mapzen.android.graphics.OnMapReadyCallback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapFragment mapFragment = (MapFragment) getSupportFragmentManager().findFragmentById(R.id.map_fragment);
        mapFragment.getMapAsync(new OnMapReadyCallback() {
            @Override public void onMapReady(MapzenMap map) {
                // Map is ready.
            }
        });

    }
}
