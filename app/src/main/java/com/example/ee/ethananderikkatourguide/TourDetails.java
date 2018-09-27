package com.example.ee.ethananderikkatourguide;

public class TourDetails extends Hotels {
    private int DetailOne;
    private String DetailTwo;
    private String DetailThree;
    private String LastDetails;

    //tf-indicates tour features, and tfo indicates tour features other

    public TourDetails(int tfImage, String tfName, String tfoCost, String tfoDetails) {
        DetailOne = tfImage;
        DetailTwo = tfName;
        DetailThree = tfoCost;
        LastDetails = tfoDetails;
    }

    public int getTourFeatureImage() {
        return DetailOne;
    }

    public String getTourFeatureName() {
        return DetailTwo;
    }

    public String getTourFeatureCost() {
        return DetailThree;
    }

    public String getTourFeatureOtherDetails() {
        return LastDetails;
    }

}


