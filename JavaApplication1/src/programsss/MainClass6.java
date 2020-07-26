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
public class MainClass6
{
	static int methodOne(int i)
	{
		return methodTwo(i *= 11);
	}

	static int methodTwo(int i)
	{
		return methodThree(i /= 11);
	}

	static int methodThree(int i)
	{
		return methodFour(i -= 11);
	}

	static int methodFour(int i)
	{
		return i += 11;
	}

	public static void main(String[] args)
	{
		System.out.println(methodOne(11));
	}
}
