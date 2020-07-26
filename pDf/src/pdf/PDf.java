
package pdf;

public class PDf extends Thread
{
    int x=2;
    void makeItSo()
    {
        
    }
    public PDf()
    {
        int x=5;
        start();
    }
    public void run()
    {
        x *=2;
    }
    
     PDf k =new PDf();
    
    public static void main(String[] args) 
    {
         PDf i=new PDf();
         i.makeItSo();
        
      
        
      
    }
    
}
