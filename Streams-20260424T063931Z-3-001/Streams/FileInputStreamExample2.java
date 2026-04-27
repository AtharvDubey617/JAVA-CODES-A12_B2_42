import java.io.FileInputStream;

public class FileInputStreamExample2 {
     
 
     public static void main(String args[]){    
          try{    
            FileInputStream fin=new FileInputStream("D:\\testout1.txt");    
            int i;    
            while((i=fin.read())!=-1){    // hello
             System.out.print((char)i);    
            }    
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
      
}

