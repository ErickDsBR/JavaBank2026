

import java.util.Scanner;
import utils.Utils;

import modules.UserData.UserData;
import service.UserService;
import modules.UserData.Session;


public class ClientMenu {
    UserService userService = new UserService();
    
    
    public void ShowClientMenu() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        
        do{ 
            if(Session.isUserLoggedIn()){
                UserMenu userMenu = new UserMenu(userService);
                userMenu.ShowUserMenu();
                continue;
            }
            UserData currentUser = Session.currentUser;

            Utils.ClearScreen();
            System.out.println("        ===HELCOME TO ULTRABANK===");
            System.out.println("        What would you like to do?");
            System.out.println("        Current User: " + (currentUser != null ? currentUser.name : "No user logged in"));
            System.out.print("\n1. Create Account   ");
            System.out.println("2. Access Account   ");
            System.out.print("\n3. Exit");
            option = Integer.parseInt(sc.nextLine());
            

            switch(option){
                case 1:
                    System.out.println("Create Account");
                    userService.RegisterUser();
                    break;
                case 2:
                    System.out.println("Access Account");
                    userService.Login();
                    break;
                case 3:
                    System.out.println("\n Thank you for using UltraBank. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }while(option != 3);
        sc.close();
    }

}
