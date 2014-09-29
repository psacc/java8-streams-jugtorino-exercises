package org.jugtaa.streams;

import java.util.Comparator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class Exercise_09
{
    public static void main(String[] args)
    {
        // Collect the 2 male pets with the longest names into a CopyOnWriteArrayList and print them.
    	Data.people.stream()
    		.flatMap(p -> p.pets.stream())
    		.filter(p -> p.gender == Data.PetGender.MALE)
    		.sorted(Comparator.comparing(pet -> pet.name.length(), Comparator.reverseOrder()))
    		.limit(2)
    		.collect(Collectors.toCollection(CopyOnWriteArrayList::new))
    		.forEach(System.out::println);
//    		.collect(CopyOnWriteArrayList::new, 
//    				(list, pet) -> list.add(pet), 
//    				(list1, list2) -> list1.addAll(list2));
    }
}
