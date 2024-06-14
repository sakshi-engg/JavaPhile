import java.util.Scanner;

// ARRAY HAS TO BE SORTED FOR BINARY SEARCH !!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class BinarySearch {

    public static int binarySearch(int arr[], int key){
        System.out.println("Entered Array Elements are:" );
        for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");      
        }
        System.out.println();
        
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){
            int mid = (start+end)/2;
            if( arr[mid] == key){ //middle element is key element
                // System.out.println("Element Found at: "+mid);
                return mid;
            }

            if( key < arr[mid]){
                end = mid-1;  //left half 
            } else {
                start = mid+1; //right half
            }
        }
        return -1;

        }

    public static void main(String args[]){

         Scanner sc = new Scanner(System.in);  

        int arr[] = new int[5];

        System.out.println("Enter array elements in sorted (ascending) order! ");

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter element No. "+(i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a key element to be searched in an array: ");
        int key = sc.nextInt();

       System.out.println("Key found at: "+ binarySearch(arr, key)+" location");

    }
}
