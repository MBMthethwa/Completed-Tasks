/*
  ========== WELCOME TO THE NEXT TASK! ==========

    Congratulations for getting this far! In this task you'll learn more about For Loops in C#.

	In the previous task we saw how to make a program that makes decisions along the way using 'if' and 'switch' statements.
	This added a lot of functionality to our programs because at certain places we could change what the program
	would do depending on the state of the variables.

	But what if we wanted to make the program perform a certain task several times - without having to write the same
	piece of code over and over again? We can use for loops for this.

	A loop is a sequence of instructions that is continually repeated until a certain condition is reached. Loops are important
    to programmers since they allow us to reduce the number of lines in a code, making our code more readable and efficient.
    Understanding this is essential in your quest of becoming a good C# programmer.

    Let's begin!
	
    ************* HELP *****************
    REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
    ************************************
 
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Control_II
{
    class Program
    {
        static void Main(string[] args)
        {
            /*
                ========== THE FOR LOOP ==========

                The code below is the general structure of a basic for loop.

                for ( initialisation; condition; increment )
                {
                    statement(s);
                }

                INITIALISATION: Create a starting value for your loop

                The initialisation of variables is similar to that in Task 2, for example: int i = 0;

                CONDITIONS: State the end condition for your loop (what will make it stop)

                The conditions used here are the same as the ones used in Task 3
                I.e: ==; <; >; <=; =<; !=

                ***Revisit the previous tasks if you need to refresh your memory***

                INCREMENT: How the initial value will change with each loop (added to or subtracted from)

                a++  increments a by one (its the same as a = a + 1)
                a--  decrements a by one (its the same as a = a - 1)
                a+=5 increments a by 5 (its the same as a = a + 5)
                a-=20 decrements a by 20 (its the same as a = a - 20)

                Below are a few sample loops with different initial conditions.
                Note that the conditions are between brackets () and that there is a semi colon after the initialisation and condition
                sections.

                Run the program after each section to see what the output is.
                Remember that you can scroll up and down on the side panel of the running program to see parts that are not in view. */

            /*
                ========== PART 1 ==========

                This section has an example of a generic for loop */

            Console.WriteLine("\n========== FIRST FOR LOOP ==========");

            for (int n = 0; n < 10; n++)
                // Here we are initialising an integer variable and assigning a value.
                // The statements in the loop are only executed when "n" is less than 10.
                // The loop will INCREMENT the variable "n" each time that the loop passes the beginning until it is greater than 10.
            {   // Braces are also used here to enclose the contents of the for loop.
                Console.WriteLine("n = " + n);// This prints out the value of n each time that the value is less than 10.
            }

            Console.WriteLine("\n========== END OF THE FIRST FOR LOOP ==========");
            /*
                ========== PART 2 ========== */

            Console.WriteLine("\n========== SECOND FOR LOOP ==========");

            for (int n = 10; n >= 0; n--) // Here we are setting the initial variable to 10 and then using the loop to count down to 0.
            {
                Console.WriteLine("n : " + n); // This prints out the value of n each time that the value is greater than or equal to 0.
            }

            Console.WriteLine("\n========== END OF THE SECOND FOR LOOP ==========");

            /*
                ========== PART 3 ========== */

            Console.WriteLine("\n========== THIRD FOR LOOP ==========");

            for (int n = 0; n <= 10; n += 2) // Here we are setting the initial variable to 0 and incrementing by 2 each loop.
            {
                Console.WriteLine("n : " + n); // This prints out the value for n each time that the value is less that or equal to 10.
            }
            Console.WriteLine("\n========== END OF THE THIRD FOR LOOP ==========");

            /*
                ========== PART 4 ==========

                This example will demonstrate how you can break out of a for loop. */

            Console.WriteLine("\n========== FOURTH FOR LOOP ==========");

            for (int n = 0; n <= 10; n++)// These conditions are the same as those of the first for loop.
            {
                // However, we now add an if statement that will break out of the for loop before it reaches completion.
                if (n == 5)
                {
                    Console.WriteLine("n : " + n + " Breaking out of for loop");
                    break; // This will exit the for loop prematurely.
                }

                else
                {
                    Console.WriteLine("n : " + n);// If the condition isn't met, this will execute.
                }
            }

            /*
                ========== PART 5 ==========

               This example will demonstrate how you can continue an iteration in a for loop. */

            Console.WriteLine("\n========== FIFTH FOR LOOP ==========");

            for (int n = 0; n <= 10; n++)// These conditions are the same as the first for loop
            {
                // However, we now add an if statement that will continue the iteration skipping the all other code if the number is even
                if (n % 2 == 0)
                {
                    continue;
                    Console.WriteLine("n : " + n); // This code will not execute as continue jumps back to the top of the loop.
                }
                else
                {
                    Console.WriteLine("n : " + n);
                }
            }

            Console.WriteLine("\n========== END OF FIFTH FOR LOOP ==========");
            Console.ReadLine();
        }
        /*
             Here is the code to generate a number in the range of 0 to 50 exclusive (0-49)
 
             Random r = new Random();
                 r.Next(50);
 
        */
		
		/*
		######### COMPULSORY TASK 1 #########
		Follow these steps:

		NOTE: Make a copy of this folder on your computer. Submit the required files when you are done.

		Before you go any further, Open the Example Programs folder in your Task folder. Have a look at the two example programs written for you, run them by hitting F5 when opened. Look at the output of each program and compare it to the code written within the Program.cs file in the Project of Task 4 - the comments are there to help you.
		 
		Create a new Project called fizzBuzz in your Task folder:
		 
		Your program must print all the numbers from 1 to 100 in each line:
		If the number is a multiple of 3 it must print "Fizz" in that line instead of the number;
		If the number is a multiple of 5 it must print "Buzz" in that line instead of the number;
		If the number is a multiple of both 3 and 5 it must print "FizzBuzz" in that line instead of the number.

		
		######### COMPULSORY TASK 2 ##########
		Follow these steps:

		Create a new Project called game in your Task folder:
		Write a program that gives a user 10 chances to guess a number in the range 0 and 50.
		If they guess the number they win the game and it ends; otherwise they lose after 10 incorrect guesses.
		After each guess an appropriate message is to be shown:
		"Guess higher" if the number the user guessed is lower than the random number,
		"Guess lower" if the number the user guessed is higher than the random number,
		"Correct guess you win" if the number the user guessed is equal to the random number
		"You lose" if the user fails to guess the correct number after 10 guesses.
		Use the code below to generate the random number for the game.
			 Random r = new Random();
			 int catchTheNumberThatIsReturned = r.Next(50);

		*/
    }
}
