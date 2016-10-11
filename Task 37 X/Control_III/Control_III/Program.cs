/*========== WELCOME TO THIS TASK! ==========

    You are well on your way to becoming a competent C# programmer!

    In this Task we will be covering the 'While' and 'Do While' loops.
    These loops are similar to the for loop but they have a different syntax as you will see below.

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

namespace Control_III
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("==========  THE WHILE LOOP  ==========\n");

            int n = 0;

            while (n <= 10)
            {
                Console.Write(n + " ");
                n++; // Increment the variable by one on each loop
            }

            Console.WriteLine("\nFrom 0 to 10, increment 1.");

            /*
                ==========  THE WHILE LOOP  ==========

                The loop above is known as the 'while loop' which stands for the fact that the program must execute code WHILE the condition is true.
                The basic syntax for a while loop is:

                while (expression)
                {
                    statement
                }

                The brackets and braces are part of the syntax- DO NOT leave them out!
                Run the program at this point and observe what the output is; notice how the output is similar to what was covered in the
                previous task.

                The while loop, and later the do while loop, are basically the same way of doing the exact same task.
                Which one you use will be based on personal preference and what may work best within your program. */

            int m = 10;

            while (m >= 0)
            {
                Console.Write(m + " ");
                m--;
            }

            Console.WriteLine("\nFrom 10 to 0, decrement 1.");

            /*
                The above is the converse for the while loop as you can also go backwards if whatever task you're doing requires that you do
                that.
                You can also increments/decrement in integral multiples of one like what was done in the previous task with the for loop.
                Try this out for yourself to see how much you remember from the previous Task! */

            /*
                ==========  THE DO WHILE LOOP  ==========

                The do while loop follows this basic syntax:

                do
                {
                    statement
                } while (condition); // Note the semi colon here.

                This loop is different to the while loop because it does whatever you need in the statement part done at least once.
                The while check is at the end so only after one loop can it terminate or carry on based on what happened during the first loop.

                Look at the sample code below: */

            Console.WriteLine("\n\n==========  THE DO WHILE LOOP  ==========\n");

            int q = 0;

            do
            {
                Console.Write(q + " ");
                q++;
            } while (q <= 10);

            Console.WriteLine("\nFrom 0 to 10, increment 1.\n");

            /*
                The above output is exactly the same output of the first loop from this document.
                If you were to change the '10' above to '0', the program will still print out the number '0' before ending.
                This is useful if you want to break out of a loop but you want the loop to run at least once. */

            char firstLet; //remember that this is a character variable and will store a single letter on the alphabet

            do
            {
                Console.WriteLine("What is the first letter of your name? ");
                firstLet = Console.ReadKey(true).KeyChar;
            } while (firstLet != 'R');

            Console.WriteLine();

            /*
                The above loop tests for the first letter of your name.
                It requires user input to test the condition against so it has to run at least once in order to get anything from the user.
                Can you see how the sample program is used in modern operating systems like Windows for password verification? */
        }
		/*
		
		######### COMPULSORY TASK 1 #########
		Follow these steps:

		NOTE: Make a copy of this folder on your computer. Submit the required files when you are done.

		Before you go any further, Open the Example Programs folder in your Task folder. Have a look at the two example programs written for you, run them by hitting F5 when opened. Look at the output of each program and compare it to the code written within the Program.cs file in the Project of Task 5 - the comments are there to help you.
		 
		Create a new Project called Math which will form the basis of teaching primary school students basic mathematical operations:

		Ask the user for the answer to four maths problems, each using one of the four basic operators:

		Addition
		Subtraction
		Division
		Multiplication

		What the program must do is start with addition and ask the user (in this case a young child, so no complicated sums) 
         * for the answer to a sum, for example 3 + 4.

		The program must keep asking the user for an answer until the correct value is entered.

		The same must be done for the rest of the operations until the correct answers have been given for each operator.

		To limit the program (and hence focus on the programming rather than the actual mathematics) limit the questions to numbers between
         * -10 and +10 and the division questions must have integer answers (so not 1.58 etc.).

		Remember that we are testing your ability to program and the actual answers are irrelevant as long as you are able to test the user's
         * input against the correct answer.

		You may use either while loops , do...while loops or a combination of both in order to test the answers that the user may give.


		########## COMPULSORY TASK 2 ##########
		Follow these steps:

		The Fibonacci Sequence is a sequence that occurs frequently in the mathematical, biological and computer sciences.
		The first ten terms are given by:
			T1: 0
			T2: 1
			T3: 1
			T4: 2
			T5: 3
			T6: 5
			T7: 8
			T8: 13
			T9: 21
			T10: 34

		The first two terms are zero and one respectively and every term that follows is the sum of the two preceding terms:
		T(n) = T(n-2) + T(n-1) (this is the formula for the nth term):
		Create a new C# Project called Fibonacci  in the Task  folder.
		Write a C# program which will display the first fifty terms of the Fibonacci Sequence.
		You must use the while loop to generate the sequence.
		The number of terms that the program must compute must be determined by the user before the loop is run.
		What will happen if there are no end criterion for the loop: is that the program will continue to run until you have to force the program to end - this is not what you want to happen!

		
		*/
    }
}
