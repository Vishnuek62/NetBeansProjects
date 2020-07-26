
package applt;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Disply extends Applet implements ActionListener
{
   Image picture;
   
   Button b;
   
   TextField tf;
   
   public void init()
   {
       picture = getImage(getDocumentBase(),"vishnu.jpg");
       tf = new TextField();
       tf.setBounds(30,40,150,20);
       
       b = new Button("click");
       b.setBounds(80, 150, 60, 50);
       
       add(b);
       add(tf);
       
       b.addActionListener(this);
       
       setLayout(null);
       
   }
   
   public void actionPerformed(ActionEvent e)
   {
       tf.setText("Welcome");
   }
   
   
   
   public void paint(Graphics g)
   {
       g.drawImage(picture, 30, 30, this);
   }
   
   
    
    
}
