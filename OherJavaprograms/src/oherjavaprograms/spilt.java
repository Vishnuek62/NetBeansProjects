

package oherjavaprograms;


public class spilt 
{
    public static void main(String[] args)
    {
       String str ="one.two. thre(e .four";
       String[] temp= str.split("\\(");
       for(int i=0;i<temp.length;i++)
           System.out.println(temp[i]);
    }
}
