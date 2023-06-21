package abstractiondemo;

public class Runner {
    public static void main(String[] args) {
        Icecream s=new Icecream("Butterscotch",25,45.5);
        s.displaySnackDetails();
        s.setName("Black current");
        s.setQuantity(55);
        s.setPrice(40.50);
        System.out.println("New details are:");
        s.displaySnackDetails();
    }
}
