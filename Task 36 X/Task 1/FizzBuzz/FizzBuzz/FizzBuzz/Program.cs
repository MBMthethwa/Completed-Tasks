using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace fizzBuzz
{
    class Program
    {
        static void Main(string[] args)
        {
            for (int y = 1; y < 101; y++)
            {
                if (y % 3 == 0 && y % 5 == 0)
                {
                    Console.WriteLine("FizzBuzz");
                }
                else if (y % 3 == 0)
                {
                    Console.WriteLine("Fizz");
                }
                else if (y % 5 == 0)
                {
                    Console.WriteLine("Buzz");
                }
                else
                {
                    Console.WriteLine(y);
                }
            }

            Console.ReadLine();
        }
    }
}
