package oherjavaprograms;

public class pyramid9 
{
    public static void main(String[] args)
    {
        
        char a='A';
        for(int i=1;i<=5;i++)
        {
            for(int k=1;k<=i;k++)
               System.out.print(a++);
            a--;
            for(int m=1;m<i;m++)
               System.out.print(--a);
            System.out.println();
        }
    }
}
