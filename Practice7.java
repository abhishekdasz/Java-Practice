public class Practice7 
{
    public static void main(String[] args) 
    {
        String s = "hello world";

        String words [] = s.split("\\s");

        for(int i=0; i<words.length; i++)
        {
            String word = words[i];

            word = word.substring(0, 1).toUpperCase() + 
                   word.substring(1, word.length()-1) + 
                   word.substring(word.length()-1).toUpperCase();

            System.out.print(word +" ");
        }

    }
}
