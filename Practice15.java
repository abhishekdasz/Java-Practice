public class Practice15 
{
    public static void main(String[] args) 
    {
        String s = "Hello World Hello";
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            char currentChar = s.charAt(i);
            boolean isDuplicate = false;

            for(int j=0; j<sb.length(); j++)
            {
                if(sb.charAt(j) == currentChar)
                {
                    isDuplicate = true;
                }
            }

            if(!isDuplicate)
            {
                sb.append(currentChar);
            }
        }
        System.out.println(sb);
    }    
}
