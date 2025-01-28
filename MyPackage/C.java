package Day3.MyPackage;
//Here in this class, the Protected method of class A is used in Class C only through Inheritance
//As it is protected method, it can only be used in its own class and its child class.
public class C extends A{
    public static void main(String[] args){
        A obj = new A();
        obj.method4();
    }
}
