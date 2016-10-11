﻿/*========== WELCOME! ==========

    In the previous 3 tasks we introduced control statements and looping mechanisms.
    In this task you will learn more about pseudo-random numbers and thereafter combine it with everything that was learned
    in order to build your very own craps game.

    1	7	5	2	3	10	4	6	9	8	1	7
    x0	x1	x2	x3	x4	x5	x6	x7	x8	x9	x10	x11

    I spy with my little eye, is there any definite pattern to the numbers listed above?

    You probably would conclude that the numbers are absolutely random.
    However nothing is absolutely random- the numbers listed above have actually been predetermined by a defining formula.

    Each successive term is generated using the preceding term according to the following formula:

	x0 = 1
	x1 = (1 * 7) % 11 = 7
	x2 = (7 * 7) % 11 = 5
	x3 = (5 * 7) % 11 = 2
	and so on...

    Numbers that appear to be random but are in fact predetermined by some formula, as the ones above, are known as pseudo-random
    numbers and are used extensively in simulation programs and games.

    In the pseudo-random formula above the value x0 = 1 is known as the seed, in general this could be any natural number, different
    choices for the seed will yield a different set of pseudo-random numbers.
 
    In C#, if the seed is not defined, it will be taken from some counter - the system time by default.
	
	************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
   ************************************
 */
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CrapsGame
{
    class Program
    {
        static void Main(string[] args)
        {
            Random r = new Random((int)System.DateTime.Now.TimeOfDay.TotalSeconds);
            /*
            The C# library comes with predefined functions which generates and seeds random numbers.
            The Random().next() function generates random numbers when called. 
            */

            char letter;
            Console.WriteLine("Here are 20 random numbers generated by the rand() function:");

            for (int i = 0; i < 20; i++)
            {
                int random = r.Next();
                Console.WriteLine(random);
            }

            Console.WriteLine("\nPress any key to continue...");
            letter = Console.ReadKey().KeyChar;

            /*
                Sometimes numbers within some specific range are required.
                If you want the range to be between 1 and 6, the rand() function can be modified as follows:

                (rand() % 6) + 1

                "rand() % 6" generates a number between 0 and 5
                adding 1 to it generates a number between 1 and 6

                In order to obtain a different set of random numbers each time the program is executed you can seed the formula based on the time
                of the day, to do this you need to include the C-time library thereafter you call the function srand() as follows: */



            Console.WriteLine("\nHere are 20 random numbers in the range from 1-6 :\n");

            for (int i = 0; i < 20; i++)
            {
                int random_range = ((r.Next(6)) + 1);
                Console.WriteLine(random_range);
            }
            Console.WriteLine("\nPress any key to continue...");
            letter = Console.ReadKey().KeyChar;
        }
        /*
        ######### COMPULSORY TASK ###########
        Follow these steps:

        NOTE: Make a copy of this folder on your computer. Submit the required files when you are done.

        Create a new Project called craps in your Task folder:

        Your program must take in the user’s bet and then simulate the first roll (this is called the ‘come out’ roll).

        A simulated roll must be in the range of 2 to 12 (the possibilities of rolling the dice).

        If the ‘come out’ roll is 7 or 11 then the player automatically wins and the initial bet is tripled and a message
         * must be displayed to the user saying how much he/she has won.

        ‘Come out’ rolls of 2, 3 or 12 are called ‘craps’ and the shooter loses the amount initially bet. If the ‘come out’
         * roll is a ‘crap’ then a message saying how much the player has lost should be displayed on the screen.

        If the ‘come out’ roll is any of the other possibilities i.e. 4, 5, 6, 8, 9, 10 then that number becomes the ‘POINT’.

        Once the ‘point’ has been established, the shooter has to roll that value again before he rolls a 7. If he rolls that
         * value before rolling a 7 then he wins and his bet is doubled, however if he rolls a 7 before rolling the ‘point’
         * value he loses the amount initially bet.

        For each simulation of the dice roll output a star '*' to represent the values on each respective dice, for example
         * suppose that the 10th dice roll was 4 and 6 then the program should display:

	        Roll 10: 4 6
	        ****
	        ******

        Remember that this is a game and that it must look as user friendly as possible in order to be used effectively.
        */
    }
}
