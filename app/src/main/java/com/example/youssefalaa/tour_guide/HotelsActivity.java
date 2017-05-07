package com.example.youssefalaa.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.El_Nabila)));
        places.add(new Place(getString(R.string.Four_Season)));
        places.add(new Place(getString(R.string.Helton)));
        places.add(new Place(getString(R.string.fairemont)));
        PlaceAdapter adapter = new PlaceAdapter(this, R.color.category_hotels, places);
        ListView listView = (ListView) findViewById(R.id.activity_hotels);
        listView.setAdapter(adapter);
    }
}
