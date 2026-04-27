public class NestedTryCatchBlock1 {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("inside block1");
                int b=45/0;
                System.out.println(b);
            }catch(ArithmeticException e1){
                System.out.println("Exception:e1");
                System.out.println("You cannot divide a number by zero");
            }
        try{
                System.out.println("inside block2");
                int b=45/0;
                System.out.println(b);
        }catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("Exception: e2");
        }

        System.out.println("Just other statemnets");
    }
        catch(ArithmeticException e3){
           System.out.println("Arithmetic exception");
            System.out.println("inside parent try catch block");
        }catch(Exception e4){
        System.out.println("exception");
        System.out.println("Inside parent try catch block");
        }
    }
}
