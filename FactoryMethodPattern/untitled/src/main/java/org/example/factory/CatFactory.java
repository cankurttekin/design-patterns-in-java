package org.example.factory;

import org.example.animals.Animal;
import org.example.animals.Cat;

// Concrete creator(factory). CatFactory will produce Cats.
public class CatFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
