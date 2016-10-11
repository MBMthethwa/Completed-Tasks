
/*
  ========== WELCOME! ==========

  In this Task we will be covering two-dimensional arrays.
  
  ************* HELP *****************
  REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
  ************************************

  The Purpose:

  Data must often be stored in table form.

  In the previous task we worked with one-dimensional arrays which correspond to
  data in a list form.

  In this task we look at two-dimensional arrays that are used to store data
  in table form. Doing matrix calculations would not be possible without this
  data structure.

  If you do not know what a matrix is, it is a mathematical concept used in
  linear algebra, which is an important branch of mathematics relevant to, and
  used in, many fields of study.

  The Basics:

  Below is a graphical interpretation of an two-dimensional array with 30
  (5*6) elements:
  (or in mathematics we could refer to this structure as 5X6 Matrix)

  Here we have:

                -> 6 columns represented by indices 0 to 5
                -> 5 rows represented by indices 0 to 4

                              Columns
        *************************************************
        *          [0]   [1]   [2]   [3]   [4]   [5]    *
        *        -------------------------------------  *
        *    [0] |  90 |  94 | 102 | 111 | 122 | 134 |  *
        *        -------------------------------------  *
        *    [1] |  77 |  80 |  86 |  94 | 103 | 113 |  *
        *        -------------------------------------  *
 Rows   *    [2] |  83 |  85 |  94 | 100 | 111 | 121 |  *
        *        -------------------------------------  *
        *    [3] |  71 |  76 |  85 |  96 | 110 | 125 |  *
        *        -------------------------------------  *
        *    [4] |  81 |  91 |  98 | 105 | 112 | 119 |  *
        *        -------------------------------------  *
        *************************************************

  Imagine a manufacturer has collected information about noise levels (in
  decibels) of five different motor cars.
  Each car's noise level has been measured at six different speeds. This is
  what the data looks like in tabular form:


        ********************************************************
        *                                                      *
        *                        Speed (km/h)                  *
        *                                                      *
        *                20    40    60    80   100   120      *
        *             -------------------------------------    *
        *        Car1 |  90 |  94 | 102 | 111 | 122 | 134 |    *
        *             -------------------------------------    *
        *        Car2 |  77 |  80 |  86 |  94 | 103 | 113 |    *
        *             -------------------------------------    *
        *  Cars  Car3 |  83 |  85 |  94 | 100 | 111 | 121 |    *
        *             -------------------------------------    *
        *        Car4 |  71 |  76 |  85 |  96 | 110 | 125 |    *
        *             -------------------------------------    *
        *        Car5 |  81 |  91 |  98 | 105 | 112 | 119 |    *
        *             -------------------------------------    *
        *                                                      *
        ********************************************************

    So Car 1 when it travels at 60km/h has a noise level of 102 db's.
    To actually store and manipulate this data is very easy.
    Lets see how we would store this data in C#.

    We would need an array which has 6 column indices (0 to 5) and 5 row indices
   (0 to 4)

    Note the syntax for a two-deimensional array:

    type[,] <name> = new type[size1,size2];
    
    In this case, we could write,
    int[,] carNoises = new int[5,6]
    
*/
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Data_II
{
    class Program
    {
        static void Main(string[] args)
        {
            /* Observe the next two lines of code below.
            These are called constants and they are declared after the #include
            statements above and before any functions.
            They are values that can be used in any function within your code and their
            value does not change at all. */

            const int NUM_CARS = 5;
            const int NUM_SPEEDS = 6;  // constants as explained above

            Console.WriteLine("========== TWO-DIMENSIONAL ARRAYS ==========");

            /*  The line of code below tells the computer to allocate memory for this
            two-dimensional array.
            Also that the type of the elements are integers. */

            int[,] noizeLevels = new int[NUM_CARS, NUM_SPEEDS];  // rows , columns is the format of the
                                                                 // two-dimensional array (see above)

            /* Note we have not initialised the two-dimensional array.
            Since we have not initialised any of the values, if you try and reference
            any of the values in the array you will get zero.
            This is because the computer assigns 0to every element until you
            explicitly assign a value.
            Run the following code and you will see what is meant. */

            Console.WriteLine("Funny answer before initialisation: ");
            Console.WriteLine(noizeLevels[2, 2]);


            /*  Let us initialise the array.
            It is possible to assign each element a value one by one which would be
            quite cumbersome.
            For example, you could get input from the user and then use a loop to run
            through every element within the array.

            noiseLevels[0,0] = 90; // Corresponds to Car 1 travelling at 20km/h
            noiseLevels[0,1] = 94; // Corresponds to Car 1 travelling at 40km/h
                    .
                    .
                    .
            noiseLevels[4,4] = 112; //Corresponds to Car 5 travelling at 100km/h
            noiseLevels[4,5] = 119; //Corresponds to Car 5 travelling at 120km/h

            A easier way to assign the values is to do it upon the creation the
            creation of the multi-dimensional array. */


            /*  ========== TWO-DIMENSIONAL ARRAYS ==========

            The code below is the general declaration and initialisation of an array.

            type[,] arrayName = new type[,] { {element1, element2, element3},{element4, element5, element6},..... };

            Hit F5 at any point to run the program and observe the output. 
             
            Below is an example two-dimensional array set up to print out its format to hopefully give you
            a better idea of what it look like internally.
            */

            int[,] example = new int[,] { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 } };

            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 4; j++)
                {
                    Console.Write(example[i, j] + ", ");
                }
                Console.WriteLine();
            }


            int[,] noiseLevels = new int[,] {
            {90, 94, 102, 111, 122, 134},
            {77, 80, 86, 94, 103, 113},
            {83, 85, 94, 100, 111, 121},
            {71, 76, 85, 96, 110, 125},
            {81, 91, 98, 105, 112, 119}};

            /*  As you can see, you can think of a two-dimensional array as an array of
            arrays.
            If you are wandering what happens if the size of each row is not the same
            as in our case.
            Then modify one of the rows and see what happens.
            For example see what happens if you change row two to {77, 80 , 86, 94}
            which has 4 elements instead of six

            ========== MODIFYING ELEMENTS WITHIN AN ARRAY ==========

            You could reassign or modify any element
            For example, if you wanted to change Car 3's value at 100km/h by
            multiplying it by 2. */

            noiseLevels[2, 4] =
            (noiseLevels[2, 4] * 2);  // multiplying by two and re-assigning
            Console.WriteLine(noiseLevels[2, 4]);

            /*  Let us print the entire matrix (two-dimensional array).
            Look for the modified noise value (111 is now 222)
            Note '\t' is for creating tab character and '\n' is for a new line
            character.
            '\n' is an alternative way of creating a new line by appending it to the end (or middle) of a string. */


            Console.WriteLine("\nA table of noise levels for different cars at various speeds:");

            Console.Write("\n" + "\t" + "20" + "\t" + "40" + "\t" + "60" + "\t" + "80" + "\t" + "100" + "\t" + "120\n");
            Console.Write("=====================================================\n");

            for (int carIndex = 0; carIndex < NUM_CARS; ++carIndex)
            {
                Console.Write("Car " + (carIndex + 1) + " | ");

                for (int speedIndex = 0; speedIndex < NUM_SPEEDS; ++speedIndex)
                {
                    Console.Write(noiseLevels[carIndex, speedIndex] + "\t");
                }
                Console.Write("\n");
            }

            Console.ReadLine();
            
        }

        /*
        ######## COMPULSORY TASK 1 ########
        Follow these steps:

        NOTE: Make a copy of this folder on your computer. Submit the required files when you are done.

        The compulsory task is to write a program to transpose an M X N matrix.

        Transposition is a matrix operation. It is a fairly simple operation to understand.
         * All that happens is the rows of the matrix are transformed (swapped) into columns.

        Given the following matrix A.

                          ------------
        	         [0] |1  2  7  6|
           row  	 [1] |3  4  1  4|
           index [2] |6  8  9  0|
        	         [3] |4  5  2  1|
                          ------------








        The transposition of A would result in the following matrix.

        	        column index

        	        [0][1][2][3]
        	        ------------
        	        |1  3  6  4|
        	        |2  4  8  5|
        	        |7  1  9  2|
        	        |6  4  0  1|
        	        ------------

        As you can see, the items of the rows in the first matrix have become the items of the  columns of the second matrix and the items of
         * the columns in the first matrix have become items of the rows of the second matrix.

        The above matrix is known as a square matrix because it has an equal number of rows and columns. 
         * The same result can be achieved for matrices of any size (HINT: think about the constant initialisation before your function!).

        Create a new Project called transpose in your Task folder.
        Transpose that matrix and store it in another two-dimensional array.
        Print the original matrix and the transposed matrix - print the matrices out so that the rows and 
         * columns can easily be seen and the original and transposed matrices can be easily identified.
        You may use whatever size matrix that you wish, as long as it is greater than a 4 X 4 matrix.


        ######## COMPULSORY TASK 2 ########
        Follow these steps:

        Create a new Project called Rainfall in your Task folder.

        Write a program that stores rainfall for each month of the years 2000 to 2005 in a two-dimensional array.
        The program must use this data to calculate and display the following:

        The average annual rainfall over the period 2000 to 2005.
        The average monthly rainfall over this period.
        The month from January 2000 to December 2005 with the highest rainfall.

        Use your own values.
        The values should be of type double.
        */
    }
}
