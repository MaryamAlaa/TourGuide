package com.example.youssefalaa.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.Moamen)));
        places.add(new Place(getString(R.string.Buffalo)));
        places.add(new Place(getString(R.string.MAC)));
        places.add(new Place(getString(R.string.Pizza)));
        places.add(new Place(getString(R.string.Spectra)));


        PlaceAdapter adapter = new PlaceAdapter(this, R.color.category_restaurants, places);
        ListView listView = (ListView) findViewById(R.id.activity_restaurant);
        listView.setAdapter(adapter);
    }
}
