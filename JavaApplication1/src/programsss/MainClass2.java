/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programsss;

/**
 *
 * @author Vishnu EK
 */
public class MainClass2 {
    public static void main(String[] args) {
        System.out.println("value="+new A2().methodOfA());
    }
    
    
}
class A2
{
	   int methodOfA()
	{
            System.out.println((true ? null : 0));
		return (true ? null : 0);
	}
}
