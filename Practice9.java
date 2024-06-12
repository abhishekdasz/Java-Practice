public class Practice9 
{
    public static void main(String[] args) 
    {
        String s = "Hello World, This is Abhishek Das";
        
        String words [] = s.split("\\s");

        String smallestWord = words[0];
        String longestWord = "";

        for(int i=0; i<words.length; i++)
        {
            String word = words[i];

            if(word.length() < smallestWord.length())
            {
                smallestWord = word;
            }
            if(word.length() > longestWord.length())
            {
                longestWord = word;
            }

            // System.out.println(word.length());
        }
        System.out.println(smallestWord);
        System.out.println(longestWord);
    }    
}
