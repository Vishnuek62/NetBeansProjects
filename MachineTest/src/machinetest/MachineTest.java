
package machinetest;

import java.util.*;

public class MachineTest 
{

 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers");
        int n = sc.nextInt();
        int[] fib = new int[n];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<fib.length;i++)
            fib[i]=fib[i-1]+fib[i-2];
        
        for(int r=0;r<n;r++)
        {
            System.out.println(fib[r]);
        }
        
        
    }
}
