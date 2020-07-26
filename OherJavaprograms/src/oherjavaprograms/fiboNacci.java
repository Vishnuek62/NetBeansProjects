

package oherjavaprograms;
import java.util.*;

public class fiboNacci 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int r= sc.nextInt();
        int[] arr = new int[r];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
            
        }
        for(int j=0;j<r;j++)
        {
            System.out.println(arr[j]);
        }
        
        
    }
}
