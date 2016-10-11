// Welcome to the Introduction to Object Orientated Programming - Inheritance Task.

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

/*
	Inheritance is one of the features of Object-Oriented Programming (OOP). Inheritance allows a class to use the properties and methods of another class.
    In other words, the derived class inherits the states and behaviors from the base class. The derived class is also called the subclass,
     and the base class is also known as the super-class. 
     The derived class can add its own additional variables and methods.
      These additional variable and methods differentiates the derived class from the base class.

	Inheritance is a compile-time mechanism. A super-class can have any number of subclasses. 
   But a subclass can have only one superclass. This is because Java does not support multiple inheritance.

	The superclass and subclass have an is-a relationship between them. Lets have a look at the example below.

	
	Lets consider a superclass Vehicle. Different vehicles have different features and properties, however there are a few of them which are common to all.
    Speed, color, fuel used, and size are just a few which are common to all. 
    Hence we can create a class Vehicle with states and actions that are common to all vehicles. 
	
	The subclass of this superclass can be any type of vehicle. Example: Class Car  A has all the features of a vehicle.
    But it has its own attributes which makes it different from other subclasses. By using inheritance, 
    we need not rewrite the code that weve already used with the Vehicle. The subclass can also be extended.
     We can make a class Sports Car which extends Car. It inherits the features of both Vehicle and Car.
*/

	// A class to display the attributes of the vehicle
class Vehicle {
   String color;
   int speed;
   int size;
   void attributes() {
      System.out.println("Color : " + color);
      System.out.println("Speed : " + speed);
      System.out.println("Size : " + size);
   }
}

// A subclass which extends vehicle
class Car extends Vehicle {
   int CC;
   int gears;
   void attributescar() {
      // The subclass refers to the members of the superclass
      System.out.println("Color of Car : " + color);
      System.out.println("Speed of Car : " + speed);
      System.out.println("Size of Car : " + size);
      System.out.println("CC of Car : " + CC);
      System.out.println("No of gears of Car : " + gears);
   }
}
public class Example {
   public static void main(String args[]) {
      Car b1 = new Car();
      b1.color = "Blue";
      b1.speed = 200 ;
      b1.size = 22;
      b1.CC = 1000;
      b1.gears = 5;
      b1.attributescar();
   }
}

/*
	The derived class inherits all of the members and methods that are declared as public or protected. 
   If declared as private, it cannot be inherited by the derived classes. The private members can only be accessed in its own class.
    The private members can be accessed through accessor methods as shown in the example below. The derived class cannot inherit a member of the base class 
    if the derived class declares another member with the same name.
*/

/* ======================================== COMPULSORY TASK 1 ========================================
   
   Modify the existing Animal.java file for this task.
   
   Using the Lion class template as shown in the pdf file, expand the class to have features specific to a lion.
	
   Add a field for lion type
   
   Add a method in this class which sets the lion type based on its weight (note that the weight is a derived field from the superclass).
   
   If they weight is less than 80kg, its type should be a cub. If less than 120kg, it should be female. And if greater than 120kg.
   
   Print out the type of lion
		
   Compile, save and run your file.
					   
   ===================================================================================================
   
   ======================================== COMPULSORY TASK 2 ========================================
   
   Modify the existing Animal.java file for this task.
	
   Create a class called Cheetah that:
		Inherits from the Animal class.
		Makes use of at least one static field which needs to have a static setter and getter.
		Contains a constructor.
		Contains a toString() method.
		Has an array as one of its fields.
   
   Create an application class, and within it create a Cheetah object and print it out with the main method.
	
   Compile, save and run your file.
   ===================================================================================================
*/
