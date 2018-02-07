package com.tracv.directional;

import com.tracv.util.Constants;

import java.awt.*;

public class PointToPointDistance {

    public static boolean withinDistance(Point a, Point b){
        return getDistance(a, b) < Constants.CLICK_VAR_DISTANCE;
    }

    public static double getDistance(Point a, Point b){
        return Math.sqrt(Math.pow(a.getX()-b.getX(), 2) + Math.pow(a.getY()-b.getY(), 2));
    }
}
