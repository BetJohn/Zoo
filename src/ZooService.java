import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZooService {
    Zoo zoo = Zoo.getInstance();
    public void seeFedAnimals() {
        for (Animal animal : zoo.getAnimals()) {
            if (!animal.isNeedFoodOrWater()) {
                System.out.println("Animal " + animal.getName() + " is fed");
            }
        }
    }
    public boolean isAnimalFed(String name) {
        for (Animal animal : zoo.getAnimals()) {
            if (animal.getName().equals(name)) {
                if (!animal.isNeedFoodOrWater()) {
                    return true;
                }
            }
        }
        return false;
    }
    public void checkAnimalHealth() {
        boolean needCare = false;
        for (Animal animal : zoo.getAnimals()) {
            if (animal.getHealthCareValability() == 0) {
                System.out.println("Animal " + animal.getName() + " needs health care");
                needCare = true;
            }
        }
        if (!needCare) {
            System.out.println("All animals are healthy");
        }
    }
    public boolean allAnimalsAreHealthy() {
        for (Animal animal : zoo.getAnimals()) {
            if (animal.getHealthCareValability() == 0) {
                return false;
            }
        }
        return true;
    }
    public void populateZooWithMammals(String path) {
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(",");

                String name = values[0];
                int age = Integer.parseInt(values[1]);
                String breed = values[2];
                boolean needFoodOrWater = Boolean.parseBoolean(values[3]);
                int healthCareValability = Integer.parseInt(values[4]);
                boolean communicateBySounds = Boolean.parseBoolean(values[5]);
                int intelligence = Integer.parseInt(values[6]);
                String feedingType = values[7];
                boolean hair = Boolean.parseBoolean(values[8]);

                Mammal mammal = new Mammal(name, age, breed, needFoodOrWater, healthCareValability,
                        communicateBySounds, intelligence, feedingType, hair);
                zoo.addAnimal(mammal);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void populateZooWithAmphibians(String path){
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] values = line.split(", ");
                String name = values[0];
                int age = Integer.parseInt(values[1]);
                String breed = values[2];
                boolean needFoodOrWater = Boolean.parseBoolean(values[3]);
                int healthCareValability = Integer.parseInt(values[4]);
                String skinType = values[5];
                String skinColor = values[6];

                Amphibian amphibian = new Amphibian(name, age, breed, needFoodOrWater, healthCareValability, skinType, skinColor);
                zoo.addAnimal(amphibian);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void populateWithBirds(String path){
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] values = line.split(", ");
                String name = values[0];
                int age = Integer.parseInt(values[1]);
                String breed = values[2];
                boolean needFoodOrWater = Boolean.parseBoolean(values[3]);
                int healthCareValability = Integer.parseInt(values[4]);
                int maxAltitude = Integer.parseInt(values[5]);
                boolean chirps = Boolean.parseBoolean(values[6]);
                boolean canFly = Boolean.parseBoolean(values[6]);
                String wingsColor = values[7];
                Bird bird = new Bird(name, age, breed, needFoodOrWater, healthCareValability, maxAltitude, chirps, canFly, wingsColor);
                zoo.addAnimal(bird);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void populateWithReptiles(String path){
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] values = line.split(", ");
                String name = values[0];
                int age = Integer.parseInt(values[1]);
                String breed = values[2];
                boolean needFoodOrWater = Boolean.parseBoolean(values[3]);
                int healthCareValability = Integer.parseInt(values[4]);
                boolean canSwim = Boolean.parseBoolean(values[5]);
                String color = values[6];
                boolean isPoisonous = Boolean.parseBoolean(values[7]);
                Reptile reptile = new Reptile(name, age, breed, needFoodOrWater, healthCareValability, canSwim, color, isPoisonous);
                zoo.addAnimal(reptile);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void wait(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void populateWithInvertebrates(String path){
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] values = line.split(",");
                String name = values[0];
                int age = Integer.parseInt(values[1]);
                String breed = values[2];
                boolean needFoodOrWater = Boolean.parseBoolean(values[3]);
                int healthCareValability = Integer.parseInt(values[4]);
                boolean canFly = Boolean.parseBoolean(values[5]);
                String foodType = values[6];
                Invertebrate invertebrate = new Invertebrate(name, age, breed, needFoodOrWater, healthCareValability, canFly, foodType);
                zoo.addAnimal(invertebrate);
            }
            scanner.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void populateWithFish(String path){
        try {
            File file = new File(path);
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] values = line.split(",");
                String name = values[0];
                int age = Integer.parseInt(values[1]);
                String breed = values[2];
                boolean needFoodOrWater = Boolean.parseBoolean(values[3]);
                int healthCareValability = Integer.parseInt(values[4]);
                boolean predator = Boolean.parseBoolean(values[5]);
                int length = Integer.parseInt(values[6]);
                String waterType = values[7];
                int maxDepth = Integer.parseInt(values[8]);
                Fish fish = new Fish(name, age, breed, needFoodOrWater, healthCareValability, predator, length, waterType, maxDepth);
                zoo.addAnimal(fish);
            }
            scanner.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void visitorMenu(){
        System.out.println("Welcome to the visitor menu");
        System.out.println("What would you like to see today?");
        animalsMenu();
    }
    public void animalsMenu(){
        System.out.println("1. See all animals");
        System.out.println("2. See all animals of a specific type");
        System.out.println("3. See all carnivores");
        System.out.println("4. See all herbivores");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> zoo.showAnimals();
            case 2 -> {
                System.out.println("Choose animal type");
                System.out.println("1. Mammal");
                System.out.println("2. Amphibian");
                System.out.println("3. Bird");
                System.out.println("4. Reptile");
                System.out.println("5. Invertebrate");
                System.out.println("6. Fish");
                int animalTypeChoice = scanner.nextInt();
                showAnimalsTypeByChoice(animalTypeChoice);
            }
            case 3 -> zoo.showCarnivoreAnimals();

            case 4 -> zoo.showHerbivoreAnimals();

            default -> System.out.println("Invalid choice");
        }
    }
    public void showAnimalsTypeByChoice(int animalTypeChoice){
        switch (animalTypeChoice) {
            case 1 -> zoo.showMamals();
            case 2 -> zoo.showAmphibians();
            case 3 -> zoo.showBirds();
            case 4 -> zoo.showReptiles();
            case 5 -> zoo.showInvertebrates();
            case 6 -> zoo.showFish();
            default -> System.out.println("Invalid choice");
        }

    }
    public void employeeMenu(){
        System.out.println("Welcome to the employee menu");
        System.out.println("1. Login");
        System.out.println("0. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                String securityCode;
                String employeeID;
                System.out.println("Enter security code");
                securityCode = scanner.next();
                System.out.println("Enter employee ID");
                employeeID = scanner.next();
                List<Employee> employees = getAllEmployees();
                if (Employee.login(securityCode, employeeID, employees))
                    System.out.println("Login successful");
                else
                    System.out.println("Login failed");
            }
            case 0 -> {
                System.out.println("Exiting");
                wait(1500);
            }
            default -> {
                System.out.println("Invalid choice");
                System.out.println("Exiting");
                wait(1500);
            }
        }
    }
    public void investorMenu(){
        System.out.println("Welcome to the investor menu");
        System.out.println("1. Login");
        System.out.println("0. Exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                String securityCode;
                String investorID;
                System.out.println("Enter security code");
                securityCode = scanner.next();
                System.out.println("Enter investor ID");
                investorID = scanner.next();
                List<Investor> investors = getAllInvestors();
                if (Investor.login(securityCode, investorID, investors))
                    System.out.println("Login successful");
                else
                    System.out.println("Login failed");
            }
            case 0 -> {
                System.out.println("Exiting");
                wait(1500);
            }
            default -> {
                System.out.println("Invalid choice");
                System.out.println("Exiting");
                wait(1500);
            }
        }
    }
    public List<Investor>getAllInvestors(){
        //return a list of all investors from the list of humans
        List<Investor> investors = new ArrayList<>();
        for(Human human : zoo.getHumans()){
            if(human instanceof Investor){
                investors.add((Investor) human);
            }
        }
        return investors;
    }
    public List<Employee> getAllEmployees(){
        //return a list of all employees from the list of humans
        List<Employee> employees = new ArrayList<>();
        for(Human human : zoo.getHumans()){
            if(human instanceof Employee){
                employees.add((Employee) human);
            }
        }
        return employees;
    }
}
