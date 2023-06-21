package myclassnobjects;

public class Snacks{
    private String name;
    private int quantity;
    private double price;
    public Snacks(String name,int quantity,double price)
    {
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public double getPrice()
    {
        return price;
    }
    public void displaySnackDetails()
    {
        System.out.println("Name of snacks is:"+name);
        System.out.println("Quantity of snacks:"+quantity);
        System.out.println("Price of snacks is:"+price);
    }
    public static void main(String[] args) {
        Snacks s=new Snacks("Cakes",4,35.5);
        s.displaySnackDetails();
    }
}
class SnackShop{
    public static void main(String[] args) {
        Snacks ss=new Snacks("Cakes",15,36.6);
        System.out.println("------Original details------");
        System.out.println("Name of snacks is:\t"+ss.getName());
        System.out.println("Quantity of snack is:\t"+ss.getQuantity());
        System.out.println("Price of snacks is:\t"+ss.getPrice());

        ss.setName("Pastries");
        ss.setPrice(40.50);
        ss.setQuantity(50);

        System.out.println("------After changing details------");
        System.out.println("Name of snacks is:\t"+ss.getName());
        System.out.println("Quantity of snack is:\t"+ss.getQuantity());
        System.out.println("Price of snacks is:\t"+ss.getPrice());
    }
}