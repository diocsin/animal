package by.iluyshenko.animal;

public abstract class Animal {

    protected int id; // Уникальный идентификатор

    protected String name;

    protected String species;

    protected int age;

    private static int totalAnimals = 0;

    public Animal(String name, String species, int age) {
        this.id = ++totalAnimals; // Присваиваем уникальный ID
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public abstract void makeSound();

    public abstract void move();

    public abstract void eat();

    public void sleep() {
        System.out.println(name + " спит.");
    }

    @Override
    public String toString() {
        return species + " по имени " + name + ", возраст: " + age + " (ID: " + id + ")";
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }

}