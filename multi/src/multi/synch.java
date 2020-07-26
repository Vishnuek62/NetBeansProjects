
package multi;

public class synch
{
    public static void main(String[] args)
    {
    final  Table r= new Table();
        Thread t1=new Thread(){  
       public void run()
       {  
      r.printTable(5);  
} 
};  
Thread t2=new Thread(){  
public void run(){  
r.printTable(100);  
}  
};  
  
t1.start();  
t2.start();
    }
    
}
class Table{  
 synchronized void printTable(int n){//synchronized method  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
} 