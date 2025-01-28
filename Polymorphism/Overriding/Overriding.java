package Day3.Polymorphism.Overriding;

class A {
    public void method1() {
        System.out.println("This method 1 is from A class");
    }

    static void method2() {
        System.out.println("This static method 2 is from A class");
    }
}

// class B uses the same method of class A and overrides its method.
class B extends A {
    public void method1() {
        System.out.println("This method 1 is from B class");
    }

}

public class Overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.method1();
        B.method2();
    }

}
