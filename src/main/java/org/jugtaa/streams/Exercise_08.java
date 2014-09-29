package org.jugtaa.streams;

import java.util.Comparator;

public class Exercise_08
{
    public static void main(String[] args)
    {
        // Sort the pets by type, then by name descending and print them.
    	
    	Data.people.stream()
    		.flatMap(p -> p.pets.stream())
    		.sorted(Comparator.<Data.Pet, Data.PetType>comparing(pet -> pet.type)
    				.thenComparing(pet -> pet.name, Comparator.reverseOrder()))
    		.forEach(System.out::println);;
    }
}
