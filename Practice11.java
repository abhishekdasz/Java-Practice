import java.util.Arrays;

public class Practice11 
{
    public static void main(String[] args) 
    {
        String s = "Hello";
        
        s = s.toLowerCase();
        char[] ch = s.toCharArray();

        Arrays.sort(ch);

        String sortedString = new String(ch);
        System.out.println("Sorted string: " + sortedString);
    }    
}
