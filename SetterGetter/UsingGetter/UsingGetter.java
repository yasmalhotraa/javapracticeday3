package Day3.SetterGetter.UsingGetter;

//imported the method of the student class
import Day3.SetterGetter.Student.Student;

//will compare age of the students created in the student package of this folder 
public class UsingGetter {
    public static void ageCompare(Student o1, Student o2){
        if(o1.getAge()> o2.getAge()){
            System.out.println(o1.getName() + "is elder than " + o2.getName());
        } else{
            System.out.println(o2.getName()+"is older than" + o1.getName());
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(111);
        s1.setAge(22);
        s1.setName("Yash");

        Student s2 = new Student();
        s2.setId(112);
        s2.setAge(19);
        s2.setName("Dhruv");

        ageCompare(s1,s2);

    }

}
