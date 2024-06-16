public class Pr11 
{
    public static void main(String[] args) 
    {
        int arr[] = { -5,4,6,-3,4,-1 };
        
        int maxSum = 0;
        for(int i=0; i<arr.length; i++)
        {
            int sum = 0;
            for(int j=i; j<arr.length; j++)
            {
                sum = sum + arr[j];
                // System.out.println(sum);
                if(sum>maxSum)
                {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Max Sum is:"+maxSum);
    }    
}
