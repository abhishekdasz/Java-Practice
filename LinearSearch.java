public class LinearSearch 
{
    public int LSearch(int arr[], int no)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(no==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int arr[]= {1,8,4,2,6,3,10};

        LinearSearch obj = new LinearSearch();
        System.out.println(obj.LSearch(arr, 50));
    }    
}
