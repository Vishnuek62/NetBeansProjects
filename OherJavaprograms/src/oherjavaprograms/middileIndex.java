

package oherjavaprograms;

import java.util.Scanner;

public class middileIndex 
{
    public static void main(String[] args)
    {
        int sum=0;
        Scanner sc = new Scanner(System.in);
         System.out.println("how many numbers to insert");
        int r = sc.nextInt();
        
        if(r%2==0)
        {
           System.out.println("cant find middle index");
        }   
        else
        {
            int[] arr = new int[r];
          
             for(int i =0 ; i<arr.length; i++)
             {
                 arr[i]= sc.nextInt();
                 sum+=arr[i];
              }
          System.out.println(sum);
          
           int w = sum-arr[(arr.length + 1)/2-1];
                     
          
        
        }
    }
}
