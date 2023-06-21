package oops_concept;

public class Snacks {
    String name;
    double price;
    public void eat(){
        System.out.println("I'm eating");
    }

    public static void main(String[] args) {
        System.out.println("This is from main method");
        Snacks s=new Snacks();
        s.eat();
        s.pay();
        Snacks s1=new Snacks();

    }
    public void pay(){
        System.out.println("I'm paying for snacks");
    }



}
