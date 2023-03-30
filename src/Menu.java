import java.util.Scanner;

import static java.lang.System.exit;

public class Menu {
    Zoo zoo = Zoo.getInstance();
    ZooService zooService = new ZooService();
    public void showOptions(){
        System.out.println("Welcome to the Zoo!");
        System.out.println("Are you a visitor, an employee or an investor?");
        System.out.println("1. Visitor");
        System.out.println("2. Employee");
        System.out.println("3. Investor");
        System.out.println("4. Exit");
    }
    public void showMenu() {
        showOptions();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1:
                zooService.visitorMenu();
                break;
            case 2:
                zooService.employeeMenu();
                break;
            case 3:
                zooService.investorMenu();
                break;
            case 4:
                exit(0);
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
    }
}
