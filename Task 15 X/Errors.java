/* --- Opening this file --- 

Please do not open this file in the wrong program such as Notepad or Notepad++.
For our Java course, all files should be opened in the program JGRASP. 
  
** Double check that both JGrasp and Java are installed on your computer as per the instructions in the Welcome document **

To do this, run JGRASP from your computer where it should be installed. Double click the JGrasp icon on your Desktop to run JGRASP.
In the top left corner of JGRASP, click File->Open
Navigate to this .java file inside your Dropbox folder on your computer (usually under C:/Users/YourUsername/Dropbox/YourDropboxFolderName/Task/errors.java)
Double click on errors.java and it will open in JGRASP. 
You may now continue reading the rest of this file.

*/


/* ************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
   ************************************
*/

public class Errors
// Save as Errors
//compilation error
{
	public static void main (String[] args)
	{
	
		//System.out.println("Welcome to my first program!")
      System.out.println("Welcome to my first program!");
      
		System.out.println("\n");
		
		//String ageStr  ="24 years"; //I'm 24 years old.     
      //int age  = 24 ; //I'm 24 years old.
       //syntax error

      
      int age = 24; 
      
		
		System.out.println("I'm " + age + " years old.");
		
		//int three = "3";
      int three = 3;
	
		
		int answerYears = age + three;  //I want an int, so I'm adding two ints. 
		
		System.out.println("Toal number of years: " + answerYears);
		
		//int answerMonths = answerYears*12; logic error
      int answerMonths = answerYears * 12 + 6;
		
		System.out.println("In 3 years and 6 months, I'll be " + answerMonths + " months old");
		
		//HINT, 330 months is the correct answer
	
	
	
	}

}


