package com.conelius.earthquake.util;

import java.util.Random;

/**
 * created by Conelius on 2/21/2020 at 11:58 AM : ceekayconelius@gmail.com , github @conykay.
 */
public class Constants {
    public static final String URL = "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_week.geojson";
    public static final int LIMIT = 100;

    public static int randomInt(int max, int min) {
        return new Random().nextInt(max - min) + min;
    }
}
