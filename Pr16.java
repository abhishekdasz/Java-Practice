public class Pr16 
{
    public static void main(String[] args) 
    {
        int n = 10;
        int temp =0;

        if(n<=1)
        {
            System.out.println("Not Prime");
        }
        else 
        {
            for(int i=2; i<n; i++)
            {
                if(n%i==0)
                {
                    temp = temp+1;
                }
            }
    
            if(temp>0)
            {
                System.out.println("Not Prime");
            }
            else 
            {
                System.out.println("Prime");
            }
        } 
    }    
}
