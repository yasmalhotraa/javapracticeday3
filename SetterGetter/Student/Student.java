package Day3.SetterGetter.Student;

public class Student {
    private int id;       // Make variables private
    private int age;
    private String name;

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    public void displayDetails(){
        System.out.println("ID: " + this.id);
        System.out.println("Age: " + this.age);
        System.out.println("Name: " + this.name);

    }
    public static void main(String[] args){
        Student student = new Student();
        student.setId(1);
        student.setAge(22);
        student.setName("Yash Malhotra");
        student.displayDetails();
    }
}
