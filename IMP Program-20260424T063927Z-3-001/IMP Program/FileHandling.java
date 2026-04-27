/*Read and display file*/

import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("test.txt");
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}


//trim()-> removes extra space at start and end
//split("\\s+")-> split based on one or more spaces
//isEmpty()->close if line has no count