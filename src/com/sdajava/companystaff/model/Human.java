package com.sdajava.companystaff.model;

/**
 * Created by lukas on 20.02.2017.
 */
public class Human {

    public String name;
    public String lastName;
    public int age;
    public String city;

    public Human()
    {

    }

    public Human(String name, String lastName, int age, String city) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.city = city;
    }
}
