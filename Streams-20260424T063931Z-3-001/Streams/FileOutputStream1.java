import java.io.*;
public class FileOutputStream1 {
    public static void main(String[] args) throws IOException{
        File fs = new File("test.txt");
        FileOutputStream fos = new FileOutputStream(fs);
        fos.write('A');
        fos.write('S');
        fos.close();
        System.out.println("file is created");
    }
}
