//Welcome to the Errors and Data Types Task. 

/* --- Opening this file --- 

Please do not open this file in the wrong program such as Notepad or Notepad++.
For our Java course, all files should be opened in the program JGRASP. 
  
** Double check that both JGrasp and Java are installed on your computer as per the instructions in the Welcome document **

To do this, run JGRASP from your computer where it should be installed. Double click the JGrasp icon on your Desktop to run JGRASP.
In the top left corner of JGRASP, click File->Open
Navigate to this .java file inside your Dropbox folder on your computer (usually under C:/Users/YourUsername/Dropbox/YourDropboxFolderName/Task/example.java)
Double click on example.java and it will open in JGRASP. 
You may now continue reading the rest of this file.

*/


/* ************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
   ************************************
*/

public class Example //Example class
{
	public static void main(String[] args) // main method
	{
	
		//You should know the basic data types, assigning and declaring variables and how to output information. 
		//You also should know how to write, compile and run Java programs - this is a good start!
		
		//==== Working with Doubles ===
		
		//Working with doubles is very similar to ints and strings:
		
		double product = 30*2; //sum stores the double 60.0 
		
		//If you divide a double, you'll get the correct result since doubles can store decimal points:
		
		double answer = product/7; //Stores 8.57142857143
		
		
		//========  Casting ========
		//We want to print out a double, but how can we do that? System.out.println only prints out STRINGS.
		
		//Solution: You can convert the contents of a variable from one data type to another:
	
		//To convert a double or int to a string, simply ADD or CONCATENATE it to a String:
		
		System.out.println(answer + ""); //Adding answer to a String to CAST it to a String 
		
		//Another way of understanding this is that System.out.println is a function that can only be given a String to work with.
		
		
		//We may want to cast from Strings to integers...
		
		//What's the difference between these two?
		String age = "18"; 
		int ageInt = 18; 
		
		//Try:
		System.out.println(age + ageInt); //1818 will be print out because you're adding a String to an Int and this casts ageInt to a string and concatenates the two.
		
		//We want to add them together to get 18+18=36. So we need to cast age to an integer also, this is how this can be done.
		
		int ageAsAnInt = Integer.parseInt(age); //Integer.parseInt is a function that takes in a String and casts it to an integer data type.
		
		//BEWARE, you can't cast the String "abc" to an integer! That just can't be a number. Your program will give you an error if you try.
		
		int correctAddition = ageAsAnInt + ageInt; //adding two ints gives an int in return
		
		System.out.println("The addition is now correct: " + (correctAddition));
		
		//What about if we want to cast to a double?
		
		double double19 = Double.parseDouble("19.24"); //A string (denoted by " ") has been CAST to a double data type, preserving the decimal point
	
		
		/*============ Dealing with Errors =================
		
		Everyone makes mistakes. Maybe you've made some already. It's important to be able to DEBUG your code.
		The word DEBUG comes from a time when computers were as big as a room, and bugs literally landed in the machinery blocking electrical signals and causing errors.
		
		There are COMPILATION ERRORS: When you try compile your code, you get an error in the bottom JGrasp panel. This is due to missing semicolons, syntax errors etc.
		
		There are RUNTIME ERRORS: Your program compiles fine, but when it is actually run, an error occurs and the program stops! The error is printed out below also.
		
		There are LOGICAL ERRORS: Your program runes and compiles fine, but the output isn't what your expected. This means your logic applied to the problem as a solution is wrong.
		
		
		====== Compilation Errors ========
		
		Here's an example of such an error that you may see when you try press the big green + sign to compile your code: example.java:93: error: ';' expected
		
		This means that on line 93 of the file example.java, you forgot to insert a ; 
		To easily 'debug' this problem, while in JGRASP, hold down the CTRL key and press L. 
		You should be able to see line numbers on the left of the program pane. 
		
		Go to the line indicated by the error message and correct the error, then try compile your code again.
		DEBUGGING is a huge part of being a programmer - get used to it!
		
		====== Runtime Errors ========
		
		Say we had this line in our program: int a = Integer.parseInt("18.2");
		Your code would compile properly, but when running you'd get the error:
		
	    Exception in thread "main" java.lang.NumberFormatException: For input string: "18.2"
    	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
    	at java.lang.Integer.parseInt(Integer.java:492)
    	at java.lang.Integer.parseInt(Integer.java:527)
    	at example.main(example.java:107)
    	
		Look carefully. The TYPE Of exception is java.lang.NumberFormatException 
		NumberFormatException must have something to do with the format of the number you gave Integer.parseInt. 
		You can't cast 18.2 to an Integer because integers don't accept decimal points.
		It's important to think in a DEDUCTIVE way to solve runtime errors.
		
		====== Logical Errors ========
		
		When we move on to loops and control statements, these will become more frequent. Even after years of programming, it takes a long time to sit down and design an algorithm, and finding out why it isn't working is more intuition than anything else.
   	
		
		*/ 
		
		
	System.out.println("Thats the end of the example code for this task!"); 
	
	
	}

}


	/*========================================================= COMPULSORY TASK =======================================================

		 This Task is in three parts:
		 
		 1.) 	Open the java file 'errors.java' located in this folder. Use JGrasp to open it. 
		 
		 		Attempt to compile the program. Fix the compilation errors and then compile the program. 
				Now run the program. Fix the runtime errors and run the program. Save your errors file such that the file runs correctly. 
		 
		 		Now run the program and notice the output. Fix the logical error so that the program outprints what it should print out.
		 
		 		Everytime you fix an error, add a comment in the line you fixed it and indicate which of the 3 types of errors it was.
		 
		 2.)    In the top left corner of JGRASP, go File -> New -> Java. Now in this new file, File -> Save As and navigate to this Dropbox folder on your hard drive.
		 	    Save the new file as 'part2'. 
			  
			    Now in JGrasp, write the code to define the outer class, then the main class. Remember that your outer class should have the name part2, because your code is saved in a file called part1.java 
			  
			    Inside your main class, write the code to declare 5 String variables that each store words of your choosing. 
			    Print out these 5 using System.out.println statements.
			    Now define two double variables storing two numbers - 2 and 50. 
				Now multiply the two variables together, store the result is a new double variable 
			    called result, and print out result using System.out.println 
			  
			    Compile and run your code. Use this task to test your knowledge of the syntax (Capitalisation/Semicolons/Brackets) and your ability to correct errors you introduce.
			  
		3.)     In the top left corner of JGRASP, go File -> New -> Java. Now in this new file, File -> Save As and navigate to this Dropbox folder on your hard drive.
		 	    Save the new file as 'part3'. 
			 
				Now in JGrasp, write the code to define the appropriate outer class, then the main class. 
				Now write a statement to declare and assign a new int variable storing a number of your choice.
				Now cast this variable to a new String variable called strInt. 
				Add a comment to this line of code, stating which type of casting you’ve carried out.
				Print out strInt.
			 
				Now declare a new String variable called numStr, and store the string "10" in it.
				Cast the string to a new int variable called numTen. 
				Again, add a comment to this line of code, stating which type of casting you’ve carried out.
				Print out numTen.


	   ==================================================================================================================================
		   
	  
	   ================================================== OPTIONAL TASK =================================================================
	  
	 	Create a new java file, following the instructions of the second part of the compulsory task above. Call the file 'logic'.
		
		Inside, write the java class and main class. Now inside the main class, write a program that displays a LOGICAL ERROR. Be as creative as possible.
	  
	  
	  
	  */