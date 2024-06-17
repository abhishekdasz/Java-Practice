public class Pr13 
{
    public static void main(String[] args) 
    {
        // 1^3 + 2 ^3 + 3^3+ + 4^3 + 5^3 = 225;   
        int n = 5;
        
        int sum = 0;
        for(int i=0; i<=n; i++)
        {
            sum = sum + i * i * i;
        }
        System.out.println(sum);
    }    
}
