public class FinalExample1 {
    final int speedlimit = 90;
    void run() {
        speedlimit = 400; 
        // Cannot change this variable as this variable is final
    }
    public static void main(String[] args) {
        FinalExample1 obj = new FinalExample1();
        obj.run();
    }
}
