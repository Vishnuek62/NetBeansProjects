
package applt;
public class Test 
{
    
    
    public static void main(String[] args)
    {
       Test[] t1 = new Test[10];
       Test[][] t2 =new Test[5][];
       
       if(t1[0]== null)
       {
           Integer i= 8;
           t2[0] = (Test[])char i;
           t2[1] = new Test[10];
           t2[2] = new Test[10];
           t2[3] = new Test[10];
           t2[4] = new Test[10];
                     
       }
       System.out.println(t1[0]);
       System.out.println(t2[1][0]);
    }
    
}
