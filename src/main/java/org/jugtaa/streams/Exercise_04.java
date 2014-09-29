package org.jugtaa.streams;

import java.awt.Point;

public class Exercise_04
{
    public static void main(String[] args)
    {
        // Print the point barycenter of the points.
        // P = (P1 + P2 + ... + Pn)/n
        // Do not write code outside fluent calls.
    	
    	Data.points.stream()
    		.reduce((i, p) -> new Point( i.x + p.x, i.y + i.y))
    		.map(p -> new Point(p.x/ Data.points.size(), p.y/Data.points.size()))
    		.ifPresent(System.out::println);
    }
}
