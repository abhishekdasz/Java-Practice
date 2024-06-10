import java.util.Scanner;
public class Rvowels 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a word: ");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
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
