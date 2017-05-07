package com.example.youssefalaa.tour_guide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.youssefalaa.tour_guide.R.id.English;

/**
 * Created by youssef alaa on 24/04/2017.
 */

public class PlaceAdapter extends ArrayAdapter<Place> {
    private static final String LOG_TAG = PlaceAdapter.class.getSimpleName();
    private int mColorId;

    public PlaceAdapter(Activity context, int color, ArrayList<Place> word) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, word);
        mColorId = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listWords = convertView;
        if (listWords == null) {
            listWords = LayoutInflater.from(getContext()).inflate(R.layout.list, parent, false);
        }
        Place currentWord = getItem(position);


        TextView english = (TextView) listWords.findViewById(English);
        english.setText(currentWord.getEnglishTans());

        View textContainer = listWords.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorId);
        textContainer.setBackgroundColor(color);

        ImageView guide = (ImageView) listWords.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            guide.setImageResource(currentWord.getmImageId());
            guide.setVisibility(View.VISIBLE);
        } else {
            guide.setVisibility(View.GONE);
        }
        return listWords;
    }
}