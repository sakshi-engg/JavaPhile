package Oops;

public class InheritanceAndSuper {
    public static void main(String[] args) {
        B obj = new B();
        obj.disp();
        obj.getData(4,5); //Parent class method is invoked with child class object
        obj.assignData(); 

        //How can I access variables of Parent class in derived class. We know we can access methods using super keyword.
       
        
        final double PI = 3.14;
        
        System.out.println(PI);

    }
}
    class A{
        int a, b;
        public void disp(){
            System.out.println("Inside Super / Parent Class");
        }
        public void getData(int x, int y){
            int a = x;
            int b =y;
            System.out.println("Value of X & Y in parent : "+x+" "+y);
        }
    }

    class B extends A{
        public void disp(){
            super.disp();
            System.out.println("Inside Derived / Child Class");
            super.disp();
        }

        public void assignData(){
            System.out.println("Value of X & Y in derived : "+a+" "+b);
        }
    }

    
