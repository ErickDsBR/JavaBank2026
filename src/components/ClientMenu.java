package components;

import java.util.Scanner;
import service.UserService;

public class ClientMenu {
    Scanner sc = new Scanner(System.in);
    UserService userService = new UserService();
    
    public void ShowClientMenu() {
        int option = 0;
        do{
            System.out.println("===CLIENT MENU===");
            System.out.println("\nCreate/Access Client Account");
            System.out.println("\n1. Create Account");
            System.out.println("2. Access Account");
            System.out.println("3. Exit");
            option = Integer.parseInt(sc.nextLine());

            switch(option){
                case 1:
                    System.out.println("Create Account");
                    userService.NewUser();
                    break;
                case 2:
                    System.out.println("\nAccess Account");
                    System.out.println("Enter the account number (CPF): ");
                    String user = sc.nextLine();
                    System.out.println("\nAccessing account for user: " + user);
                    userService.CurrentUser(user);
                    break;
                case 3:
                    System.out.println("\nReturning to Main Menu");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }while(option != 3);
        sc.close();
        Menu.ShowMenu();

        
    }

}
