/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package amiit;

class Base 
{
    void amethod(int iBase)
    {
        System.out.println("super amethod");
        
    }
}

class Over extends Base
{
   void amethod(int iBase)
    {
        System.out.println("sub amethod");
        
    }
    
    
    public static void main(String[] args)
    {
        Over o = new Over();
        int iBase=0;
        o.amethod(iBase);
    }
}



