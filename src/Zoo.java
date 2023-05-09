import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private static Zoo instance;
    private List<Animal> animals = new ArrayList<>();;
    private List<Human> humans = new ArrayList<>();;

    private Zoo() {
    }
    public static Zoo getInstance() {
        if (instance == null) {
            instance = new Zoo();
        }
        return instance;
    }
    public List<Animal> getAnimals() {
        return animals;
    }
    public void showAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
    public void showMamals() {
        for (Animal animal : animals) {
            if (animal instanceof Mammal) {
                System.out.println(animal);
            }
        }
    }
    public void showBirds() {
        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                System.out.println(animal);
            }
        }
    }
    public void showReptiles() {
        for (Animal animal : animals) {
            if (animal instanceof Reptile) {
                System.out.println(animal);
            }
        }
    }
    public void showFish() {
        for (Animal animal : animals) {
            if (animal instanceof Fish) {
                System.out.println(animal);
            }
        }
    }
    public void showInvertebrates() {
        for (Animal animal : animals) {
            if (animal instanceof Invertebrate) {
                System.out.println(animal);
            }
        }
    }
    public void showAmphibians() {
        for (Animal animal : animals) {
            if (animal instanceof Amphibian) {
                System.out.println(animal);
            }
        }
    }
    public void showCarnivoreAnimals(){
        List<Mammal> mamals = new ArrayList<>();
        List<Invertebrate> invertebrates = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal instanceof Mammal) {
                mamals.add((Mammal) animal);
            }
            if (animal instanceof Invertebrate) {
                invertebrates.add((Invertebrate) animal);
            }
        }
        for (Mammal mammal : mamals) {
            if (mammal.getFoodType().equalsIgnoreCase("carnivore")) {
                System.out.println(mammal);
            }
        }
        for (Invertebrate invertebrate : invertebrates) {
            if (invertebrate.getFoodType().equalsIgnoreCase("carnivore")) {
                System.out.println(invertebrate);
            }
        }
    }
    public void showHerbivoreAnimals(){
        List<Mammal> mamals = new ArrayList<>();
        List<Invertebrate> invertebrates = new ArrayList<>();

        for (Animal animal : animals) {
            if (animal instanceof Mammal) {
                mamals.add((Mammal) animal);
            }
            if (animal instanceof Invertebrate) {
                invertebrates.add((Invertebrate) animal);
            }
        }
        for (Mammal mammal : mamals) {
            if (mammal.getFoodType().equalsIgnoreCase("herbivore")) {
                System.out.println(mammal);
            }
        }
        for (Invertebrate invertebrate : invertebrates) {
            if (invertebrate.getFoodType().equalsIgnoreCase("Herbivore")) {
                System.out.println(invertebrate);
            }
        }
    }
    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }
    public void addHuman(Human human) {
        humans.add(human);
    }
    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
    public List<Human> getHumans() {
        return humans;
    }
    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }
}
