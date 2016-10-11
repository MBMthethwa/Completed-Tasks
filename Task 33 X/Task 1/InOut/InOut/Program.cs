using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace InOut
{
    class Program
    {
        static void Main(string[] args)
        {
            String name = "";
            int age = 0;

            Console.WriteLine("Enter your user name ");
            name = Console.ReadLine();
            Console.WriteLine("Enter your age ");
            age = int.Parse(Console.ReadLine());
            Console.WriteLine(name + " " + age);
            Console.WriteLine("Hello World ");
            Console.ReadLine();




        }
    }
}
