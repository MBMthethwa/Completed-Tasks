// Welcome to the Introduction to Java Programming Task.

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


//What you're reading right now is a comment.  Any line with // before it is a comment.

// This is a Java file. It is a normal file with the .java extension on a computer.
 
 
/* A multiline comment can also be inserted using the / and * symbols. 
  
   This is a multiline comment. 
   Comments are messages left in a program that are intended to be read by humans.
   Comments are completely ignored by the computer executing the Java code. 
   They can be inserted absolutely anywhere in a program. 

*/  

/* ************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM   ************************************
*/
  

/*================================= The General Structure of a Java Program  =================================

	Unfortunately Java isn't the easiest language to jump into. You will need to first memorise the structure of a Java program without fully understanding it.

	All java code must be contained inside a Java class. The java class usually must be named the same as the file its in,
	in this case we're working inside a file named 'example' so our java class will also be named example.

*/
 public class example // The class  declaration
 { // Opening brackets to indicate start of the class
 
    public static void main (String [] args) // This is the main method declaration and it must be declared exactly like this.
	{
		System.out.println("Hello World! I completed the Task.");
		/* This is a statement, statements must always end with semi colons. 
		   This particular statement prints the message: Hello World! I completed the Task.
		   The message inside "" is called a String. A String is used to represent text and must always be between ""
		
		The main method is the entry point of a Java program, the execution of the program starts in the main method.
		 
		   A Java program is composed of statements. A statement is an instruction and it must always end with a semi colon
		   Notice how the code is carefully lined out and how matching brackets are in line with each other.
		   Keeping your code neat, easily readable and well commented is EXTREMELY important. 
		
		   Navigate to the pdf in this folder to receive further instructions on completing your task.
		*/ 
		
	
	
	} // Remember whenever you open any type of bracket, it must have a matching closed one of your code will not run.
}  // Closing brackets to indicate end of the class
	//====================================================================================================================================



	/*==================================================== COMPULSORY TASK ===============================================================
	
	 Now that you understand the basic structure of a Java program, it's time to learn how to run them among other things.
	 
	 
	 ==== Working with the JGrasp Editor ====
	 
	 JGrasp is a Java editor. It's a place where we can view the code of Java programs, edit them and also RUN and COMPILE them.
	 
	 Notice how comments in JGrasp appear in ORANGE, and the Java code above appears in black, purple and green.
	 
	 This is known as Syntax highlighting and is aimed to make programs more readable.
	 
	 Orange is a bit bright on my eyes for all these comments. If you'd like, on the top JGrasp menu click Settings->Colors.
	 Now under 'Comments', click the Orange box, select a new colour (navy blue is nice) and click Ok, then Apply on the previous panel and Ok again to close.
	 
	  ==== Compiling programs ====
	  
	  After you've written some Java code, you have to first COMPILE it. All programs need to be COMPILED before they can be RUN. What does this mean?
	  
	  When you install Java on your computer, you install something called the Java Virtual Machine (JVM). Think of this like a little Java program that runs on your computer.
	  Everytime you first write new Java code, the JVM COMPILES it to check that the code you wrote is actually acceptable in the Java language.
	  In other words, it checks your code for any Syntax errors (Missing brackets/incorrect spelling etc). If these are found, compilation will fail and you will be notified of the error.
	  Any compilation errors are reported in the panel you see at the bottom of JGRASP, the 'JGrasp messages' window.
	  
	  Since we've written this program you're reading now, there should be no errors and it should compile correctly.
	  To compile the code, look at the top of the JGRASP menu and find the big green cross (CTRL + B). Click this now.
	  
	  In the bottom portion of the JGrasp window you should see: 
		  ----jGRASP exec: javac -g example.java
    	
    
     ----jGRASP: operation complete.
     
	  This means your code compiled correctly. EVERYTIME YOU CHANGE THE CODE OF A PROGRAM, YOU NEED TO COMPILE IT. YOU SHOULD ALSO SAVE YOUR CODE REGULARY.
	  You may notice a new file appear in this folder that this program is in. The file is called 'example.class' and it is a CLASS file that is made when your code compiles properly.
	  
	  ==== Running programs ====
	  
	  Now that you've compiled this program, you can actually execute the code written above to see the output.
	  
	  In the top jGRASP menu, click the picture of the red running man next to the compile button (CTRL + R). 
	  
	  At the bottom of JGRASP, in the RUN I/O panel, you should see a message. This is the output of this program.
	  
	  *** CREATE A NEW TEXTFILE IN THIS FOLDER. CALL IT TASK 1. INSIDE IT, SIMPLY COPY AND PASTE THE MESSAGE THAT YOU SEE, WHICH IS THE OUTPUT OF THIS PROGRAM. ***
	  
	  Once this has been completed successfully, a tutor will check this answer and give you your next task.
	 
	  

	======================================================================================================================================
	   
	   
	   
	   

	================================================== END OF EXAMPLE =================================================================*/
