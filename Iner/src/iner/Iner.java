
package iner;
class Iner 
{
    private int i=5;
    class rfg
    {
       void tr()
        {
           System.out.println(i);
        }
    }
    void display()
    {
        rfg r=new rfg();
        r.tr();
    }
    public static void main(String[] args)
    {
        Iner rt=new Iner();
        rt.display();
    }
 }