import java.util.Arrays;

class A 
{
    int a;
    int b;
    void printNums(int ...c)
    {
        System.out.println(Arrays.toString(c));
    }
}
public class Pr8 
{
    public static void main(String[] args) 
    {
        A obj = new A();
        obj.printNums(10);
        obj.printNums(10,20,30,40);
    }    
}
