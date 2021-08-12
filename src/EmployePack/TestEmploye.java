package EmployePack;

public class TestEmploye {

    public static void main(String[] args) {

        Employe e = new Employe(100, "rahul", "jain", 1000);
        System.out.println(e);
        e.setFirstName("rakesh");
        e.setLastName("sharma");
        e.setId(99);
        e.setSalary(2000);
        System.out.println("Employee name is " + e.getFirstName() + " " + e.getLastName());
        System.out.println("Employee id is " + e.getId() + " and salary is " + e.getSalary());
        System.out.println("Employee's annual salary is " + e.getAnnualSalary());
        System.out.println("Employee's raised salary is " + e.raiseSalary(10));
        System.out.println(e.getName());

    }

}
