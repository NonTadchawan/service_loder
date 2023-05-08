package org.example;

import org.example.factory.PetFarmFactory;
import org.example.pet.Pet;

public class App
{
    public static void main( String[] args )
    {
        PetFarmFactory pf = new PetFarmFactory();
        Pet pet = pf.selectPet();
        pet.adopt();
    }
}
