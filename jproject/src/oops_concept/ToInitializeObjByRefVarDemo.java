package oops_concept;

public class ToInitializeObjByRefVarDemo {
        String color;
        int age;

        public static void main(String[] args) {
            ToInitializeObjByRefVarDemo buzo=new ToInitializeObjByRefVarDemo();
            buzo.color="black";
            buzo.age=10;
            System.out.println("Color is:"+buzo.color);
            System.out.println("Age is"+buzo.age);
        }
    }
