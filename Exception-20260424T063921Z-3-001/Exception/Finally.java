public class Finally {
    public static void main(String[] args) {
        try{
            int a=100, b=0, c;    //b=2
            c=a/b; 
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
            System.out.println("You cannot divide a number by zero");
        }
        finally{
            System.out.println("I am in finally block");
        }
        System.out.println("hello");
        // finally block will always execute with or without catch block 
        // cannot use without try block
    }
}
