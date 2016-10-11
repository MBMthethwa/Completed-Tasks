//Welcome to the Control Structures and Input task 

/* --- Opening this file --- 

Please do not open this file in the wrong program such as Notepad or Notepad++.
For our Java course, all files should be opened in the program JGRASP. 
 

*/


/* ************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM
   ************************************
*/

import javax.swing.*; //This new line shall be explained towards this end of this task. 
	
public class Example // Example class
{

	
	public static void main (String[] args) // Main method
	{
	
		/*	You should know the basic data types, assigning and declaring variables, and how to output information. 
			You also should know how to write, compile and run Java programs.
			You should now also be comfortable with dealing with syntax, compilation and logical errors. 
		
		==============================================================================================================
		**
		** 	The compulsory programs for this exercise will be given as you read the example code. 
		**	Compulsory program instructions will be given in boxes similar to this one.
		** 	Please complete ALL programs as a lot of information is presented in this task and practice is vital.
		**
		==============================================================================================================

		 ====== Control statements ========
		Our programs don't seem very powerful if all we can do is define and output variables.
		Let's talk about CONTROL STATEMENTS.
		These are statements that add LOGIC to your programs. 
		One of the most important of these statements is the if statement:
		
		*/
		
		int num = 30;
		
		if (num > 10)
		{
			System.out.println("The value stored in the variable num is bigger than 10");
		}
		
		/* 	Can you understand what the above code does? 
			It simply checks what int value is stored in the variable num. If the value is bigger than 10, it prints out a message.
			The > sign in mathematics means bigger than. 
			In your head when reading this, you should be able to under that it means 'If num bigger than 10, do what's in the braces'
			
			If the value is not bigger than 10, the code inside the brackets under the if statement DOES NOT EXECUTE.
			This is because the if CONDITION is not satisfied (i.e. is not true), so the code in braces is ignored. 
			
			Let's look at another if statement:
		
		*/
		
		int numTwo = 15;
		
		if (numTwo > 10) //The CONDITION evaluates to true or false - the code in the immediate braces executes if it is true.
		{
			System.out.println("The value stored in variable numTwo is bigger than 10");
		}
		else
		{
			System.out.println("The value stored in variable numTwo is not bigger than 10");
		}
		
			/* 	This if statement checks a new variable, numTwo.
				If the value stored in numTwo (15 at the moment) is bigger than 10, then the first message is displayed.
				If in any other case the value is not bigger than 10 (so it could be 0, 8, -2), then the second message is displayed.
				Both messages will never be displayed. It is logically impossible because a number cannot be both bigger than 10 and not bigger than 10.
				Thinking logically is a critical part of programming. 
				
				If statements do not NEED to have an else statement. The above if known as an if-else statement. 
				You can just have an if statement by itself, like in the first example.

		
			*/
		
		/* ====== The syntax of if statements ======== 
		
		Remember how tricky syntax could be?
		Unfortunately if statements introduce many places where you can mix up a bracket, or insert a ; in the wrong place.
		Look carefully at the if statement below. 
		
		*/
		
		double doubleNum = 11.5;
		
		if (doubleNum < 10) //1.
		{//2.
		
			System.out.println("You'll only see this output if doubleNum is less than 10"); //3.
			System.out.println("DoubleNum is less than 10!");
			
		} //4.
		else //5
		{//6
		
			System.out.println("DoubleNum is not less than 10."); //7.
			
		}//8
		
		/* 
			Note the commented numbers in the if statement above. 
			Let's talk about the Syntax at each of these numbers:
			
			1.) Notice how the CONDITION for the if statement is stored in PARENTHESES: (doubleNum < 15)
				Notice also how there is no ; at the end of this line!
				
				This is because just the line 'if (doubleNum < 10)' is not a statement by itself.
				It's line starting a sentence but not finishing it. If that happens - so what? 
				That's why there isn't a ; at the end of it. It's not a statement by itself but rather the START of a longer statement.
				
			2.) Notice how directly after this line there is an opening BRACE: { 		
				The { brace signifies the start of the rest of the statement.
				Notice how it has a MATCHING CLOSING BRACE, }, at 4. 
				
				To type 'curly brackets', you need to hold down SHIFT and press the 'curly bracket' symbol near the left side of your keyboard.
				
				Don't confuse the ROUND brackets, ( ) , of 1. with the CURLY brackets of 2 and 4 { }
				
			3.) This is just a normal statement in Java. Note the ; at the end of the line. 
				Note carefully that it is within the two curly brackets 2 and 4. 
				You can type as many statements as you want in here! Just line them up and they'll execute in order if the condition above is satisfied.
				
			4.) The closing bracket that matches 2. DON'T FORGET THIS BRACKET. ALL OPEN BRACKETS MUST HAVE A CLOSING ONE IN JAVA.
				If you do not close your brackets, your code will not compile.
				
			5. 6. 7.) 	Notice the structure of the else statement.
						Note how it comes directly after 4.) and under the if statement.
						Notice how the else statement has no CONDITION. It's condition is basically when the if statement is false!
						Notice how otherwise the structure is the same as the if statement.
						
						
						
			====================== COMPULSORY TASK 1 ======================
			==	
			==	Now that you understand the syntax of an if statement, it's time to write one.
			==	Using the method presented in previous tasks, create a new Java file in this folder called firstIf.java
			== 	Write the outer class (remembering to name it correctly) and the main class shown before.
			==	Now inside the main class, define a new variable called num and assign any number to it.
			==	Below this declaration, write an if else statement
			==  The IF CONDITION should be if the number is bigger than 10. If this is true, print out "This number is bigger than 10"
			==	else print out that the number is not bigger than 10.
			==  Compile, save and run your file.
			==  
			===============================================================
			
		
		*/
		
		
		/* ====== More if statement examples ======== 
		
			Now that you fully understand the nitty gritty of the syntax, here are some more examples of if statements.
			Note the different logical operators in the examples below!
			You can check many different things with if statements - everything in fact!
		
		*/
		
		int numThree = 42;
		
		if (numThree == 20) //** NB: What's the difference between = and == ? we use = to asign a value to a variable, and we use == to copmare two variables or values 
		{
			System.out.println("numThree is equal to 20. I'm certain of it.");
		}
		
		/*
			In the example above, why don't we just say if (numThree = 20) ?
			Why do we use == instead?
			
			A very important thing to remember, is that when checking equality in Java
			we must use the == sign, because = is used to ASSIGN new values to variables, == is the command to CHECK IF THEY ARE EQUAL TO SOMETHING.
			ie:
			
			numThree = 20; 
			
			Means assign the value 20 to the variable numThree.
			
			numThree == 20;
			
			Means is the value stored in variable numThree equal to 20? This question returns a TRUE or FALSE answer.
			
			
		*/
		
		
		String name = "John";
		
		if (name.equalsIgnoreCase("Tom"))   //We can't compare strings using ==
		{
			System.out.println("Greetings, Tom");
			
		}
		else
		{
			System.out.println("I don't know you. Hello " + name); 
		
		}
		
		/*
			In the example above, we don't compare Strings using ==
			This is because Strings are special data types.
			For now, just remember we use variableName.equalsIgnoreCase("String to compare to"))
			to check if two String variables store the same value.
			Here's another example:			
			
		*/
		
		
		String nameOne = "John";
		String nameTwo = "Mark";
		
		if (nameOne.equalsIgnoreCase(nameTwo))   //We're comparing the values of two String variables directly here.
		{
			System.out.println("nameOne and nameTwo store the same values");
			
		}
		else
		{
			System.out.println("nameOne and nameTwo store different values"); 
		
		}
		
		/*	
			For now, let's try only compare variables of the same DATA TYPE in if statements.
			ie: compare doubles with doubles, strings with strings etc.
			
			===================== COMPULSORY TASK 2 =======================
			==	
			==	Using the method presented in previous tasks, create a new Java file in this folder called firstStringIf.java
			== 	Write the outer class (remembering to name it correctly) and the main class shown before.
			==	Now inside the main class, define a new variable called name and assign any String to it. 
			==	Below this declaration, write an if else statement
			==  The IF CONDITION should be if the String is equal to "Tim". If this is true, print out "Welcome Tim"
			==	else print out that the user is not recognised.
			==  Compile, save and run your file.
			==  
			===============================================================
		
		
			===================== COMPULSORY TASK 3 =======================
			==	
			==	Using the method presented in previous tasks, create a new Java file in this folder called firstDoubleStringIf.java
			== 	Write the outer class (remembering to name it correctly) and the main class shown before.
			==	Now inside the main class, define two new String variables : nameOne and nameTwo. Assign any name to both.
			==	Below this declaration, write an if else statement
			==  The IF CONDITION should be if the Strings are equal, print out "Names are the same"
			==	else print out that the names are not the same.
			==  Compile, save and run your file.
			==  
			===============================================================			
		
		*/
		
		/* ====== The if-elseif statement ======== 
	
			What if you're writing a program for your grandmother. 
			The program asks for her password, her password is 123.
			But she often forgets and sometimes enters 1234.
			To save her embarrassment, you want to write her a program.
			Your program will show a welcome message if she enters 123, OR 1234, but not otherwise.
			
			Here's an example of a statement to do that:
		
		*/ 
		
		int password = 1234; //Imagine this is what your grandmother entered in this run of the program.
		
		if (password == 123)
		{
			System.out.println("Password correct! Welcome Grandmother.");
			
		}
		else if (password == 1234)
		{
			System.out.println("Password correct! Welcome Grandmother.");
		}
		else
		{
			System.out.println("Password incorrect.");
		}
		
		/* 
			IF the first condition isn't satisfied (the value of password is NOT 123)
			THEN CHECK THE SECOND CONDITION and IF THIS ISN'T SATISFIED (the value of the pass is ALSO NOT 1234)
			THEN print out Password Incorrect.
			
			Basically, and else if statement allows you to do more 'checks'.
			Remember that the conditions of your if statements are checked in the order they are written, from top to bottom.
			i.e. check if it is 123 first, then check if its 1234 ONLY IF THE FIRST CHECK FAILED.
			
			As with all if statements, at most only ONE of the above brackets of code will execute. The rest will be skipped.
			
			===================== COMPULSORY TASK 4 ======================
			==	
			==	Using the method presented in previous tasks, create a new Java file in this folder called ifElse.java
			== 	Write the outer class (remembering to name it correctly) and the main class shown before.
			==	Now write a program that defines a String stored in a variable called name.
			==	If the name is equal to Thabo, print out "Hello Thabo", otherwise if the name is equal to "Tony", output a greeting to Tony.
			==	Else print out user not recognised.
			==	Compile, save and run your file.
			==  
			==============================================================
		
		*/ 
		
		/* ====== Other comparison operators ======== 
	
			Let's look at some examples:
			
		*/
		
		double numd = 100;
		 
		if ((numd/2)==50) //You can have an operation inside the condition
		{
			System.out.println("Numd must store the value 100, since 50 times 2 is equal to 100");
			
		}
		else if (numd > 100)	//Greater than operator
		{
			//You can have nothing happen inside an if statement, but this is bad programming style.
		}
		else if (numd < 100) //Less than operator
		{
		
		}
		else if (numd != 25) //NOT EQUAL TO OPERATOR
		{
			System.out.println("I am certain numd does not store the value 25");
		}
		else if ( (numd%2)== 0) //MODULO OPERATOR. 
		{
			System.out.println("The value stored in numd is even because the remainder when it is divided by 2 is 0.");
		}
		
		
		/*	
			
		
			===================== COMPULSORY TASK 5 ======================
			==	
			==	Using the method presented in previous tasks, create a new Java file in this folder called operators.java
			== 	Write the outer class (remembering to name it correctly) and the main class shown before.
			==	Duplicate the if - elseif - elseif - elseif - elseif statement above in your program.
			==	Change the value of numd to 120. 
			== 	Do not copy and paste code unless you are certain you understand the SYNTAX of all these different operators.
			==	Compile, save and run your file. Ensure that it works.   
			
			==	Notice that when the value of numd is 120, multiple of the conditions in the if-else structure are correct, but only one output is seen.
			==	Why is this? Look at the order of conditions and write a comment in your program explaining why this is.
			==	Remember to use the // letters in front of a line to make it a comment.
			
			==	Now change the value of numd to 30 and note the output. Write a comment explaining the output.
			==
			==============================================================
		
		
		
		==================================================== CHECKPOINT ====================================================
		
		If, elseif and else statements are very important. Please ensure that you have completed all 5 compulsory exercises above before continuing.
		
		If you feel you are struggling to understand any concepts presented in this task, or the previous tasks please do the following:
		
		Navigate to this task folder on your computer's hard drive located inside your Dropbox folder.
		Right click in the task folder and click -> New -> Text file.
		Open the file you created and write a list of the concepts you do not understand. Be as detailed as possible.
		Save the file. Our tutors will review it and give you additional tasks, explanations and lessons to assist you in your understand.
		
		DO NOT CONTINUE WITH FURTHER TASKS IF YOU HAVE ANY ISSUES UNDERSTANDING ANY OF THE PRESENTED ASPECTS OF JAVA.
		
		
		=====================================================================================================================
		
		
		====== Getting input ======== 
	
		You may have noticed that we can print out information, but you haven't been shown how to get input from a user. 
		There are many methods to do this. We will show you a method that is easier for the user, but not necessarily the programmer.
		
		When programming Java, it is important to understand that there are huge LIBRARIES/PACKAGES that come standard with Java.
		Just like when you buy a calculator, there are hundreds of built in functions. If you're only using your calculator to do simple sums, you're missing out on the other functions that it has to offer.
		
		Java is similar to this. There are libraries that other programmers have made, that have built in functions to do common tasks.
		We could write a long and complicated program that provides a popup box that a user can enter data into, that is then stored in the program.
		But some programmer has already done this for us. All we need to do is IMPORT his/her library and call the function that does this.
		
		For this specific task, we will use the Java SWING library. This is a library or package full of graphical user interface (GUI) functions.
		To use any functions from this library, we must import it. You can import libraries with the following command:
		
		import javax.swing.*;  
		
		This command is known as an IMPORT statement.
		All IMPORT STATEMENTS must come BEFORE the main method of your program, ie:
		
		import javax.swing.*;
		
		public class example
		{
			
			
			public static void main(String[] args)
			{
			
				System.out.println("My program with an import!");
			
			
			}
			
		}
		
		This particular command imports the Java SWING library of functions. All you have to remember is to include this statement 
		in the place shown about in any programs where you want to get input. You may notice in this example program 
		
		Now that this command is in the right place, you can call one of the functions from the library ANYWHERE in your program as follows:
	
		*/ 
		
		String response = JOptionPane.showInputDialog("Enter your name");
		
		/*
			What does this command do?
			
			When your program executes this line of code, a popup box is shown to the user. 
			The popup box displays the message entered as a String in the brackets.
			Whatever the user enters is stored as a STRING variable. Here we have stored the response in the String variable response.
			
			The statements below this command will NOT execute until the user has entered something into the box and pressed continue.
			
			For now, you'll have to memorise the JOptionPane.showInputDialog statement, or copy and paste it.
			Note the round brackets around the String message, the semicolon, and especially the capitals in JOptionPane.showInputDialog (JO, P, I, D)
			
			
			Complete the final exercises for this task below. 
			
			
			===================== COMPULSORY TASK 6 ======================
			==	
			==	Using the method presented in previous tasks, create a new Java file in this folder called input.java
			== 	Write the outer class (remembering to name it correctly) and the main class shown before.
			==	Insert the import statement shown above in the correct place in your program.
			==	Now in your main class, write the JOptionPane statement and prompt the user with the message "What is your name?"
			==	Store the user input in a String variable called input. 
			==	Now print out the contents of the variable input.
			==	Compile, save and run your file multiple times with different inputs. Note what happens and how it works.
			==
			==============================================================

			===================== COMPULSORY TASK 7 ======================
			==	
			==	Using the method presented in previous tasks, create a new Java file in this folder called finalInput.java
			== 	Write the outer class (remembering to name it correctly) and the main class shown before.
			==	Copy and paste your code from Exercise 6 above.
			==  Now write an if-elseif-else statement.
			==  If the user inputs your name, print out a greeting message.
			==	Else if the user inputs the name "Ben", print out "Greetings Ben"
			==	Else print out "Greetings Stranger"
			== 	Run your program multiple times with different inputs. 
			==	Can you see how we've made a dynamic program that gives different output depending on input?
			== 	You're well on you way to making more useful programs. 
			==	
			==============================================================
		
		*/ 
	
	}

}


	/*  =========================== OPTIONAL TASK ===========================
	
		Create a new program called castInput.java.
		Write the outer class (remember to name it correctly) and the main class as shown before.
		Ask a user to input their age.
		Divide their age by 2 and output it.
		=====================================================================
	 */