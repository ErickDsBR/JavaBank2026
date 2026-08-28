package components;

import java.util.Scanner;
//! =================DATAS========================
import modules.UserData.UserData;
import service.UserService;

public class Menu {
    public static void ShowMenu(){
        Scanner sc = new Scanner(System.in);
        UserService userService = new UserService();
        ClientMenu clientMenu = new ClientMenu();
        
        //!current user

        String currentUser = null;

        
        int opcao = 0;
        do {
            System.out.println("===MENU===");
            System.out.println("Usuário atual: " + (currentUser != null ? currentUser : "Nenhum usuário selecionado"));
            System.out.println("Chose An Option ");
            System.out.println("\n 1 - Criar/Abrir Conta do Cliente");
            System.out.println("\n 2 - Consultar Saldo");
            System.out.println("\n 3 - Depositar/Transferir");
            System.out.println("\n 4 - Realizar Saque");
            System.out.println("\n 5 - sair");

            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:{
                    clientMenu.ShowClientMenu();
                    break;
                }
                case 2:
                    System.out.println("Consultar Saldo");
                    System.out.println("Informe o número do Cpf: ");
                    String accountNumber = sc.nextLine();
                    userService.CheckBalance(accountNumber);
                    break;
                case 3:
                    System.out.println("Depositar/Transferir");
                    System.out.println("Informe o número do Cpf: ");
                    String user = sc.nextLine();
                    UserData userName = userService.CurrentUser(user);
                    currentUser = userName.name;

                    break;

                case 4:
                    System.out.println("Realizar Saque");
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
