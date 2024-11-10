class OOP1
{
    String make, model, color;
    int year;
    double price;

    public void Drive()
    {
        make = "Chevrolet";
        model = "Corvette";  
        year = 2023;
        color = "blue";
        price = 500000.00;

        System.out.println("You drive the car ");
    }

    public void Brake() 
    {
        System.out.println("You step on the brake ");
    }
}

class Car
{
    public static void main(String[] args)
    {
        OOP1 C1 = new OOP1();  // Create an object of OOP1 class
        C1.Drive();            // Call Drive method using OOP1 object

        OOP1 C2 = new OOP1();  // Create another object of OOP1 class
        C2.Brake();            // Call Brake method using OOP1 object
    }
}
