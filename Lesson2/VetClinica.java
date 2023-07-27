package Lesson2;
import java.util.ArrayList;
import java.util.List;

public class VetClinica {
    private final List<Animal> animals;

    public VetClinica() {
        this.animals = new ArrayList<>();
    }

    public VetClinica addNewAnimal(Animal animal) {
        animals.add(animal);
        return this;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public List<Animal> getFlying() {
        List<Animal> resultAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Flyable) {
                resultAnimals.add(animal);
            }
        }
        return resultAnimals;
    }

    public List<Animal> getSwimming() {
        List<Animal> resultAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Swimable) {
                resultAnimals.add(animal);
            }
        }
        return resultAnimals;
    }

    public List<Animal> getRunning() {
        List<Animal> resultAnimals = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal instanceof Runnable) {
                resultAnimals.add(animal);
            }
        }
        return resultAnimals;
    }


    public int index = 0;
}