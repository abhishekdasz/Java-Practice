public class Capitalize 
{
    public static void main(String[] args) 
    {
        String s = "Hello World";
        
        String newString = "";
        String [] str1 = s.split("\\s");

        for(String string : str1)
        {
            int length = string.length();

            String firstChar = string.substring(0, 1);
            String restCharacter = string.substring(1, length-1);
            String lastCharacter = Character.toString(string.charAt(length-1));

            newString = newString + firstChar.toUpperCase() + restCharacter + lastCharacter.toLowerCase();
        }

        System.out.println(newString);
    }    
}
