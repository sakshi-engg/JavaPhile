import java.util.*;

public class LargestNumber {
    

    public static void largestNumber(int arr[]){
        System.out.println("Entered Array Elements are:" );
        for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");      
        }
        System.out.println();

           int  largest=Integer.MIN_VALUE;
           System.out.println("Value of Minimum Infinity Value: "+largest);
           int  smallest=Integer.MAX_VALUE;
           System.out.println("Value of Maximum Infinity Value: "+smallest);
        
            // int largest = arr[0]; //assume first number is largest
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                largest=arr[i];
             }

             if(arr[i]<smallest){
                smallest=arr[i];
             }
        }
        System.out.println("Largest Number is: "+largest);
        System.out.println("Smallest Number is: "+smallest);
    }


   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter element No. "+(i+1));
            arr[i] = sc.nextInt();
        }

        largestNumber(arr);
    }
}
