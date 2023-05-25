import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ZooService {
    Zoo zoo = Zoo.getInstance();
    DbFunction dbFunction = new DbFunction();
    AuditService auditService = new AuditService("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\audit.csv");
    public void seeFedAnimals() {
        for (Animal animal : zoo.getAnimals()) {
            if (!animal.isNeedFoodOrWater()) {
                System.out.println("Animal " + animal.getName() + " is fed");
            }
        }
        auditService.writeActionToCsv("seeFedAnimals");
    }
    public boolean isAnimalFed(String name) {
        for (Animal animal : zoo.getAnimals()) {
            if (animal.getName().equals(name)) {
                if (!animal.isNeedFoodOrWater()) {
                    return true;
                }
            }
        }
        auditService.writeActionToCsv("isAnimalFed");
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
        auditService.writeActionToCsv("checkAnimalHealth");
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
                dbFunction.insertMammal(name, age, breed, needFoodOrWater, healthCareValability,
                        communicateBySounds, intelligence, feedingType, hair);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        auditService.writeActionToCsv("populateZooWithMammals");
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
                dbFunction.insertAmphibian(name, age, breed, needFoodOrWater, healthCareValability, skinType, skinColor);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        auditService.writeActionToCsv("populateZooWithAmphibians");
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
                dbFunction.insertBird(name, age, breed, needFoodOrWater, healthCareValability, chirps,maxAltitude, canFly, wingsColor);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        auditService.writeActionToCsv("populateWithBirds");
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
                dbFunction.insertReptile(name, age, breed, needFoodOrWater, healthCareValability, canSwim, color, isPoisonous);
            }
            scanner.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        auditService.writeActionToCsv("populateWithReptiles");
    }
    public void wait(int miliseconds) {
        try {
            Thread.sleep(miliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        auditService.writeActionToCsv("wait");
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
                dbFunction.insertInvertebrate(name, age, breed, needFoodOrWater, healthCareValability, canFly, foodType);
            }
            scanner.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        auditService.writeActionToCsv("populateWithInvertebrates");
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
                dbFunction.insertFish(name, age, breed, needFoodOrWater, healthCareValability, predator, length, waterType, maxDepth);
            }
            scanner.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        auditService.writeActionToCsv("populateWithFish");
    }
    public void visitorMenu(){
        auditService.writeActionToCsv("visitorMenu");
        System.out.println("Welcome to the visitor menu");
        System.out.println("What would you like to see today?");
        animalsMenu();
    }
    public void animalsMenu(){
        auditService.writeActionToCsv("animalsMenu");
        System.out.println("1. See all animals");
        System.out.println("2. See all animals of a specific type");
        System.out.println("3. See all carnivores");
        System.out.println("4. See all herbivores");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                zoo.showAnimals();
                auditService.writeActionToCsv("showAnimals");
            }
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
            case 3 -> {
                zoo.showCarnivoreAnimals();
                auditService.writeActionToCsv("showCarnivoreAnimals");
            }

            case 4 -> {
                zoo.showHerbivoreAnimals();
                auditService.writeActionToCsv("showHerbivoreAnimals");
            }

            default -> System.out.println("Invalid choice");
        }

    }
    public void showAnimalsTypeByChoice(int animalTypeChoice){
        switch (animalTypeChoice) {
            case 1 -> {
                zoo.showMamals();
                auditService.writeActionToCsv("showMamals");
            }
            case 2 -> {
                zoo.showAmphibians();
                auditService.writeActionToCsv("showAmphibians");
            }
            case 3 -> {
                zoo.showBirds();
                auditService.writeActionToCsv("showBirds");
            }
            case 4 -> {
                zoo.showReptiles();
                auditService.writeActionToCsv("showReptiles");
            }
            case 5 -> {
                zoo.showInvertebrates();
                auditService.writeActionToCsv("showInvertebrates");
            }
            case 6 -> {
                zoo.showFish();
                auditService.writeActionToCsv("showFish");
            }
            default -> System.out.println("Invalid choice");
        }
        auditService.writeActionToCsv("showAnimalsTypeByChoice");

    }
    public void employeeMenu(){
        auditService.writeActionToCsv("employeeMenu");
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
        auditService.writeActionToCsv("investorMenu");
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
        auditService.writeActionToCsv("getAllInvestors");
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
        auditService.writeActionToCsv("getAllEmployees");
        return employees;
    }
    public void creatFriendship(Animal animal1, Animal animal2){
        Map<Animal, Animal> relationships = new Map<Animal, Animal>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object key) {
                return false;
            }

            @Override
            public boolean containsValue(Object value) {
                return false;
            }

            @Override
            public Animal get(Object key) {
                return null;
            }

            @Override
            public Animal put(Animal key, Animal value) {
                return null;
            }

            @Override
            public Animal remove(Object key) {
                return null;
            }

            @Override
            public void putAll(Map<? extends Animal, ? extends Animal> m) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set<Animal> keySet() {
                return null;
            }

            @Override
            public Collection<Animal> values() {
                return null;
            }

            @Override
            public Set<Entry<Animal, Animal>> entrySet() {
                return null;
            }
        };
        relationships.put(animal1, animal2);
        BestFriend bestFriend = new BestFriend(relationships);
    }
    public void showFriendship(BestFriend bestFriend, Animal animal){
        auditService.writeActionToCsv("showFriendships");
        System.out.println("Friendships: ");
        System.out.println(bestFriend.relationship.get(animal));
    }
}
