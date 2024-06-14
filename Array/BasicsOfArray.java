import java.util.Scanner;

public class BasicsOfArray{
    public static void arrayCopy(){
        int source[] = {67,2,3,4};
        int dest[] = new int[4];
        System.arraycopy(source, 0, dest, 0, source.length);

        for(int i=0; i<dest.length; i++){
            System.out.println(dest[i]);
        }
    }
        public static void arrayUserInput(){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter array size: ");
            int size = sc.nextInt();

            System.out.println("Enter "+size+" Array Elements: ");

            int arr[] = new int[size];
            for(int i=0; i<size; i++){
                arr[i] = sc.nextInt();
            }

            System.out.println("Entered Elements Are: ");
            for(int i=0; i< arr.length; i++){
                System.out.print(arr[i]+" ");
            }
            
            System.out.println("\nAddition of Array Elements");
            int result = 0;
            for(int i=0; i< size; i++){
                result+=arr[i];
            }
            System.out.println("Addition of all elements: "+result);
        }

    public static void twoDimensionalArray(int rows, int cols, int total){
        // System.out.print("Adition of Matrix Elements: ");
        int arr[] [] = new int[rows] [cols];
        int arr1[] [] = new int [rows] [cols];
        int sumMatrix[][] = new int[rows][cols];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array elements of 1st Matrix: \n");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter array elements of 2nd Matrix: \n");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr1[i][j] = sc.nextInt();
            }
        }

     System.out.println("Sum of Matrix Elements: ");

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){              
                sumMatrix[i][j] = arr[i][j]+arr1[i][j];
                System.out.println(sumMatrix[i][j]);
            }
        }
    }

    public static void main(String args[]){
        // arrayCopy();
        // arrayUserInput();
        twoDimensionalArray(2, 2, 4);
    }
}