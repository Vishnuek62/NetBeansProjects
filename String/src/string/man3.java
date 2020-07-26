
package string;
import java.lang.*;

@ class man3 
{
  
    public static void main(String[] args) 
  {
   boolean r;
      String s = "sachin"+"Tendulkkar";
      
   String s1= "      vishnu      ";
   System.out.println(s1);
   System.out.println(s1.trim());
   System.out.println(s1.substring(0,5));
   
   String s3= "VISHNU";
   StringBuilder bg= new StringBuilder();
   
   String s6=bg.append("Sachin").append(" Tendulkar").toString(); 
   //String s6= s1.concat(s3);
   
   System.out.println(s6);
   
   
   String s2 = new String("ratan");
   
  // r=s.equals(s1);
   r=s.equalsIgnoreCase(s3);
   System.out.println(r);
  System.out.println(s); 
  System.out.println(s.compareTo(s1));
   System.out.println(s.compareTo(s2));
 //  System.out.println(r);
  }  
}
