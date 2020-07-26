
package ariyan;

import java.util.*;

public class matrix 
{
 
    public static void main(String[] args)
    {
        int rows,cols,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size");
        rows = sc.nextInt();
        cols = sc.nextInt();
        
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the matrix datas");
        for(i=0;i<rows;i++)
        {
            for(j=0;j<cols;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
         for(i=0;i<rows;i++)
        
            for(j=0;j<cols;j++)
            
                System.out.println("   "+arr[i][j]+ "   ");
                System.out.println("1");
          
        System.out.println(Arrays.deepToString(arr)); 
         
    }
}
