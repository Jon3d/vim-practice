import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem3 implements Problem {
  Long MAX = 600851475143L;
  public void printQuestion(){
    System.out.println("What is the largest prime factor of the number 600851475143");
  }
  public String getAnswer(){
   Long answer = 0L;
   for (Long i = MAX / 2L; i > 0L; i--)
     if( MAX % i == 0L && isPrime(i))
       return String.valueOf(i);
   return "0";
  }
  private boolean isPrime(Long num){
    for( Long i = 2L; i < num / 2L; i++)
      if ( num % i == 0L )
        return false;
    return true;
  }
}

