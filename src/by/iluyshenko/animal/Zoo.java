package by.iluyshenko.animal;

public class Zoo {

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Барсик", 3),
                new Cat("Мурка", 2),
                new Bird("Кеша", 1),
        };

        Owner owner = new Owner();

        for (Animal animal : animals) {
            if (animal instanceof Pet pet) {
                owner.addPet(pet);
                pet.play();
            } else if (animal instanceof WildAnimal wildAnimal) {
                wildAnimal.hunt();
            }
            animal.makeSound();
            animal.move();
            animal.eat();
            System.out.println();
        }
        System.out.println("Общее количество животных " + Animal.getTotalAnimals());
    }

}
