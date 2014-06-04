// TODO package name;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Problem10 implements Problem{
  int PRIMESBELOW = 2000000;
  boolean[] NUMS = new boolean[PRIMESBELOW];
  public void printQuestion(){
    System.out.println("Find the sum of all the primes below 2 million.");
  }

  public String getAnswer(){
    for(int i = 2; i < PRIMESBELOW; i++)
      if(NUMS[i] == false)
        sieve(i);
    long answer = 0;
    for(int i = 2; i < PRIMESBELOW; i++)
      if(NUMS[i] == false){
        answer += (long)i;
      }
    System.out.println(answer);
    return String.valueOf(answer);
  }

  public void sieve(int i){
    for(int x = 2 * i; x < PRIMESBELOW; x += i)
      NUMS[x] = true;
  }
}

