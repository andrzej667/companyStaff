package sdajava.companyStaff.controller;

import sdajava.companyStaff.model.Management;
import sdajava.companyStaff.model.Worker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrzej on 21.02.2017.
 */

//klasa sterujaca


public class Controller {

    public UserInput userInput = new UserInput();
    public List<Worker>workerList=new ArrayList<>();
    public List<Management>chiefList=new ArrayList<>();

    public void addWorker() throws IOException {

        System.out.println("Dodaje pracownika... :");
        UserInput userInput = new UserInput();
        workerList.add(userInput.populateWorker());
    }

    public void addChief() {

        System.out.println("Dodaje szefa:  ...");
        UserInput userInput = new UserInput();
        //userInput.populateManagement();
        chiefList.add(userInput.populateManagement());
    }

    public void showChief() {

        System.out.println("Pokazuje szefa: ....");

        for (Management w:chiefList) {
            System.out.println("  Imie: "+w.name +"\n  Nazwisko: "+w.lastName + "\n  Plec: "+w.sex +"\n  Funkcja: "+w.funkcion +"\n  Wiek: "+w.age +"\n  IDNumer: "+w.idNumber +"\n  Posiada "+w.companyShare+" procent akcji");
        }
    }

    public  void showWorkers() {

        System.out.println("Pokazuje pracownikow:   ...");
        System.out.println("W firmie mamy:  "+workerList.size()+"  pracownikow"); /*dopisane we srode

        for(int i=0; i<=workerList.size(); i++)  //
        {
            System.out.println(workerList.get(i).lastName);
        }
*/
        System.out.println(workerList);
        workerList.stream().forEach(s -> System.out.println("  Imie: "+ s.name +"\n  Nazwisko: "+s.lastName + "" +
                "\n  Plec: "+s.sex +"\n  Poziom: "+s.level +"\n  Wiek"+s.age +"\n  IDNumer: "+s.idNumber +"\n " +
                " Wynagrodzenie: "+s.salary));


        //for(Worker w:workerList){
         //   System.out.println("  Imie: "+w.name +"\n  Nazwisko: "+w.lastName + "\n  Plec: "+w.sex +"\n  Poziom: "+
         //           w.level +"\n  Wiek"+w.age +"\n  IDNumer: "+w.idNumber +"\n  Wynagrodzenie: "+w.salary);
        //}
       // System.out.println(""); // Linijka przerwy. Bez znaczenia dla programu
    }

}
