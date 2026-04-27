package Super;
class SuperConstructorExample {
    public SuperConstructorExample() {
        System.out.println("Constructor of Parent Class");
    }
}

public class SubclassConstructor extends SuperConstructorExample {
    SubclassConstructor() {
        System.out.println("Constructor of Child Class");
    }
    SubclassConstructor(int num) {
        System.out.println("Arg Constructor of Child Class");
    }
    void display() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        SubclassConstructor obj = new SubclassConstructor();
        obj.display();
        SubclassConstructor obj2 = new SubclassConstructor(5);
        obj2.display();
    }
}