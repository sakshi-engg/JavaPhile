package Projects;

import java.util.*;
public class TeleMedicine{

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
    public static void main(String[] args) {
        price();
    }
}