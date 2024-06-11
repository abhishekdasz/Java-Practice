public class ConvertOpp 
{
    public static void main(String[] args) 
    {
        String s = "Hello World";
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(Character.isLowerCase(c))
            {
                c = Character.toUpperCase(c);
                sb.append(c);
            }
            else 
            {
                c = Character.toLowerCase(c);
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
