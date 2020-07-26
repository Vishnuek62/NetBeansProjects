

package machinetest;

public class pettern 
{
    public static void main(String[] args) 
    {
          for(int i=0;i<=4;i++)
          {
	       int t=(int) Math.pow(11, i);
               char arr[]=String.valueOf(t).toCharArray();
				
		for(int k=4;k>i;k--)
                {
		     System.out.print(" ");
		}
		
                for(int j=0;j<=arr.length-1;j++)
                {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		
          }
	}
    
}
