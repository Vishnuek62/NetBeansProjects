package ocjp;

class Animal 
{
   String noise()
    {
         return "peep";
    }
}
class Dog extends Animal 
{  
     String noise() 
     {
             return "bark";
     }
}
class Cat extends Dog
{
     String noise() 
     {
             return "meow";
      }
}

public class AniMA 
{
    public static void main(String[] args)
    {
       Animal j =new Animal();
       Dog h =new Dog();
       
       //j= (Animal)h;
       h=(Dog)j;
        
    }
    
}
