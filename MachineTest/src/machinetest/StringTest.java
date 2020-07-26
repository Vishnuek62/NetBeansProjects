package machinetest;

import java.util.*;

public class StringTest 
{
    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
		System.out.println("Enter full name :");
		
		char inputArr[]=sc.nextLine().trim().toCharArray();
		int spaceCount=0;
		
		for(int i=0;i<=inputArr.length-1;i++)
                {
			if(inputArr[i]==' ' )
                        {
				spaceCount++;
			}
		}
		if(spaceCount==0)
                {
			System.out.print(Character.toUpperCase(inputArr[0]));
			for(int f=1;f<=inputArr.length-1;f++)
                        {
				System.out.print(Character.toLowerCase(inputArr[f]));
			}
		}
		int count=0;
		for(int i=0;i<=inputArr.length-1;i++)
                {
			if(spaceCount>0 && i==0)
                        {
				System.out.print(Character.toUpperCase(inputArr[i])+". ");
			}
			
			if(inputArr[i]==' ')
                        {
				count++;
				if(count!=spaceCount)
                                {
					System.out.print(Character.toUpperCase(inputArr[i+1])+". ");
				}
				else
                                {
					System.out.print(Character.toUpperCase(inputArr[i+1]));
					for(int h=i+2;h<=inputArr.length-1;h++)
                                        {
						System.out.print(Character.toLowerCase(inputArr[h]));
					}
				}
			}
		}
	}

    
}
