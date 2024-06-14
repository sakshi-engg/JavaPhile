import java.util.Scanner;

public class Sample {

    public static void Evenodd(int num){
        if( num % 2 == 0 ){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void arithmeticOperators(int num1, int num2){
        System.out.println("Arithmetic Operators: ");
        System.out.println(num1 + num2 );
        System.out.println(num1 - num2 );
        System.out.println(num1 * num2 );
        System.out.println(num1 / num2 );
        System.out.println(num1 % num2 );
    }

    public static void unaryOperator(int num){
        System.out.println("Unary Operators: ");
        System.out.println(++num);
        System.out.println(num++);
        System.out.println(num--);
        System.out.println(--num);
    }

    public static void relationalOperator(int a, int b){
        System.out.println("Relational Operators: ");
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
    }

    public static void logicalOperators(boolean a, boolean b){
        System.out.println("Logical Operators: ");
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!(a && b));
    }

    public static void evenOddUsingBitManipulation(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Integer Number: ");
       int num =  sc.nextInt();
        int bitmask = 0;  
        if((num & bitmask)==0 ){
    //         1 0 1 1  (11 in binary)
    //      &  0 0 0 1
    //    ------------------
    //         0 0 0 1
            System.out.println("Even Number");
        }  else {
            System.out.println("Odd Number");
        }
       }

      
       public static void price() {
        System.out.println("Medicine Ordering System");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Suggestions \n2. Order \n3. Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("\nGet List Of Medicines here: \nhttps://www.drugs.com/drug_information.html\n");
                    break;
                    
                    case 2:
                    System.out.println("Order");
                    medicineOrder(sc);
                    break;

                case 3:
                    System.out.println("Exiting..");
                    sc.close(); // Close the Scanner object before exiting
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        }
    }

    public static void medicineOrder(Scanner sc) {
        System.out.println("Enter Medicine Name: ");
        String name = sc.next();

        System.out.println("Enter Quantity of " + name + " :");
        int quantity = sc.nextInt();

        System.out.println("Enter price: ");
        float price = sc.nextFloat();

        System.out.println("Total Price : " + (price * quantity));
    }



       public static void dec(){
        int i=10;
        while(i>1){
            System.out.print(i);
            i-=2;
        }
       }

       public static void pattern(){
        int k = 5;

        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++)
            { 
                if( i == 5 && j > 2 ){
                    System.out.print(k);
                k--;
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
       }

    public static void main(String args[]){
        // int i = 9/8;
        // System.out.println(i);
        // Evenodd(6);
        // arithmeticOperators(4, 6);
        // unaryOperator(9);
        // relationalOperator(10, 20);
        // logicalOperators(true, false);
        // evenOddUsingBitManipulation();
        price();
        System.out.println("Exited!");
        // pattern();
    }
}
