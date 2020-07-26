

package machinetest;
import java.util.*;
public class perComb 
{
    public static void main(String[] args)
    {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter value of n :");
			int n = sc.nextInt();
			
			System.out.println("Enter value of r :");
			int r = sc.nextInt();
			
			int facN = 1;
			
			for(int i=1;i<=n;i++){
				facN = facN*i;
			}
			
			System.out.println("facN : "+facN);
			
			int facR = 1;
			
			for(int i=1;i<=r;i++){
				facR = facR*i;
			}
			
			System.out.println("facR : "+facR);
			
			int facNR = 1;
			
			for(int i=1;i<=n-r;i++){
				facNR = facNR*i;
			}
			
			System.out.println("facNR : "+facNR);
			
			
			double ncr = facN/(facR*facNR);
			double npr = facN/facR;
			
			System.out.println("Combination : "+ncr);
			System.out.println("Permutation : "+npr);
	}

    
}
