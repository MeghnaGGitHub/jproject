package oops_concept;

public class Animal {
    public void eat()
    {
        System.out.println("I'm eating");
    }

    public static void main(String[] args) {
        System.out.println("From main mthd");
        Animal buzo=new Animal();
        buzo.eat();
        buzo.run();
        Birds sp=new Birds();
        sp.fly();
      //  buzo.fly(); By creating obj of particular class we can use only those class function.
    }
    public void run()
    {
        System.out.println("I'm running");
    }
}
class Birds
{
    public void fly(){
        System.out.println("I'm flying");
    }
}