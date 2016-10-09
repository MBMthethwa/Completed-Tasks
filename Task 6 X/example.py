# Welcome to the example file for Introduction to Functions.

# ************* HELP ******************
#  REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM, OR CREATE A NEW TEXT FILE IN THIS FOLDER CALLED 'HELP'.
# *************************************

# ===== Functions in Python=====
# Recall from the previous task:

# A function is a block of defined code that is only run when you call it.
# This is a great way to reuse code and store logic that can be called from anywhere else in the program in just one line. 

def addone(x):
    return (x+1)

# This function takes in a variable x and adds one to it! In this instance we'll assume that x in an integer since we're working with numbers, however the type of input variable you use will vary based on the applications of your functions.
# Return means what you will get back if you go number = addone(5) , you'll get the int 6 which is 5 + 1.
# We can call the input variable (here x) anything we want. It's just a name we give it so we know how to refer to it within the function (every indented line under the def addone(x) line is 'within' the function).

print str(addone(2)) # This will print out 3. 

# Sometimes you may need to create a function which can handle multiple arguments(input variables) in order to do what you require. Passing arguments into a function are one the most beneficial components of functions, and the best part is that you could pass as many as you want. Take a look at the example code below.

def power(base, exponent):  
    result = base**exponent
    print (result)

power(3,5)
	
# Here we've created a function which accepts two arguments and prints the result of the base to the exponent using the ** operation (where x ** y means x^y). This function allows us to reuse it as many times as we want, whereas hard coding (doing the math yourself), would have to be done each time you required the calculation.

# Something which may become handy to you at a later point is the ability to import certain files or modules into your program to be handled by your functions. Below is an example.

import math            # This line imports the math module.
everything = dir(math) 
print (everything)

# The above code has imported all content from the math module which we've then simply printed/listed on the console to view.
# This is extremely useful when you need to import contents from modules or even other programs you've created - but we'll take a look at that later.
# Python has a number of built-in functions. dir() is one of them. This function returns all the names or attributes for the specified input parameter(here the math module). 


# Lastly, it may be useful to know about some more built-in functions that can do work for you. 
# Examples of these can be found below.

maximum = max(1,5,7,3,6)
print (maximum)

minimum = min(1,4,7,1)
print (minimum)

absolute = abs(-42)
print (absolute)

# When you run this code, you'll notice how the functions automatically do the mathematical operation for you without any definition.

# We'll look at more advanced functions and how they can be applied in the next task.

# You now have all the tools for the compulsory task.
# COMPULSORY TASK 1:
'''
	Create a new Python file in this folder called functionPractice.py.
	Define a function, sumAll(n) that sums all numbers from to 1 to n.
	For example, calling sumAll(10) should return the answer to 1 + 2 + 3... + 10.
	The function sumAll(n) will have to use a for loop to carry out this summation, and it will have to use a sum variable that increases in value over each iteration of the for loop.
'''

# COMPULSORY TASK 2: 
'''
    Create a Python file called "amazon.py" in this folder.
    Write code to create user-defined functions for the following operations: Minimum, Maximum, Sum, Average, and Standard Deviation. These functions should run on a defined list, and write the outputs to a text file called output.txt.
    Define a list of values as follows:
        list = [1, 5, 8, 77, 24, 95] (you can make this list as long as you want, just remember the commas).
    Your program should generate output.txt as follows:
        The min of [1, 5, 8, 77, 24, 95]  is 1.
        The max of  [1, 5, 8, 77, 24, 95]  is 95.
        The avg of  [1, 5, 8, 77, 24, 95]  is 35.	
    Your program should handle any length of input numbers. You can assume that the list of input numbers are always valid integers and the list is never empty.
'''
