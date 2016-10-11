// Welcome to the Control Structures - Arrays Task.

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

public class Example 
{
	
	public static void main(String[] args)
	{
		/*  In the previous tasks you learned how to work with variables
			and could take a glimpse of how useful they are. 
			
			You now know how to make arithmetic operations in java: just store
			the numbers you want into variables and perform the operations.

			But what if you work in a big company and need to deal with thousands or
			even millions of numbers and perform individual operations with those numbers. 
			You could write a million variables but that would just make you go insane,
			you would need to initialize them all, know which one goes where, etc, etc...
			
			Luckily for us Java has something that can help us with this insane mission: Arrays.
			
			An array is a set of values that have something in common. The concept is not just applied
			in programming but in our every day life, for example, in most schools the classrooms are
			numbered, that way instead of giving a particular name to each classroom and have to remember
			all the different names of the different classrooms we just have to follow the numbering system, 
			even though each classroom is unique. Arrays work in a similar way. The best way to understand
			this is seeing it in action
		
			================= ARRAY DECLARATION =======================
		
			Arrays are a set of variables but an array itself is a variable. A variable that contains 
			multiple variables. An array can be of any type. To declare an array you have to specify
			what type do you want the array to be and its name, just like we did with "normal" variables.  */
		
		int[] numbers; // Can also be replaced by int numbers[]
		
		/*	int:	
				This is the type we want our array to be of, that means this array will only store variables
				of type int; 
				
			numbers:
				This is the name of the array. Programmers usually name arrays in plural, whenever you can do it, it
				will help you and others knowing this variable is an array.
			
			[]:
				Those are the first brackets. They are here to specify that we are creating an array, in every array
				declaration we have to use square brackets. These brackets can be after the type of the array 
				or after its name. This is really useful when we want to create more than one array or more than one variable
				of the same type.
				
			Examples where the place of [] is helpful: */
		
		int[] as, bs; // Here we declared two arrays of type int. One of them is named as, the other one is named bs. 
		
		int c, ds[]; // Were we declared a variable of type int named c and an array of type int named ds.
		
		/* Declaring multiple variables in the same line is helpful to save some space, but is not a good practice. 
		   It is good practice to declare each variable in its own line, that way you can keep track of what type the
		   variable is. 
		   
		   ================= ARRAY INITIALIZATION =======================
		
		   So far we've seen how to declare arrays, but how can we initialize them?
		   Just like we've seen with single variables, arrays cannot be used until they're initialized, trying to 
		   do this will lead to compilation errors.
		   There are multiple ways we can assign values to an array. Everything written in each assignment
		   is of utmost importance and nothing should be removed and/or added. */
		
		
		numbers = new int[10]; 
		
		/* new:
				This word is used to specify that we are creating a new object that is not a built in type like int or double.
				It might seem complicated right now, but it's actually very simple and this word will be further explained in 
				later tasks. For now keep in mind that we have to use this word to initialize arrays. 
				
		  int[10]:
				Here we specify the size of the array. It must be written exactly like this, the type of the array 
			    (same as the one specified in its declaration) followed by its size. In this case our array can store 10 values.
				We can specify whatever number we want in here, as long as it is a NOT NEGATIVE INTEGER NUMBER. You cannot 
				create an array with size -1 or 2.5. But you can create arrays with size 0, 15 or 1000000, its up to your needs.
				
		  In this type of assignment all the elements of the array will have the value 0 if the array is of type int.
		  The contents of this array after this initialization will be: 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
		  */
		
		numbers = new int[]{1, 2, 4}; 
		
		/* Here we specified all the values of the array. The size will be automatically set to the number of elements we passed,
		   in this case, 3.
		   After being initialized like the the contents of the array numbers will be: 1, 2, 4 */
		
		
		String[] names = {"Alice", "Bob", "Cecil"};
      //0609520739
		
		/* In this statement we declared and initialized the array names.
		   In this case we only need one set of brackets because we are declaring and initialising this array int the same 
		   statement.
		   
		   String[] names = {"Alice", "Bob", "Cecil"}; CORRECT
	
		   String[] words;
		   
		   words = {"Alice", "Bob", "Cecil"}; INCORRECT - This type of initialization is only possible when the array is also being declared
		   
		   The correct would be:
		   
		   words = new String[]{"Alice", "Bob", "Cecil"}; */
		
		double[] realNumbers = new double[26]; 
		
		/* The most common way to declare and initialize an array is this one.
		   This array has 26 double values and they're all 0.0 - remember this is an array of type double */
		   
		 
		int numberOfBuckets = 24;
		
		int[] buckets = new int[numberOfBuckets];
		//	An array's size is an integer value, so passing a variable as the size of the array would be correct.
		
		/*  ================= ARRAY ACCESSING =======================
			
			Now let's see how to work with the values inside the array. If the values could not be changed or accessed, arrays wouldn't be of much use. */
		
		System.out.println("================= ARRAY ACCESSING =======================");
		
		numbers = new int[5]; 
		
		/* Let's work with the variable numbers we created before. This reinitialization was done so we wouldn't have to depend so much
		   on previous initializations. 
		  
		   First of all, one useful operation is to know the size of the array we're working with. Even though we can clearly see 
		   the size of our array here this will not always be possible. Further along this task you will see how useful it is 
		   to get the size of the array. Referring to the size is the same as referring to the number of elements in the array or its length.
		   
		   Length is the term Java uses to refer to the size of an array. */
		
		System.out.println("The length of the array numbers is " + numbers.length);
		
		/*	numbers.length is a variable that stores a value of type int specifying the length of the array numbers.
			This holds for every array regardless of the type. To get an array's length we must write the name of the 
			array followed by a dot followed by the word length:
				
				array_name.length -> gives us the size of the array where array_name is the name of our array.		*/
		
		System.out.println("The first number in numbers is " + numbers[0]);
		
		/* To access a value in a certain position inside an array we have to write its name followed by the position we want
		   to access inside []. The same goes for changing a value at a certain position. Just remember, the type we define
		   our array to be is the same type all of the variables inside it will be.

		   In this case our array is still with default values in all positions and, since 0 is the default value for int, all
		   values inside the array will be 0.
		   
		   In programming the array position is very often referred to as index.
		   */
		   
		numbers[0] = 14; // Changing the value at position 0
		
		System.out.println("The first number in numbers now is " + numbers[0]);
		
		numbers[numbers.length-1] = 45; // Here we are changing the value of the last element in the array. 
		
		int lastNumber = numbers[numbers.length-1]; /* Copying the value at the last position to a variable, remember:
		an array is just a set of variables - whatever you can do with single variables you can do with variables inside the array,
		all you have to do is specify the index.
		
		Since the array starts from 0, the last position is the size of the array minus 1 as mentioned before.
		*/
		
		System.out.println();
		
		System.out.println("Some info about the array numbers: ");
		System.out.println("- It has " + numbers.length + " elements ");
		System.out.println("- The number in the first position or index 0 is " + numbers[0]);
		System.out.println("- The number in the second position or index 1 is " + numbers[1]);
		System.out.println("- The number in the last position is " + lastNumber); // Remember we store the number in the last position into this variable
		System.out.println("- The last position or index is " + (numbers.length-1));
		
		// We can also print all the information inside an array, all we have to do is write a for loop. There are 2 ways to do this:
		
		int[] powersOf2 = {1, 2, 4, 8, 16, 32, 64};
		
		System.out.println();
		
		System.out.println("This array has " + powersOf2.length + " values ");
		
		System.out.println("Printing the powers of 2:");
		
		for(int i=0; i<powersOf2.length; i++) // index starting from 0, while index is smaller than the size of the array, increment index
		{
			System.out.println("The value at index " + i + " is " + powersOf2[i]);
			powersOf2[i] = powersOf2[i]*10; // Here we are multiplying the number at the current position by 10.
		}
		
		System.out.println();
		System.out.println("Printing the powers of 2 multiplied by 10:");
		 
		 /* This is a special for loop for arrays, the type of the first variable must be of the same type as the array. The name of that variable can be whatever we want as always. After that we add colons and then the name of the array. What this loop will do is copy each element of the array powersOf2 into n in each iteration. */
		for(int n: powersOf2)
		{
			System.out.println("The current number is " + n);
		}
		
		/*	============= THINGS TO NEVER FORGET ABOUT ARRAYS ================

			1. Once initialized we cannot change the size of an array. To change its size we would have to reinitialize it
			   but that would mean setting all elements of an array to their default values. This reinitialization is actually the creation of a new array so even though the array has the same name it will be different from the one previously created.
			   Once again, an array has a fixed size - it cannot be changed.
			
			2. An array MUST hold values that are compatible with it. You cannot create an int array and then store double values in it.
			   
			3. The first position of every array is 0, the last one is the size of the array minus 1. That means if you have an array with
			   8 elements, its first position will be 0 and its last one will be 7. This is valid for every single array regardless of the type and the number of elements in it.
		
			4. An array's size must be a NON NEGATIVE INTEGER NUMBER.
			
			5. If only the size is specified in the initialization of an array all its values will be the type's defaults.
			   Here is a table with the variable types we used so far and the respective default values:
			   
			   ###################################
			   # TYPES			# DEFAULT VALUES #
			   ###################################
			   # int			# 0		 		 #
			   # double     	# 0.0		     #
			   # boolean		# false		     #
			   # String 		# nulll	 	     #
			   ###################################
			
			With enough practice these things will be burned in your memory. Just remember that every value inside an array is a single variable, all we have to do is specify the position.
		
		
		   ================ COMPULSORY TASK 1 ===================
		
		   N factorial is a multiplication of all integer numbers starting from 1 to N.
		   Factorial of 0 and 1 is 1. 
		   Factorial of 4 is 24. (4 * 3 * 2 * 1)
		 
		   1. Create a new file called Factorial.java with its main method.
		   
		   2. Create an array called factorials with space to store 13 integer numbers.
		   
		   3. For each index in the factorials array calculate its factorial and store it.
		   
		   4. Print out all calculated factorials.
		  
		   Note: Use Java to calculate the factorials.
		   
		   ================ COMPULSORY TASK 2 ====================
		   
		   1. Create a new file called Rebel.java
		   
		   2. Create two arrays: one of them must store integer numbers and the other one must store words. Each of them must be able to store 5 values
		   
		   3. Fill the first array with numbers from 1 to 5 and the second one with numbers from 6 to 10
		   
		   Note: The words array should contain the value in the form of a string and not the actual word i.e -> words[1] = "1"
		   
		   4. Swap the numbers in the first array with the ones in the second one (swap numbers with the same index).
		   
		   5. Multiply all the numbers in the first array by 4.
		   
		   6. Multiply all the numbers in the second array by 3.
		   
		   7. Print out the contents of both arrays.
		   
		   8. Swap all the numbers in the first array with the ones in the second one but this time only swap the numbers at even positions.
		   
		   9. For every number from 1 to 40 print out if it is in the array that stores numbers, the one that stores words or none of them.
		   
		   10. For every number in the numbers array:
			  - Print it out;
			  - Print out the positions of the divisors it has in numbers array.
			  - Print out the positions of the divisors it has in words array.
			
		   11. Do 10 for words array.
		*/
	}
	
}