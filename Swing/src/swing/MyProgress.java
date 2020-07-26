
package swing;

import javax.swing.*; 

public class MyProgress extends JFrame
{
     JProgressBar jb;  
     
     int num=0;  
  
     MyProgress()
     {  
        jb=new JProgressBar(0,100);  
         jb.setBounds(40,40,200,30);  
      
       jb.setValue(0);  
        jb.setStringPainted(true);  
      
       add(jb);  
        setSize(400,400);  
       setLayout(null);  
     }  
  
     public void iterate()
     {  
        int i=0;
       while(i<101)
       {  
           jb.setValue(i);  
         i++;  
      try
      {
          Thread.sleep(1000);
      }
      catch(Exception e)
      {}  
      }  
    }  
   public static void main(String[] args) 
   {  
      MyProgress m=new MyProgress();  
       m.setVisible(true);  
        m.iterate();  
    }  
}  