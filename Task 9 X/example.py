# Welcome to the example file for your next task.
# Now that you've completed the basic introduction to lists and hashing in Python we are going to use what we know and apply it to a scenario.

# In this compulsory task we will be looking at planning the costs of a holiday, whilst taking factors into consideration such as holiday locations, travel costs, etc.
# To further prepare you for this task, the additional reading and examples below will assist you in completing the compulsory task.

# I also hope you are able to google and use the Python documents to find certain information out. This is a programmer's greatest tool.
# Our teachers are of course still completely willing to help you!

# ************* HELP *****************
#  REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM, OR CREATE A NEW TEXT FILE IN THIS FOLDER CALLED 'HELP'.
#  Visit www.hyperiondev.com and log in to see all the ways you can get help.
# *************************************

# ==== A few examples and revised theory to recap what we have learnt so far ====

# ==== DEFINING A LIST ====

colours = ["blue", "green", "yellow", "red", "purple"]

# Above we see the default way of defining a list.

# ==== INDEXING THROUGH LISTS ====

print ("The 2nd element of colours is found at index 1: " + colours[1])

# The above line will print out the second element in the list, you'll better understand this by running this file in the Python shell.

# ==== NEW VALUE ASSIGNMENT ====

colours[3] = "beige"
print (colours)

# The above code shows how values in the list can be overwritten to update data.

# ==== LIST ADDITIONS AND LENGTH ====

food = []
food.append('pizza')
food.append('burger')

print (food)

print (len(food))

# The append function is useful to extend the size of the list by adding data to it. The len function is used to check the length of the list, this could be useful when running a conditional program.

# ==== LIST ORDER ====

colours.sort()

# The sort command will order the contents of your list in alphanumerical order.

# ==== LIST SLICING ====

slice = colours[0:2]

print (slice)

# Slicing a list is useful when you wish to utilise individual sections of your list. Here the first two elements of the list are sliced.

# ==== LIST LOOPING ====

for colour in colours:
	print (colour)
	
# We will sometimes need to run through all the contents of a list and operate on each item, this is where a for loop is perfectly suited.
	
# ==== DEFINING A HASH MAP ====

marks = {'Joe' : 87, 'Mark' : 29, 'Jill' : 76}

# Always remember that the key is defined first, followed by its value.

# ==== HASH ENTRIES ====

marks['Sue'] = 95

print (marks)


# ==== ENTRY REMOVALS ====

del marks['Mark']

marks['Jill'] = 80

print (marks)

# === LET'S GET GOING! ====
# You should now be well equipped to tackle your compulsory task! Good luck!
