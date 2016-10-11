// Welcome to the Iterators Task.

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

// =================== ITERATORS =====================

class IteratorExample {

   public static void main(String args[]) {
   
      // Create an array list
      ArrayList al = new ArrayList();
      
      // add elements to the array list
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");

      // Use iterator to display contents of al
      System.out.print("Original contents of al: ");
      Iterator itr = al.iterator();
      while(itr.hasNext()) {
         Object element = itr.next();
         System.out.print(element + " ");
      }
      System.out.println();
      
	  // Modify objects being iterated
      ListIterator litr = al.listIterator();
      while(litr.hasNext()) {
         Object element = litr.next();
         litr.set(element + "+");
      }
      System.out.print("Modified contents of al: ");
      itr = al.iterator();
      while(itr.hasNext()) {
         Object element = itr.next();
         System.out.print(element + " ");
      }
      System.out.println();

      // Now, display the list backwards
      System.out.print("Modified list backwards: ");
      while(litr.hasPrevious()) {
         Object element = litr.previous();
         System.out.print(element + " ");
       }
       System.out.println();
    }
}

// =================== LIST ITERATORS =====================

class ListIteratorExample {

  public static void main(String[] args) {

    // Create an ArrayList and populate it with elements
    ArrayList arrayList = new ArrayList();
    arrayList.add("element_1");
    arrayList.add("element_2");
    arrayList.add("element_3");
    arrayList.add("element_4");
    arrayList.add("element_5");
    
    // The ListIterator object is obtained using listIterator() method
    ListIterator it = arrayList.listIterator();

    // For forward iteration over the collection elements we can use the hasNext() and next() methods of ListIterator
    System.out.println("Forward iteration :");
    while(it.hasNext())
      System.out.println(it.next());

    // For backward iteration over the collection elements we can use the hasPrevious() and previous() methods of ListIterator
    System.out.println("Backward iteration :");
    while(it.hasPrevious())
      System.out.println(it.previous());

    // nextIndex and previousIndex return next and previous index from the current position in the list
    System.out.println("Previous Index is : " + it.previousIndex());  
    System.out.println("Next Index is : " + it.nextIndex());

    // We get the next element in forward order
    System.out.println("Next element is : " + it.next());

    // nextIndex and previousIndex return next and previous index from the current position in the list
    System.out.println("Previous Index is : " + it.previousIndex());  
    System.out.println("Next Index is : " + it.nextIndex());
    
    // Add an element just before the next element
    it.add("element_6");
    System.out.println("After inserting element_6, ArrayList contains : ");
    for(int i = 0; i < arrayList.size(); i++)
      System.out.println(arrayList.get(i));

    // We get the next element in forward order
    System.out.println("Next element is : " + it.next());

    // void remove() method removes the last element returned by next or previous methods
    it.remove();
    System.out.println("After removing element_2, ArrayList contains : ");
    for(int i = 0; i < arrayList.size(); i++)
      System.out.println(arrayList.get(i));

    // We get the next element in forward order
    System.out.println("Next element is : " + it.next());

/*
   void set(Object o) method replaces the last element returned
   by next or previous methods. The set method can only be called
   if neither add or remove methods are called after last call of
   next or previous methods
*/

    it.set("element_7");
    System.out.println("After replacing element_3, ArrayList contains : ");
    for(int i = 0; i < arrayList.size(); i++)
      System.out.println(arrayList.get(i));
  }
}

/* ======================================== COMPULSORY TASK 1 ========================================
   
	•Create a new java file called BasicIterator.java

	•Refer to the ArrayList you created in the Lists Task.
	
	•Define an iterator loop to do the following:
		•Check if the next object exists in the ArrayList
		•Print out the next object
		•Remove the object that was returned
	
	•Define a count variable to count how many items were in your ArrayList based of how many time
	the check for the next object returns true.
					
	•Print out the count variable

	•Compile, save and run your file.
					   
   ===================================================================================================
   
   ======================================== COMPULSORY TASK 2 ========================================
   
	•Create a new java file called BasicListIterator.java

	•Refer to the ArrayList you created in the Lists Task.

	•Add three objects to the list.

	•Utilise the nextIndex() method until the size of the list is returned.

	•Iterate through the loop, printing both the previous and next object for each index.

	•Compile, save and run your file.


   ===================================================================================================
*/