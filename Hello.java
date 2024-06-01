class Hello 
{
    public void repeatNums(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int count = 0;
            for(int j=0; j<i; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }
            if(count>0)
            {
                System.out.println("Element "+ arr[i]+ " occurs more than once.");
            }
        }
    }
    public static void main(String[] args) 
    {
        int arr [] = {1,2,3,1,5,2,6,6};
        Hello h = new Hello();
        h.repeatNums(arr);   
    }
}