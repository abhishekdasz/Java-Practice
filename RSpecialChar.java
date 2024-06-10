import java.util.Scanner;

public class RSpecialChar 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) < 'A' || s.charAt(i) > 'Z' &&
               s.charAt(i) < 'a' || s.charAt(i) > 'z')
               {
                s = s.substring(0, i) + s.substring(i+1);
                i--;
               }
        }

        System.out.println(s);
    }
}
