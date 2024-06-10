public class LongShortWord 
{
    public static void main(String[] args) 
    {
        String s = " Hello World My name is Abhishek";

        String words [] = s.split("\\s");

        String longestWord = "";
        String shortestWord = words[0];

        for(int i = 0; i<words.length; i++)
        {
            String word = words[i]
            if(word.length() > longestWord.length())
            {
                longestWord = word;
            }
            if(word.length() < shortestWord.length())
            {
                shortestWord = word;
            }
        }
        System.out.println("Longest Word:" + longestWord);
        System.out.println("Longest Word:" + shortestWord);
    }
}
