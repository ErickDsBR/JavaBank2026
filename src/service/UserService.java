package service;
import modules.UserData.UserData;
import modules.UserData.Session;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class UserService {
    Scanner sc = new Scanner(System.in);
    List<UserData> user = new ArrayList<>();
    
    public UserData RegisterUser() {
        do{
            System.out.println("Enter the account number (CPF): ");
            String accountNumber = sc.nextLine();
            System.out.println("Enter the name: ");
            String name = sc.nextLine();
            System.out.println("Enter the initial balance: ");
            double balance = Double.parseDouble(sc.nextLine());
            
            if (balance <= 0) {
                System.out.println("The initial balance must be different from 0.");
                continue;
            }else {
                System.out.println("User registered successfully!");
                UserData newUser = new UserData(accountNumber, name, balance);
                user.add(newUser);

                //! saida do usuario
                System.out.println("Account Number: " + newUser.accountNumber + "\nName: " + newUser.name + "\nBalance: " + newUser.balance);
                return newUser;
            }
            
            
        }while(true);
        

        
    }

    public UserData Login() {
        do{
            System.out.println("Enter the account number (CPF): ");
            String accountNumber = sc.nextLine();
            for (UserData u : user) {
                if (u.accountNumber.equals(accountNumber)) {
                    Session.currentUser = u;
                    return u;
                }
            }
            System.out.println("User not found.");
        } while(true);
    }

    public UserData GetUserByAccountNumber(String accountNumber) {
        for (UserData u : user) {
            if (u.accountNumber.equals(accountNumber)) {
                return u;
            }
        }
        return null;
    }
    

}
