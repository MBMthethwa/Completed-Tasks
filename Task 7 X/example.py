# Welcome to the example file for your next task.
# Now that you've completed the basic introduction to functions in Python we are going to use what we know and apply it to a scenario.

# In this compulsory task we will be looking at planning the costs of a holiday, whilst taking factors into consideration such as holiday locations, travel costs, etc.
# To further prepare you for this task, the additional reading and examples below will assist you in completing the compulsory task.

# I also hope you are able to google and use the Python documents to find certain information out. This is a programmer's greatest tool.
# Our teachers are of course still completely willing to help you!

# ************* HELP *****************
#  REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM, OR CREATE A NEW TEXT FILE IN THIS FOLDER CALLED 'HELP'.
#  Visit www.hyperiondev.com and log in to see all the ways you can get help.
# *************************************

# ==== A few examples to recap what we have learnt so far ====

# ==== ARGUMENTS ====
# Functions are really handy, you could think of them as being rechargable batteries, because once you have created one, you can use it over and over again.

def print_function():
	return ("I don't do much.")
	
print (print_function())
	
# The problem with the above function, is that it doesn't really do much aside from the print statement inside it. What makes functions so unique is their ability to operate on some data.

def power_function(base, exponent):
	result = base ** exponent
	print (result)
	
power_function(4,3)

# The above function has demonstrated reusability as its input arguments can be changed repeatedly. Note that functions can take as many arguments as you create them to, but sometimes too many can lead to a problem in their future use.

# ==== IMPORTS ====
# Although creating functions is really awesome, it also becomes a bit tedious over time, which is why Python provides you with modules loaded with built-in functions. All you have to do is import what you want, either the entire module or simply a function from the module.

from math import sqrt
print (sqrt(16))

# ==== BUILT-IN FUNCTIONS ====
# It's worth noting that not all built-in functions have to be imported, there's a large quantity that are always available to you without any additional code required.

minimum = min(1,4,7,1)
print (minimum)

absolute = abs(-42)
print (absolute)

# ==== SOMETHING NEW! ====

# ==== FUNCTIONS WITHIN FUNCTIONS ====
# Note: This section will be a big aid in helping you complete your compulsory task, if you're still unhappy with it, you'll find many online sources on this section and your tutor is always on standby to help!

# A simplistic analogy of this process is a recipe. You have small steps which consist of their own process, and the final step produces a product based on the outcome of each little step carried out along the way. 

# Calling functions within a function allows for maximum code reusability as you'll have created many small function segments, with one unique function at the end which utilises the functions you've created.

def study_time(hours):
	return (0.03*(hours))
	
def past_papers(number_of_papers):
	return (0.05*(number_of_papers))
	
def anticipation(mood):
	if mood == "confident":
		return (0.2)
	elif mood == "anxious":
		return (0.1)
	elif mood == "stressed":
		return (-0.1)
	else:
		return (0)
	
def prepared_for_test(hours, number_of_papers, mood):
	result = (study_time(hours) + past_papers(number_of_papers) + anticipation(mood)) * 100
	return ("Chance of passing test: " + str(result) + "%.")
	
print (prepared_for_test(15,2,'stressed'))

# The above code shows how we created functions for various situations, and then utilised one final function to call those functions for a result.

# === LET'S GET GOING! ====
# You should now be well equipped to tackle your compulsory task! Good luck!
