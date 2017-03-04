package sdajava.companyStaff.model;

/**
 * Created by Andrzej on 20.02.2017.
 */
public class Worker extends Human{

    public String level;
    public int salary;


        public Worker()
        {}

        public Worker(String name,String lastName,String sex,int age,int idNumber, String level, int salary)
        {
            super(name,lastName,sex,age,idNumber);
            this.salary=salary;
            this.level=level;
        }
    }



