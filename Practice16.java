import java.util.Scanner;
public class Practice16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Strings:");
        int noOfStr = sc.nextInt();

        String s [] = new String[noOfStr];
        System.out.println("Enter your strings:");
        for(int i=0; i<noOfStr; i++)
        {
            s[i] = sc.nextLine();
        }

        System.out.println("Your strings:");
        for(int i=0; i<s.length; i++)
        {
            System.out.println(s[i]);
        }
    }
}
