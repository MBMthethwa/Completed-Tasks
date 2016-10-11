/*
  ========== WELCOME TO THE NEXT TASK! ==========

  Well done on getting to this point!
  From here on we will be moving onto more intermediate topics.

  In this Task we will be covering arrays and lists.

  An array is a collection of variables of the same data type. Picture an array
  as a series of numbered boxes each containing one item of data.
  The number associated with the box is the index of the item.
  What the index refers to is known as the element.
  To access a particular item the index of the box associated with the element
  is used to access the appropriate box.
  The index is an integer and refers to the position of the element within the
  array thus the elements are ordered based on the
  number of the index starting from zero.

  Below is a graphical interpretation of an array with five elements:

          ***************************
  Index   **[0]**[1]**[2]**[3]**[4]**
          ***************************
  Element ** 4 ** 9 ** 1 ** 3 ** 7 **
          ***************************

  Let's begin!
  
  ************* HELP *****************
  REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
  ************************************
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_I
{
    class Program
    {
        static void Main(string[] args)
        {
            // ========== ARRAYS ==========
            // The code below is the general declaration and initialisation of an array.
            // Note the square brackets [] that are used to define the index (position) of the array.
            // Hit F5 at any point to run the program and observe the output.

            Console.WriteLine("========== ARRAYS ==========");

            int[] timesFive = new int[5];  // This creates an array of integers that has space for 5 elements

            Console.WriteLine("The first five multiples of five are: ");

            for (int i = 0; i < 5; ++i)
            {
                timesFive[i] = i * 5;  // This assigns the value of 'i * 5' to the ith index
                                       // of the array
                Console.Write(timesFive[i] + " ");  // This prints out the value stored in
                                                    // the array at index i
            }


            // As you can see when you run the program, the program outputs the values of
            // the array, which are the first five multiples of five.
            // The array above did not initialise the elements in the same line as
            // declaring the array. The array below will declare an array AS WELL as
            // initialise the elements in the same line. Look at the braces instead of the square brackets for
            // encasing the elements.Also look at how each element is separated by a comma, and that strings
            // are encased in double quotes.

            string[] studentNames = {"Chris", "Aadil", "Comfort", "Edward", "Chilwe"};  // five element string array
            int studentNo;

            Console.WriteLine("What is the number of the student that you wish to see(0-4)?: ");
            studentNo = Convert.ToInt32(Console.ReadLine()); //change the type from string to integer

            if (studentNo >= 0 && studentNo <= 4)
            {
                Console.WriteLine("The student that corresponds with number " + studentNo + " is " + studentNames[studentNo]);
            }
            else {
                Console.WriteLine("Invalid student number");
            }

            // The above code gets input from the user to refer to a specific element in
            // the array based on the index number.
            // In this case the index was determined from a variable that was first put
            // through an if statement.

            string[] shoppingList = new string[4];  // four element string array
            int x = 0;

            do
            {
                Console.WriteLine("What would you like to add to your shopping list for today? ");
                shoppingList[x] = Console.ReadLine();
                x++;
            } while (x < 4);

            Console.Write("The items on your shopping list are: ");

            for (int p = 0; p < 4; ++p)
            {
                Console.Write(shoppingList[p] + " ");
            }

            // From these examples the possibilities are endless as to what can be
            // done with a set of variables stored under one variable name.

            // How much easier is declaring an array with five elements rather than
            // having to declare five separate variables?

            // Remember that variables that are not initialised will store a random
            // number in it until you initialise it!

            // Next we will be covering Lists.

            // ========== LISTS ==========

            // A list is very similar to an array. The main difference between the to
            // is that lists can handle storage automatically and can easily be resized unlike arrays. 
            // You might then wonder why on earth would someone want to have to do things manually with 
            // arrays when you can use dynamic lists? 
            // The answer is efficiency - when your data sets get a lot larger and you need
            // to search for items, the manner in which lists are created and stored in memory
            // make using them slower than arrays with a pre-defined size.

            // The code below is the general declaration of a list:

            //  List <type> list_name;

            Console.WriteLine("\n========== LISTS ==========");

            List<double> distance = new List<double>();  // This creates a new instance of a list

            // ===========Adding Elements to a list=============

            int a = 0;

            while (a < 10)
            {
                distance.Add(3.4 * a);  // This adds 3.4 multiplied by i into each
                                        // element of the list using a while loop
                a++;
            }

            Console.WriteLine("The list has " + distance.Count + " elements.");  // This prints out the size of the list

            // ========== Accessing Elements in a List ==========

            // NB: Just like the arrays the first element is at position 0 of the list
            // There are several ways of accessing elements in a list - these are
            // illustrated below.
            // Note that the next two loops do exactly the same thing and provide the
            // exact same output, merely in a different way.

            Console.Write("\nThe elements in the list are ( using distance[j] ):");

            // This loop prints out all the elements in our distance list
            for (int j = 0; j < distance.Count; j++)
            {
                Console.WriteLine(distance[j] + "\t");
            }

            Console.Write("\nThe elements in the list are ( using distance.ElementAt(j) ):");

            // This loop prints out all the elements in our distance list
            for (int j = 0; j < distance.Count; j++)
            {
                Console.WriteLine(distance.ElementAt(j) + "\t");
            }

            // If by accident you access an element outside the list, the program
            // will terminate with an exception. The array method `[j]', however,
            // results in segmentation fault.
            int k = 0;
            do
            {
                Console.Write(distance[k] + "  ");
                ++k;
            } while (k < distance.Count);

            distance.Remove(5); // This deletes the an element in the list with value 5.
            distance.RemoveAt(3); // This deletes the element at index 5.
            
        }
        /*
        ########## COMPULSORY TASK 1 ##########
        Follow these steps:

        NOTE: Make a copy of this folder on your computer. Submit the required files when you are done.

        In this task you will be required to build a Celsius to Fahrenheit temperature converter. Create a new C# Project called Celfah in your Task folder:

        The user must enter ten temperature values in degrees Celsius. These must be stored into an array or linked list (whatever you prefer).

        You will then have to convert these values to Fahrenheit and return them to the user as shown below:
        Celsius                    	Fahrenheit
        1                          	33.8
        3                          	37.4
        The formula that you will need to convert from Celsius to Fahrenheit is:

        (°C x 9/5) + 32 = °F eg.  1°C =  33.8°F .
        Try this on your calculator to ensure that you get the right value.


        ########## COMPULSORY TASK 2 #########
        Follow these steps:

        Create a new Project called DecBin in your Task folder:
        Using linked lists, create a program that accepts decimal numbers from the user and returns the binary equivalents of those numbers.

        Read the file Decimal to Binary Conversion.pdf in your Task 7 folder to understand how to convert from decimal to binary numbers.

        The output must look like the sample output shown below:
                      Decimal            Binary
                      1                      1
                      2                      10
                      3                      11


        */
    }
}
