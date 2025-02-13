package by.iluyshenko.animal;

import java.util.Random;

public abstract class Pet extends Animal {

    private static String[] owners = new String[5];

    private Random rand = new Random();

    static {
        owners[0] = "Барсик";
        owners[1] = "Мурзик";
        owners[2] = "Лапка";
        owners[3] = "Гав";
        owners[4] = "Беляшик";
    }

    protected String ownerName;

    protected String ownerSurName;

    public Pet(String name, String species, int age, String ownerName) {
        super(name, species, age);
        this.ownerName = ownerName;
        this.ownerSurName = owners[rand.nextInt(owners.length)];
    }

    public void play() {
        System.out.println(name + " играет с хозяином " + ownerName + ".");
    }

    @Override
    public String toString() {
        return super.toString() + " (Домашнее животное, хозяин: " + ownerName + " " + ownerSurName + ")";
    }

}
