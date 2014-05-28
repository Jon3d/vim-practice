// TODO package name;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Problem1 implements Problem{
  public void printQuestion(){
    System.out.println("Find the sum of all multiples of 3 or 5 below 1000");
  }
  public String getAnswer(){
    int answer = 0;
    for(int i = 0; i < 1000; i++)
      if( i % 3 == 0 || i % 5 == 0)
        answer += i;
    
    return String.valueOf(answer);
  }
  
}

