// Welcome to the Advanced Object Orientated Programming Task.

/* --- Opening this file --- 

Please do not open this file in the wrong program such as Notepad or Notepad++.
For our Java course, all files should be opened in the program JGRASP. 
  
** Double check that both JGrasp and Java are installed on your computer as per the instructions in the Welcome document **

To do this, run JGRASP from your computer where it should be installed. Double click the JGrasp icon on your Desktop to run JGRASP.
In the top left corner of JGRASP, click File->Open
Navigate to this .java file inside your Dropbox folder on your computer (usually under C:/Users/YourUsername/Dropbox/YourDropboxFolderName/Task/example.java)
Double click on example.java and it will open in JGRASP. 
You may now continue reading the rest of this file.

*/


/* ************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
   ************************************
*/

//=================== CONSTRUCTORS ===================
/*
It can be tedious to initialize all of the variables in a class each time an instance is created.
It would be simpler and more concise to have all of the setup done at the time the object is first
created. Because the requirement for initialization is so common, Java allows objects to initialize
themselves when they are created. This automatic initialization is performed through the use of a
constructor.

It has the same name as the class in which it resides and is syntactically similar to a method.
Lets begin by defining a simple constructor that simply sets the dimensions of each box to
the same values.
*/

class Box {
	double width;
	double height;
	double depth;
	
	// This is the constructor for a Box.
	Box() {
	System.out.println("Constructing Box");
	width = 10;
	height = 10;
	depth = 10;
	}
	
	// Compute and return volume.
	double volume() {
	return width * height * depth;
	}
}

class BoxDemo {
   public static void main(String args[]) {
      // Declare, allocate, and initialize Box objects.
      Box mybox1 = new Box();
      Box mybox2 = new Box();
      
      double vol;
      
      // get volume of first box
      vol = mybox1.volume();
      System.out.println("Volume is " + vol);
      
      // get volume of second box
      vol = mybox2.volume();
      System.out.println("Volume is " + vol);
   }
}
/*
As you can see, both mybox1 and mybox2 were initialized by the Box() constructor when 
they were created. Since the constructor gives all boxes the same dimensions, 10 by
10 by 10, both mybox1 and mybox2 will have the same volume.

Most constructors will not display anything. They will simply initialize an object.
*/

//=================== Overloading Methods ===================
/*
Method Overloading is a feature that allows a class to have two or more methods having
the same name, if their argument lists are different.

Argument lists could differ in:
1. Number of parameters (refer to DisplayOverloading example).
2. Data type of parameters (refer to DisplayOverloading2 example).
3. Sequence of Data type of parameters.
*/

class DisplayOverloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}

class DisplayOverloading2
{
    public void disp(char c)
    {
        System.out.println(c);
    }
    public void disp(int c)
    {
       System.out.println(c );
    }
}

public class Example
{
   public static void main(String args[])
   {
       DisplayOverloading obj = new DisplayOverloading();
       obj.disp('a');
       obj.disp('a',10);
       
       DisplayOverloading2 ob = new DisplayOverloading2();
        ob.disp('a');
        ob.disp(5);

/* DisplayOverloading: 
   Method disp() has been overloaded based on the number of arguments  We have two
   definitions of method disp(), one with one argument, and another with two arguments.
   
   DisplayOverloading2:
   Method disp() is overloaded based on the data type of arguments  Like DisplayOverloading, 
   we have two definitions of method disp(), one with a char argument and another
   with an int argument.
*/

//=================== toString() Method ===================
/*
Every class implements toString( ) because it is defined by Object. However, the default
implementation of toString( ) is seldom sufficient. For most important classes that you
create, you will want to override toString( ) and provide your own string representations.
Fortunately, this is easy to do. The toString( ) method has this general form:

String toString( )

To implement toString( ), simply return a String object that contains the human-readable
string that appropriately describes an object of your class. By overriding toString( )
for classes that you create, you allow them to be fully integrated into Javas programming
environment. For example, they can be used in print( ) and println( ) statements and in
concatenation expressions.

The following program demonstrates this by overriding toString( ) for the NewBox class:
*/   
      NewBox b = new NewBox(10, 12, 14);
      String s = "Box b: " + b; // concatenate Box object
      System.out.println(b); // convert Box to string
      System.out.println(s);
   }
}

class NewBox {
   double width;
   double height;
   double depth;
   NewBox(double w, double h, double d) {
      width = w;
      height = h;
      depth = d;
}
public String toString() {
    return "Dimensions are " + width + " by " + depth + " by " + height + ".";
    }
}

/* ======================================== COMPULSORY TASK 1 ========================================
   
   Create a new file called SpeedOOP.java
   
   Create a class called Car and do the following:
 		Define properties within the class for its model, colour, brand and top speed.
		Create all accessor and mutator methods for these fields as well as a constructor which sets
		all the fields to default values (this constructor should take no parameters).
		Overload this constructor with one which sets all the fields to values specified in the
		parameters of the constructor.
	
   Create a class called Race and do the following:
		Define one property called trackLength as well as two Car objects. (Do not initialise the
		car objects yet as this will be done in the constructor).
		Create the the constructor which will take three parameters - two car objects and one int
		value for the length of the track.
		Assign the parameters to the fields that were defined earlier in the class.
	
	Create a function called Race which determines the following:
 		Which car wins the race based on their top speed.
 		Calculate how long it takes the winning car to complete the race
 		If the cars have the same top speed, the function should return This race was a tie!.
		The output should return the output in the following format:
			BMW i8 won the race covering a distance of 1000m in 9.3 seconds.
			
	Create a class called Application to do the following:
		Ensure the class has a main method
		Within this method, define two cars as well as a Race object (using the two cars you just created).
		Your cars may be customised or default cars (Your choice!).
		Using the Race object you just created, predict which car would win and print this out.
	
   Compile, save and run your file.
					   
   ===================================================================================================
   
   ======================================== COMPULSORY TASK 2 ========================================
   
   Create a new file called MethodsInOOP.java
	
   Create a class for formula one cars. It only needs four fields:
		Number of wheels
		Top speed
		Cost per wheel
		Wheel brand
   
   Decide which of these fields can be defined as static fields
	
   Ensure the static fields have static setters and getters
   
   Be mindful of which variables and methods should or shouldnt be public.
   
   Create a main method for this class and create a formula one car object.
   
   Print out all the fields of the object.
   
   Compile, save and run your file.
   ===================================================================================================
*/
