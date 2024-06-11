public class Practice4 
{
    public static void main(String[] args) 
    {
        String s = "$Hello8*@World";
        
        String newSt = s.replaceAll("[^A-Za-z]", "");

        System.out.println(newSt);
    }    
}
