class Engine
{
    void start ()
    {
        System.out.println("Engine starts.");
    }
}
class Car
{
    Engine e = new Engine();
    void startCar()
    {
        e.start();
        System.out.println("Car starts.");
    }
}
public class Pr3 
{
    public static void main(String[] args) 
    {
        Car c = new Car();
        c.startCar();
    }    
}
