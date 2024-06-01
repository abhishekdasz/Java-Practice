public class Two 
{
    public int Search(int arr[], int key, int start, int end)
    {
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==key) 
            {
                return mid;
            }
            if(key<arr[mid])
            {
                end = mid-1;
            }
            else if(key>arr[mid])
            {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        int arr[] = {2,4,6,8,10,12,14};
        int key = 6; 
        
        Two obj = new Two(); 
        System.out.println(obj.Search(arr, key, 0, arr.length-1));
    }    
}
