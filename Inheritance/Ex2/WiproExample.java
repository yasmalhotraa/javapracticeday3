package Day3.Inheritance.Ex2;
//this code will create 5 class files in the folder afterthe compilation of the code : Developer.class, Employee.class, HR.class, Manager.class, WiproExample.class.
//Base Class
 class Employee {
    String name;
    int employeeID;

    public Employee(String name, int employeeID) {
        this.name = name;
        this.employeeID = employeeID;
 }
    public void displayEmployeeInfo(){
        System.out.println("Employee name; " + name);
        System.out.println("EmployeeID: " + employeeID);
    }
}

//Derived Class Manager
class Manager extends Employee{
    String department;

    public Manager(String name, int employeeID, String department){
        super(name, employeeID); //calls the parent constructor
        this.department = department;
    }
    public void displayManagerInfo(){
        displayEmployeeInfo();
        System.out.println("Department: " + department);
    }
}

//Derived class Developer 
class Developer extends Employee{
    String language;

    public Developer(String name, int employeeID, String language){
        super (name, employeeID);
        this.language = language;
    }
    public void displayDeveloperInfo(){
        displayEmployeeInfo();
        System.out.println("Programming Language: "+ language);
    }
}

//Derived class HR
class HR extends Employee{
    int noOfTeams;

    public HR(String name, int employeeID, int noOfTeams){
        super(name, employeeID);
        this.noOfTeams = noOfTeams;

    }

    public void displayHrInfo(){
        displayEmployeeInfo();
        System.out.println("Number of Teams: "+ noOfTeams);
    }
}

//main class to create objects and input details and print information 
public class WiproExample {
    public static void main(String[] args){
        //Creating objects of different employee types
        Manager manager = new Manager("Jaskirat", 101, "Operations");
        Developer developer = new Developer("Yash Malhotra", 201, "Java");
        HR hr = new HR ("Utkarsh", 301, 4);

        //Display Information of each employee type.
        System.out.println("\n Manager Information: ");
        manager.displayManagerInfo();

        System.out.println("\n Developer Information: ");
        developer.displayDeveloperInfo();

        System.out.println("\n HR Information: ");
        hr.displayHrInfo();
    }
}
