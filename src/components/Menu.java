package components;

import java.util.Scanner;
import modules.Usermodules;


public class Menu {
    Usermodules usermodules = new Usermodules();
    public static void ShowMenu(){
        Scanner sc = new Scanner(System.in);


        opcao = 0;

        while(true) {
            System.out.println("===MENU===");
            System.out.println("Chose An Option");
            System.out.println("1 - LOGIN");
            System.out.println("2 - Register");
            System.out.println("3- sair");
            sc.hasNextLine();
        }
       switch (opcao) {
           case 1:
               System.out.println("password");
               int userPassword = interger.parseInt(sc.hasNextLine());

        }
    }


}
