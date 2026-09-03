package service;
import java.util.Scanner;

import modules.UserData.Session;
import modules.UserData.UserData;


public class BankService {
    Scanner sc = new Scanner(System.in);
    UserService userService;

    public BankService(UserService userService) {
        this.userService = userService;
    }


    public void Deposit() {

        try{ 
            System.out.println("your actual balance is: " + Session.currentUser.balance); 
    
            System.out.println("Enter the amount to deposit:");
            double amount = Double.parseDouble(sc.nextLine());
            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a positive value.");
                return;
            }
            else {
                Session.currentUser.balance += amount;
                System.out.println("Deposit successful. New balance: " + Session.currentUser.balance);
            }

        }catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }    
    }
    public void Withdraw() {
        try {
            System.out.println("Your actual balance is: " + Session.currentUser.balance);
            System.out.println("Enter the amount to withdraw:");
            double amount = Double.parseDouble(sc.nextLine());
            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a positive value.");
                return;
            }
            if (amount > Session.currentUser.balance) {
                System.out.println("Insufficient funds. Your balance is: " + Session.currentUser.balance);
                return;
            }
            Session.currentUser.balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + Session.currentUser.balance);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public UserData Transfer() {
        try {
            System.out.println("Your actual balance is: " + Session.currentUser.balance);
            System.out.println("Enter the account number of the recipient:");
            String transferSwitch = sc.nextLine().trim();
            
            System.out.println("Enter the amount to transfer:");
            double amount = Double.parseDouble(sc.nextLine());

            if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a positive value.");
                return null ;
            }
            if (amount > Session.currentUser.balance) {
                System.out.println("Insufficient funds.");
                return null;
            }

            UserData selecteduser  = userService.GetUserByAccountNumber(transferSwitch);
            
            if (selecteduser == null) {
                System.out.println("Recipient not found.");
                return null;
            }
            if (selecteduser.accountNumber.equals(Session.currentUser.accountNumber)) {
                System.out.println("You cannot transfer money to yourself.");
                return null;
            }
            
            Session.currentUser.balance -= amount;
            selecteduser.balance += amount;
            System.out.println("Transfer successful. Your new balance: " + Session.currentUser.balance);
            System.out.println("Recipient's new balance: " + selecteduser.balance);
            return selecteduser;

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        return null;
    }
    
}


