// Welcome to the Writing First Java Program Task

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
  

//================================= Writing your first Java program  =================================

//Remember the structure of a Java program from the previous task?

 public class Example //Class declaration
 { 
 
    public static void main (String [] args) //Main method declaration 
	{
	
		//In this task, we'll work more with writing code executed between these two brackets
		
		//============ Statements and Syntax ============
		//A line of code is known as a statement. All statements must have perfect syntax (punctuation and spelling) or your program will not compile and hence not run.
		//All statements in Java, except class declarations, comments and control structures, MUST end in a semicolon (;). Don't forget it!

		//============ Declaring Variables =============
		
		//We store data in placeholders called variables. Here are two declarations of variables:
		  
		  String nameCompany = "Hyperion Development"; //The VARIABLE 'nameCompany' STORES the value "Hyperion Development". Notice the ; at the end of the statement.
		  int num = 123; //The VARIABLE 'num' STORES the value 123. Notice the ; at the end of the statement.
		  
		//Declaring variables follow the convention: [Data Type] [Variable Name] = [Value]; as seen above.
		  
		//============ Style =================
		/* A good habit when coding is to always name your variables something relevant (i.e. a name that applies to its value).
			 myName = "John"
			 firstNum = 1
			 
		   It is not required for the code to be 'correct', but if you don't use descriptive names for your variables, it will confuse not just you, but others that read your code.
		   Using descriptive variable names is known as a programming CONVENTION or a programming STYLE.
		   It's important to develop a good programming style early.		   
		   
		*/

		//============ Data Types =============

		/*You might be wondering why the words 'String' and 'int' precede the two variables we mentioned earlier on. These are known as DATA TYPES. There are 2 types of data:
				 1) Primitive data types: Integer, Double, Char and Boolean.
				 2) Complex data: String, arrays and objects.
				 
		When choosing a data type for a variable, one needs to decide the type of data that it will store. 

		*/
		
		
		//Integers store integer values (no decimal points):
		int twenty = 20; //The data type to declare an integer is 'int'. We will refer to integers data types as ints from now on.
		
		//Doubles store double values, or real numbered numbers ie numbers with decimal points:
		double half = 0.5;  //One half
		
		//Characters store single letters:
		char a = 'a';  //Note that chars are surrounded by SINGLE QUOTES, ie ' . Don't forget to close your quotes when declaring a char!
		
		//Strings store text, or characters that have been 'strung' up:
		String name = "John"; //Note that Strings are surrounded by DOUBLE QUOTES, ie ". Don't confuse this with single quotes for chars. 
		
		//============ Assigning Variables =============
		
		//Once a variable is declared, the program will remember its variable. 
		//Your program's code is executed from the top of the file to the bottom.
		//At this point, we've defined the variables 'twenty', 'half', 'a', 'name' and 'num'. 
		//At this point in the program, we can call these variables because they have already been DECLARED:
		
		//Let's make assign something to the variable name. Can you see above we declared name = "John"? Now let's change the value stored in name.
		name = "Mark";
		
		//Your program is able to do that, because it knows what the variable 'name' is (i.e. what data type it is).
		//If you asked your program to store a new value in a variable called 'nameTwo', your program would not compile because at this point because a variable called nameTwo hasn't been declared in your program yet.
		
		//Similar to this, if you tried to store a String in a variable that has already been defined as a  integer...
		
		//int half = "0.5";  WRONG! We can't store "0.5' in here because a String can't be stored in an int variable.
		
		//....You would get a compilation error.
		
		
		//============ Assigning and Declaring Variables =============
		
		//You can even declare and assign variables at the same time:
		
		int sum = 10 + 20;  //Store the result of adding 10 and 20 in the integer variable sum. Sum now stores the int value 30
		
		//You can even declare and assign variables USING other variables:
		
		int sumTwo = sum + 10; //What int value does sumTwo hold now? That's right: 40. 
		
		int sumThree = sumTwo + sum; //What about sumThree? Think carefully! 
		
		//We can assign an already declared variable a NEW value:
		
		sumThree = 0; //sumThree no longer stores what it used to, its value has been overwritten.
		
		
		//========================  **** SUMMARY: Variables **** ========================= 
		
		//1.) Know how to declare variables: [Data Type] [Descriptive Variable Name] = [Value appropriate to data type or operation that results correct value];
		
		//2.) Know that you can only use variables if they have been ALREADY BEEN DECLARED.
		
		//3.) Know that you can't have two variables with THE SAME NAME in a program. Example if I was to do:
		
		//int sumThree = 50; 
		
		//... I would get a compilation error. This is because sumThree has ALREADY been defined above.
		
		//I could however reassign sumThree by going sumThree = 50; without redeclaring it.
		
		
		//============ Working with integers =============
		
		//As seen above, we can add integer variables as expected. Here are some other operations:
		
		   int num6 = 2+2; // 2 plus 2
		   int num7 = 4-2;// 4 minus 2
		   int num8 = 2*2; // 2 multiplied by 2   NOTE the multiplication sign is not x
		   int num9 = 4/2; // 4 divided by 2      NOTE the division sign is / 

		//============ Output ================
		
		//Remember in the previous task the program we ran outputted something? Let's see how we can do that.

		// Most programs would be useless if they couldn't output any data. Java has a very simple built-in method of outputting data.

		System.out.println ("Hello World"); //Anything that is in the brackets is what will be output.
		
		//You'll have to memorise System.out.println . BE SURE THAT EVERYTIME YOU TYPE IT, YOU FOLLOW THE EXACT PUNCTUATION AND CAPITALISATION.
		//If you make the smallest mistake, such as system.out.println("hello"); or system.outprintln("Hello"); your code will not compile.

		//For now, let's only try print out STRINGS. 
		   
		//============ Working with Strings =============   
		   
		//Strings are a bit more complicated, can we add two strings?
		
		String firstName = "Alan";
		String lastName = "Turing";
	
		String fullName = firstName + lastName;
		
		//What does fullName store? Let's outprint it to the output terminal:
		
		System.out.println(fullName);
		
		// * Compile and run this program as shown in the previous task and take a look at what is output at the bottom of JGrasp. It should be after "Hello World" *
		// What problem do you see?
		
		//The Strings have been CONCATENATED together to form a new string stored in fullName with value "AlanTuring".
		
		//Alan needs a space between his first and last name. Let's fix that by reassigning fullName:
		
		fullName = firstName + " " + lastName; //We reassigned fullName, inserting the empty String " " inbetween his name.
      
		
		//Now insert a System.out.println(fullName); below this comment, compile and run the program again to see the new output:
		
		//Insert your code here:
      System.out.println(fullName);
		
		
		
		//End inserted code

		
		// You can also add lines breaks and tabbed spacing to your output.
		   
		   System.out.println ("A tab comes after this: \t" + "There is a tab before this text on the screen"); // The \t command will create a tab if its inside a String
		   System.out.println ("A new line comes after this: \n" + "There is a new line before this text on the screen"); // The \n command will create a new line if inside a String  
		   
		//To print out non-strings, add them to a string:
		
		   System.out.println("The number is " + 3); 
		   
		//You can't do System.out.println(3); , because 3 is not a String by itself. We'll talk more about this in the next task.


		//This is the end of the executable code for this Java program.
			
		} //Closing bracket of main class
		
	} //Closing bracket of example class
		

	//You've reached the end of the example code. Make sure you understand everything fully. 
	//If you don't, feel free to contact one of our tutors with any questions.
	
	//The compulsory exercise to finish this Task and move on to the next task is below. 



		/*========================================================= COMPULSORY TASK =======================================================

		  It's now time for you to make your own program. 
		  We've already created the structure of the program for you to help you out.
		  In JGrasp, go to File->Open and navigate to your Dropbox folder again. Inside this task folder you should find and open the 'task2' file.
		  
		  Read the contents of the task2 file in JGrasp. It will have space for you to finish the following exercise:
	
		  Using examples shown in this example program, write code in the place indiciated in the task2 file to do the following:
		   
			  Create four variables, using the appropriate data type (String, double, int or char) and have them store:
			   - Your first name
			   - Your age
			   - Your approximate height in centimeters (decimal)
			   - Your favourite whole number
			 
		  Output this data on separate lines with a tabbed spacing (eg: First name:      Joe)
		  You'll need to use 4 seperate System.out.println statements to do this, each adding your variable to a String to outprint them.
		  
		  Don't forget to compile and run your code to test the output. 
			  
		 If you need any help, be sure to let the teachers know by sending an email to help@hyperiondev.com or by leaving a message in your Dropbox.  
		 
		 If your code is correct, you'll get to move on to the next task. Good luck!

		===================================================================================================================================
		   
	  
	   ================================================== OPTIONAL TASK =================================================================
	  
	 	Add to your program above by changing your first name to your full name, with correct formatting. 
		Add 5 years to your age using the add operator.
		Divide your favourite number by 3. Outprint your number and briefly explain in a comment what was the expected result, if the result is wrong, and how this could be fixed.
	  
	  
	  
	  */
