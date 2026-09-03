import java.util.Scanner;
import utils.Utils;
import service.BankService;
import service.UserService;
import modules.UserData.Session;
import modules.UserData.UserData;



public class UserMenu {
    Scanner sc = new Scanner(System.in);
    BankService bankService;
    UserService userService;
    
    public UserMenu(UserService userService) {
        this.userService = userService;
        this.bankService = new BankService(userService);
    }

    public void ShowUserMenu() {
        do{
            Utils.ClearScreen();
            System.out.println("        ===USER MENU===");
            System.out.println("Hello, " + Session.currentUser.name + " your Balance is: " + Session.currentUser.balance);
            System.out.println("        What would you like to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Logout");
            int option = Integer.parseInt(sc.nextLine());
            
            switch(option){
                case 1 -> {
                    System.out.println("Deposit");
                    bankService.Deposit();
                }
                case 2 -> {
                    System.out.println("Withdraw"); 
                    bankService.Withdraw();
                }
                case 3 -> {
                    System.out.println("Transfer");
                    bankService.Transfer();
                } 
                case 4 -> {
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
