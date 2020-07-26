
package awt;

import java.awt.*;
public class CreatFrame extends Frame
{  
    CreatFrame()
    {
        Button r =new Button("Click me");
        r.setBounds(30, 100, 80, 30);
        
        add(r);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args)
    {
     new CreatFrame();   
    }
    
}
