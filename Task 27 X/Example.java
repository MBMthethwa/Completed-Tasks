// Welcome to the Exception Handling Task.

/* --- Opening this file --- 

	Please do not open this file in the wrong program such as Notepad or Notepad++.
	For our Java course, all files should be opened in the program JGRASP. 
	  
	** Double check that both JGrasp and Java are installed on your computer as per the instructions in the Welcome document **

	To do this, run JGRASP from your computer where it should be installed. Double click the JGrasp icon on your Desktop to run JGRASP.
	In the top left corner of JGRASP, click File->Open
	Navigate to this .java file inside your Dropbox folder on your computer (usually under C:/Users/YourUsername/Dropbox/YourDropboxFolderName/Task/example.java)
	Double click on example.java and it will open in JGRASP. 
	You may now continue reading the rest of this file.




   ************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
   ************************************


    ================== EXCEPTIONS ==================

	An Exception can be anything which interrupts the normal flow of the program. When an exception occurs program processing gets terminated and doesn’t continue further. In such cases we get a system generated error message. The good thing about exceptions is that they can be handled. We will cover the handling part later in this same tutorial.

	•When can an exception occur?
	Exception can occur at runtime (known as runtime exceptions) as well as at compile-time (known Compile-time exceptions).

	•Reasons for Exceptions
	There can be several reasons for an exception. For example, following situations can cause an exception – Opening a non-existing file, Network connection problem, Operands being manipulated are out of prescribed ranges, class file missing which was supposed to be loaded, and so on.
	
	
	============== ERROR VS EXCEPTION ==============
	
	•Errors indicate serious problems and abnormal conditions that most applications should not try to handle. Error defines problems that are not expected to be caught under normal circumstances by our program. For example memory error, hardware error, JVM error etc.
	
	•Exceptions are conditions within the code. A developer can handle such conditions and take necessary corrective actions. Few examples:
		•DivideByZeroException
		•NullPointerException
		•ArithmeticException
		•ArrayIndexOutOfBoundsException
		
		
	======= ADVANTAGES OF EXCEPTION HANDLING =======

	•Exception handling allows us to control the normal flow of the program by using exception handling in program.
	•It throws an exception whenever a calling method encounters an error providing that the calling method takes care of that error.
	•It also gives us the scope of organizing and differentiating between different error types using a separate block of codes. This is done with the help of try-catch blocks.	
	
	
	================ EXCEPTION TYPES ==============
	
	There are two types of exceptions:
	
	•Checked exceptions:
	All exceptions other than Runtime Exceptions are known as Checked exceptions as the compiler 'checks' them during compilation to see whether the programmer has handled them or not. If these exceptions are not handled/declared in the program, it will give compilation error.
	
	•Checked examples:
	ClassNotFoundException
	IllegalAccessException
	NoSuchFieldException
	EOFException
	
	•Unchecked exceptions
	Runtime Exceptions are also known as Unchecked Exceptions as the compiler does not check whether the programmer has handled them or not, but it’s the duty of the programmer to handle these exceptions and provide a safe exit.
	These exceptions need not be included in any method’s throws list because compiler does not check to see if a method handles or throws these exceptions.
	
	•Unchecked examples:
	ArithmeticException
	ArrayIndexOutOfBoundsException
	NullPointerException
	NegativeArraySizeException
	
	
	============== HANDLING EXCEPTIONS =============
	
	•try-catch:
	We use try-catch blocks for exception handling in our code - try is the start of the block and catch is at the end of try block to handle the exceptions. We can have multiple catch blocks with a try and try-catch block can be nested also. A catch block requires a parameter that should be of type Exception.
	
	•throws:
	We know that if any exception occurs, an exception object is getting created and then Java runtime starts processing to handle them. Sometime we might want to generate exception explicitly in our code, for example in a user authentication program we should throw an exception to client if the password is null. The throws keyword is used to throw exceptions to the runtime to handle it.
	
	•throws:
	When we are throwing any exception in a method and not handling it, then we need to use 'throws' keyword in method signature to let the caller program know the exceptions that might be thrown by the method. The caller method might handle these exceptions or propagate it to its caller method using the throws keyword. We can provide multiple exceptions in the throws clause and it can be used with main() method also.
	
	•finally:
	finally block is optional and can be used only with try-catch block. Since exception halts the process of execution, we might have some resources open that will not get closed, so we can use finally block. The finally block always gets executed, whether an exception occurred or not.
	

   ======================================== COMPULSORY TASK 1 ========================================
   
   •Create a new java file called ExceptionHandling.java
   
   •Create a class called ‘ExceptionHandling’
	
   •Within this class, create a main method.
	
   •Outside the main method, create a method called ‘printOneByOne’ which takes one String as a parameter. This method should iterate from 0 to 100 and print out the character of the String at these positions.
			
   •Handle any possible exceptions with a try-catch statement. If an exception occurs, print out:
   ‘Caught the exception!’
   
   •Within the main method, create an instance of the class and call the ‘printOneByOne’ method with
   the parameter ‘EXCEPTION’.
	
   •Compile, save and run your file.
					   
   ===================================================================================================
*/