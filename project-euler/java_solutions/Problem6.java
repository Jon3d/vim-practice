// TODO package name;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Problem6 implements Problem{
  public void printQuestion(){
    System.out.println("Find the different between the sum of the" +
        "squares of the first 100 natural numbers and the square of the sum");
  }
  public String getAnswer(){
    int sumOfSquares = 0;
    int squareOfSums = 0;
    for(int i = 0; i <= 100; i++){
      sumOfSquares += (int)Math.pow(i, 2);
      squareOfSums += i;
    }
    squareOfSums = (int)Math.pow(squareOfSums, 2);
    return String.valueOf(squareOfSums - sumOfSquares);
  }
}

