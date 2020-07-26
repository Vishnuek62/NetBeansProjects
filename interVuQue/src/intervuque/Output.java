
package intervuque;
class Abcd
{
    public int i;
    protected int j;
    private int u;
     public static void main(String []args)
    {
        Abcd r= new Abcd();
        r.u=8;
    }
}
class Bcd extends Abcd
{
    int j;
    void display()
    {
        super.j=3;
        System.out.println(i+"  "+j+"   "+super.j);
    }
}

public class Output 
{
    public static void main(String []args)
    {
        Bcd b= new Bcd();
        b.i=1;
        b.j=2;
        b.display();
        Abcd r= new Abcd();
        r.u=8;
    }
    
}
