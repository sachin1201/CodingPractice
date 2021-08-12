package EmployePack;

public class Employe {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

//    Employe()
//    {
//        id = 1;
//        firstName = "rahul";
//        lastName = "jain";
//        salary = 1000;
//    }

    Employe(int id, String firstName, String lastName, int salary)
    {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    public int getSalary()
    {
        return salary;
    }
    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getAnnualSalary()
    {
        return 12*salary;
    }

    public int raiseSalary(int percent)
    {
        return (salary + salary*percent/100);
    }




     public String toString()
     {
         return "Employee name is " + firstName + lastName + " and id is " + id + " and salary is " + salary;
     }

}
