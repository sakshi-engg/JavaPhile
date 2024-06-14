package Oops;

public class BasicsOfOops {

    String name = "Sakshi";
    int age = 20;

    //Constructors in Java
    BasicsOfOops(){
        System.out.println("Default constructor is executed as soon as the object (local variable) is created. Default constructor is explicitly invoked");
    }

    BasicsOfOops(int name, float val){
        System.out.println("Parameterized Constructor is invoked with different object name creation");
    }
    public static void msg(){
        System.out.println("Hello from method 1");
     }

    public static void msg(int wpNumber){
        System.out.println("Hello from method 2");
     }

    public static void methodOverloading(){
   System.out.println("Method overloading means same method name but different signatures\r\n" + 
              "    Method overloading in Java is also known as \r\n" + 
              "    Compile-time Polymorphism, Static Polymorphism, or Early binding."); 
        msg();
        msg(123);
    }

 public static void main(String args[])   {
    BasicsOfOops obj = new BasicsOfOops();
    // obj.name = "Rathi";
    // methodOverloading();
    BasicsOfOops obj1= new BasicsOfOops(2, 22.7f);


 }
}
