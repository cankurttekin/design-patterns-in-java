package org.example.factory;

import org.example.animals.Animal;
import org.example.animals.Dog;

// Concrete creator(factory). DogFactory will produce Dogs.
public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
