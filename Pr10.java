class StaticBlock 
{
    static
    {
        System.out.println("Hello World from Static Block.");
    }
}
public class Pr10 
{
    static
    {
        System.out.println("Hello World");
    }
    public static void main(String[] args) 
    {
        StaticBlock s = new StaticBlock();
    }    
}
