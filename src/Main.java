import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //create an auditService
        Zoo zoo = Zoo.getInstance();
        ZooService zooService = new ZooService();
        zooService.populateZooWithAmphibians("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\amphibians.txt");
        zooService.populateZooWithMammals("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\mammals.txt");
        zooService.populateWithBirds("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\birds.txt");
        zooService.populateWithReptiles("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\reptiles.txt");
        zooService.populateWithInvertebrates("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\invertebrates.txt");
        zooService.populateWithFish("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\fishes.txt");
        Collections.sort(zoo.getAnimals());
        //Menu menu = new Menu();
        //menu.showMenu();
        DbFunction dbFunction = new DbFunction();
        Connection con = dbFunction.connect();
        dbFunction.createTableAnimal();
//        dbFunction.insertAnimal("Lion", 5, "Carnivore", true, 5);
//        dbFunction.insertAnimal("Tiger", 6, "Carnivore", true, 5);
//        dbFunction.insertAnimal("Bear", 7, "Carnivore", true, 5);
        dbFunction.createTableBird();
//        dbFunction.insertBird("Larry",5,"Eagle",true,6,true,2000,false,"Black");
//        dbFunction.insertBird("Harry",5,"Eagle",true,6,true,2000,false,"Black");
//        dbFunction.insertBird("Barry",5,"Eagle",true,6,true,2000,false,"Black");
//        dbFunction.showAllBirds();
        dbFunction.createTableFish();
//        dbFunction.insertFish("Nemo",5,"Clownfish",true,6,true,12,"Sweet",500);
//        dbFunction.showAllFishes();
        dbFunction.createTableInvertebrate();
//        dbFunction.insertInvertebrate("Spider",5,"Tarantula",true,6,false,"Insects");
//        dbFunction.showAllInvertebrates();
        dbFunction.createTableMammal();
//        dbFunction.insertMammal("Simba",2,"Lion",false,100,true,2000,"Carnivore",true);
//        dbFunction.showAllMammals();
        dbFunction.createTableReptile();
//        dbFunction.insertReptile("Rex",5,"Crocodile",true,6,true,"Carnivore",true);
//        dbFunction.showAllReptiles();
        dbFunction.createTableAmphibian();
//        dbFunction.insertAmphibian("Froggy",5,"Frog",true,6,"Oily","Green");
//        dbFunction.showAllAmphibians();
    }
}