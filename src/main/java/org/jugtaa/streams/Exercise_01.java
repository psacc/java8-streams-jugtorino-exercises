package org.jugtaa.streams;

public class Exercise_01
{
    public static void main(String[] args)
    {
        // Print all points to System.out.
    	
    	Data.points.stream().forEach(System.out::println);
    }
}
