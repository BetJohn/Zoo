import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Zoo zoo = Zoo.getInstance();
        ZooService zooService = new ZooService();
        zooService.populateZooWithAmphibians("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\amphibians.txt");
        zooService.populateZooWithMammals("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\mammals.txt");
        zooService.populateWithBirds("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\birds.txt");
        zooService.populateWithReptiles("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\reptiles.txt");
        zooService.populateWithInvertebrates("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\invertebrates.txt");
        zooService.populateWithFish("C:\\Users\\Ioan\\Desktop\\Facultate Semestru2\\ProgramareAvansataObiecte\\Zoo_Project\\Zoo\\src\\Files\\fishes.txt");
        Collections.sort(zoo.getAnimals());
        Menu menu = new Menu();
        menu.showMenu();

    }
}