

package scjp;


import java.io.Console;
public class Test 
{
    public static void main(String... args)
    {
        byte r=127;
        Integer i = 23;
        String str = (i<45) ? "njan" : (i>22) ? "njan2" : "nan3"; 
        String str1 = (i<45)? (i>5)? "feb":"hjk"   : "dec" ;
        Console con = System.console();
           boolean auth = false; 
         if (con != null)
        { 
             int count = 0;
          do
             {
               String uname = con.readLine(null);
           char[] pwd = con.readPassword("Enter %s's password: ", uname);
               con.writer().write("\n\n");
             } while (!auth && ++count < 3);
        }
      }
 }
