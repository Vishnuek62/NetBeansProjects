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
class A
{
	static int i = 1111;

	static
	{
		i = i-- - --i;
                System.out.println("first"+i);
	}

	{
		i = i++ + ++i;
                 System.out.println("second"+i);
	}
}

class B extends A
{
	static
	{
		i = --i - i--;
                 System.out.println("third"+i);
	}

	{
		i = ++i + i++;
                 System.out.println("forth"+i);
	}
}

public class MainClass1
{
	public static void main(String[] args)
	{
		B b = new B();

		System.out.println(b.i);
	}
}
