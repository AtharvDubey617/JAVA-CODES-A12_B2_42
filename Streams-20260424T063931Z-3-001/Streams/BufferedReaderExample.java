import java.io.*;
public class BufferedReaderExample {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("xyz.txt"));
            int ch;
            while((ch=br.read())!=-1){
                System.out.print((char)ch);
            }
            br.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
