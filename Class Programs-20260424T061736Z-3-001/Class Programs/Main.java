final class FinalExample2 {
    int x = 100;
    void run() {
        int x = 110;
        System.out.println(x);
    }
}

class Main {
    public static void main(String[] args) {
        FinalExample2 honda = new FinalExample2();
        honda.run();
    }
}
