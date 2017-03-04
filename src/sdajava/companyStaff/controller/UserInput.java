package sdajava.companyStaff.controller;

import sdajava.companyStaff.Main;
import sdajava.companyStaff.model.Management;
import sdajava.companyStaff.model.Worker;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.IOException;

/**
 * Created by Andrzej on 21.02.2017.
 */


public class UserInput {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());


    public Worker populateWorker() throws IOException {

        LOGGER.addHandler(new FileHandler("loger.xml"));
        LOGGER.info("Logger Name: " + LOGGER.getName());
        //LOGGER.config("index is set to " + index);

        Worker worker = new Worker();  //Tworzenie obiektu klasy Workr

        Scanner in = new Scanner(System.in);
        boolean flag = true;


        while (flag) {
            try {
                System.out.println("Podaj imie pracownika: ");
                worker.name = in.nextLine();

                System.out.println("Podaj nazwisko pracownika: ");
                worker.lastName = in.nextLine();

                System.out.println("Podaj płec: ");
                worker.sex = in.nextLine();

                System.out.println("Podaj poziom (czy co tam)  ");
                worker.level = in.nextLine();

                System.out.println("Podaj wiek:  ");
                worker.age = in.nextInt();

                System.out.println("Podaj IDNumber");
                worker.idNumber = in.nextInt();

                System.out.println("Podaj wynagrodzenie: ");
                worker.salary = in.nextInt();

                flag = false;

            } catch (java.util.InputMismatchException e) {
                LOGGER.log(Level.INFO, "Exception occur", e);
            }
        }

            return worker; //zwracanie obiektu
        }

    public Management populateManagement() {

        Management management =  new Management();
        Scanner in=new Scanner(System.in);

        System.out.println("Podaj imie prezia: ");
        management.name=in.nextLine();

        System.out.println("Podaj nazwisko prezia: ");
        management.lastName=in.nextLine();

        System.out.println("Podaj plec prezia: ");
        management.sex=in.nextLine();

        System.out.println("Podaj funkcje prezia: ");
        management.funkcion=in.nextLine();

        System.out.println("Podaj wiek prezia: ");
        management.age=in.nextInt();

        System.out.println("Podaj IDNumber prezia: ");
        management.idNumber=in.nextInt();

        System.out.println("Podaj % akcji prezia: ");
        management.companyShare=in.nextDouble();

        return management;
    }
}
