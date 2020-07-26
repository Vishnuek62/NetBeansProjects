

package javaconceptoftheday;
import java.util.*;

public class FindmissinNo 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the actual no. of elements");
        int n = sc.nextInt();
       System.out.println("Enter acual data elements of data");
         int[] arr1 = new int[n];
         for(int r =0 ; r< n;r++)
         {
             arr1[r]= sc.nextInt();
         }
         int[] arr = new int[n-1];
         System.out.println("Enter data elements of data");

         for(int r =0 ; r< n-1;r++)
         {
             arr[r]= sc.nextInt();
         }
         int sum= 0, Actsum=0;
         for(int y =0; y<n-1; y++)
         {
             sum += arr[y];
         }
         System.out.println(sum);
         for(int y =0; y<n; y++)
         {
             Actsum += arr1[y];
         }
         
         System.out.println(Actsum);
         
         System.out.println("Missin Number" + (Actsum-sum));
         
        

    }
}
