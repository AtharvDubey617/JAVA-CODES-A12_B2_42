import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream("woho.txt"));
        BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("test.txt"));
        int ch;
        while((ch=fis.read())!=-1){
            fos.write(ch);
        }
        System.out.println(ch);   //SOP((char)ch) if does not use buffer
        fis.close();
        fos.close();
    }
}
//in same way we can copy image audio and music files
