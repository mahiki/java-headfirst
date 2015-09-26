/* ArrayList<E>()
 * int size()		        how many objects
 * boolean contains(E)	does list contain E
 * boolean isEmpty()
 * add(s)		            add s to list
 * remove(s)		        remove s from list
 * indexOf(s)		        index of s, or -1
 * get(int index)	      return object at index
 */

package wkspc;
import java.util.ArrayList;

public class ArrayListDemo{

  ArrayList<String> listOfStrings = new ArrayList<String>();
  
  public void runDemo(){
    
    while(true){
    
      String blob = Helper.getUserInput("+> ");

      if(blob == null) {
        listOfStrings.add(blob);
        continue;
      }
      
  	  if(blob.equals("exit")) {System.out.println("exiting."); return;}

  	  
      if(blob.equals("clear")){
        listOfStrings.clear();
        System.out.print("ArrayList items all deleted.\t");
        System.out.println("isempty(): " + listOfStrings.isEmpty() + "\n");
        continue;
      }
      
      if(blob.equals("size")) {
        System.out.println("List Size: " + listOfStrings.size());
      continue;
      }
      
  	  if(blob.equals("list")) {
  	    for(String s : listOfStrings) System.out.print(s +"\t");
    	  System.out.println();
  	    continue;
  	  }
  	  
  	  if(blob.equals("first")) {
  	    if(!listOfStrings.isEmpty()){
    	    System.out.print(listOfStrings.get(0) +"\t");
      	  System.out.println();
  	    }
  	    else { System.out.println(); }
  	    
  	    continue;
  	  }

  	  if(blob.equals("last")) {
  	    if(!listOfStrings.isEmpty()){
    	    System.out.print(listOfStrings.get(listOfStrings.size()-1) +"\t");
      	  System.out.println();
  	    }
  	    else { System.out.println(); }
  	    
  	    continue;
  	  }

      listOfStrings.add(blob);
      
    }
  }
  
  public static void main(String[] args){
    Helper.clearConsole();
    Helper.printLines(4);
  	System.out.println("          - - - We are playing with ArrayList<String> - - -");
    System.out.println("Commands:     exit  size  first  list  last clear\n");
    System.out.println("All other input will add to ArrayList");
    System.out.println("Provide command or string at the '+>' prompt\n");

    ArrayListDemo demo = new ArrayListDemo();
    demo.runDemo();
    
  }
}
