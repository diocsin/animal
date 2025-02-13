package by.iluyshenko.animal;

public class Zoo {

    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Барсик", 3, "Иван"),
                new Cat("Мурка", 2, "Анна"),
                new Bird("Кеша", 1, "Мария"),
                new Lion("Симба", 5, "Африканская саванна")
        };

        for (Animal animal : animals) {
            System.out.println(animal);
            animal.makeSound();
            animal.move();
            animal.eat();

            if (animal instanceof Pet pet) {
                pet.play();
            } else if (animal instanceof WildAnimal wildAnimal) {
                wildAnimal.hunt();
            }

            System.out.println();
            System.out.println("Общее количество животных " + Animal.getTotalAnimals());
        }
    }

}
