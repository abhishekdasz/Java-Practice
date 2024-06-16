class A 
{
    int x = 10;    
}
class B extends A
{
    int x = 20;
    void printX()
    {
        System.out.println("This x:"+ this.x);
        System.out.println("Super x:"+ super.x);
    }
}
public class Pr9 
{
    public static void main(String[] args) 
    {
        B obj = new B();  
        obj.printX();  
    }    
}
