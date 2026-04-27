package Super;
class SuperExample2 {
    SuperExample2() {
        System.out.println("no-arg constructor of parent class");
    }
    SuperExample2(String str) {
        System.out.println("Parametrized constructor of parent class");
        System.out.println(str);
    }
}

public class SubClassExample2 extends SuperExample2 {

    public SubClassExample2() {
        System.out.println("No-arg of Child Class");
        super();
    }
    void display() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        SubClassExample2 obj = new SubClassExample2();
        obj.display();
    }
}