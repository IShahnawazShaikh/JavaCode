package staticOverride;


class Parent {
     public static void greet() {
         System.out.println("Greeting from parent");
     }
}
public class Child extends Parent {
    public static void greet() {
        System.out.println("Greeting from child");
    }
    public static void main(String [] arg) {
        Parent p = new Child(); // Greeting from parent
        p.greet();

        Child st1 = new Child(); // Greeting from child
        st1.greet();

    }
}
