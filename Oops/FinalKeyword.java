package Oops;

 
public class FinalKeyword {
    public static void main(String[] args) {
        A obj = new A();
        obj.method1();
    }
}

final class A{
    final public void method1(){
        System.out.println("Final class can't be Extended");
        System.out.println("Final method can't be overriden");
        final  double PI = 3.12;
                System.out.println("Final variable can't be changed");
    }
}
