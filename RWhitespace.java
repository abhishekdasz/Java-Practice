import java.util.Scanner;
public class RWhitespace 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String s = sc.nextLine();
        String remove = s.replace(" ", "");
        System.out.println("Your sentence is: "+ remove);


        System.out.println("Enter another word:");
        String st = sc.nextLine();
        String remove2 = st.replaceAll("\s", "");
        System.out.println("Your sentence is: "+ remove2);
    }    
}
