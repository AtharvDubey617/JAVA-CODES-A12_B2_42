import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("abc.txt");
            int ch;
            while((ch=fr.read())!=-1){
                System.out.print((char)ch);
            }
            System.out.println("\nfile read...\n");
            fr.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
