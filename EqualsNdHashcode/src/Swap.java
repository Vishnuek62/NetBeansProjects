/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class Swap {
   // swap() doesn't swap i and j
   public static void swap(StringBuilder i, StringBuilder j) 
   {
      StringBuilder temp = new StringBuilder(i);
      i = j;
      j = temp;
   }
   public static void main(String[] args) 
   {
      StringBuilder i = new StringBuilder("i");
      StringBuilder j = new StringBuilder("j");
      swap(i, j);
      System.out.println("i = " + i + ", j = " + j);
   }
}