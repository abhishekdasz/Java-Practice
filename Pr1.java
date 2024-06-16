class A
{
    String name;
    int age;    
    A(String n)
    {
        name = n;
    }
    A(String n, int a)
    {
        name = n;
        age = a;
    }
}
public class Pr1 
{
    public static void main(String[] args) 
    {
        A obj = new A("Abhishek");
        A obj2 = new A("Abhishek", 21);

        System.out.println(obj2.name + ": " + obj2.age);
    }    
}
