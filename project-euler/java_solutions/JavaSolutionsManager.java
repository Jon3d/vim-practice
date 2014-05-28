// TODO package name;
 
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.awt.datatransfer.*;
public class JavaSolutionsManager{

  private static String printQuestionAndAnswer(String fileName){
    String answer = null;    
    try{
        Object problem = Class.forName(fileName).newInstance();
        Problem prob = new ProblemProfilerDecorator((Problem) problem);
        answer = prob.getAnswer();

        System.out.print(fileName + ": ");
        System.out.println("Answer: " + answer);
      } catch (ClassNotFoundException e){
        e.printStackTrace();
      } catch (InstantiationException e){
        e.printStackTrace();
      } catch (IllegalAccessException e){
        e.printStackTrace();
      }
    return answer;
  }

  private static ArrayList<String> getAllProblems(){
    File folder = new File(".");
    ArrayList<String> problems = new ArrayList<String>();
    File[] listOfFiles = folder.listFiles(new FilenameFilter(){
      public boolean accept(File dir, String name){
        return name.toLowerCase().matches("problem[0-9]+.class");
      }
    });
    for( File file: listOfFiles){      
      String fileName = String.valueOf(file).replace("./", "").replace(".class", "");
      problems.add(fileName);  
    }
    return problems;
  }
  
  private static void printAllProblems(){
    ArrayList<String> problems = getAllProblems();
    for(String problem: problems)
      printQuestionAndAnswer(problem);
  }

  private static void getSingleProblemAndCopyToClipboard(String number){
    String fileName = "Problem" + number;
    File f = new File(fileName + ".class");
    if(f.exists()){
      StringSelection s = new StringSelection(printQuestionAndAnswer(fileName));
      Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
      c.setContents(s, null);
    }else
      System.out.println(fileName + " does not exist!");
  }

  public static void main(String[] args) throws IOException{
    if(args.length > 0){
      getSingleProblemAndCopyToClipboard(args[0]);
      System.out.println("Press any key to exit (This will clear the clipboard)");
      System.in.read();
    }else{
      printAllProblems();
    } 
  }
}

