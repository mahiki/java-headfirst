/* CLI utility helper for testing Java concepts
 * final and private constructor, for static methods only
 *
 * String getUserInput(String prompt)     define prompt and receive 1 line of input
 *
 * the try-with-resources (placing reading in parens) causes NPE
 */

package wkspc;
import java.io.*;

public final class Helper{
  
    private Helper(){}
    
  	public final static String getUserInput(String prompt){
  		
  		String inputLine = null;
  		System.out.print(prompt);
  		
  		try {
  		  BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
  			inputLine = is.readLine();
  			if(inputLine.length() == 0) return null;
  		    
  		} catch (IOException e){System.out.println("IOException: " + e); }
  		
  		return inputLine;
  	}
  	
  	public final static void printLines(int i){
  	  for(int j = 0; j < i; j++) System.out.println();
  	}

    public final static void clearConsole(){
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }
  
}
