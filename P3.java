import java.util.Arrays;

public class P3 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,7,4,2,6,3};
        
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }    
}
