package by.iluyshenko.animal;

public class Bird extends Pet {

    public Bird(String name, int age, String ownerName) {
        super(name, "Птица", age, ownerName);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " чирикает: Чик-Чирик!");
    }

    @Override
    public void move() {
        System.out.println(name + " летает в небе.");
    }

    @Override
    public void eat() {
        System.out.println(name + " клюет зерна.");
    }

}
