
package javaconceptoftheday;
import java.util.*;
import java.util.Arrays;
public class SeconDLarg 
{
    
    
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the integer Array");
         int[] arr =new int[5];
         for(int i=0;i<arr.length;i++)
         {
             arr[i]= sc.nextInt();
             
         }
         
         TreeSet<Integer> al = new TreeSet<Integer>();
         for(int a: al)
         {
             al.add(arr[a]);
         }
         
         System.out.println(arr[3]);
    }
    
}
