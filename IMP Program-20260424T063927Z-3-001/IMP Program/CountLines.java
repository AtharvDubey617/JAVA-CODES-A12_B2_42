import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        int lineCount = 0;
        int wordCount=0;
        String line;
        while((line=br.readLine())!=null){
            lineCount++;
            //remove leading and tariling spaces, then split the line into words using one or more spaces

            //check if the file is not empty (to avoid counting balnk lines as words)
            if(!line.trim().isEmpty()){
                String words[]=line.trim().split("\\s+");
                wordCount+=words.length;  //add number of words in this line
            }
        }
        br.close();
        System.out.println("Total lines: "+lineCount);
        System.out.println("Word Count: "+wordCount);
    }
}
