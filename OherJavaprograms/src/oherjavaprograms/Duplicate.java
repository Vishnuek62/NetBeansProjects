package oherjavaprograms;
import java.util.*;

public class Duplicate 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers to insert");
        int r = sc.nextInt();
        int[] arr = new int[r];
        for(int i =0 ; i<arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        for(int j=0;j< arr.length;j++)
        {
            for(int k=j+1;k<arr.length;k++)
            {
               if( arr[j]== arr[k])
               {
                    System.out.println("duplicate element"+  arr[j]);
               }
                
            }
            
        }
        
        
        
     }
    
}
