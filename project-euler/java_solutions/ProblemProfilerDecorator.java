 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProblemProfilerDecorator implements Problem {
  protected Problem timedProblem;
  public ProblemProfilerDecorator(Problem timedProblem){
    this.timedProblem = timedProblem;
  }
 
  public String getAnswer(){
    timedProblem.printQuestion();
    long time = System.currentTimeMillis();
    String answer = timedProblem.getAnswer();
    long endTime = System.currentTimeMillis();
    long totalTime = endTime - time;
    System.out.println("Total execution time: " + totalTime + "ms"); 
    return timedProblem.getAnswer();
  }
  public void printQuestion(){
    timedProblem.printQuestion();
  }
}

