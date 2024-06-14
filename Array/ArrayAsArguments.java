public class ArrayAsArguments 
{
    public static void update(int a[])
    {
        for(int i =0; i<a.length; i++)
        {
          a[i]  = a[i] + 1; 
            }
          System.out.println("\n");
        }
    public static void main(String args[]){
      int array[] =  {98,99, 99, 97, 99};
      update(array);
      System.out.println("");
      System.out.println("Updated Marks");
      for(int i =0; i<array.length; i++)
      {
       System.out.print(" "+array[i]);
          }
    }
}
 
 