package sdajava.companyStaff;

import sdajava.companyStaff.GUI.GUI;
import sdajava.companyStaff.controller.Controller;

import java.io.IOException;
import java.util.Scanner;


public class Main {



        public static void main(String[] args) throws IOException {


                String login = "as";                    //Login haslo ze skanerem wiersz11 do 26
                String password = "123";
                String userLogin;
                String userPassword;

                boolean flag = true;
                int option;
                boolean optionFlag = true;

                Scanner in = new Scanner(System.in);


                while (flag) {
                        System.out.println("Podaj login: ");
                        userLogin = in.nextLine();

                        System.out.println("Podaj haslo: ");
                        userPassword = in.nextLine();

                        if (!(userLogin.equals(login) && userPassword.equals(password))) { //jeżeli (negacja(...

                                System.out.println("Podales zle dane");
                        } else {
                                flag = false;
                        }
                }

                // ====> menu <====

                Controller controller = new Controller(); // obiekt klasy kontroler


                while (optionFlag) { // Zapetlenie, aby menu dzialalo poprawnie

                 /*       System.out.println("Wiatj w naszym systemie \n" + //przeniesione do GUI.java
                                "1.Dodaj nowego pracownika \n" +
                                "2.Dodaj nowego szefa \n" +
                                "3.Pokaz wszyskich pracownikow \n" +
                                "4.Pokaz wszystkich szefow \n" +
                                "0.Wyjscie z programu"
                        );*/


                        System.out.println(GUI.companyName);
                        GUI.showMenu();
                        option = in.nextInt();


                        switch (option) {
                                case 1:                 //dodawanie pracowinika
                                        controller.addWorker();

                                        break;

                                case 2:                 //dodawanie szefa

                                        controller.addChief();

                                        break;

                                case 3:                 // pokazuje wszystkich pracow
                                        controller.showWorkers();
                                        break;

                                case 4:                  //pokazuje wszystkich szefow
                                        controller.showChief();
                                        break;
                                default:
                                        optionFlag = false;
                        }
                }



                /*
            List<Worker> workersAA = new ArrayList<>(); //Worker jest wymagany we wczesniejszych wersjach


            Worker worker1 = new Worker();
            worker1.salary = 35;
            worker1.level = "sdf";
            worker1.name = "Adam";
            worker1.lastName = "Kowalski";
            worker1.sex = "male";
            worker1.age = 55;

            Worker worker2 = new Worker("Jan", "Marcinkiewicz", "male", 44, 47564, "master", 7358);
            Worker worker3 = new Worker("Anna", "Kartosn", "female", 3, 753, "newbe", 74546);

            Management management1 = new Management("Tadek", "Biedak", "male", 64, 8956, "CEO", 26.4);

            workersAA.add(worker1); //listy
            workersAA.add(worker2);
            workersAA.add(worker3);


            System.out.println("Rozmiar: " + workersAA.size());

            for (Worker w : workersAA) //odwolanie do listy workers
            {
                    System.out.println("Imie: " + w.name);
                    System.out.println("Nazwisko: " + w.lastName);
                    System.out.println("Wynagrodzenie:  " + w.salary);
            }
            for (Worker w : workersAA) {
                    System.out.println("Plec:  " + w.sex);
            }

            //Management man = new Management();
            //
            //man.
   */

        }
}

