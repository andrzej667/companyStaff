package com.sdajava.companystaff.model;

/**
 * Created by lukas on 20.02.2017.
 */
public class Worker  extends Human{

    public String level;
    public double salary;

    public Worker()
    {

    }

    public Worker(String name, String lastName, int age, String city,  String level, double salary) {
        super(name, lastName, age, city);
        this.salary = salary;
        this.level = level;

    }

}
