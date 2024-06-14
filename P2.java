class P2
{
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 8, 2, 4, 2, 1, 4};

        boolean isVisited[] = new boolean[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            if(isVisited[i]==true)
            {
                continue;
            }
            int count = 1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    isVisited[j] = true;
                    count++; 
                }
            }
            System.out.println(arr[i] + "count:" + count);
        }
    }
}