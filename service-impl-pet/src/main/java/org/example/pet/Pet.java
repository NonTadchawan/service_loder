package org.example.pet;

import org.example.petfarm.PetFarm;

public class Pet implements PetFarm
{
    @Override
    public void adopt() {
        System.out.println("Adopted.");
    }
}
