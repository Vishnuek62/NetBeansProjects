

import java.awt.event.*;
import java.awt.*;
public class EventHandling extends Frame implements ActionListener
{  
    TextField tf;
    EventHandling()
    {
        Button r =new Button("Click me");
        r.setBounds(30, 100, 80, 30);
        r.addActionListener(this);
        
        tf =new TextField();
        tf.setBounds(60,50,170,20);
        
        add(r);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("welcome");
    }
    
    public static void main(String[] args)
    {
     new EventHandling();   
    }
    
}
