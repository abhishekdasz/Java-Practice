public class Five 
{
    public void BSort(int arr[])
    {
        for(int turn=0; turn<arr.length-1; turn++)
        {
            for(int j=0; j<arr.length-1-turn; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }


    public void SSort(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[minPos] > arr[j])
                {
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {5,4,1,3,2};
        Five obj = new Five();
        // obj.BSort(arr);

        obj.SSort(arr);


    }    
}
