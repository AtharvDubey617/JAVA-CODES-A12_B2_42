public class NestedTryCatchBlock {
    public static void main(String[] args) {
        try{
            try{
                try{
                    int arr[]={1,2,3,4,5};
                    System.out.println(arr[10]);
                }catch(ArithmeticException e1){
                    System.out.println("Arithmetic Exception");
                    System.out.println("handled in try block 1");
                }
            }catch(ArrayIndexOutOfBoundsException e2){
                    System.out.println("Arithmetic Excpetion");
                    System.out.println("handled in try block 2");
            }        
        }catch(ArithmeticException e3){
                    System.out.println("Arithmetic Excpetion");
                    System.out.println("handled in parent try block");
        }
        catch(ArrayIndexOutOfBoundsException e4){
            System.out.println("Arithmetic exception");
            System.out.println("handled in try block");
        }
        catch(Exception e5){
            System.out.println("Arithmetic Excpetion");
            System.out.println("handled in main try block");
        }
    }
}
