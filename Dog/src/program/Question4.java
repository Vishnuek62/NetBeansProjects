/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

/**
 *
 * @author Vishnu EK
 */
 
public class Question4
{
  public static void main(String[] args)
  {
    my m = new my(){};
    m.myMethod();
    System.out.println(m.getClass().getSuperclass());
  }
}
 
abstract class my
{
  public void myMethod()
  {
    System.out.println("Abstract");
  }
}