package components;

import java.util.Scanner;

public class Menu {
    public static void ShowMenu(){
        Scanner sc = new Scanner(System.in);



        int opcao = 0;

        do {
            System.out.println("===MENU===");
            System.out.println("Chose An Option");
            System.out.println("1 - LOGIN");
            System.out.println("2 - Register");
            System.out.println("3- sair");
            opcao = Integer.parseInt(sc.nextLine());

        }
        while (opcao != 3);


    }


}
