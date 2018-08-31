package com.example.android.earthquakereport;

public class Earthquake {

    private String mPlace;

    /**earthquake magnitude**/
    private String mMag;

    private long mTimeInMilliseconds;


    /**
     * constructor
     * new Earthquake object
     * that takes the following parameters
     * @param place for the place in which the earthquake occurred
     * @param mag for the magnitude of the earthquake X.X
     * @param timeInMilliseconds is the time in milliseconds
     *
     **/

    public Earthquake(String place, String mag, long timeInMilliseconds) {
        mPlace = place;
        mMag = mag;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getPlace() { return mPlace; }
    public String getMag() { return mMag; }
    public long getTimeInMilliseconds() { return mTimeInMilliseconds; }
}
