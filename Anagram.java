import java.util.Arrays;

public class Anagram 
{
    public static void main(String[] args) 
    {
        String a = "Listen";
        String b = "Silent";

        a = a.toLowerCase();
        b = b.toLowerCase();

        char [] chArr1 = a.toCharArray();
        char [] chArr2 = a.toCharArray();
        
        Arrays.sort(chArr1);
        Arrays.sort(chArr2);

        if(Arrays.equals(chArr1, chArr2))
        {
            System.out.println("Anagram");
        }   
    }    
}
