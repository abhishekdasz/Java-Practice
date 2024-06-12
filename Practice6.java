public class Practice6 
{
    public static void main(String[] args) 
    {
        String s = "hel123l4o";

        int sum = 0;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
                sum = sum + Integer.parseInt(""+ch);
            }

        }
        System.out.println(sum);
    }
}
