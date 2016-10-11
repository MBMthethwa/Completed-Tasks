//    This is a comment in C#. Comments can be placed anywhere within your code and the compiler will
//    ignore them.
//    Comments are for human eyes only - you can make a comment anywhere by placing // in front of your comment.
//    For a multi-line comment, place a /* in front of what you wish to say and */ behind it.

/*
    This is a multi-line comment
    You use this when you have a lot to type 
 */

/*
    This document should be open in your IDE. If not, ensure that your IDE is installed on your system
    and ensure that this file is open in your IDE. To open it in your IDE, simply double-click on this file once
    your IDE is installed and it will automatically open it.

    In order to fully understand the basics of C#, you must please read through all the comments in this file.

    ========== WELCOME TO THE C# COMPONENT OF THE CERTIFIED SOFTWARE DEVELOPER MICRODEGREE ==========

    This is a programming course that will briefly skim over the basics of C# programming before diving into the
    more challenging aspects of what some consider the tough concepts of this course.
    C# is similar to Java or Python so having done both if these by now you should pick up on the concepts fairly quickly.
	This section still starts at the beginning with concepts you may be fairly familiar with by now, but explains them in terms of C#.
	Even though C# is fairly similar to Java, there are some subtle differences which will be explained to you throughout this section.
	

    ********** HELP ***********

    REMEMBER THAT IF YOU NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM

    Feel free to post any comments or feedback on our Facebook wall located at www.facebook.com/hyperiondev
    Visit www.rmoola.com/advice.html and www.hyperiondev.com for more information on getting assistance.

    ***************************

    Now we can start getting down to the programming part. Look at the sample program below:*/

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks; // These serve the same purpose as the import statements in the Java section of the course. 
                              // Feel free to look back to refresh your memory!

namespace HelloWorld
{
    class Program
    {
        static void Main(string[] args)
        {
            string name;
            int num;
            Console.WriteLine("Please enter your name(hit enter once you have typed it in):");
            name = Console.ReadLine();
            Console.WriteLine("Hello, " + name + ", welcome to the Hyperion C# component of this MicroDegree!");
            Console.WriteLine("Please enter your favourite number(hit enter once you have typed it in):");
            num = int.Parse(Console.ReadLine());
            Console.WriteLine("Your favourite number is: " + num);
            Console.WriteLine("Hello world!");
            //new HW.run();
        }
    }
}
/*
    The above is a basic C# program.

    Before going any further, press F5 on your keyboard or click on the sideways green triangle at the top left corner of the screen.
    This will run the program that has been written above for you to see what a basic C# program looks like.
    The program above will ask for your name and then welcome you to the course as well as print out the line "Hello World".

    The rest of the document will be spent explaining what each of the words and symbols mean.
    Each line is executed/completed (in order) from top to bottom when the program is run - do not forget this when writing your programs
    later on!

    using System;
    using System.Collections.Generic;
    using System.Linq;
    using System.Text;
    using System.Threading.Tasks;

    These are the first five lines of code. This is known as "library imports".
    This will tell the compiler to include the library functions which are located within your compiler's directory and will allow
    you to use many of its features.

    namespace HelloWorld

    This statement allows the program to use all the names in any included C# library files. If you do not know what we're talking about, 
    don't worry!
    Just remember to include it in any future programs.
    Note that a semi colon ; is used to terminate the statement - do not forget this for your statements or you will
    receive an error message.
    
    class Program
    
    C# is an Object-Orientated language - this will be explained later in the course.
    Using classes allows us to be clever and sort our programming in a logical manner.
    
    static void Main(string[] args)
    {

    }

    The Main function is the main part of your program.
    This contains what will run when your program begins execution.
    The Main function is one of many possible functions that can exist in a program but only one function in a program
    can be called Main.
    The void before Main states what kind of variable will be returned, in this case nothing.
    Do not worry about the brackets after main for now, just make sure that your program has them.
    Below the main function declaration are two curly brackets, known as braces.
    These are used in pairs - the left brace { , shows where the main function begins and the right } , shows where it ends.
    Both braces are mandatory for your program to run, do not forget them!

    string name;

    This is the first statement within the main function of the program.
    There are many different variable types within C#, the one this line refers to is the string data type.
    Strings store text in memory and can therefore be used later in the program for a variety of different things.
    Notice how it is a lower case 's', unlike Java in the previous section of the course.
    Another variable type is the int type and can be written like this:

    int myAge;

    The above creates a space in memory for an integer to be stored for use in the program.

    Variables need to be given names too - this string is called "name".
    There are good and bad variable names:

    lastName is a good variable name.
    variableOne is not a good variable name because it is too vague and it will be difficult to keep track of names when writing
    larger programs.

    Don't forget the semi-colon after each line in your functions!

    Console.WriteLine("Please enter your name(hit enter once you have typed it in):");

    Console is a built-in object within the C# language with a function WriteLine that allows the program to write text on the screen for the
    user to read.
    This is helpful as it gives the user direction on what to do next within the program, for example this program
    wants the user to enter their age.
    Please note that the text being outputted is enclosed within " " as it is a string
    otherwise your program will return an error at compile-time.

    name = Console.ReadLine();

    ReadLine is another built-in function that takes in input from the user and allows it to be stored in a variable for
    example, the string called "name".
    Notes that the = symbol sets the variable with the input from the user.

    Console.WriteLine("Hello, " +name+ ", welcome to the Hyperion C# course!");

    This is a line in which multiple + are used. + allows for combination of text and numbers when formatted as a string, known
    as concatenation.
    Each piece of information contained between the symbols will be outputted in the order that they are written.
    The unseen entry in the statement is a newline keyword - this moves the following output to the next line so as to
    make your program look neater and easier to read.
    Note that specific text is enclosed between " " and variables are just written on their own.

    num = int.Parse (Console.ReadLine());
 
    This allows us to write a number and then we convert it into a number. All input added through the console
    is initially text.
 
    Console.WriteLine("Hello world!");

    This is the last statement that is within the main function- can you guess what it will do?
    Re-read the above if you find that you are having difficulties.
*/

/*
    ========== OPTIONAL TASK ==========

    Now that you have been given a bit of knowledge on the basic input and output of a C# program, you can begin to
    play around to create your own C# program.
   
    First find your 'Solution Explorer', if you cannot, then go to 'View' and click on 'Solution Explorer'
    You see HelloWorld in your solution explorer? Right click on the entry and click 'Add' and then 'Class'.
    Name your class as 'HW.cs'
    There will now be a new class empty file in your IDE.

    First, copy the text below into your new C# class in between the class braces({ ... }).

    public void run() { 
    Console.WriteLine("I am a natural professional!"); 
    }
    

    Run the program by pressing F5 and note what happens.
 
    You should notice that nothing happens! Go back to the Main method above and uncomment the line: new HW.run();
 
    Write a new comment in your class file stating what output the program produces.

    You may also play with the code a bit to see what will happen when you change the content of your program and note
    what happens when things are changed when you change your code. */

/*
    ########## COMPULSORY TASK 1 ##############
    
    Follow these steps:

    NOTE: Make a copy of this folder on your computer. Submit the required files when you are done.

    Before you go any further, Open the Example Programs folder in your Task folder. Have a look at the two example programs written for you, run them by hitting F5 when opened. Look at the output of each program and compare it to the code written within the file - the comments are there to help you.

    Create a new C# project called InOut within your Task folder and do the following:
        Click file and then new Project.
        Select C# Console Application and name it InOut.

    Here are your instructions:

    Get the user's name.
    Get the user's age.
    Print the user's name and age.
    Print Hello World on a new line.
*/