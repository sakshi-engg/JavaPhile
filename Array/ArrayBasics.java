import java.util.Arrays;

import java.util.*;

public class ArrayBasics{

    public static void ArrayUpdate(){
        //datatype array name = new datatype[size]

        int marks[]= new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Subjects Marks");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println(Arrays.toString(marks));
        int avg = (marks[0]+marks[1]+marks[2])/3;
System.out.println(avg);

marks[0] = marks[0] + 1;
 System.out.print("Updated Marks: ");
for(int i=0; i<marks.length; i++){
    System.out.print(" "+marks[i]);
}
}   
    public static void main(String[] args) {
        ArrayUpdate();

    
    }
}