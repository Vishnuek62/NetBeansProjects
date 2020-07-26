
package javaconceptoftheday;
import java.util.Scanner;

public class SeconD_LArg 
{
    
    public static void main(String[] args)    
    {
        int Larg, SecondLarg;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n =sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the array values");
        for(int i=0;i<n;i++)
         {
             arr[i]= sc.nextInt();
         }
    
        if(arr[0]>arr[1])
        {
            Larg= arr[0];
            SecondLarg =arr[1];
            
        }
        else
        {
            Larg= arr[1];
            SecondLarg =arr[0];
        }
        
        for(int i=2;i<n;i++)
        {
            if(arr[i]>Larg)
            {
                SecondLarg =Larg;
                Larg=arr[i];
                
            }
            else if(arr[i]<Larg && arr[i]>SecondLarg)
            {
                
                SecondLarg=arr[i];
                
            }
        }
       System.out.println("Secong Large is"  + SecondLarg);
    }
}
