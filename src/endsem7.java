import java.util.*;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
public class endsem7 {
    public static void main(String[] args) throws IOException{
  try{
      File file=new File("nonexistent.txt");
      FileReader reader=new FileReader(file); // this may throw a filenotfoundexception

  }
  catch (IOException e){
      System.out.println("an exception occured "+e.getMessage());
  }
  finally{
      System.out.println("done");

  }
        System.out.println("hi");
        }
    }

