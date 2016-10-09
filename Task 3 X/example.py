# Welcome to the example file for your next task.
# Now that you've completed the basic introduction to Python we are going to use what we know and apply it to a scenario.

#In this compulsory task we will be looking at investment returns and how different rates affect how much you get back.
#There are some examples below which we recommend reading through and understanding to assist you in completing the compulsory task.

# I also hope you are able to Google and use the python documents to find certain information out. This is a programmer's greatest tool.
# Our teachers are of course still completely willing to help you!

# ************* HELP *****************
#  REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM, OR CREATE A NEW TEXT FILE IN THIS FOLDER CALLED 'HELP'
#  Visit www.hyperiondev.com and login to see all the ways you can get help.
# *************************************

 
# ==== A few examples to recap what we have learnt so far ====

# ==== TYPES ====
#Variables have different types and depending on what sort of operation you wish to do on them they may need to be of a different type.
# For example, checking the comparison below you will see how even if they seem to have the same value, that they are not equivalent.

if 9 =="9": #Comparing an integer and a string
	print ("Types matter")
else:
	print("Types don't matter")

#To avoid this you need to change the type by casting. This is often used when the user is giving input as that is usually stored as a string.
#Casting is done as follows:

if 9 == int("9"):
	print ("Successful casting")
else:
	print ("I didn't need to cast that!")


# ==== INPUT ====
#It is often useful to prompt the user for some form of input, such as their age, height, or an answer to a question (yes/no), etc.
#This is done by using raw_input which stores the answer as a string if you assign a variable to store the value. Remember that
#giving your variables meaningful names is crucial as in writing larger programs one can get very lost if you were to store them as
#var1, var2, etc.

userAge = raw_input("What is your age?")
userHeight = raw_input("What is your height in cm?")
userWeight = raw_input("What is your weight in kgs?")


# === COMPARISONS AND CONDITIONS ====
#At a certain point in your program you may want to do something different depending either on what has happened already or what
#the user inputs. An if statement is very useful for this and takes on the following structure:


if len("Hello World")>6:
        print("This sentence is long!")
elif len("Hello World")>3:
        print("Slightly more manageable!")
else:
        print("Easy stuff")
        

#==== LOOPS ====
#Now what if you want to ask the user for input a certain number of times? A for loop is used here and is as follows:

for i in range(0,10):
        print(i)
        
#Notice how the first number is included, and the last excluded.



#====SOMETHING NEW!====
        
#==== WHILE LOOPS ====
#Another loop is the while loop which executes until the condition is no longer met. This is similar to the for loop, except
#a for loop runs a set number of times specified at the start (such as zero through to ten). An example is given below:

a=0
while a<10:
        print(a)
        a++ #Equivalent of a = a + 1

#Initially a is set to 0. The while loop is started as it checks the condition to see if it is true, in which case it executes
#the body of code associated with it. So a is less than 10, so it prints the value, increments by 1 and goes back to the top
#of the loop to check the condition again, and so on and so forth.
        
        
# === LET'S GET GOING! ====
#You now know enough to complete the compulsory task. We do, however, recommend that you go through the following exercises as, not only
#will it better your understanding of programming, but also make the compulsory task a lot easier.


# ======================= Play around with Python a bit (1) (OPTIONAL TASK) ============================
#
# Ask the user to enter a number less than 100. If they enter one above 100, ask them to try again (and continue to do so until they follow instructions.
# Once they have entered a valid number, check if it is even and if it is then multiply it by 2 and print it out. If it isn't, then multiply it by 3 and
# print it out.
#
# ==================================================================================================



# ======================= Play around with Python a bit (2) (OPTIONAL TASK) ============================
#
# Earlier we asked the user to input their age, weight and height. Now let's use this to calculate their Body Mass Index (BMI).
# The formula to calculate their BMI is as follows:
# BMI = weight(kg) / (height (m) * height (m)
# Using this, tell the user their BMI for their current age. The output should look as follows:
# At age 21 your BMI is 27.2

# HINT: Watch out for what units the calculation is in as well as what type the variables have been stored as!
#
# ==================================================================================================
