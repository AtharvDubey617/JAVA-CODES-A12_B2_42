import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("abc.txt");
            String str= "My name is jagruti";
            fw.write(str);
            System.out.println("File created...");
            fw.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e1){
            System.out.println("Excpetion: " + e1.getMessage());
        }

    }
}
