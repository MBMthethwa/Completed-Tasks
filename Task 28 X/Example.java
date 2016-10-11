// Welcome to the Lists Task.

/* --- Opening this file --- 

	Please do not open this file in the wrong program such as Notepad or Notepad++.
	For our Java course, all files should be opened in the program JGRASP. 
	  
	** Double check that both JGrasp and Java are installed on your computer as per the instructions in the Welcome document **

	To do this, run JGRASP from your computer where it should be installed. Double click the JGrasp icon on your Desktop to run JGRASP.
	In the top left corner of JGRASP, click File->Open
	Navigate to this .java file inside your Dropbox folder on your computer (usually under C:/Users/YourUsername/Dropbox/YourDropboxFolderName/Task/example.java)
	Double click on example.java and it will open in JGRASP. 
	You may now continue reading the rest of this file.




   ************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
   ************************************
*/

// This means that all packages are imported from the java.util library
import java.util.*;

// Demonstrate ArrayList.
class ArrayListExample {
   public static void main(String args[]) {
      // Create an array list of Strings.
      ArrayList<String> al = new ArrayList<String>();
      System.out.println("Initial size of al: " + al.size());
      
      // Add elements to the array list.
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
      al.add(1, "A2");
      System.out.println("Size of al after additions: " + al.size());
      
      // Display the array list.
      System.out.println("Contents of al: " + al);
      
      // Remove elements from the array list.
      al.remove("F");
      al.remove(2);
      System.out.println("Size of al after deletions: " +
      al.size());
      System.out.println("Contents of al: " + al);
   }
}

// Demonstrate LinkedList.
class LinkedListExample {
   public static void main(String args[]) {
      // Create a linked list of Strings.
      LinkedList<String> ll = new LinkedList<String>();
      
      // Add elements to the linked list.
      ll.add("F");
      ll.add("B");
      ll.add("D");
      ll.add("E");
      ll.add("C");
      ll.addLast("Z");
      ll.addFirst("A");
      ll.add(1, "A2");
      System.out.println("Original contents of ll: " + ll);
      
      // Remove elements from the linked list.
      ll.remove("F");
      ll.remove(2);
      System.out.println("Contents of ll after deletion: " + ll);
      
      // Remove first and last elements.
      ll.removeFirst();
      ll.removeLast();
      System.out.println("ll after deleting first and last: " + ll);
      
      // Get and set a value.
      String val = ll.get(2);
      ll.set(2, val + " Changed");
      System.out.println("ll after change: " + ll);
   }
}

/* ======================================== COMPULSORY TASK 1 ========================================
   
	•Create a new file called SpeedOOP.java
   
	•Create a new java file called QuizScores.java

	•Import the java.util.ArrayList package.
	
	•Create a public class called ‘QuizScores’.’
	
	•Within this class, create a main method.
					
	•Within this method, create an integer ArrayList called ‘Group C’.

	•Add ten elements to the ArrayList using the add() function to represent scores of learners from Group C.

	•Print out the ArrayList

	•Print out the highest score..

	•Remove the lowest score, and print out the next lowest score.

	•Print out the average score.

	•Compile, save and run your file.
					   
   ===================================================================================================
   
   ======================================== COMPULSORY TASK 2 ========================================
   
	•Create a new java file called Speed.java

	•Import the java.util.LinkedList package.
		
	•Create a public class called ‘Speed’.
		
	•Within this class, create a main method.
						
	•Within this method, create an String LinkedList called ‘Cars’.

	•Add ten elements to the LinkedList to represent names of cars.

	•Insert a car at a unique index in the LinkedList.

	•Remove the car that used to be at that index.

	•Print out the LinkedList (it may be useful to use a for loop).

	•Print out the size of the LinkedList.

	•Print out any cars that contain a vowel in their name.
	 
	•Compile, save and run your file.
   ===================================================================================================
*/