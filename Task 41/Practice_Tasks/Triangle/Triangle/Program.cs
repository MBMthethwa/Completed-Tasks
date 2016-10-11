/*  For every triangle- the sum of any two sides is greater than the third side.
    This can be used to test to see if three numbers can be used to represent the lengths of a triangle.

    Write a function that takes each side as an input from the user and returns "True" for a valid triangle and "False" for an invalid
    triangle.

    Hint: The function will return a value of type boolean.

    Write the code for your program below.*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Triangle
{
    class Program
    {
        static void Main(string[] args)
        {
            int NumberOfLines = 5;
            int count = 1;
            while (NumberOfLines-- != 0)
            {
                int c = count;
                while (c-- != 0)
                {
                    Console.Write("*");
                }
                Console.WriteLine();
                count = count + 2;
            }

            Console.ReadLine();
        }

        
    }
}
