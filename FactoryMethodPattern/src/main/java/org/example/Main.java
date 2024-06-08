package org.example;

import org.example.factory.AnimalFactory;
import org.example.factory.CatFactory;
import org.example.factory.DogFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("Factory Method Pattern...\n");

        AnimalFactory dogFactory = new DogFactory();
        AnimalFactory catFactory = new CatFactory();

        dogFactory.makeAnimalSpeak();
        catFactory.makeAnimalSpeak();

    }
}