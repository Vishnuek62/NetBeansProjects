
package multi;
class Table1
{
   synchronized void printval(int n)
    {
     
           for(int i=1;i<n;i++)
           {
            try
              {
               Thread.sleep(1000);
               System.out.println(n*i);
             }catch(Exception e)
              {}
           }
}
}
class new1 extends Thread
{
       Table1 t;
       new1(Table1 t)
       {
          this.t =t;
        }
       public void run()
        {
         t.printval(6);
        }
} 

class new2 extends Thread
{
       Table1 t;
        new2(Table1 t)
         {
             this.t=t;
         }
         public void run()
         {
            t.printval(7);
          }
} 
class new3 extends Thread{Table1 t;
        new3(Table1 t)
         {
             this.t=t;
         }
         public void run()
         {
            t.printval(8);
          }}
class new4 extends Thread{Table1 t;
        new4(Table1 t)
         {
             this.t=t;
         }
         public void run()
         {
            t.printval(9);
          }}
public class Synchr
{
       public static void main(String[] args)
     {
             Table1 r =new Table1();  
          new1 n1= new new1(r);
           new2 n2 = new new2(r);
             new3 n3 =new new3(r);
             new4 n4 = new new4(r);
             
             n1.start();
          n2.start();
          n3.start();
          n4.start();
      }
}
