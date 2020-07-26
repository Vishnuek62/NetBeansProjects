/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package oherjavaprograms;


public class pyramid8 
{
    public static void main(String[] args)
    {
        char a='A';
        for(int i=0;i<=10;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(a++);
                if(a=='Z'+1)
                {
                    a='A';
                } 
            }
            
            System.out.println();
        }
        
    }
    
}
