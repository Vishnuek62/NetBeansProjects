package oherjavaprograms;
public class reMove 
{
    public static int[] duplicate(int[] in)
    {
        int j=0;
        if(in.length<2)
        {
            return in;
        }
        for(int i=1;i<in.length;)
        {
            if(in[i]==in[j])
            {
                i++;
            }
            else
            {
               in[++j]=in[i++];
            }
        }
        int[] out= new int[j+1];
        
        for(int k=0;k<out.length;k++)
        {
            out[k]=in[k];
        }
        
        return out; 
        
    }
    public static void main(String[] args)
    {
        int[] input ={2,5,6,8,8,10,11,11,26,26,29};
        int[] output = duplicate(input);
        for(int i : output)
        System.out.println(i);
        
        
    }
    
}
