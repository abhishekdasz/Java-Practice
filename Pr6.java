interface i1
{
    void run();
}
interface i2
{
    void run();
}
class Scooter implements i1, i2
{
    public void run()
    {
        System.out.println("Scooter starts with kick.");
    }
}
class Car implements i1
{
    public void run()
    {
        System.out.println("Car starts with key.");
    }
}
public class Pr6 
{
    public static void main(String[] args) 
    {
        Scooter s = new Scooter();
        s.run();

        Car c = new Car();
        c.run();    
    }
}
