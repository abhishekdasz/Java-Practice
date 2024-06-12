public class Practice10 
{
    public static void main(String[] args) 
    {
        String s1 = "listen";


        

        char cha1 [] = new char[s1.length()];
        for(int i=0; i<s1.length(); i++)
        {
            cha1[i] = s1.charAt(i);
        }

        for(int i=0; i<cha1.length; i++)
        {
            System.out.println(cha1[i]);
        }
    }    
}
  