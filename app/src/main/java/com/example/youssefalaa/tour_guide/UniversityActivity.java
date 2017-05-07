package com.example.youssefalaa.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class UniversityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.Cairo), R.drawable.cairo));
        places.add(new Place(getString(R.string.Helwan), R.drawable.helwan));
        places.add(new Place(getString(R.string.Ain_shams), R.drawable.ain));
        places.add(new Place(getString(R.string.Ales), R.drawable.alex));
        places.add(new Place(getString(R.string.Fayoum), R.drawable.fayuom));
        places.add(new Place(getString(R.string.Monofia), R.drawable.menoifya));
        places.add(new Place(getString(R.string.Nile), R.drawable.nile));

        PlaceAdapter adapter = new PlaceAdapter(this, R.color.category_universities,places);
        ListView listView = (ListView) findViewById(R.id.activity_university);
        listView.setAdapter(adapter);
    }
}
