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
class A1
{
	static void staticMethod()
	{
		System.out.println("Static Method");
	}
}

public class MainClass
{
	public static void main(String[] args)
	{
		A1 a = null;

		a.staticMethod();
	}
}
