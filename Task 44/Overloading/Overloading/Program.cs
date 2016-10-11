/*========== WELCOME TO THE FINAL C# TASK! ==========

   ************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
   ************************************

	First of all, congratulations getting this far and hopefully you have experienced the real fun of "Programming"!

	In this Task, our focus will be on function overloading, which I am pretty sure
	you have come across before, or at least the term.

	*Function Overloading is the concept in programming that allows us to create multiple functions
	sharing same name but having different signature of parameters.

	*A function can have more parameters or just same number of	parameters with different data types in different positions.

	*Please note that signature of a function refers only to function name and parameters,
	 and it has nothing to do with the return type.

    */
//Now let's do some short code:
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Overloading
{
    class Program
    {
        static void Main(string[] args)
        {
            /*take a look at the two functions, both called setInfo*/

            int a = 5;
            int b = 6;

            /*Now lets say we use these two values and functions in another class or function.
	        If we are to do this:*/

            Console.WriteLine(setInfo(a, b));

            /*Our result here will simply be "11" because we are invoking Function2 to do the
            work for us...but if we had something like :

            double a = 8.4;    and    double b = 8.9;

            Function2 would be called to do the work for us as it matches the types, i.e. double.
            This can be seen below;*/

            double c = 8.4;
            double d = 8.9;

            Console.WriteLine(setInfo(c, d));

            /*But, thinking like a programmer, one can ask themselves, "what will happen if they had

	            double a = 8.4;    and int b = 7;

	        *When a piece of software which uses Function-Overloading gets debugged, the compiler checks which
	        function will be suitable to do the job and then it decides from there.

	        *Of the above two variables, one can't really say there is a match for those two,
	        but if the compiler feels like it can handle them, then it will compile else
	        it will give an error and that error part is called Ambiguous matches.

	        *Ambiguous matching is when the compiler fails to compile a function because it just
	        can't handle the unmatching arguments or at least perform type conversion*/



            /*=========Purpose of Function Overloading============

	        Function Overloading is one of those concepts you just have to know
            and understand albeit they add no unique functionality to code.

            *One can say, it makes code clean and easier to read
            *Offload some memorising of functions when a programmer is at work.
	        and yeah that's it...Left some space for your thinking.*/


            /* EXAMPLES
            Below is another example for calculating the area of either a circle or a rectangle.
            Upon closer inspection, it can be seen that the two functions don't have the same number
            of parameters! So not only can the types of the parameters differ, but also the number!
            
            Below the area function you can find some exercises to practice.
             */

            area(10, 20);
            area(5);

            Console.ReadLine();
        }

        private static double setInfo(double height, double weight)
        {  //Function1
            return height - weight;
        }

        private static int setInfo(int age, int score)
        {  //Function2

            return age + score;
        }

        /* These two functions demonstrate what function overloading is and if we try to analyse
        them, assuming they both display the info stored in their parameters, they will surely
        give different answers even if we have same input for both of them.*/




        /* Let's look at another example:
            The function below is used to calculate the area of an object - and depending on the parameters
            we can assume it's either a rectangle or a circle (just assume this for this example) */

        private static void area(double sides1, double sides2)
        {
            double area = 2 * sides1 + 2 * sides2;
            Console.WriteLine("The area of the rectangle is: " + area + " cm^2");
        }

        private static void area(double rad)
        {
            double area = Math.PI * Math.Pow(rad, 2);
            Console.WriteLine("The area of the circle is: " + area + " cm^2");
        }


        /* ============= Optional Exercise ============== 
         Create two overloaded functions below called add, one of which takes two ints as input, and the
         other three. Return the answers and include the .WriteLine in the Main function above to
         print the result.
         */


        /*
        ####### COMPULSORY TASK 1 #####
        Follow these steps:
        NOTE: Make a copy of this folder on your computer. Submit the required files when you done

        Before you go any further, Open the Example Programs folder in your Task folder. Have a look at the  example 
        program written for you, run it by hitting F5 when opened. The comments are there to help you.

        In this Task, you are required to create a pseudo calculator for primary school kids, this calculator is only to:
        Add
        Subtract
        Divide (divide two integer numbers)
        Multiply (multiply three decimals together)
        NOTE: Each calculation has a function.

        The Addition and Subtraction functions must take in three variables, the two numbers which the calculation 
        is based on and also a string variable specifying if it's addition or subtraction.

        Create a new C# project called schoolChildrenCalculator within your Task folder and do the following:

        Create four functions all with same name: CalculateIt() , each performing a calculation and then RETURNING the answer.

        The answer must be returned to a variable in the Main() function which gets displayed on the screen. 
        Make sure no data is lost while you working on the given calculation.


        ######## COMPULSORY TASK 2 ########
        Follow these steps:

        Create a new C# project called Validation within your Task folder and do the following:

        You are to create two functions with same name getDetails(), but both performing unique tasks, as well as one function with a different name, DisplayData().

        variables needed:
        string username
        string password

        In one of the functions, you are going to validate a username by making sure it has between 
        5 and 10 letters(only) in it and then RETURNING true meets the requirements, otherwise false if it does not. 
        The username you will get from user's input.
        In the second function you are supposed to randomise a password for that user, which will have between 
        3 and 5 digits and then storing that password in an String variable (integer to string conversion).
        In DisplayData() function, display the username if it is valid and the new password with a message 
        welcoming them to their newly created account. If the username is invalid, assign a default name which is similar to the invalid one.

        */
    }
}
