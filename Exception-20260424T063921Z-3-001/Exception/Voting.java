import java.util.Scanner;
class YoungerAgeException extends RuntimeException{       //customised exception class
    YoungerAgeException(String msg){
        super(msg);
    }
}
public class Voting {               //main class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age=sc.nextInt();
        try{
            if(age<18){
                throw new YoungerAgeException("You are eligible for voting");         //manually exception create kar skyte hai
            }
            else{
            System.out.println("Eligible to vote");
            }
        }catch(YoungerAgeException e){
            e.printStackTrace();
        }
        System.out.println("Hello");
    }
}
