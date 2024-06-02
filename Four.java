public class Four 
{
    public void re(int first, int last, int arr[])
    {
        while(first<last)
        {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5};  

        Four obj = new Four();
        obj.re(0, arr.length-1, arr);
    }
}
