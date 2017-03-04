package sdajava.companyStaff.GUI;

import static java.lang.Math.*; //*->wszystkie metody w klasie Math

/**
 * Created by Andrzej on 23.02.2017.
 */
public class GUI {

    public static String companyName="TO JEST MOJA FIRMA";  //przykład GUI -> Main



    public static void showMenu()
    {
        System.out.println("Wiatj w naszym systemie \n" +
                "1.Dodaj nowego pracownika \n" +
                "2.Dodaj nowego szefa \n" +
                "3.Pokaz wszyskich pracownikow \n" +
                "4.Pokaz wszystkich szefow \n" +
                "0.Wyjscie z programu"
        );
    }
}
