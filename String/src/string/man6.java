
package string;


public class man6 
{
   int rollno;  
 String name;  
 String city;  
  
 man6(int rollno, String name, String city)
 {  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
  
 public static void main(String args[])
 {  
   man6 s1=new man6(101,"Raj","lucknow");  
   man6 s2=new man6(102,"Vijay","ghaziabad");  
     
   System.out.println(s1); 
   System.out.println(s2); 
 }      
}
