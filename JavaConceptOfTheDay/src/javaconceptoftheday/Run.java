

package javaconceptoftheday;


public class Run 
{
    public static void main(String[] args) throws Exception
    {
        Runtime ru = Runtime.getRuntime();
        
        ru.exec("notepad.exe");
    }
    
}
