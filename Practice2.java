public class Practice2 
{
    public static void main(String[] args) 
    {
        String s = "HELLO";
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                continue;
            }
            else
            {
                System.out.println(ch);
            }
        }
    }    
}
