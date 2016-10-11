/*
    ========== WELCOME! ==========
	
	************* HELP *****************
    REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
    ************************************

    By this point you might have realised that programs can get quite long and
    complicated.
    Programs in the "Real World" can have hundreds of thousands of lines of code
    and have many teams of programmers working on the same program.
    For this reason, it is necessary to break the program up into manageable
    sub-sections and then recombine the sub-sections at the end
    once each team has completed their own sections into the finished program.

    In these instances, functions can be very useful.

    Functions can also be useful if you wish to reuse a section of code
    somewhere within your program but do not wish to retype the specified
    code that you require (it can become very time-consuming if you have to
    copy/paste a section of code many times, not to mention the space needed).
    A function effectively allows you to place the specified code within its own
    "section" within your program and then allows you to access
    the lines contained therein by means of specifying within your code that you
    wish to use it.

    So using functions accomplishes three things:

    1. Functions help break problems or tasks into smaller subtasks thereby
       allowing the program to be created systematically.
    2. Functions help with making it easier to reuse code.
    3. Functions make debugging a program MUCH easier.

    ========== DEFINING FUNCTIONS ==========

    The syntax for defining a function has the form:

    Access_Modifier Return_Type Function_Name(Parameter_List)
    {
        (do something with the parameters, if any)
        return Return_Value;
    }

    This is what each element within the above syntax means:
  
    * Access_Modifier - where that function is visible within the program and therefore where
      it can be called from. There are four main types: private (only within current class),
      protected (accessible by class and any sub-classes through inheritance), internal (within
      same project) and public (can be used from other classes). We will mainly be dealing with
      private and public.

    * Return_Type - the variable type of the value that will be returned by the
      function.

    * Function_Name - the name of the function with which the function will be
      called upon within the program (the same rules that apply for
      variable naming applies here).

    * Parameter_List - this will be the list of parameters that will accompany
      the function name when called upon within the program. The parameter list
      values are separated by a comma and any number of parameters can be sent
      to a function.

    * return Return_Value - this line of code will return the calculated value
      from the function to the place within the program where the
      function was called from (the variable type of this return value is
      specified in the first line of the function).

    We have seen a specified type of function before in the form of the main
    function required by every program that you have written so far

    static void Main(string[] args)
    {
        (lines of your program)        
    }

    See how it follows the same syntax as a generic function?

    Don't worry about the string[] args for now - simply put this is to
    do with command line commands.

    */
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Functions
{
    class Program
    {
        /*
        ========== BUILT-IN C# FUNCTIONS ==========

        There are many built-in functions within C# that do not need to be defined
        or prototyped within your code.
        An example of this is the rand() function(used in previous tasks).

        Let us begin by calculating the result of a number raised to a power WITHOUT
        using a function:*/

        static void Main(string[] args)
        {
            Console.WriteLine("========== BUILT-IN C# FUNCTIONS ==========");

            // variable declaration
            double number = 10, power = 4, answer = 1;

            // for loop to calculate 10 to the power of 4
            for (int i = 1; i <= power; ++i)
            {
                answer = answer * number;
            }

            Console.WriteLine(number + " to the power of " + power + " without using a function is equal to: " + answer);

            /*  It is rather tedious to have to use a for loop if your program requires
            you to calculate this many times.
            This is why C# has a function called Math.Pow(Number, Power).
            This means that the method Pow is being used from the Math Class.
            The power function requires a number and its power to be specified between
            brackets with a comma - these are called arguments.
            Look at the code below and then run the program to observe the output.*/

            answer = Math.Pow(number, power);
            Console.WriteLine(number + " to the power of " + power + " using the Math.Pow function is equal to: " + answer);

            /*  Observe that the outputs are the same, except the second one was made much
            easier by using a built-in C# function.

            The same result can be achieved with the pow() function by specifying it
            within the output and using actual values instead of declared
            variables.*/

            Console.WriteLine(8 + " to the power " + 5 + " is equal to " + Math.Pow(8, 5));

            /*  Verify that the output is correct by using a calculator to check it.

            Another built-in mathematical function can be used to find the square root
            of a number.
            Using the syntax Math.Sqrt(number). Notice that only the positive option is given, and not -7.*/

            number = 49;
            answer = Math.Sqrt(number);  // the same value can be obtained by the code sqrt(49)
            Console.WriteLine("The square root of " + number + " using the sqrt() function is " + answer);

            /*  ========== CALLING FUNCTIONS ==========

            Now that we have used a few built-in functions, we are going to create a
            few of our own for use within the main function.

            In order to do this, we need to skip to the end of our main function.

            *** Please come back here after seeing the functions written after the
            main function. ***

            Now that you have seen the functions defined below, we can call on them
            within the main function and send arguments to them in order
            to receive the required output.

            The syntax of function calling has the form:

            Variable = Function_Name(Argument_List);

            This will call the function and send the arguments to it of which the
            return value will be assigned to a variable.*/

            Console.WriteLine("\n========== CALLING FUNCTIONS ==========");

            double num1 = 45.9, num2 = 35.0;

            answer = mySumFinder(num1, num2);  // calling the required function and
                                               // assigns the return value to a variable
            Console.WriteLine("The sum of " + num1 + " and " + num2 + " is " + answer);

            // calling the function as a part of a larger expression.
            answer = mySumFinder(3, num1) * 2;

            Console.WriteLine("The sum of 3 and " + num1 + " multiplied by 2 is equal to: " + answer);
            Console.WriteLine("The sum of 35 and 6.5 is equal to: " + mySumFinder(35, 6.5));// another possible way of calling the function.

            /*  ========== VOID FUNCTIONS ==========

            The functions called above returned some value when called.
            Void functions return no value.
            Void functions are used to do something like outputting information to the
            user without the need to return a value to a variable.
            */
            Console.WriteLine("\n========== VOID FUNCTIONS ==========");

            double value1 = 67.4, value2 = 12.4;

            print_val(value1, value2);  // calls the function. Note that there is no
                                        // variable that the output will be assigned to
                                        // because there is no output

            // calls the void function again with different parameters
            print_val(value2, 45);

            Console.ReadLine();
        }
        /*  ========== USER-DEFINED FUNCTIONS ==========

        Below are two functions that have been created for use within our
        program(ignore the third for now)
        
        Look at and compare the two functions below to the generic syntax of a
        function to see what the function means and what it will return.

        Once you are done, return to the place within the main function where you
        left off and continue from there.*/


        // function that will return the sum of two variables

        private static double mySumFinder(double firstNum, double secondNum)
        {  // takes in two arguments of type double
            return (firstNum + secondNum);  // adds the two numbers and returns the answer
        }

        // function that will return the combination of two strings separated by a space

        private static string concatStrings(string firstStr, string secondStr)
        {
            string answer; // defines a new variable of type std::string within the
                           // function
            answer = firstStr + " " + secondStr;
            return answer;
        }


        // function that will print the comparison of two values

        private static void print_val(double funcVal1, double funcVal2)
        {
            if (funcVal1 > funcVal2)
            {
                Console.WriteLine(funcVal1 + " is greater than " + funcVal2);
            }
            else if (funcVal2 > funcVal1)
            {
                Console.WriteLine(funcVal2 + " is greater than " + funcVal1);
            }
            else {
                Console.WriteLine(funcVal1 + " is equal to " + funcVal2);
            }
            return;  // this will return nothing but should be kept here as good
                     // programming practice.

            // The program will return to the main function once this function reaches the
            // second brace (}) below
        }

        /*  ========== PLAY AROUND WITH C# ==========

        Functions are an easy concept to visualise but the syntax can get quite
        confusing.
        Change the values above to see what kind of output you get each time the
        program is run.
        Remember that this is the purpose of functions - being able to return values
        without having to retype or copy/paste lines of code!

        ========== PRACTICE TASKS ==========

        Open the folder Practice_Tasks in your Task folder.
        There are a few files which have their own instructions to get some
        practice with writing functions.

        The References task shows you how to send an array to a function.

        The Scope task introduces you to different variable scopes.
        
        The Asterix task allows you to use functions to print out a picture.*/
    }

    /*
        ######## COMPULSORY TASK 1 ########
        Follow these steps:

        NOTE: Make a copy of this folder on your computer. Submit the required files when you are done.

        Before you go any further, open the Practice_Tasks folder in your Task folder. Have a look at the four example programs written for you, 
     * run them by hitting F5 when opened.
 
        Create a new C# Project called StraightLine within your Task folder and do the following:
 
        Write a program that runs through the domain values -50 to 50 with a step of 1                (Hint: these are the x-coordinates).

        Each number in the domain will be sent to a function that will return the y-coordinate (using the formula below).

        The value for the gradient must be given by the user (make it an integer for simplicity).

        The y-intercept will be a globally declared variable with a value of 2 (see scope.cpp for help with this).

        Print out each coordinate set in the domain beneath each other, for example:
            (x(1); y(1))
            (x(2); y(2))


        NOTE: The graph of a straight line has the equation y = mx + c where:
            y is the y-coordinate.
            x is the x-coordinate.
            m is the gradient(or slope) of the graph.
            c is the y-intercept(point where the graph "cuts" the y-axis).
              
               Read the file straight_line.htm if you have any difficulties.


        ######## COMPULSORY TASK 2 ########
        Follow these steps:

        Create a C# Project called TriangleNum in your Task folder.
 
        Read the attached file triangle_num.htm to understand what a triangle number is.
        Here is what you should do:
 
         Compute all the triangle numbers for n from 0 to 100.
         The triangle number must be computed in a function.
         The output must be printed one underneath the other.
    */
}
