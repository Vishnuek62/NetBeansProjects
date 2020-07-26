


package intervuque;

public class clonin 
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        try
        {
        clonin n =new clonin();
        clonin n1= (clonin)n.clone();
        System.out.println(n1);
    }catch(Exception e)
    {}
    }
}
