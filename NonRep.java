public class NonRep 
{
    public static void main(String[] args) 
    {
        String s = "Hello";

        int frequency [] = new int[256];
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            frequency[ch]++;
        }

        System.out.print("Non-repeating characters: ");
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (frequency[ch] == 1) {
                System.out.print(ch + " ");
            }
        }
    }    
}
