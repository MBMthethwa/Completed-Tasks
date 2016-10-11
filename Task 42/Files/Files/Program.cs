/*
  Welcome to the next task! 
  
  ************* HELP *****************
  REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
  ************************************
  
  In the previous tasks, we wrote code which could take in input from a user
  using "Console.ReadLine()".

  We also could display contents on to the console (the black screen) using 
  "Console.Write()" or "Console.WriteLine()".

  What happens if we want to write data to a storage medium that stores the data
  permanently? The C# programs we have written so far store data in a variable and as
  soon as we end the program, the data is lost.

  In this task, you are going to be introduced to file streams. A way in which
  we can write program data to an external storage medium (i.e your hard drive
  or a USB flash drive).
*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO; //This library needs to be used to read and write to files

// In this task, this header will be used to write data to the hard drive and
// also be able to retrieve it.

namespace Files
{
    class Program
    {
        static void Main(string[] args)
        {
            string writeFilePath = "REPALCE ME!";            
            string readFilePath = "REPALCE ME!";

            /******************* Writing to a text file******************************/

            /*Here a TextWriter object is declared. 
            The object after being declared will have methods for us to be able to write
            data to a text file.
            Notice the "REPLACE ME!". This is where your file path goes. The format of this is:
            C:\\directory1\\directory2\\file.txt
            Go back to where you have placed this task folder and copy the path.
            To do this, click in the top bar of the window and you'll see that the path has become highlighted.
            Copy and paste this into the "REPLACE ME!" place. Be sure to have double "\"s.
            An example is: C:\\Users\\Haschick\\Downloads\\Hyperion Tasks\\example.txt
            Use the file name myExample.txt
             */

            TextWriter myWriter = File.CreateText(writeFilePath);

            /*If a file with the name "example" is present in the folder specified, the open
            method will open it in order for us to write content into it. If the file does not exist, a text file with
            the name "example.txt" will be created. Note the format of the file is ".txt" which means that the file can
            be opened using any text editor i.e notepad.*/

            myWriter.Write("The file was opened correctly and this is the first line I have written!");

            /* Similar to that of Console, we can specify .Write or .WriteLine, depending on if
            you want an end of line character at the end of that line.
            Since the file is open, we can transfer text through the TetWriter and store
            it in text file with the title "example". After that, we can close it. It is
            good practice to always close the files you are working with as soon as you
            are done using them.*/

            myWriter.Close();



            // ********** Opening file modes and reading from a file *********************

            //Follow the instructions above for writing files to get the path for the number.txt file in your Task 10 folder,
            //and then use this to replace "REPLACE ME!" in the examples below.

            TextReader myReader;// An input file stream object so that we access a file on disk            

            /*
            Now we can open any text file, in this case we open the text file called
            number.txt. When we open it, we specify the mode we are opening it in.

            **Types of file reading modes**
            1) Read a line at a time.
            2) Turn the file into an array of lines.
            3) Reading the whole file at once. This can be very slow depending on the size of the file.             
             */

            /************ 1) - A line at a time **************/
            Console.WriteLine("\nReading in a line at a time");            
            myReader = File.OpenText(readFilePath);
            string txtResults = ""; //to store the text that we read by appending new lines

            while (true) //This looks like an infinite loop, but don't worry - we break out from inside the loop.
            {
                string theLine = myReader.ReadLine();
                if (theLine == null) break; //check if we have reached the end of the file
                txtResults = txtResults + theLine + '\n'; //append the new line to the existing text read in
            }
            //txtResults now holds all of the lines as a single string which have been read in a line at a time.
            Console.Write(txtResults);
            myReader.Close();


            /************ 2) - Array of lines **************/
            Console.WriteLine("\nReading in as an array of lines");
            myReader = File.OpenText(readFilePath);
            string[] allLines = File.ReadAllLines(readFilePath);//the lines from number.txt have been stored in an array
                                                                // - one entry in the array holds one line.
            txtResults = ""; //clear the results
            for (int i = 0; i < allLines.Length; i++)
            {
                txtResults = txtResults + allLines[i] + '\n';
            }
            Console.WriteLine(txtResults);


            /************ 2) - Whole file at once **************/
            Console.WriteLine("\nReading in as a whole file");

            string wholeFile = File.ReadAllText(readFilePath);
            Console.WriteLine(wholeFile);
            Console.ReadLine();

            //Now that you know different ways to read from and write to files,
            //you can attempt the compulsory exercise. We highly recommend doing the optional
            //exercises as well.
        }

        /*
        ######## COMPULSORY TASK 1 ########
        Follow these steps:
        NOTE: Make a copy of this folder on your computer. Submit the required files when you done

        Before you go any further, have a look at the example program written for you, run it by hitting F5 when opened. 
        Look at the output of the code written within the Files Project’s program - the comments are there to help you.
 
        Create a new C# Project called PlayingWithFiles within your Task folder and do the following:

        Write your name to a text file titled my_name.txt Don't forget to close it after writing to it.

        Open a text file titled king.txt in 2 file modes in order to write to it without erasing the data it already contains. The text data it already contains is: "C# is ", the only thing you have to do is write code that will append "king" to the text "C# is ". The final result: "C# is king.". You can find this text file inside the default task folder.

        Lastly, read in all the integer numbers and write them to another file called myNumber.txt.

        Hints: 
        1. Check if file exists.
        2. The display must list the numbers, make use of the new line escape sequence: \n
        3. Copy king.txt and number.txt to PlayingWithFiles/bin/debug to read and write to files.

        
        ######### COMPULSORY TASK 2 ########
        Follow these steps:

        Create a new Project called Reversed in your Task folder.

        Write a program that reads a file and writes out a new file with the lines in reversed order (i.e. the first line in the old file becomes the last one in the new file.)

        Use your lines of text.
        */
    }
}
