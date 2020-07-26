

package javaconceptoftheday;

import java.util.Scanner;


public class Equalit 
{
     public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array1");
        int n = sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter data of the array1");
        for(int i= 0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter size of the array2");
        int m = sc.nextInt();
        int[] arrr=new int[m];
        System.out.println("Enter data of the array2");
        for(int i= 0; i<m; i++)
        {
            arrr[i]= sc.nextInt();
        }
        if(n==m)
        {
            System.out.println("arrays length is equal");
        }
                      boolean j = false;

        for(int r=0; r<arr.length;r++)
        {
            if(arr[r]==arrr[r])
            {
              j = true;
            }
            else
            {
                 j = false;
            }
        
        }
        if(j)
        {
            System.out.println("array isequal");
        }
        else
        {
              j = false;

        }
        
        
    }
}
