package sdajava.companyStaff.model;

import sdajava.companyStaff.model.Human;

/**
 * Created by Andrzej on 21.02.2017.
 */
public class Management extends Human {

    public String funkcion;
    public double companyShare;

    public Management ()
    {}

    public Management(String name, String lastName, String sex, int age, int idNumber, String funkcion, double companyShare)
    {
        super(name,lastName,sex,age,idNumber);
        this.funkcion=funkcion;
        this.companyShare=companyShare;
    }


}
