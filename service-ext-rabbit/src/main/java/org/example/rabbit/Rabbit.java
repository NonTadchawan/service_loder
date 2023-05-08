package org.example.rabbit;


import org.example.pet.Pet;

public class Rabbit extends Pet {
    @Override
    public void adopt() {
        System.out.println("Adopted rabbit.");
    }
}
