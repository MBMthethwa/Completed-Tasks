using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Celfah
{
    class Program
    {
        static void Main(string[] args)
        {
            
            
            List<int> celsius = new List<int>();
            
            for (int y = 0; y < 10 ; y++ )
            {
                Console.WriteLine("Enter the celsius you want to convert to Fahrenheit ");
                int c = int.Parse(Console.ReadLine());
                celsius.Add(c);
            }

            Console.WriteLine("celsius \t\t Fahrenheit");
            for (int i = 0; i < celsius.Count; i++ )
            {
                double fahrenheit = 33.8 * (celsius.ElementAt(i));
                Console.WriteLine(celsius.ElementAt(i) + "\t\t" +  fahrenheit + "\n");
                
            }

            Console.ReadLine();
        }
    }
}
