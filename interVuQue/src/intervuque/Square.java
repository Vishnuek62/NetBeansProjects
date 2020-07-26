

package intervuque;
class Rectangle
{
   public int area(int a,int b)
    {
        return 1;
    }
}
public class Square extends Rectangle
{
        
    public int area(double a,long b)
    {
        return 0;
    }

    
    public static void main(String[] args)
    {
       Square r = new Square();
       System.out.println(r.area(59999999.9,2));
        
        
    }
}
