import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter("xyz.txt"));
            String str = "YOYOYO!!..";
            bw.write(str);
            System.out.println("file created...");
            bw.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
