package org.jugtaa.streams;

public class Exercise_06
{
    public static void main(String[] args)
    {
        // Print all the pets of all people.
    	Data.people.stream()
    		.flatMap(p -> p.pets.stream())
//    		.distinct()
    		.forEach(System.out::println);
    }
}
