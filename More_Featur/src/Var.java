
public class Var 
{
 //   void nm()
 ///   {
  ///     System.out.println("nji");
 //   }
    
    void nm(char f,int h,int ... j)
    {
        
        System.out.println(h);
        for(int g: j)
        {
            System.out.println(g);
        }
    }
    
    public static void main(String[] args)
    {
        Var l =new Var();
        
      //  l.nm();
        
        l.nm('d',4,55,5,64,4,67);        
    }
    
}
