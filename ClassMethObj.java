class Vehicle
{
    String company;
    int manYear;

    public void carSpeed()
    {
        System.out.println("This car has very high speed.");
    }
}
public class ClassMethObj {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.company = "Tata";
        v1.manYear = 2020;

        System.out.println("The vehicle company name is: " + v1.company + " & The manufaucturing year is: " + v1.manYear );
        v1.carSpeed();
    }
}
