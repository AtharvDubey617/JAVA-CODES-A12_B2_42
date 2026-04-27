import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader1 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter first number: ");
        double a = Double.parseDouble(br.readLine());
        System.out.println("enter second number: ");
        double b= Double.parseDouble(br.readLine());
        if(a>b){
            System.out.println(a+"is greater");
        }else{
            System.out.println(b+"is greater");
        }
        br.close();
    }
}
