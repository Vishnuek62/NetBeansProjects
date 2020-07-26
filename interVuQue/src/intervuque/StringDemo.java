
package intervuque;

public class StringDemo
{
    static int i,c=0,res;
    static int wordcount(String s)
    {
        char ch[]= new char[s.length()]; 
         System.out.println(s.charAt(0));
        //in string especially we have to mention the () after length
        System.out.println(s.charAt(11));
         System.out.println(s.charAt(5));
        
        for(i=0;i<s.length();i++)
        {
            ch[i]= s.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
            c++;
            
        }
        System.out.println(s.charAt(11));
        return c;
    }
    
    public static void main (String args[])
    {
        res=StringDemo.wordcount(" manchester united also known as red nji jdn");
        //string is always passed in double quotes
        
        System.out.println("The number of words in the String are :  "+res);
    }
}