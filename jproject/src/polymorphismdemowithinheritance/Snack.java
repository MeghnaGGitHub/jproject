package polymorphismdemowithinheritance;

public class Snack {
    private String name;
    private int quantity;
    private double price;
    public Snack(String name,int quantity,double price)
    {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    public void setName(String name){this.name=name;}
    public String getName(){return name;}
    public void setQuantity(int quantity){this.quantity=quantity;}
    public int getQuantity(){return quantity;}
    public void setPrice(double price){this.price=price;}
    public double getPrice(){return price;}

    public void displaySnackDetails()
    {
        System.out.println("Snack details are:----");
        System.out.println("Name is:\t"+getName());
        System.out.println("Quantity is:\t"+getQuantity());
        System.out.println("Price is:\t"+getPrice());
    }
}

class Runner{
    public static void main(String[] args) {
        Snack s1=new Snack("Chips",35,32.32);
        Snack s2=new Icecream("Icecream",55,45.55,"Cassata");
        s1.displaySnackDetails();
        s2.displaySnackDetails();
    }
}