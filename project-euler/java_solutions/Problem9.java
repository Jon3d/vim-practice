// TODO package name;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Problem9 implements Problem{
  public void printQuestion(){
    System.out.println("Find the pythagorean triplet for which a + b + c = 1000");
  }
  public String getAnswer(){
    for(int a = 1; a < 1000; a++)
      for(int b = 1; b < 1000; b++)
        for(int c = 1; c < 1000; c++)
          if(a + b + c == 1000 && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
            return  String.valueOf(a * b * c);

    return null;
  }
}

