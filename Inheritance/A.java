package Day3.Inheritance;
//This program creates 2 classes: Class A and Class B in the folder after Compiling the code.
class B extends A{
    int z;
    void method2(){
        System.out.println("This is B class");
    }
}
public class A {
    int x, y;
    void method1(){
        System.out.println("This is A class");
       
    }
    public static void main(String[] args){
        B obj = new B();
        obj.method2();
        A ob = new A();
        ob.method1();
    }
}
