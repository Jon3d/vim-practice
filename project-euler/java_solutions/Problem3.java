import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem3 implements Problem {
  public void printQuestion(){
    System.out.println("What is the largest prime factor of the number 600851475143");
  }
  public String getAnswer(){ 
    long MAX = 600851475143L;
    long answer = 2L;
    while (answer <= MAX) {
      if( MAX % answer == 0L )
        MAX /= answer;
      else
        answer++;
    }
    return String.valueOf(answer);
  } 
}

