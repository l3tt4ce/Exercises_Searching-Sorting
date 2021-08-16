package com.company;

import java.awt.*;
import java.util.Comparator;


// 15 - Write a Comparator that compares Point objects by their distance from the origin of (0,0)
// Points that are closer to the origin are considered to come before those which are further

public class PointComparator implements Comparator<Point> {
    public int compare(Point p1, Point p2){
        // if any of the calculation is negative then p1 is closer to the origin
        int dx = p1.x - p2.x;
        if (dx == 0){
            return p1.y - p2.y;
        } else
            return dx;
    }
}
