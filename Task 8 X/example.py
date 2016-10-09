# Welcome to the example file for Introduction to Lists and Hashing.

# ************* HELP *****************
#  REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
# ************************************

# ===== Lists =====
# Recall that we can define a list of integers as follows:

nums = [ 1, 2, 3, 4]

sumNums = sum(nums) # We can compute the sum of the integers using built-in functions, i.e. sum(nums) gives you 1+2+3+4 = 10.
lenNums = len(nums)	# We can find out how many elements are in the list like this, here lenNums stores the int 4 (as there are 4 elements(items) in the list nums). 

# What if we have a String, seperated by some standard seperator called a DELIMETER, and we want to put this String into a new list?
# I.e. look at strNums, the DELIMETER here is the comma(',' symbol). What if we want to get each number in the strNums String and put them into a list?

strNums = "1,2,3,4,5" # This is one long String, but if we got rid of the commas and put each int into its own cell in a list, we could get a list of ints, like above.

newNumList = strNums.split(",")		# This is an important operation. It takes the above String, splits it using the DELIMETER , and puts each item into a new list. 
print newNumList					# Run this program, do you see the new list?

# Unfortunately, new NumList is a list of STRINGS, ie , the elements are '1', '2', .. rather than 1, 2. 
# We can't sum a list of Strings, we can only sum ints. What if we wanted to find the sum of a long list of numbers? We need to cast each string to an int to do so.

# We know that we can cast from a str to an int using the int() function seen earlier. But how can we do this on each element of the list?

# ===== List comprehensions =====
# List comprehensions are a powerful tool that will apply some operation to every element in a list, and then put it back into a new list.
# For example:

newNumListInts = [int(element) for element in newNumList] # We are looping over newNumList, the list of Strings we created above. For each element, we are casting it to an int and putting it into a new list, newNumListInts.

print newNumListInts  # Do you see the difference?

# Now we can sum this list, since newNumListInts is a list of ints, not Strings.

print sum(newNumListInts)

# What else can we do with list comprehensions?

doubleList = [2 * element for element in newNumListInts]	# A new list, with each element double its value in the previous list.
halfList = [0.5 * element for element in newNumListInts] # A new list, with each element half its value in the previous list.

# List comprehensions are powerful tools - don't forget them!

# ======================= Play around with Python a bit (COMPULSORY TASK 1) ============================
#
#    Create a new Python file in this folder called comprehend.py.
#    Imagine there's a really rude friend of yours, that always sends emails with all words in capital letters. 
#    Your friend also doesn't know how to use a spacebar, so he seperates words with the : character.
#    Imagine your friend sends the message "HI:HOW:R:U:TODAY:.
#    Take this message, as a String. Split it into a list of String words and make each word lowercase using a list comprehension on each element.
#    Read http://stackoverflow.com/questions/6797984/how-to-convert-string-to-lowercase-in-python for information on how to make words lowercase.
#    Now, edit the first and last word (i.e. the first and last element of your list) to capitalise the first letter of the sentence, and add a full stop to the end of the sentence.
#    Print out this new intelligent sentence.
#
# ======================================================================================================


# ===== Switch statements in Python =====
# Imagine we have a long list of codewords. Each codeword triggers a specific function to be called.
# For example, we have the codewords 'go' which when seen calls the function handleGo, and another codeword 'ok' which when seen calls the function handleOk.

# We can use the following structure called a HASH TABLE to encode this:

def handleGo(x):
    return "Handling a go! " + x

def handleOk(x):
    return "Handling an ok!" + x

# This is the hash table:	
codewords = { 
  'go': handleGo,   # The KEY here is 'go' and the VALUE it maps to in the hash is handleGo (Which is a function!).
  'ok': handleOk,   
}

# This hash maps STRINGS (codewords) to FUNCTIONS.

# Now, we see a codeword given to us:

codeword = "go"

# We can handle it as follows:

if codeword in codewords:
	answer = codewords[codeword]("Argument")
	print answer
else:
	print "I don't know that codeword."

# Hash functions are general tools for mapping, and in some way mimic FUNCTIONS from MATHEMATICS (remember f(x) = x^2?).
# There are some very important applications for hash functions.

# This hash maps STRINGS (the words of numbers) to INTS (their int value):

codewordsTwo = { 
  'one': 1,         # The key here is the string 'one' and it has the int value 1 in the hash.
  'two': 2,        
}

print "Word to number mapper:"

word = "one"
print codewordsTwo[word]

# Here are a ton of places they are used. Take a look - http://en.wikipedia.org/wiki/Hash_function . 

# ======================= Play around with Python a bit (COMPULSORY TASK 2) ============================
#
#    Create a new Python file in this folder called hash.py
#    Think about three celeberaties/famous people that you know.
#    Create a hash called hotMap, where the the KEYS are the name and surname of the person (i.e. a String), and the VALUE for each key is either the String 'hot' or 'not',
#    based on whether you think that person is hot or not!
#
#    Here's my hash:
#
#    hotMap = {
#        'EmmaWatson': 'Hot',
#        'JustinBieber': 'Not',
#        'LeoDiCaprio': 'Hot',
#    }
#
#    What does print hotMap['EmmaWatson'] return? It's returns hot
# ======================================================================================================

