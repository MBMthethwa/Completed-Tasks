    /*========== NESTED FOR LOOPS ==========

    Below will be sample code for you to see how a nested for loop runs.
    A nested for loop is basically a loop within a loop.

    Play around with the values and see what different conditions for each loop will yield.
    Hit F5 at any time to see what the program does.*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace NestedLoops
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine( " ========== NESTED FOR LOOPS ==========\n" );

            int i, j; // Variables have been assigned here - they will be initialised in each loop

            for (i = 1; i < 5; i++) // Conditions for outer loop
            {
                Console.WriteLine( "Outer loop number: " + i ); // "\t" creates a tab within the output

                for (j = 1; j < 4; j++) // Conditions for inner loop INSIDE the outer loop
                {
                    Console.WriteLine( "\t" + "Inner loop number: " + j ); // "\t" creates a tab within the output
                } // End of inner loop

            } // End of outer loop

            Console.ReadLine();
        }
    }
}
