

class Employee
{
    String name;
    double Salary;
  
    Employee(String name, double salary)
    {
        this.name= name;
        this.Salary=salary;
    }
}

public class SalesPerson extends Employee
{
    
    double com;
    
    public SalesPerson(String name,double salary, double com)
    {
        super(name,salary);
        this.com=com;
    }   
    
    public static void main(String[] args)
    {
        SalesPerson h = new SalesPerson("vishnu",9757l,678l);
    }
}
