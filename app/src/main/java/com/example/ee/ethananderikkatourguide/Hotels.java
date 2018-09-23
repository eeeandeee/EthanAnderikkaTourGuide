package com.example.ee.ethananderikkatourguide;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;



public class Hotels extends Activity implements HotelListAdapter.HotelClickListener {


    ArrayList<Hotels> Features = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(android.R.style.Theme_DeviceDefault_Light);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        Features.add(new TourDetails("Radisson Blu","Ikeja"));


        //casting view from adapter into List View on My PlayLists
        HotelListAdapter Adapter = new HotelListAdapter(Hotels.this, Features, Hotels.this);

        ListView listView = findViewById(R.id.myplaylists);
        listView.setAdapter(Adapter);

    }

        @Override
    public void hotelClicked(int position) {
        //Intent intent = new Intent(Hotels.this, NowPlaying.class);

        //startActivity(intent);
    }


}