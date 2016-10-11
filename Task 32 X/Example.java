// Welcome to the Files Task.

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


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// ================ File Input =================

class ScannerExample {

    public static void main(String args[]) throws FileNotFoundException {
  
        //Creating File instance to reference text file in Java
        File text = new File("test.txt");
      
        //Creating Scanner instnace to read File in Java
        Scanner scnr = new Scanner(text);
      
        //Reading each line of file using Scanner class
        int lineNumber = 1;
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }       
    }   
}

// ================ File Output =================

import java.util.Formatter;
import java.util.Locale;

class FormatterDemo {
	
	public static void main(String[ ] args) {
	   
		// create a new formatter
		try {
		Formatter f = new Formatter("outputTest.txt");
		
		// print the formatted strings to the file
		f.format("%s %s %s", "1","John", "Smith \r\n");
		f.format("%s %s %s", "2","Amy", "Brown");
		f.close();    
		} 
  
		catch (Exception e) {
			System.out.println("Error");
		}
	}
}


/* ======================================== COMPULSORY TASK 1 ========================================
   
	•Create a new java file called MyFile.java

	•Write code to read the content of the text file input.txt. For each line in input.txt, write a
	new line in the new text file output.txt that computes the answer to some operation on a list of
	numbers.

	•If the input.txt has the following:
		Min: 1,2,3,5,6
		Max: 1,2,3,5,6
		Avg: 1,2,3,5,6

	•Your program should generate output.txt as follows:
		The min of [1, 2, 3, 5, 6] is 1.
		The max of [1, 2, 3, 5, 6] is 6.
		The avg of [1, 2, 3, 5, 6] is 3.4.

	•Assume that the only operations given in the input file are min, max and avg, and that the
	operation is always followed by a list of comma separated integers. You should define the
	functions min, max and avg that take in a list of integers and return the min, max or avg of
	the list.

	•Your program should handle any combination of operations and any length of input numbers. You
	can assume that the list of input numbers are always valid integers and that the list is never
	empty.

	•Compile, save and run your file.
		   
   ===================================================================================================
   
   ======================================== COMPULSORY TASK 2 ========================================
   
	•Modify your MyFile.java file to do the following:

	•Change your program to additionally handle the operation “px” where x is a number from 10 to 90
	and defines the x percentile of the list of numbers. E.g.:
        Input.txt: 
			Min: 1,2,3,5,6
			Max: 1,2,3,5,6
			Avg: 1,2,3,5,6
			P90: 1,2,3,4,5,6,7,8,9,10
			Sum: 1,2,3,5,6
			P70: 1,2,3
			
		Your output.txt should read:
			The min of [1,2,3,5,6] is 1.
			The max of [1,2,3,5,6] is 6.
			The avg of [1,2,3,5,6] is 3.4.
			The 90th percentile of [1,2,3,4,5,6,7,8,9,10] is 9.
			The sum of [1,2,3,5,6] is 17.
			The 70th percentile of [1,2,3] is 2.

	•Compile, save and run your file.

   ===================================================================================================
*/