

package intervuque;


public class Str 
{
    public static void method(Object e)
    {
        System.out.println(e);
    }
    public static void method(String o)
    {
        System.out.println("a"+o);
    }
    
    
            
    public static void main(String args[])
    {
        String[] aw={"qaz","wsx","edc"};
        aw[0]="rfv";
        
        for(int i=0;i<aw.length;i++)
        {
            System.out.println(aw[i]);
        }
        
        
        method(null);
        String f0 = "abc";
        String f00 = "abc";
        
        String f1 = new String("abc");
        String f2 = new String("abc");
        
        System.out.println("   "+f0==f00);
        
        
    }
}
