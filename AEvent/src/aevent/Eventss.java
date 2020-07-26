
package aevent;

import java.awt.*;
import java.awt.event.*;
public class Eventss extends Frame implements ActionListener
{
    
    Eventss()
    {  
       TextField ft= new TextField(); 
       ft.setBounds(60,50,170,20);
       
       Button jh=new Button();
       jh.setBounds(100, 120, 80, 30);
       
       jh.addActionListener(this);
       
    }
    
    
    
    
    public static void main(String[] args)
    {
         Eventss n = new Eventss();
    }
    
}
