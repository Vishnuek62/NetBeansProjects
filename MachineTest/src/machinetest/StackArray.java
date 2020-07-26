package machinetest;
import java.util.Scanner;
public class StackArray 
{
        int top;
	int arr[];
	int max;
	
        StackArray(int size)
        {
	     max=size;
	     top=-1;
             arr = new int[max];
	}
	
	void push(int element)
        {
		if(top==max-1)
                {
			System.out.println("overflow !");
		}
		else
		{
			top=top+1;
			arr[top]=element;
			System.out.println(+element+" inserted !");
		}
	}
	
	void pop()
        {
		if(top<0)
                {
			System.out.println("Underflow !");
		}
		else
                {
			top=top-1;
			System.out.println("Elemnet deleted !");
		}
	}
        
	void peak()
        {
		if(top<0)
                {
			System.out.println("Underflow !");
		}
		else
                {
			System.out.println("Peak : "+arr[top]);
		}
	}
        
	void display()
        {
		if(top==-1)
                {
			System.out.println("No element to display !");
		}
		else
		{
			System.out.print("Elements in stack : ");
			for(int i =0;i<=top;i++)
                        {
				System.out.print(arr[i]+" ");
			}
		}
	}
        
	public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
               System.out.println("enter the size of array");
               int n =sc.nextInt();
		StackArray st = new StackArray(n);
                
                
		System.out.println("top : "+st.top);
		st.display();
		System.out.println("top : "+st.top);
		st.pop();
		System.out.println("top : "+st.top);
		
                st.push(1);
		System.out.println("top : "+st.top);
		st.push(3);
		st.push(3);
                st.push(3);
                st.push(3);
                st.push(3);
                st.push(3);
                System.out.println("top : "+st.top);
		st.pop();
		System.out.println("top : "+st.top);
		st.peak();
		st.display();

	}
}