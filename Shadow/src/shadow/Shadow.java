

package shadow;

class asd
{
    int i=8;
    
    
}

public class Shadow extends asd
{
    int i=7;
     
    public static void main(String[] args) 
    {
        Shadow  w= new Shadow();
        asd e =w;
        System.out.println(e.i);
        
    }
    
}
