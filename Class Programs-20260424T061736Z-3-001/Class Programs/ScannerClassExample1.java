import java.util.Scanner;
public class ScannerClassExample1 {
    public static void main(String[] args) {
        String s = "Hello, This is Java";
        Scanner scan = new Scanner(s);
        System.out.println("Boolean Result: " + scan.hasNext());
        System.out.println("String: " + scan.nextLine());
        scan.close();
        System.out.println("----- Enter Details -----");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        System.out.println("Name: " + name);
        System.out.print("Enter age: ");
        int i = in.nextInt();
        System.out.println("Age: " + i);
        System.out.print("Enter Salary: ");
        double d = in.nextDouble();
        System.out.println("Salary: " + d);
        in.close();
    }
}
