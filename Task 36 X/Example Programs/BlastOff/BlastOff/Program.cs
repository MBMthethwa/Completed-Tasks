using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace BlastOff
{
    class Program
    {
        static void Main(string[] args)
        {
                char startCount;

                Console.WriteLine("Do you wish to begin the countdown(Y/N)?" );

                 startCount = Console.ReadKey(true).KeyChar;

                if (startCount == 'Y' || startCount == 'y')
                {
                    Console.WriteLine("Countdown initiated!" );

                    for (int n = 10; n > 0; n--)
                    {
                        Console.WriteLine(n );
                    }

                    Console.WriteLine("Blast off!");
                }
                else
                {
                    Console.WriteLine("Countdown aborted!" );
                }

                Console.ReadLine();
        }
    }
}
