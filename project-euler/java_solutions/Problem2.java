// TODO package name;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList; 

public class Problem2 implements Problem{
  public String getAnswer () {
    int answer = 0;
    int ph = 0;
    int first = 1;
    int  second = 1;
    while(ph < 4000000){
      ph = first + second;
      if(ph % 2 == 0)
        answer += ph;
      first = second;
      second = ph;
    }
    return String.valueOf(answer);
  }
  public void printQuestion(){
    System.out.println("Find the sum of the even-valued terms of the " + 
        "fibonaccie sequence whos values do not exceed 4 million");

  }
}

