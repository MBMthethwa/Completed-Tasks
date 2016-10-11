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

public class example1
{
	public static void main(String [] args)
	{
	int i, sum = 0;		/*Declarations to be used in the comparison of the while-loop and for-loop repetition constructs*/
	
	/*while-loop */
	
	/*initialise*/
		i = 1; 
		
	/*test*/
		while(i <= 10) 
		{
	/*update:*/
			sum += i;
			i++;
		}
		
		
		
	/*For-loop. Equivalent to the above while-loop*/
	
		for( i = 1; i <= 10; i++ )
			sum += i;
		
		/* 
		Obeserve how compact this implementation is in comparision to the while-loop. 
		Compact code can be easier to read and thus quickly communicate what is going on to other programmers that might want to read your code.
		*/
	}
}
//Proceed with example2.java