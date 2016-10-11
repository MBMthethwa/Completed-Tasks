/*  ========== SENDING ARRAYS TO FUNCTIONS ==========

    It is possible to send an array to a function.
    This, however, cannot be done value by value.
    Therefore you need to send the entire array to the function and hence the value of the array in the function has the same address in
    memory as the array in the main function.

    See the code below.*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Scope
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("========== SENDING ARRAYS TO FUNCTIONS ==========");
            double[] arrayNum = { 5.0, 95, 8.9, 5.89, 6.9 }; //declared and initialised array
            int len = 5; //length of array
            Console.WriteLine(findAverage(arrayNum, len)); //calls the function by sending it parameters- notice that there are no [] 
            //brackets after arrayNum
            Console.ReadLine();
        }

        private static double findAverage(double[] arrayParam, int arrayLength)
        {
            //variable declaration for within the function. These cannot be seen/accessed from outside this function.
            double sum = 0;
            double average = 0;

            for (int i = 0; i < arrayLength; i++) //for loop to run through the array
            {
                sum = sum + arrayParam[i]; // sum up values
            }

            average = sum / arrayLength; // find average

            return average;
        }
    }
}
