package org.example.cat;

import org.example.pet.Pet;

public class Cat extends Pet {
    @Override
    public void adopt() {
        System.out.println("Adopted cat.");
    }
}
