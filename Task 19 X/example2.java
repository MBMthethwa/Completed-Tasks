// Welcome to the Control Structures - For Loop Task.

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
   Comments are completely ignored by the computer executing the Java course. 
   They can be inserted absolutely anywhere in a program. 

*/  

/* ************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
   ************************************
*/

public class example2
{
	public static void main(String [] args)
	{
		for( int count = 10; count > 0; count --)
			System.out.print(count + " "); //loop body
		System.out.println("Blast Off!!!"); //after execution of for loop
	}
}

/* ======================================== COMPULSORY TASK 1 ========================================
   -In the while.java program you wrote in the Control Structures - While Loop task, modify the 
    program to use a for-loop repetition construct where the while-loop was used.
   -This should be the only modification made to your source code. 
   -Save this new version as for.java. 
   -Place comments that describe the modifications you have had to make to use a for-loop.
   ===================================================================================================
   
   ======================================== COMPULSORY TASK 2 ========================================
   -Modify do_whilePassword.java from the Control Structures - Do While Loop task to use for-loops to
    achieve the same computations being done by the while-loop(s) of that source code. 
   -Let that be the only change in the new source code. 
   -Place comments that describe the modifications you have had to make to use a for-loop.
   ===================================================================================================
*/