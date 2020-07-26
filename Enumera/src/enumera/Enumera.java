

package enumera;

enum season {  
            winter(5),
                 spring(6),
                  summer(7),
                   fall(8);
                   
                   private int data;
                   season(int data)
                   {
                       this.data=data; 
                     }
                   
}

public class Enumera 
{
    
    
    public static void main(String[] args) 
    {
        for(season s: season.values())
        {
            System.out.println(s);
        }
        
        season m= season.fall;
        
            System.out.println(m);
    }
}
