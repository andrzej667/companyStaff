package com.sdajava.companystaff.controller;

import com.sdajava.companystaff.model.Worker;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukas on 21.02.2017.
 */
public class Controller {

    public UserInput userInput = new UserInput();
    public List<Worker> workerList = new ArrayList<>();

    public void addWorker(){

        Worker w1 = userInput.populateWorker();
        workerList.add(w1);
    }

    public void addChief(){

    }

    public void showChief(){

    }

    public void showWorkers(){

        System.out.println("W firmie mamy: " + workerList.size() + " pracownikow");

        for(Worker w: workerList){
            System.out.println("Imie: " + w.name + " nazwisko: " + w.lastName);
        }

    }
}
