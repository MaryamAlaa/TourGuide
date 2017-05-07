package com.example.youssefalaa.tour_guide;

/**
 * Created by youssef alaa on 24/04/2017.
 */

public class Place<Place> {
    final private static int NO_IMAGE = -1;

    private String English;
    private int mImageId = NO_IMAGE;

    public Place(String englishTans, int imageId) {

        English = englishTans;
        mImageId = imageId;
    }

    public Place(String englishTans) {
        English = englishTans;
    }

    public String getEnglishTans() {
        return English;
    }


    public int getmImageId() {
        return mImageId;
    }


    public boolean hasImage() {
        return mImageId != NO_IMAGE;
    }
}
