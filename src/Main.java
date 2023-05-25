import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        //create an auditService
        Zoo zoo = Zoo.getInstance();
        ZooService zooService = new ZooService();
        DbFunction dbFunction = new DbFunction();
        Connection con = dbFunction.connect();
        dbFunction.createTableAnimal();

        dbFunction.createTableBird();

        dbFunction.createTableFish();
//                dbFunction.showAllFishes();
        dbFunction.createTableInvertebrate();
//        dbFunction.showAllInvertebrates();
        dbFunction.createTableMammal();
//        dbFunction.showAllMammals();
        dbFunction.createTableReptile();
//        dbFunction.showAllReptiles();
        dbFunction.createTableAmphibian();
//        dbFunction.showAllAmphibians();
        zooService.populateZooWithAmphibians("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\amphibians.txt");
        zooService.populateZooWithMammals("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\mammals.txt");
        zooService.populateWithBirds("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\birds.txt");
        zooService.populateWithReptiles("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\reptiles.txt");
        zooService.populateWithInvertebrates("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\invertebrates.txt");
        zooService.populateWithFish("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\fishes.txt");
        Collections.sort(zoo.getAnimals());
        dbFunction.showBirds("Stork");
        Menu menu = new Menu();
        menu.showMenu();


    }
}