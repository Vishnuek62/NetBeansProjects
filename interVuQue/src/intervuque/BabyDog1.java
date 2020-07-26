

package intervuque;

class Animal
{  
    void q()
    {}
void eat(){System.out.println("animal is eating...");}  
}  
  
class Dog extends Animal
{  
    void w()
    {}
  void eat(){System.out.println("dog is eating...");}  
}  
  
class BabyDog1 extends Dog
{ 
    void e()
    {}
    void eat(){System.out.println("babydog1 is eating...");}
   public static void main(String args[])
   {  
        Animal a=new BabyDog1();  
        a.eat();  
        a.q();
        
   }
}