public class Practice12 
{
    public static void main(String[] args) 
    {
        String s = "Hello World";

        char ch [] = s.toCharArray();

        for(int i=0; i<ch.length; i++)
        {
            if(Character.isLowerCase(ch[i]))
            {
                ch[i] = Character.toUpperCase(ch[i]);
            }
            else if(Character.isUpperCase(ch[i]))
            {
                ch[i] = Character.toLowerCase(ch[i]);
            }
        }

        String newString = new String(ch);

        System.out.println(newString);
    }    
}
