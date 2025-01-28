package Day3.MyPackage;
//as B and A both are in same package , we can use the methods of class A in class B. 
//We can not use Private method of class A in class B as it is Private and can only be used within the class itself.
public class B {
    public static void main(String[] args){
        A obj = new A();
        obj.method1(); //Default method of class A
        obj.method2(); //Public method fo class A
        obj.method4(); //Protected method of class A
    }
    
}
