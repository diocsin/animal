package by.iluyshenko.animal;

public abstract class Pet extends Animal {

    private Owner owner;

    public Pet(String name, String species, int age) {
        super(name, species, age);
    }

    public void setOwner(Owner owner) {
        this.owner= owner;
    }

    public void play() {
        System.out.println(name + " играет с хозяином " + owner.getName() + ".");
    }

    public String getOwnerName() {
        return owner != null ? owner.toString() : "Без владельца";
    }

    @Override
    public String toString() {
        return super.toString() + " Домашнее животное, хозяин: " + owner.getName();
    }

}
