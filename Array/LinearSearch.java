import java.util.Scanner;
// import java.util.Arrays;

public class LinearSearch {

    public static int linearSearch(int arr[], int key){
        System.out.println("Entered Array Elements are:" );
        for(int i=0; i<arr.length; i++){
         System.out.print(arr[i]+" ");      
        }
        System.out.println();

        int count = 0;

        for(int i=0; i<arr.length; i++){
            if(key==arr[i]){
                count++;
               System.out.println();
               if(count==1){
                System.out.print("Element "+arr[i]+" is found at position: "+i);
            }
                // return 1; //element found return 1
                if(count>1){
                    System.out.print("Element "+arr[i]+ " is found at positions: "+i);
                }
                // if(count>1){
                //     System.out.print(i+" ");
                // }
            }    
        }
        
        if(count>1){
            System.out.println();
            System.out.println("The key element exists "+count+" times in an array");
        } else if(count==1)
        {
            System.out.println();
            System.out.println("Element exists one time in an Array!");
        } else{
            System.out.println("Element not found in an Array!");
        }
    
        // return -1;
        return ( count>=1 ) ? 1 : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter element No. "+(i+1));
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a key element to be searched in an array: ");
        int key = sc.nextInt();

        linearSearch(arr, key );
    }
}
