// Welcome to the Control Structures - Switch Task.

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

public class example
{

public static void main (String [] args )
{
	int coinValue = 50;
	switch( coinValue )
		{
			case 1:
			case 2:
			case 5:
			case 10:	System.out.println( coinValue + " cents is a standard coin" );
						break;
			case 50:	System.out.println( coinValue + " cents is a special coin" );
						break;
			default:	System.out.println( "No coin for " + coinValue + "cents" );
						break;
		}
}
}
 
/* ======================================== COMPULSORY TASK 1 ========================================
   
   -Create a new file called switch.java.
   
   -Using a switch statement: write a program that asks the user to enter a numeric digit from zero
    up to (and not including) 100.
	
   -Once the user has entered the number the program should convert the number into words.
		
   -For example: if the user enters ‘52’ the program displays 'fifty two'. Your program should use a
                 switch statement to make the necessary numeric to word conversions for the integer
				 number entered by the user.
					   
   ===================================================================================================
   
   ======================================== COMPULSORY TASK 2 ========================================
   
   -Enhance the compulsory task program so that the user may enter an amount of money which the
    program will read back to the user stating the correct magnitudes of thousands, hundreds, and
	cents.
	
   -For example: Input: R123.99
				 Output: One hundred and twenty three rands and ninety nine cents.
   
   -Assume the input amount will always be in rands and that if the input amount is x, then
    0 <= x < 10000.
	
   -Save this file as switchEnhanced.java.
   ===================================================================================================
*/