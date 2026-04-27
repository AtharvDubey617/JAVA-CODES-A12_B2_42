/*Writing a details to a file */


import java.io.*;
public class WriteFile{
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Hello world");
        fw.close();
    System.out.println("Data Written Successfully");
    }
}