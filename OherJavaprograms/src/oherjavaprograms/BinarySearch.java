package oherjavaprograms;
import java.util.*;

public class BinarySearch 
{
    public static int[] sort(int[] arr1)
    {
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=i+1;j<arr1.length;j++)
            {
                if(arr1[i]>arr1[j])
                {
                    int temp;
                    temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        return arr1;
    }
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("size of array");
        int n = sc.nextInt();
        System.out.println("Enter the values");
        int[] arr =new int[n];
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Search value is");
        int key =sc.nextInt();
        int[] sortarr =sort(arr);
        System.out.println("sorted array is ----->");
        for(int i =0;i<sortarr.length;i++)
        {
             System.out.println(sortarr[i]);
        }
        
        int beg=0,last=n-1;
        int mid=(beg+last)/2;

        while(beg<=last)
        {
           if(sortarr[mid] == key)
              {
                  System.out.println("key is found at "+(mid+1)+ "  ");
                  break;
              }
           else if(sortarr[mid]> key)
             {
                  last=mid-1;
             }
           else if(sortarr[mid]< key)
             {
                  beg= mid+1;
             }
             mid=(beg+last)/2;
        }
        
        if(beg>last)
        {
            System.out.println("not found");
        }
            
  }
}
