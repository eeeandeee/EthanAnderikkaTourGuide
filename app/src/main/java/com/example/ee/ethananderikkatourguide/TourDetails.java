package com.example.ee.ethananderikkatourguide;

public class TourDetails extends Hotels {
    private String FName;
    private String FLocation;
    private int Image;

    public TourDetails (String mName, String mLocation) {
        FName = mName;
        FLocation = mLocation;
        }


    public String getFeatureName(){
        return FName;
    }
}


