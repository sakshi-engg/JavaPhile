import java.util.Arrays;

//Reversing an array elements in same array by swapping elements, hence 
//time complexity - O(n/2) ~ O(n) - N no. of times loop is iterated
//space complexity - O(1) - No auxilary/extra space is required, only variables require constant space i.e. firstElement , lastElement  require 
// O(2) i.e. O(1) - constant amount of space is required

public class ReverseArray {

    public static void ReverseArray(int arr[]){
        int firstElement = 0;
        int lastElement = arr.length - 1;

        while(firstElement < lastElement){

            int temp = arr[lastElement];
            arr[lastElement] = arr[firstElement];
            arr[firstElement] = temp;

            firstElement++;
            lastElement--;
        }


    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,90,100};
        System.out.println("Original Order "+Arrays.toString(arr));

        ReverseArray(arr);
        System.out.print("Reversed Order ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
