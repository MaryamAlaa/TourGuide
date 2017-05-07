package com.example.youssefalaa.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MallsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_malls);
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.Arkedia)));
        places.add(new Place(getString(R.string.Mall_Egy)));
        places.add(new Place(getString(R.string.Mall_Egy)));
        places.add(new Place(getString(R.string.festival)));
        PlaceAdapter adapter = new PlaceAdapter(this, R.color.category_malls, places);
        ListView listView = (ListView) findViewById(R.id.activity_malls);
        listView.setAdapter(adapter);
    }
}
