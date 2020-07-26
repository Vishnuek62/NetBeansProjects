
package machinetest;
import java.util.*;

public class QueueArray 
{
	int front;
	int rear;
	int arr[];
	int max;
	
	QueueArray(int size)
        {
		max=size;
		front=-1;
		rear=0;
		arr = new int[max];
	}
	
	void push(int element)
        {
		if(front>=max-1)
                {
			System.out.println("queue Overflow !");
		}
		else
		{
			front=front+1;
			arr[front]=element;
			System.out.println(element+" inserted !");
		}
	}
        
	void pop()
        {
		if(front<rear)
                {
			System.out.println("Underflow");
		}
		else
                {
			rear=rear+1;
			System.out.println("Element deleted !");
		}
	}
        
	void display()
        {
		if(front<rear)
                {
	               System.out.println("No elemnt to display");
		}
                else
                {
		   System.out.print("Elements in queue : ");
		   for(int i = rear;i<=front;i++)
                   {
			System.out.println(arr[i]+" ");
	           }
		}
	}
	
	public static void main(String[] args) 
        {
               Scanner sc = new Scanner(System.in);
               System.out.println("enter the size of array");
               int n =sc.nextInt();
		QueueArray qt = new QueueArray(n);
		
		qt.display();
                
		qt.pop();
		qt.push(1);
                qt.push(2);
                qt.push(3);
                qt.push(1);
                
                
		qt.display();
		qt.push(4);
                qt.display();
		qt.pop();
                qt.display();
		qt.push(2);
		
		qt.display();
	}
}
