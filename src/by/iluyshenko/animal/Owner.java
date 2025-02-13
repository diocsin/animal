package by.iluyshenko.animal;

import java.util.Arrays;

public class Owner {

    private String name;

    private Pet[] pets;

    public Owner(String name, Pet[] pets) {
        this.name = name;
        this.pets = pets;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", pets=" + Arrays.toString(pets) +
                '}';
    }

}
