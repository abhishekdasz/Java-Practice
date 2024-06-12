public class Practice8 
{
    public static void main(String[] args) 
    {
        String s = "hello";
        
        for(int i = 0; i < s.length(); i++)
        {
            boolean isRepeated = false;
            for(int j = 0; j < s.length(); j++)
            {
                if(i != j && s.charAt(i) == s.charAt(j))
                {
                    isRepeated = true;
                    break;
                }
            }
            if(!isRepeated)
            {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }    
}
