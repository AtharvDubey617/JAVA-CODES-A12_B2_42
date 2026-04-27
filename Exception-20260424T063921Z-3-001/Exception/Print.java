public class Print {
    public static void main(String[] args) {
        try{
            int a=100, b=0, c;
            c=a/b;
        }catch(ArithmeticException e){
            e.printStackTrace();
            //e.toString();
            //e.getMessage();
        }
    }
}
