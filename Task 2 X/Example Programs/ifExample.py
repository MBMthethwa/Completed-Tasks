#This is an example Python program demonstrating if statements.

name = raw_input("Enter your name: \n")

if len(name) == 0:
	print "Your didn't enter anything."
	raw_input("")
	
else:
	
	if len(name) > 10:
	
		print "You've got a long name."
		
	else:
		
		age = int(raw_input("Thanks for entering your name. Enter your age: \n"))

		


print name
print age
raw_input("")

#Run this program. Change your input to get different outputs due to the if statements.
