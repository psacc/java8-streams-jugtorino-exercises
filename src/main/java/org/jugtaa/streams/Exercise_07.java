package org.jugtaa.streams;

import java.util.stream.Collectors;

public class Exercise_07
{
    public static void main(String[] args)
    {
        // Group the pets by pet type and print them.

    	Data.people.stream()
    		.flatMap(p -> p.pets.stream())
    		.collect(Collectors.groupingBy(p -> p.type))
//    		.forEach((t, p) -> System.out.println(t + " " + p));
    		.entrySet()//.stream()
    			.forEach(System.out::println);
    		
    }
}
