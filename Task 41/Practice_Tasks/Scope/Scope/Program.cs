    /*  ========== SCOPE ==========

    The scope of a program is the different places within the program where variables can be declared and accessed.
    There are, broadly speaking, three places where variables can be declared.
    The scope of a variable is essentially the 'lifetime' of the variable and is very important in knowing where variables
    begin and end within a program.

    1)  'Global' variables are declared outside the main function as well as all other functions and can be accessed within any function
        within your program
    2)  'Local' variables are declared within the main function as well as ay other function. These varibles only last for the duration of
        of the function in which they are declared.
    3)  When you declare a variable as a function parameter has what is called 'parameter scope'. */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Scope
{
    class Program
    {
        double money = 50.00; //global variable (it does not matter where you initialise it as long as it it above the main function)

        static void Main(string[] args)
        {
            /*  ========== DEFINING LOCAL SCOPE WITHIN BLOCKS ==========

            It is possible to further restrict the scope within a function (in this case the main function) by using blocks {}.
            The "block" is a pair of braces where the variable will be valid for within the program. */

            Console.WriteLine("========== DEFINING LOCAL SCOPE WITHIN BLOCKS ==========");

            {
                int num1 = 20; //the scope of this variable is between a block

                num1 += 10; //incrementing num1 by 10

                Console.WriteLine(num1); //we can print out or manipulate the variable between the block only
            }

            //If we try to manipulate the variable num1 outside the block we will receive an error as seen below

            //num1 += 5; //will return an error

            //Console.WriteLine(num1); //will return an error

            /*  What you will see is the error returned is- "error: 'num1' was not declared in this scope".
            Knowing what this error means now might help you later on within your coding career.

            Please comment out the above two erroneous lines before continuing. */

            string stringName = "Thehseen"; //this is a local string declaration and initialisation meaning that this variable can be used anywhere
            //in the main function from now on


            //========== SCOPE WITHIN FUNCTIONS ==========
            /* Below a function called myFuntion has been declared. Pay careful attention to the comments
             regarding parameter scope.
             Now we will call the function to see its output:*/
            Console.WriteLine(myFunction(stringName));


            Console.ReadLine();
        }

        private static string myFunction(string person) // here the variable 'person' has parameter scope.
        {
            string greeting; //this variable's scope lies within this function
            greeting = "Hello"; //initialise variable

            return (greeting + " " + person);
        }
    }
}

