package components;

import java.util.Scanner;

import service.UserService;

public class Menu {
    public static void ShowMenu(){
        Scanner sc = new Scanner(System.in);
        
        UserService userService = new UserService();
        
        //!current user
        
        int opcao = 0;
        do {
            System.out.println("\n ===MENU===");
            System.out.println("Chose An Option ");
            System.out.println("\n 1 - Criar/Abrir Conta do Cliente");
            System.out.println("\n 2 - Consultar Saldo");
            System.out.println("\n 3 - Depositar/Transferir");
            System.out.println("\n 4 - Realizar Saque");
            System.out.println("\n 5 - sair");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:{
                    System.out.println("\n ===Criar/Abrir Conta do Cliente===");
                    userService.NewUser();
                    break;
                }
                case 2:
                    System.out.println("Consultar Saldo");
                    userService.ListUsers();
                    break;
                case 5:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        while (opcao != 5);

        
        sc.close();
    }



}
