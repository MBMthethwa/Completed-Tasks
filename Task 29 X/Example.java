// Welcome to the HashMaps and Sets Task.

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
   
import java.util.*;

//Demonstrate HashMap.
class HashMapExample {

   public static void main(String args[]) {
   
      // Create a HashMap.
      HashMap<String, Double> hm = new HashMap<String, Double>();
      
      // Put elements to the map
      hm.put("John Doe", new Double(3434.34));
      hm.put("Tom Smith", new Double(123.22));
      hm.put("Jane Baker", new Double(1378.00));
      hm.put("Tod Hall", new Double(99.22));
      hm.put("Ralph Smith", new Double(-19.08));
      
      // Get a set of the entries.
      Set<Map.Entry<String, Double>> set = hm.entrySet();
      
      // Display the set.
      for(Map.Entry<String, Double> me : set) {
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
      }
      System.out.println();
      
      // Deposit 1000 into John Doe's account.
      double balance = hm.get("John Doe");
      hm.put("John Doe", balance + 1000);
      System.out.println("John Doe's new balance: " +
      hm.get("John Doe"));
   }
}

/*
   The program begins by creating a hash map and then adds the mapping of names to 
   balances. Next, the contents of the map are displayed by using a set-view, obtained
   bycalling entrySet( ). The keys and values are displayed by calling the getKey() 
   and getValue() methods that are defined by Map.Entry. Pay close attention to how
   the deposit is made into John Doe’s account. The put() method automatically replaces
   any pre-existing value that is associated with the specified key with the new value. 
   Thus, after John Doe’s account is updated, the hash map will still contain just one
   "John Doe" account.
*/

// Demonstrate HashSet.
class HashSetDemo {

   public static void main(String args[]) {
   
   // Create a HashSet.
   HashSet<String> hs = new HashSet<String>();
   
   // Add elements to the hash set.
   hs.add("Beta");
   hs.add("Alpha");
   hs.add("Eta");
   hs.add("Gamma");
   hs.add("Epsilon");
   hs.add("Omega");
   System.out.println(hs);
   }
}

/*
   It is important to note that HashSet does not guarantee the order of its elements,
   because the process of hashing doesn’t usually lend itself to the creation of
   sorted sets. If you need sorted storage, then another collection, such as a TreeSet, 
   is a better choice.
*/

/* ======================================== COMPULSORY TASK 1 ========================================
   
	•Create a new java file called Restaurant.java
	
	•Import the java.util.HashMap package.
	
	•Create a public class called ‘Restaurant’.
	
	•Within this class, create a main method.
	
	•Within this method, create a HashMap called “RestaurantMenu’ with Strings for keys and Integers
	for values.
	
	•Add 10 meal elements to the menu, with their prices mapped as the values.
	
	•Print out the keys to the user (picture a menu).
	
	•Present the user with the option to order, or pay.
	
	•If order, present the list and option again, whilst summing the prices of what they order (note
	the user can only order one item at a time).
	
	•Print out the total of their order.
	
	•Compile, save and run your file.
					   
   ===================================================================================================
   
   ======================================== COMPULSORY TASK 2 ========================================
   
	•Create a new java file called Buffet.java
	
	•Import the java.util.HashSet package.
	
	•Create a public class called ‘Buffet’.
	
	•Within this class, create a main method.
	
	•Ask a user to input what they would eat at a buffet.
	
	•Append the item to the HashSet.
	
	•Keep asking and appending items, until the user enters “nothing”.
	
	•Print out the size of the HashSet.
	
	•Print out the HashSet (notice what happened to any repeated entries?).
	
	•Compile, save and run your file.

   ===================================================================================================
*/