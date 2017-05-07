package com.example.youssefalaa.tour_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView university = (TextView) findViewById(R.id.unis);
        TextView restuarant = (TextView) findViewById(R.id.restautants);
        TextView workSpace = (TextView) findViewById(R.id.workspaces);
        TextView hotels = (TextView) findViewById(R.id.hotels);
        TextView malls = (TextView) findViewById(R.id.malls);


        university.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent University = new Intent(MainActivity.this, UniversityActivity.class);
                startActivity(University);
            }
        });


        restuarant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Restaurant = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(Restaurant);
            }
        });


        workSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent WorkSpace = new Intent(MainActivity.this, WorkSpaceActivity.class);
                startActivity(WorkSpace);
            }
        });

        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Hotels = new Intent(MainActivity.this, HotelsActivity.class);
                startActivity(Hotels);
            }
        });

        malls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Malls = new Intent(MainActivity.this, MallsActivity.class);
                startActivity(Malls);
            }
        });
    }
}
