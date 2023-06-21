package oops_concept;

public class ToInitializeObjByUsingMthdDemo {
    String color;
    int age;
    void intObj(String c,int a)
    {
        color=c;
        age=a;
    }
    void display()
    {
        System.out.println("Color is:"+color+"\nAge is:"+age);
    }

    public static void main(String[] args) {
        ToInitializeObjByUsingMthdDemo buzo=new ToInitializeObjByUsingMthdDemo();
        buzo.intObj("Black",45);
        buzo.display();
    }
}
