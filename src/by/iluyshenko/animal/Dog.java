package by.iluyshenko.animal;

public class Dog extends Pet {

    public Dog(String name, int age) {
        super(name, "Собака", age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " говорит: Гав-гав!");
    }

    @Override
    public void move() {
        System.out.println(name + " бегает на четырех лапах.");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест собачий корм.");
    }

}
