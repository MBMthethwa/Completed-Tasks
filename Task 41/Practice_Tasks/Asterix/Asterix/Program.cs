/*  Write a Function to draw a frame of asterisks.
    The user must enter two integers representing the width and height of the frame.

    For example:

    * * * * * * *
    *           *
    *           *
    *           *
    * * * * * * *

    should be drawn for a width of 7 and height of 5. Note the asterisks forming the top and the bottom rows of
    the frame are separated by single space characters.
    once you have prototyped and defined the function, test it out by calling it from within the main function.

    Write the code for your program below.*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Asterix
{
    class Program
    {
        static void Main(string[] args)
        {
        	Console.WriteLine("Enter the width");
        	int width = int.Parse(Console.ReadLine());
        	Console.WriteLine("Enter the height");
        	int height = int.Parse(Console.ReadLine());
        	String asteric = "";
        	
        	for(int x = 0; x < width; x++)
        	{
        		asteric = asteric + "*";
        		for(int y = 0; y < height; y++)
        		{
        			asteric = asteric + "*";
        		}
        	}
        	
        	Console.WriteLine(asteric);
        	Console.ReadLine();
        }
    }
}
