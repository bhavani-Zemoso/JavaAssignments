package assignment6;

public class Employee {

    String name, address;


    public Employee(String name)
    {
        this();
        this.name = name;
    }

    public Employee()
    {
        this.name = this.address = "";
    }

    public Employee(String name, String address)
    {
       this(name);
       this.address = address;
    }


    public static void main(String args[])
    {
        Employee employee1 = new Employee("Daniel");
        employee1.printEmployeeDetails();

        Employee employee2 = new Employee("Krithika" ,"Jaipur");
        employee2.printEmployeeDetails();
    }

    public void printEmployeeDetails()
    {
        System.out.println("Name : " + this.name);
        System.out.println("Address : " + this.address);
    }

}
