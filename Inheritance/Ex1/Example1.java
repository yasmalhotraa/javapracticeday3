package Day3.Inheritance.Ex1;
//This code will create 3 classes in the folder after compiling the code : Example1.class, Parent.class, child.class
class Parent{
    public void displayParentMessage(){
        System.out.println("This message is from Parent class.");
    }
}
class child extends Parent{
    public void displayChildMessage(){
        System.out.println("This message is from Child class.");
    }
}
public class Example1 {
    public static void main(String[] args){
        child object = new child();

        object.displayParentMessage();
        object.displayChildMessage();
    }
}
