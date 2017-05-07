package com.example.youssefalaa.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class WorkSpaceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_space);
        ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.Ebda3)));
        places.add(new Place(getString(R.string.Creativo)));
        places.add(new Place(getString(R.string.ice)));
        PlaceAdapter adapter = new PlaceAdapter(this, R.color.category_workSpaces, places);
        ListView listView = (ListView) findViewById(R.id.activity_work_space);
        listView.setAdapter(adapter);
    }
}
