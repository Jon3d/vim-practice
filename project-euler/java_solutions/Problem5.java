// TODO package name;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Problem5 implements Problem{
  public void printQuestion(){
    System.out.println("What is the smalest positive number that is evently divisible by all of the numbers 1 - 20");
  }
  public String getAnswer(){
    Long answer = 20L;
    while(true){
      for(Long i = 20L; i > 0L; i--){
        if(i == 1)
          return String.valueOf(answer);
        else if( answer % i != 0 )
          break;
      }
      answer += 20;
    }
  }
}

