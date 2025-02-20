package by.iluyshenko.animal;

public class Cat extends Pet {

    public Cat(String name, int age) {
        super(name, "Кот", age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Мяу!");
    }

    @Override
    public void move() {
        System.out.println(name + " грациозно крадется.");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест рыбу.");
    }

}
