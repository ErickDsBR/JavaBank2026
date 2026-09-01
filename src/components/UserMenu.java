import java.util.Scanner;
import utils.Utils;

import modules.UserData.Session;
public class UserMenu {
    Scanner sc = new Scanner(System.in);
    public void ShowUserMenu() {
        do{
            Utils.ClearScreen();
            System.out.println("        ===USER MENU===");
            System.out.println("\n 1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Logout");
            int option = Integer.parseInt(sc.nextLine());
            
            switch(option){
                case 1 -> {
                    System.out.println("Check Balance");
                }
                case 2 -> {
                    System.out.println("Deposit");
                }
                case 3 -> {
                    System.out.println("Withdraw");
                }
                case 4 -> {

                    System.out.println("Transfer");
                }
                case 5 -> {
                    System.out.println("Logout");
                    Session.currentUser = null; 
                    return; 
                }
                default -> {
                    System.out.println("Invalid option. Please try again.");
                }
            
            }
        }while(true);
    }
}
