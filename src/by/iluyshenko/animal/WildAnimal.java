package by.iluyshenko.animal;

public abstract class WildAnimal extends Animal {

    private String habitat;

    public WildAnimal(String name, String species, int age, String habitat) {
        super(name, species, age);
        this.habitat = habitat;
    }

    public void hunt() {
        System.out.println(name + " охотится в " + habitat + ".");
    }

    @Override
    public String toString() {
        return super.toString() + " (Дикое животное, среда обитания: " + habitat + ")";
    }

}
