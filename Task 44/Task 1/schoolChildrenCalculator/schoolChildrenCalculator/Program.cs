/*
 * Created by SharpDevelop.
 * User: Programming
 * Date: 2016-09-30
 * Time: 08:21 PM
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;

namespace schoolChildrenCalculator
{
    class Program
    {
        public static int calculateIt(int number1, int number2,String operatorr)
        {
            return number1 + number2;

        }

        public static int calculateIt(String operatorr,int number1, int number2)
        {
            return number1 - number2;

        }

        public static int calculateIt(int number1, int number2)
        {
            return (int)(number1 / number2);

        }

        public static double calculateIt(double number1, double number2, double number3)
        {
            return (number1 * number2 * number3);

        }

        public static void Main(string[] args)
        {
            int number1 = 0, number2 = 0, number3 = 0;
            Console.WriteLine("Do you want to +,-,* or /");
            String option = Console.ReadLine();

            if (option == "+")

            {
                Console.WriteLine("Enter number");
                number1 = int.Parse(Console.ReadLine());
                Console.WriteLine("Enter number");
                number2 = int.Parse(Console.ReadLine());
                Console.WriteLine(calculateIt(number1, number2,option));
            }
            else if (option == "-")
            {
                Console.WriteLine("Enter number");
                number1 = int.Parse(Console.ReadLine());
                Console.WriteLine("Enter number");
                number2 = int.Parse(Console.ReadLine());
                Console.WriteLine(calculateIt(option,number1, number2));
            }
            else if (option == "*")
            {
                Console.WriteLine("Enter number");
                number1 = int.Parse(Console.ReadLine());
                Console.WriteLine("Enter number");
                number2 = int.Parse(Console.ReadLine());

                Console.WriteLine("Enter number");
                number3 = int.Parse(Console.ReadLine());
                Console.WriteLine(calculateIt(number1, number2,number3));
            }
            else if (option == "/")
            {
                Console.WriteLine("Enter number");
                number1 = int.Parse(Console.ReadLine());
                Console.WriteLine("Enter number");
                number2 = int.Parse(Console.ReadLine());
                Console.WriteLine(calculateIt(number1, number2));
            }
            Console.ReadLine();
        }
    }
}