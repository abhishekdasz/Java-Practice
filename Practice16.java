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
            s[i] = sc.next();
        }

        for(int i=0; i<noOfStr; i++)
        {
            for(int j=i+1; j<noOfStr; j++)
            {
                if(s[i].compareTo(s[j])>0)
                {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp; 
                }
            }
        }

        System.out.println("Strings after lexicography order:");
        for(int i=0; i<s.length; i++)
        {
            System.out.println(s[i]);
        }
    }
}
