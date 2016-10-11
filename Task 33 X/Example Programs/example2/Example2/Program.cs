using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Example2
{
    class Program
    {
        static void Main(string[] args)
        {
            int numOne = 10;//Init values
            int numTwo = 20;
            int answer;
            Console.WriteLine("What is " + numOne + "+" + numTwo + " equal to? Write your answer below:");//Ask a question
            answer = int.Parse(Console.ReadLine());//Get input
            Console.WriteLine("Your answer is "+(((numTwo+numOne)==answer )?"Correct!":"Incorrect! The real answer is "+(numOne+numTwo))); //Don't worry what ?: means, it will be explained later
            
        }
    }
}
