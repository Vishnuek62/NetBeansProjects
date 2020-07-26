
package applt;

import java.applet.*;

import java.awt.*;



public class DigitalClock extends  Applet implements Runnable
{
    Thread t =null;
    int hr=0,min=0,sec=0;
    String timeString= "";
    
    public void start()
    {
        t = new Thread(t);
        t.start();
    }
    
    public void init()
    {
        setBackground(Color.green);
        
        
    }
    
    public void run()
    {
        
    }
    
}
