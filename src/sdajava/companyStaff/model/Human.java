package sdajava.companyStaff.model;

/**
 * Created by Andrzej on 20.02.2017.
 */
public class Human {  //klasa

    public String name;
    public String lastName;
    public String sex;
    public int age;
    public int idNumber;

    public Human() {
    }

    public Human(String name, String lasName, String sex, int age, int idNumber) { //konstruktor
        this.name = name;
        this.lastName = lasName;
        this.sex = sex;
        this.age = age;
        this.idNumber = idNumber;
    }


}
