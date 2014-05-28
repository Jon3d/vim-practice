// TODO package name;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class Problem4 implements Problem {
  public void printQuestion(){
    System.out.println("What is the largest palindrome made from the product of 3-digit numbers.");
  }

  public String getAnswer(){
    int largest = 0;
    for (int i = 999; i > 900; i--)
      for (int x = 999; x > 900; x--)
        if(i * x > largest && isPalindrome(i * x) == true)
          return String.valueOf(i * x);
    return String.valueOf(largest);
  }
  private boolean isPalindrome(int num){
    String number = String.valueOf(num);
    for(int i = 0; i < number.length() / 2; i++){
      if( number.charAt(i) != number.charAt(number.length() - i - 1) )
        return false;
    }
    return true;
  }
}

