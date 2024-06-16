class Animal 
{
    void eat()
    {
        System.out.println("I am eating.");
    }
}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("I am barking.");
    }
}
public class Pr2 
{
    public static void main(String[] args) 
    {
        Dog muthu = new Dog();
        muthu.bark();
        muthu.eat();
    }    
}
