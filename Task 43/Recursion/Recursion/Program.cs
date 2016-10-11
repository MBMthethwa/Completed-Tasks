/*
    ========== WELCOME TO THE C# PENULTIMATE TASK - RECURSION! ==========
    A few tasks ago, we wrote code that makes use of functions. So you might need to revisit this task before attempting this task.
	
	************* HELP *****************
    REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
    ************************************

    In this task, you are going to be introduced to the concept of Recursion. In simple terms, recursion is when a function
    calls itself. Normally a recursive function uses conditional statements to call the function recursively or not. The main
    benefits of using recursion are compact code which is easily understandable code, as well as less variables used. 
    Recursion and iteration can be used to achieve the same results. The following guideline will help you to decide 
    on which method to use depending on a given situation.
    When to use recursion?  Where compact, understandable  and intuitive code is required.
    When to use iteration? Where there is limited memory and faster processing is required.    
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Recursion
{
    class Program
    {
        static void Main(string[] args)
        {
            //The following examples show where recursion can be be used instead of iteration to calculate the Fibonacci sequence.
            //Due to the nature of recursion, most of the examples have been separated.

            //Example Task: Already completed for you to study.
            Console.WriteLine("======== Fibonacci Examples ===========");
            Console.WriteLine("Using iteration Fibonacci(6) is " + iterative_fibonnaci(6));
            Console.WriteLine("Using recursion Fibonacci(6) is " + recursive_fibonnaci(6));

            //Task 1: Complete the code for the recursive factorial function.
            Console.WriteLine("\n======== Task 1: Factorials ===========");
            Console.WriteLine("Using iteration Factorial(4) is " + iterative_factorial(4));
            Console.WriteLine("Using recursion Factorial(4) is " + recursive_factorial(4));

            //Task 2: Complete the code for the recursive string_length function.
            string myString = "Hyperion C#";
            Console.WriteLine("\n======== Task 2: String Length =======");
            Console.WriteLine("The string '" + myString + "' has " + myString.Length + " characters using the C++ string library\n");
            Console.WriteLine("The string '" + myString + "' has " + string_length(myString) + " characters using my string length function\n");

            //Task 3: Complete the code for the recursive GCD function.
            Console.WriteLine("\n======== Task 3: GCD ===========");
            Console.WriteLine("Using recursion GCD(24, 36) is " + GCD(24, 36));


            Console.ReadLine();
        }
        //===========================Fibonacci Sequence Examples=======================================================================
        // The Fibonacci sequence is calculated using the following formula: fib(n) = fib(n-1) + fib(n-2)

        // Method 1: Using Iteration
        private static int iterative_fibonnaci(int n)
        {
            int fn1, fn2;
            fn1 = fn2 = 1;

            if (n == 0)
            {
                return 0;
            }

            else if (n == 1 || n == 2)
            {
                return 1;
            }

            else
            {
                for (int i = 3; i <= n; i++)
                {
                    int fn = fn1 + fn2;
                    fn1 = fn2;
                    fn2 = fn;
                }
                return fn2;
            }
        }

        // Method 2: Using recursion
        private static int recursive_fibonnaci(int n)
        {
            if (n == 0)
            {
                return 0;
            }

            else if (n == 1 || n == 2)
            {
                return 1;
            }

            else
            {
                //This code perform the same function as the for loop in the iterative function
                return recursive_fibonnaci(n - 1) + recursive_fibonnaci(n - 2); // Using recursion instead of a loop
            }
        }



        //####### COMPULSORY TASK 1 ##########
        
        //========================== Task 1 - Factorial ==========================
        // The factorial is calculated using the following formula: fact(n) = n! = n×(n-1)! = 1×2×3×4×...×n
        // Method 1: Factorial Example using iteration
        private static int iterative_factorial(int n)
        {
            int fact = 1;
            if (n < 1)
            {
                Console.WriteLine("Invalid Entry \n");
            }
            else
            {
                // Calculating the factorial using iteration
                for (int i = 1; i <= n; i++)
                {
                    fact *= i;
                }
                return fact;
            }
            return -1;
        }

        // Method 2: Complete the Factorial function below using a recursive function
        private static int recursive_factorial(int n)
        {
            // Write your code here!!!!!
            return 0;
        }



        /*
        ============================ Task 2 - String Length ======================
        The C# String library determines the length of a string by counting the
        number of characters before the '\0' (The null termination character). This
        function can  also be implemented using recursion. Your task is to implement
        this using recursion. Complete the code for the string_length function below.
        */
        private static int string_length(string word)
        {
            return 0; // Write the recursive implementation for calculating the string length
        }



        /*
        ============================= Task 3 - GCD ===============================
        Complete the GCD function below to calculate the greatest common divisor (GCD)
        for two numbers x and y using recursion. GCD is the largest positive integer
        that divides the numbers without leaving a remainder.
        */
        private static int GCD(int x, int y)
        {
            return 0; // Write the recursive implementation for calculating the greatest common divisor
        }
    }
}
