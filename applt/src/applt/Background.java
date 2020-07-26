
package applt;

class Background implements Runnable
{
    
    int i=0;
    public void run()
    {
        while(true)
        {
            i++;
            System.out.println("i=" +i);
        }
        return 1;
    }
    
}
