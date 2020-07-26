

class Person 
{
   static String name = "No name";
   Person(String nm)
   {
       name = nm;
   }
         //  Person(){};
 }

class Employee extends Person 
{
   static String empID="0000";
   Employee(String id) 
    { 
      super(id);
       empID = id;
    }
 }

 public class pRime //extends Employee
 {
     public static void main(String[] args)
     {
         Employee e = new Employee("4321");
           System.out.println(e.empID);
             System.out.println(e.name);
     }
 }