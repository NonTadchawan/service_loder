package org.example.factory;

import org.example.pet.Pet;

import java.util.Optional;
import java.util.ServiceLoader;

public class PetFarmFactory {
    public Pet selectPet(){
        ServiceLoader<Pet> service = ServiceLoader.load(Pet.class);
        Optional<Pet> pet = service.stream().map(e -> e.get()).findFirst();
        return pet.get();
    }
}
