import java.io.*;

public class FileOutputStream2 {
    public static void main(String[] args){   //throws IOException
        try{
        File fobj = new File("woho.txt");
        FileOutputStream fos = new FileOutputStream(fobj);
        String s="Hello World";
        String str="\nIndia is great\n";
        byte b[]=s.getBytes();
        byte a[]=str.getBytes();
        fos.write(b);
        fos.write(a);
        fos.write(a, 9, 6);
        fos.close();
        System.out.println("File is created");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
/*either use throws keyword(block) or try catch block both of them are correct */
