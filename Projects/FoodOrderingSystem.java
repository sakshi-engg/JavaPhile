package Projects;
import java.util.Scanner;

public class FoodOrderingSystem {
    static int total = 0;
    static int grandTotal = 1;

    // Order method is made static to access in main method
    public static void order() {
        System.out.println("\nWelcome to Wake n Bite!\n");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice: ");
            System.out.println("1. Menu Card \n2.Order \n3.Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("\nCheckout Menu Card:  \nhttps://www.shudhrestaurant.com/menu.html\n");
                    break;

                case 2:
                    System.out.println("Order");
                    foodOrder();
                    break;

                case 3:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter valid choice");
            }
        }
    }

    public static void foodOrder() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Dish Name: ");
        String name = sc.next();

        System.out.println("Enter Quantity of " + name + " :");
        int quantity = sc.nextInt();

        System.out.println("Enter price: ");
        float price = sc.nextFloat();
        grandTotal = (int) (price * quantity); // Calculate grandTotal as integer
        total += grandTotal;

        System.out.print("Do you wish to order anything else (yes/no)? ");
        String wish = sc.next();

        if (wish.equalsIgnoreCase("yes")) {
            // Recursive call to order more
            foodOrder();
        } else {
            System.out.println("******* Thank you for Ordering from WAKE N BITE *******");
            System.out.println("======= Your Total Bill is: " + total + " =======");
            System.exit(0);
        }
    }

    // Main method to start the program
    public static void main(String[] args) {
        order();
    }
}