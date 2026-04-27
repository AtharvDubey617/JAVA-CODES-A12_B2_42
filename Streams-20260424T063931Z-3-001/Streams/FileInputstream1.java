import java.io.*;

public class FileInputstream1 {
    public static void main(String[] args) throws IOException{
        File fobj = new File("hehehe.txt");
         FileOutputStream fos = new FileOutputStream(fobj);
        String str1="\nIndia is great\n";
        byte a[]=str1.getBytes();
        fos.write(a);
        fos.close();
        FileInputStream fis = new FileInputStream(fobj);
        byte arr[]=new byte[16];
        fis.read(arr);
        String str=new String(arr);
        System.out.print(str);
        fis.close();
    }
}
