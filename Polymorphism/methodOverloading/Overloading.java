package Day3.Polymorphism.methodOverloading;
//overloading ... compile time polymorphism
//all methods have the same name but the have different variables
public class Overloading {
 
    public int sum(int a, int b){
        return a+ b;
    }

    public int sum (int a, int b, int c){
        return a+ b+ c;
    }

    public double sum(int a, double b){
        return a+ b;
    }

    public double sum (double a, int b){
        return a+ b;
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(o.sum(5, 7));
        System.out.println(o.sum(5, 7, 8));
        System.out.println(o.sum(5.5, 7));
        System.out.println(o.sum(6, 2.5));
    }
}
