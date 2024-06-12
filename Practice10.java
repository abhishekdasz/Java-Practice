import java.util.Arrays;

public class Practice10 
{
    public static void main(String[] args) 
    {
        String s1 = "listen";
        String s2 = "silent";

        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(ch1.equals(ch2))
        {
            System.out.println("Both strings are anagram to each other.");
        }
    }    
}            
  