// Welcome to the Introduction to Object Orientated Programming Task.

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

public class example {

    class SimpleCow {

        /**
         * A multiline comment is called a docstring and is used to store
         * information about the class, function, or file/module in which it is
         * contained. It is combined with others in the same class to form a
         * javadoc
         *
         * Documenting the code you write is of fundamental importance.
         * Docstrings allow you to somewhat automate the process; there are
         * tools within Netbeans and Eclipse that generate documentation from
         * docstrings. IDEs like Eclipse and Netbeans can also display them as
         * part of their autocompletion.
    *
         */
        String color, _noise = "moo!";

        public SimpleCow(String color) {
            /**
             * This is the constructor for the class SimpleCow. A constructor
             * creates a new instance of a class (see the introductory reading).
             *
             * To instantiate a class with the constructor, you simply call the
             * class name like a function with the keyword 'new':
             *
             *
             */
            this.color = color;
        }

        public void make_noise() {
            /**
             * Method that prints the cow's noise to standard output...
             *
             * A method is simply a function attached to an object (see
             * reading). In Java, methods and properties are accessed with the
             * dot operator: blue_cow.make_noise()
             */
            System.out.println(_noise);
        }

        void set_color(String new_color) {
            /*
             *Paints the cow a different color
             *This method is meant to be an example of the way that methods can modify an object's state.
             *
             *Get/set methods for object properties are a common sight in object-oriented code,
             */
            color = new_color;
        }

        String get_color() {
            /**
             * Method that returns the cow's color
        *
             */
            return color;
        }

        boolean compare(SimpleCow other) {
            /* String contents are compared via .equals
             == compares the objects they themselves.*/
            return color.equals(other.color);
        }

        @Override
        public String toString() {
            /*
             Allows for use to return a string representation of an object
             */
            return this.color + ' ' + this._noise;
        }
    }
	
	    example() {

        SimpleCow blue_cow = new SimpleCow("blue");
        SimpleCow red_cow = new SimpleCow("red");

        blue_cow.make_noise();

        System.out.println(red_cow.compare(blue_cow));

        blue_cow.set_color("red");
        System.out.println(red_cow.compare(blue_cow));
    }

    public static void main(String[] args) {
        new example();
    }
}

/* ======================================== COMPULSORY TASK 1 ========================================
   
   -Create a new file called OOP.java
   
   -Create an Accessor method which returns the full name of the human in the format “John Smith”.
	
   -This can be accomplished in two ways. You can access the variables directly or you can make use of the accessor methods you created earlier. Try both.
		
   -Compile, save and run your file.
					   
   ===================================================================================================
   
   ======================================== COMPULSORY TASK 2 ========================================
   
   -Modify you OOP.java program to do the following.
	
   -Implement the Human class as demonstrated in the task document.
   
   -Next, define two new Human objects, John and Thabang.
	
   -For both objects, assign each a First name, Surname, Age, and Gender property.
   
   -Print out each object with all information on the object displayed on one line as such:
		John Smith Male 24
   
   -Compile, save and run your file.
   ===================================================================================================
   
   ======================================== COMPULSORY TASK 3 ========================================
   
   -Modify you OOP.java program to do the following.
	
   -Extend your Human class to have at least another 3 fields which are relevant to all humans (Try make use of different data types).
   
   -Ensure you create accessor and mutator methods for all the new fields.
	
   -Try make your human as detailed as possible. (Can you see the usefulness of classes and OOP?).
   
   -Using your new properties, assign further information on your two Human objects.
   
   -Print out each object with all information on the object displayed on one line as such:
		John Smith Male 24 Engineer Toyota
   
   -Compile, save and run your file.
   ===================================================================================================
*/