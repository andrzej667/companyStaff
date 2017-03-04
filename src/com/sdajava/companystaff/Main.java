package com.sdajava.companystaff;

import com.sdajava.companystaff.controller.Controller;
import com.sdajava.companystaff.ex.C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        C cObj = new C();

        cObj.fieldA = "Cos";

        String login = "lukasz";
        String password = "1234";
        String userLogin;
        String userPassword;

        boolean optionFlag =  true;
        boolean flag = true;
        int option;

        Scanner in = new Scanner(System.in);

        while (flag) {

            System.out.printf("Podaj login: ");
            userLogin = in.nextLine();

            System.out.println("Podaj haslo: ");
            userPassword = in.nextLine();

            if (! (userLogin.equals(login) && userPassword.equals(password)) ) {
                System.out.println("Podales zle dane");
            }else{
                flag = false;
            }
        }
        //menu

        Controller controller = new Controller(); //obiekt klasy kontroler

        while (optionFlag) {

            System.out.println("Witaj w naszym systemie! \n" +
                "1. Dodaj nowego pracownika \n" +
                "2 . Dodaj nowego szefa \n" +
                "3. Pokaz wszystkich pracownikow \n" +
                "4 . Pokaz wszystkich szefow \n" +
                "0. Wyjcie z programu"
            );

            option = in.nextInt();

            switch (option) {
                case 1:
                    controller.addWorker();
                    break;

                case 2:
                    controller.addChief();
                    break;

                case 3:
                    controller.showWorkers();
                    break;

                case 4:
                    controller.showChief();
                    break;
                 default:
                     optionFlag = false;
            }
        }
    }
}
