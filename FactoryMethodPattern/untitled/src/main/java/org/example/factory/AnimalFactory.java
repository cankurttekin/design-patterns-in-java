package org.example.factory;

import org.example.animals.Animal;

// Base creator(factory)
public abstract class AnimalFactory {

    // Subclasses will override this method in order to create specific Animal objects.
    public abstract Animal createAnimal();

    public void makeAnimalSpeak() {
        Animal animal = createAnimal();
        animal.speak();
    }
}
