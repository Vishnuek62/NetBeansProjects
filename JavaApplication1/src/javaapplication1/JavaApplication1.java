package javaapplication1;
public class JavaApplication1 
{

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++)
        {
            if (i == 1)
            {
                System.out.println("*");
            } 
            else
            {
                    int a = i + (i-1);
                    for (int j = 1; j <= a; j++)
                    {

                        if (j % 2 != 0) {
                            System.out.print("*");
                        } 
                        else {
                        System.out.print("A");
                    }
                }
                System.out.println();
            }
        }

    }

}

// TODO code application logic here

