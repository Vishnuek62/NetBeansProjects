
package ariyan;

public class ascii 
{
    static char asciival(final int j)
    {
        return (char)j;
        
    }
    
    static int asciival2(char h)
    {
        return (int)h;
    }
    
    public static void main(String[] args)
    {
        int i=65;
        char k='a';
        System.out.println("charatr of i" + asciival(i));
        System.out.println("ascii of k" + asciival2(k));
    }
    
}
