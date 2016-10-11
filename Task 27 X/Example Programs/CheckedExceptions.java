import java.io.File;
import java.io.FileReader;

public class CheckedExceptions {

   public static void main(String args[]){		
      File file=new File("E://file.txt");
      FileReader fr = new FileReader(file); 
   }
   
}

/*
   Since the methods read() and close() of FileReader class throws IOException,
   you can observe that compiler notifies to handle IOException, along with
   FileNotFoundException.
*/