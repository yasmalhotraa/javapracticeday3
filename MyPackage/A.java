package Day3.MyPackage;

// Using these examples of Class A, B and C we will understand the concept of Access Modifiers. 
public class A {
    void method1() {
        System.out.println("This is Default method of Class A");
    }

    public void method2() {
        System.out.println("This is Public method of Class A");
    }

    private void method3() {
        System.out.println("This is Private method of Class A");
    }

    protected void method4() {
        System.out.println("This is Protected method of Class A");
    }

    public static void main(String[] args) {
        A obj = new A(); // Object Created
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
    }

}
