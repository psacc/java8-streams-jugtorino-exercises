package org.jugtaa.streams;

import java.util.stream.Collectors;

public class Exercise_02
{
    public static void main(String[] args)
    {
        // Print all points to System.out with this formatting: [x=?/y=?]
        // For example: [x=1/y=1], etc.
        // Use the public fields "x" and "y" of java.awt.Point, and Collectors.joining().
    	
    	System.out.println(Data.points.stream()
    		.map(point -> "[x="+point.x+"/y="+point.y+"]")
    		.collect(Collectors.joining(",")));
    }
}
