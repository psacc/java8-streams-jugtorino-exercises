package org.jugtaa.streams;

import java.awt.Point;
import java.util.Arrays;
import java.util.List;

public class Data
{
    public static List<Point> points = Arrays.asList(
            new Point(1, 1),
            new Point(2, 2),
            new Point(2, 3),
            new Point(5, 3),
            new Point(5, -4),
            new Point(-4, -4),
            new Point(0, 0)
    );

    public static List<Person> people = Arrays.asList(
            new Person("mario", new Pet("fuffy", PetType.DOG, PetGender.FEMALE)),
            new Person("simone"),
            new Person("andrea", new Pet("bianco", PetType.CAT, PetGender.MALE),
                    new Pet("nero", PetType.CAT, PetGender.MALE)),
            new Person("nicola", new Pet("nemo", PetType.FISH, PetGender.MALE),
                    new Pet("marlin", PetType.FISH, PetGender.MALE),
                    new Pet("dory", PetType.FISH, PetGender.FEMALE))
    );

    public static class Person
    {
        public final String name;
        public final List<Pet> pets;

        public Person(String name, Pet... pets)
        {
            this.name = name;
            this.pets = Arrays.asList(pets);
        }
    }

    public static class Pet
    {
        public final String name;
        public final PetType type;
        public final PetGender gender;

        public Pet(String name, PetType type, PetGender gender)
        {
            this.name = name;
            this.type = type;
            this.gender = gender;
        }

        @Override
        public String toString()
        {
            return String.format("%s(%s)", name, type);
        }
    }

    public enum PetType
    {
        CAT, DOG, FISH
    }

    public enum PetGender
    {
        MALE, FEMALE
    }

    private Data()
    {
    }
}
