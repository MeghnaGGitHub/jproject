package abstractiondemo;

public class Icecream extends Snack{
    public Icecream(String name,int quantity,double price)
    {
        super(name, quantity, price);
    }
    @Override
    public void displaySnackDetails() {
        System.out.println("Icecream Details:");
        System.out.println("Name of icecream:\t"+getName());
        System.out.println("Quantity of icecream:\t"+getQuantity());
        System.out.println("Price of icecream:\t"+getPrice());
    }
}

