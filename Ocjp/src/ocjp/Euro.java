package ocjp;
class Money 
{
   private  String country = "Canada";
    public String getC()
    {
        return country; 
    }
 }
class Yen extends Money
 {
    public String getC()
    {
        return ""; 
    }
 }

public class Euro extends Money 
 {
    public String getC(int x)
    {
        return super.getC();
    }
    public static void main(String[] args) 
    {
        Money h = new Money();
    //    h.country="";
    System.out.print(new Yen().getC() + " " + new Euro().getC());
    }
 }