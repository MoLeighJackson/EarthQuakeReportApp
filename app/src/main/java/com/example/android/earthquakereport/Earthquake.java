package com.example.android.earthquakereport;

public class Earthquake {

    private String mPlace;

    private String mDate;

    /**earthquake magnitude**/
    private String mMag;


    /**
     * constructor
     * new Earthquake object
     * that takes the following parameters
     * @param place for the place in which the earthquake occurred
     * @param date for the date on which the earthquake occurred month day, year
     * @param mag for the magnitude of the earthquake X.X
     *
     **/

    public Earthquake(String place, String date, String mag) {
        mPlace = place;
        mDate = date;
        mMag = mag;
    }

    public String getPlace() { return mPlace; }
    public String getDate() { return mDate; }
    public String getMag() { return mMag; }
}
