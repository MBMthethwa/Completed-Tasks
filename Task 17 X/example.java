// Welcome to the Control Structures - While Loop Task.

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
		int i, sum = 0;
		i = 2;				//initial even integer for the sum
		
		System.out.print( "2" );

		while( sum <= 250 )	//loop test; check current value of sum
		{
			sum += i;		//add integer to sum
			i += 2;			//update i to next even integer
			System.out.println( "+"+i );
		}
		System.out.println(sum);
	}
}

/* =========================== COMPULSORY TASK ============================
   -Create a new file called while.java.
   -Write a program that always asks the user to enter a number.
   -When the user enters the negative number -1, the program should stop
    requesting the user to enter a number.
   -The program must then calculate the average of the numbers entered
    exclusive of the -1.
   -Make use of the while loop repetition structure to implement the
    program.
   ========================================================================
   
   ============================ OPTIONAL TASK =============================
   -Modify your while.java file to do the following:
        -require the user to enter their name, with only a certain name
		 being able to trigger the loop.
		-print out the number of tries it took the user before inputting
		 the correct name.
		-Add a conditional statement that will cause the user to exit
		 the program without giving the average of the names entered if
		 they enter a certain input.
   ========================================================================*/