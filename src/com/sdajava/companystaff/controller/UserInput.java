package com.sdajava.companystaff.controller;

import com.sdajava.companystaff.model.Worker;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * Created by lukas on 21.02.2017.
 */
public class UserInput {

    public Worker populateWorker(){

        Worker worker = new Worker(); //tworze nowy obiekt klasy worker

        Scanner in = new Scanner(System.in);

        //wypelniam obiket
        System.out.println("Podaj imie pracownika: ");
        worker.name = in.nextLine();

        System.out.printf("Podaj nazwisko pracownika: ");
        worker.lastName = in.nextLine();

        System.out.println("Podaj wiek pracownika: ");
        worker.age = in.nextInt();

        return worker; //zwracam obiekt
    }

}
