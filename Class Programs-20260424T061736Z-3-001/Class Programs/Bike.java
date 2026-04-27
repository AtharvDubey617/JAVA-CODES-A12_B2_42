class MethodOverridingNeed {
    void run() {
        System.out.println("Vehicle is Running");
    }
}

public class Bike extends MethodOverridingNeed {
    @Override
    void run() {
        System.out.println("Bike is Running");
    }

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
