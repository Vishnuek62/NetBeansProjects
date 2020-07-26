
package more_featur;

public class Enu 
{
    enum we5 {
        vishnu,vivek,siva,naji,likz
    }
    
    public static void main(String[] args)
    {
       we5 g = we5.siva;
       
       switch(g)
       {
           case vishnu:
               System.out.println("vishnu");
          
           case siva :
               System.out.println("siava");
       }
    }
    
}
