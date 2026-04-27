public class MultipleCatchBlockError {
    public static void main(String[] args) {
        try {
            int arr[] = new int[7];
            arr[10] = 10 / 5;   // 10/0 for ArithmeticException
            arr[1]=10/0;        
            // as alraedy exception occur in above line so no matter what's the next statement it will directly jump to the catch block of that exception
            System.out.println("Last statement of try block");
        } catch (ArithmeticException e) {
            System.out.println("You should not divide a number by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Accessing array elements outside of the limits");
        } catch (Exception e) {
            System.out.println("Show other exception");
        }

        System.out.println("Out of try catch block");
    }
}
