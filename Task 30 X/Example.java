// Welcome to the Enumerators Task.

/* --- Opening this file --- 

	Please do not open this file in the wrong program such as Notepad or Notepad++.
	For our Java course, all files should be opened in the program JGRASP. 
	  
	** Double check that both JGrasp and Java are installed on your computer as per the instructions in the Welcome document **

	To do this, run JGRASP from your computer where it should be installed. Double click the JGrasp icon on your Desktop to run JGRASP.
	In the top left corner of JGRASP, click File->Open
	Navigate to this .java file inside your Dropbox folder on your computer (usually under C:/Users/YourUsername/Dropbox/YourDropboxFolderName/Task/example.java)
	Double click on example.java and it will open in JGRASP. 
	You may now continue reading the rest of this file.


   ************* HELP *****************
   REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
   ************************************
*/

import java.util.*;

	class EnumExample1{  
	
		//Basic Enumerator declaration
		enum Season { 
			WINTER,
			SPRING,
			SUMMER,
			FALL; 
		}  
		
		public static void main(String[] args) {  
      
         //Variable assignment from Enum
         Season x = Season.WINTER;
         System.out.println(x);
         
         //Loop to iterate through Enum and print it's content
			for (Season s : Season.values())  
				System.out.println(s);  
		}
	}
   
   //Initializing specific values to the Enum constants
   class EnumExample2{  
      enum Season{   
         WINTER(5),
         SPRING(10),
         SUMMER(15),
         FALL(20);   
        
      private int value; 
      
      //Initialising properties of Enum 
      private Season(int value){  
         this.value=value;  
      }  
      
      }  
      public static void main(String args[]){  
         for (Season s : Season.values())  
            System.out.println(s+" "+s.value);  
      }  
   }  
   
   //Applying Enum on switch statement
   class EnumExample3{  
      enum Day{ 
      SUNDAY, 
      MONDAY, 
      TUESDAY, 
      WEDNESDAY, 
      THURSDAY, 
      FRIDAY, 
      SATURDAY;}
        
      public static void main(String args[]){  
         Day day=Day.MONDAY;  
      
      //Switch statement to test for Enum values  
      switch(day){  
         case SUNDAY:   
            System.out.println("sunday");  
            break;  
         case MONDAY:   
            System.out.println("monday");  
            break;  
         default:  
            System.out.println("other day");  
      }
      }
   }  
 	
/* ======================================== COMPULSORY TASK ==========================================
   
	•Create a new java file called Planet.java
	
	•Create a public Enum called ‘Planet’.

	•Define the following values within the Enum:
		-MERCURY (3.303e+23, 2.4397e6)
		-VENUS (4.869e+24, 6.0518e6)
		-EARTH (5.976e+24, 6.37814e6)
		-MARS (6.421e+23, 3.3972e6)
		-JUPITER (1.9e+27, 7.1492e7)
		-SATURN (5.688e+26, 6.0268e7)
		-URANUS (8.686e+25, 2.5559e7)
		-NEPTUNE (1.024e+26, 2.4746e7)

	•Define two private final Double variables; ‘mass’ and ‘radius’.

	•Initialise the Planet properties as such:
		Planet(double mass, double radius) {
			this.mass = mass;
			this.radius = radius;
		}

	•Create a public static final Double variable called ‘G’ and set it to 6.67300E-11.

	•Define a Double method called ‘surfaceGravity’ which returns the result of:
		- G * mass / (radius * radius)

	•Define a Double method called ‘surfaceWeight ’ which takes a Double variable called
	‘otherMass’, and returns:
		-otherMass * surfaceGravity()

	•Create a main method which does the following:
		-Ask the user for their weight
		-Convert this String input to a Double called earthWeight
		-Create a Double variable called earthMass which is equal to:
			~earthWeight/EARTH.surfaceGravity()
		-Create a loop to iterate through each planet in the Planet Enum to display the
		 user’s weight on each planet.

	•Compile, save and run your file.
					   
   ===================================================================================================
*/