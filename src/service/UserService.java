package service;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import modules.UserData;

public class UserService {
    private static List<UserData> usersList = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);
    public void NewUser() {
        do{
            System.out.println("Informe o número do Cpf: ");
            String accountNumber = sc.nextLine();

            System.out.println("Informe o nome do usuário: ");
            String name = sc.nextLine();
            

            System.out.println("Informe o saldo do usuário: ");
            double balance = Double.parseDouble(sc.nextLine());

            if (balance < 0) {
                System.out.println("O saldo deve ser maior ou igual a zero.");
                continue;
            }
            System.out.println("Saldo válido.");

            UserData newUser = new UserData(accountNumber, name, balance);
            usersList.add(newUser);

            System.out.println("Usuário criado com sucesso!");

            break;
        } while(true);
        
    }
    public List<UserData> ListUsers(){
        System.out.println("\n ===Lista de Usuários===");

        for (UserData user : usersList) {
            System.out.println("Número da Conta: " + user.accountNumber);
            System.out.println("Nome do Usuário: " + user.name);
            System.out.println("Saldo: " + user.balance);
            System.out.println("------------------------");
        }
        return usersList;
    }

}
