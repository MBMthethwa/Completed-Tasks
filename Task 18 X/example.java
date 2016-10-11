// Welcome to the Control Structures - Do While Loop Task.

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

import java.util.*;
import javax.swing.*;

public class example
{
	public static void main ( String [] args )
	{
			int choice = 0;
			do
			{
				System.out.println( "Enter today's number from the menu:" );
				choice = Integer.parseInt( JOptionPane.showInputDialog( 	"1. Sunday\n"+
												"2. Monday\n"+
												"3. Tuesday\n"+
												"4. Wednesday\n"+
												"5. Thursday\n"+
												"6. Friday\n"+
												"7. Saturday\n"+
												"0. Quit program" ) );
									
				switch( choice )
				{
					case 1: System.out.println( "Sunday! Last day to do the homework." );break;
					case 2: System.out.println( "Monday! Be happy, 5 more days in the week." );break;
					case 3: System.out.println( "Tuesday! Wednesay will be better." );break;
					case 4: System.out.println( "Wednesday! Can you feel it in the air?" );break;
					case 5: System.out.println( "Thursday! Get set!" );break;
					case 6: System.out.println( "Friday! Time to party!" );break;
					case 7: System.out.println( "Saturday! Put your legs up and relax" );break;
					default: System.out.println( "Please enter a number between 1 and 7, or 0 to quit" );break;
				}
				
			}while( choice != 0 );
	}
}

/* ============================================== COMPULSORY TASK 1 ==================================================

   Imagine that the password to sign in to some computer is “John”. Write a program that prompts the user to enter a 
   password to login to this imaginary computer. If the user enters the correct password then notify the user and terminate
   the program. Should the user get the password incorrect three times in a row then inform the user of the current 
   password and allow the user to set a new password. Check the new password so that it satisfies these modified java 
   identifier rules: 
   
	   1. The password may have any number of characters between 1 and 20, inclusive.
							
	   2. The password may start with an underscore “_” or any letter of the alphabet
								
	   3. The password may be any combination of upper and lower case letters.
								
	   4. The password consists only of numbers, English alphabet letters, and the underscore character.
							
   Should a proposed password not match these rules then inform the user that they have entered an invalid password and prompt the user to try again until an acceptable password is found.
							
   Here is an example run on the assumption that the current password is “John”: 
   
		 prompt: Enter password:			
         input: peter
         prompt: Incorrect password. Please enter password:
         input: luke
         prompt: Incorrect password. Please enter password:
         input: tabo
         prompt: Password incorrect on three attempts.
         prompt: The password was John. Please set a new user password: 
         input: rivoningo23
         prompt:password changed.
						
   Save this program as do_whilePassword.java 
   
   ===================================================================================================================
   
   
   ============================================== COMPULSORY TASK 2 ==================================================
   
   Using a do...while loop, implement a program that presents a menu to the user. The options of the menu allow the user
   to use the programs you wrote in the previous activities.
   
   The menu of the program is as follows: 
        1. task3.java
        2. errors.java
        3. while.java
        4. do_whilePassword.java 
        5. quit
						
   The program executes the corresponding programs implemented in the previous tasks. Be sure to direct the user on how to
   use the menu.

   Save this program as do_whileMenu.java. 

   ===================================================================================================================
*/