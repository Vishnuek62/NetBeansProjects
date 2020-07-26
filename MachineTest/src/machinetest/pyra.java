

package machinetest;


public class pyra 
{
              public static void main(String[] args)
              {
                  int star=0;
                  for(int i=0;i<=4;i++)
                  {
		       for(int s=0;s<=4-i;s++)
                         {
			      System.out.print("#");
		         }
			   
                       for(int k=0;k<=star;k++)
                       {
			   System.out.print("*");
			}
				
				star=star+2;	
				System.out.println();
		 }
		star=star-5;
		for(int j=0;j<=3;j++)
                {
				
				for(int h=0;h<=1+j;h++)
                                {
					System.out.print(" ");
				}
				
				for(int l=0;l<=star;l++)
                                {
					System.out.print("*");
				}
				
				star=star-2;
				System.out.println("*");
                 }

    
          }
}
