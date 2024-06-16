abstract class Vehicle
{
    abstract void run();
}

class Scooter extends Vehicle
{
    void run()
    {
        System.out.println("Scooter starts with kick.");
    }
}
class Car extends Vehicle 
{
    void run()
    {
        System.out.println("Car starts with key.");
    }
}
public class Pr4 
{
    public static void main(String[] args) 
    {
        Scooter s = new Scooter();
        s.run();

        Car c = new Car();
        c.run();
    }    
}
