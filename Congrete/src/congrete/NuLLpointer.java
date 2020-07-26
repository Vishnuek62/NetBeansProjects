
package congrete;
class Book
{
    String title;
    String auhtor;
}
public class NuLLpointer 
{
    
    public static void main(String[] args)
    {
        Book[] my = new Book[3];
        
        my[0] = new Book();
         my[1] = new Book();
          my[2] = new Book();
        
         
         int x=0;
        my[0].title ="java";
        my[1].title ="c";
        my[2].title ="python";
        
        my[0].auhtor ="qwe";
        my[1].auhtor ="asd";
        my[2].auhtor ="zxc";
        
        while(x<3)
        {
            System.out.println(my[x].title);
            System.out.println(my[x].auhtor);
            x++;
        }
        
        
    }
    
    
}
