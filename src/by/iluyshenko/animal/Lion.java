package by.iluyshenko.animal;

public class Lion extends WildAnimal {

    public Lion(String name, int age, String habitat) {
        super(name, "Лев", age, habitat);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " рычит: Ррррр!");
    }

    @Override
    public void move() {
        System.out.println(name + " быстро бежит по саванне.");
    }

    @Override
    public void eat() {
        System.out.println(name + " ест мясо.");
    }

}
