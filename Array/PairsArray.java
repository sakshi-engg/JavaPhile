import java.util.Scanner;

//time complexity: O(n²) - Nested loops exceute i*j times 
public class PairsArray {

    public static void pairFinder(int arr[]){

        System.out.println("Entered Array Elements are:" );
        for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");      
        }
        System.out.println();

        System.out.println("Pairs in an Array are as follows: ");
        int totalPairs = 0;
        int n = arr.length;
        int tp = n*(n-1)/2;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+", "+arr[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+totalPairs);
        System.out.println("Total Pairs by Arithmetic Progression formula of sum: "+tp);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        // Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter element No. "+(i+1));
            arr[i] = sc.nextInt();
        }
        pairFinder(arr);

    }
}
