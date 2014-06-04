// TODO package name;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Problem12 implements Problem{
  public void printQuestion(){
    System.out.println("What is the first triangle number to have over 500 divisors.");
  }
  public String getAnswer(){
    long triangleNum = 0;
    long naturalNumber = 1;
    short numTimesDivisible = 0;
    while(true){
      triangleNum += naturalNumber;
      naturalNumber++;
      numTimesDivisible = 0;
      for(long x = triangleNum; x > 0; x--)
        if( triangleNum % x == 0 )
          numTimesDivisible++;
      if(numTimesDivisible > 500)
        return String.valueOf(triangleNum);
    }
  }
}

