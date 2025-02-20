package by.iluyshenko.animal;

import java.util.Random;

public class Owner {

    private int id;

    private String name;

    private String surName;

    private Pet[] pets = new Pet[0];

    private static int totalOwners = 0;

    private static String[] names;

    private static String[] surNames;

    private static Random random = new Random();


    static {
        System.out.println("Класс Owner загружен в память!");
        names = new String[] { "Иван", "Анна", "Петр", "Мария", "Дмитрий" };
        surNames = new String[] { "Иванов", "Петрова", "Сидоров", "Кузнецова", "Попов" };
    }

    public Owner() {
        this.id = totalOwners + 1;
        this.name = names[random.nextInt(names.length)];
        this.surName = surNames[random.nextInt(surNames.length)];
        totalOwners++;
    }

    public void addPet(Pet pet) {
        Pet[] pets1 = new Pet[pets.length + 1];
        System.arraycopy(pets, 0, pets1, 0, pets.length);
        pets1[pets1.length - 1] = pet;
        pets = pets1;
        pet.setOwner(this);
    }

    public String getName() {
        return name;
    }

    public static int getTotalOwners() {
        return totalOwners;
    }

    @Override
    public String toString() {
        return "Владелец: " + name + " " + surName + ", питомцев: " + pets.length;
    }

}
