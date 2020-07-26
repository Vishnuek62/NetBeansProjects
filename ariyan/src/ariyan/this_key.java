
package ariyan;

public class this_key 
{
    int ii;
    String hh;
    
    this_key()
    {
        System.out.println("bidhnu");
    }
    
    this_key(int i, String h)
    {
       
        ii=i;
     
        hh=h; 
         System.out.println("mohanlal");
        
    }
    
    void display()
    {
        System.out.println(ii+"    "+hh);
    }
    
    
    public static void main(String[] args)
    {
        
       this_key n =new this_key(11,"vishu"); 
       
       n.display();
    }
    
}
