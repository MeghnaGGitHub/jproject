package polymorphismdemowithinheritance;

public class Icecream extends Snack{
    private String flavour;
    public  Icecream(String name,int quantity,double price,String flavour)
    {
        super(name,quantity,price);
        this.flavour=flavour;
    }
    // public void setFlavour(String flavour){this.flavour=flavour;}
    //public String getFlavour(){return flavour;}

    @Override
    public void displaySnackDetails() {
        System.out.println("Ice-cream details are:----");
        System.out.println("Name is:\t"+getName());
        System.out.println("Quantity is:\t"+getQuantity());
        System.out.println("Price is:\t"+getPrice());
        System.out.println("Flavour is:\t"+flavour);
    }
}
