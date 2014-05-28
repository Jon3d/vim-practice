// TODO package name;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Problem7 implements Problem{
  public void printQuestion(){
    System.out.println("What is the 10001st prime number?");
  }
  public String getAnswer(){
    boolean[] primeSieve = new boolean[104744];
    int ph = 0;
    int current = 1;
    while(true){
      current++;
      if(primeSieve[current] == false){
        if(ph == 10001)
          return String.valueOf(current);
        sieve(primeSieve, current);
        ph++;
      }
    }
  }
  private void sieve(boolean[] arr, int num){
    for(int i = num + num; i < 104744; i += num)
      arr[i] = true;
  }
}

