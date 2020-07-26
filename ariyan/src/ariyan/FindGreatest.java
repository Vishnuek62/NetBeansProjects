
package ariyan;

public class FindGreatest 
{
    
    public static void main(String[] args)
    {
       double[] j = {1.3,4.5,2.9,3.0,1.5};
       
       for(int i=0;i<j.length;i++)
       {
           System.out.println(j[i]);
       }
       
       double max = j[0];
       
       for(int i=1; i<j.length;i++)
       {    
       if(max < j[i])
       {
           max = j[i];
       }
       
           } 
       System.out.println(max);

    }
    
}
