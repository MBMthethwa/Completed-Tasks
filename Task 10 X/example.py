# Welcome to the example file for Functions, Lists, and Hashing.

# ************* HELP *****************
#  REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM.
# ************************************

# Everything you have been learning has been tested with application tasks for each section, however you will now be utilising everything you have learnt to solve this problem.

# You've covered all the necessary content so solve a large real-life data problem. Data management is an extremely important component of the Computer Science field and this will provide you with first hand experience.

# You may find it helpful to revise what you've learnt from your functions, lists, and hashing tasks as they will form the majority of this task.

# This task will also require you to do some individual research as this component is essential to being a successful software developer.

# You now have all the tools for the compulsory task.

# COMPULSORY TASK: 

'''
    After you've read and understand all of example.py, create a new Python file called amazon.py inside this folder. This programming problem is one posed to new software developer applicants to Amazon, the software development company you've probably bought a book or dvd from once in your life. Inside amazon.py, write Python code to read in the contents of the textfile 'input.txt', and for each line in input.txt, write out a new line in a new text file output.txt that computes the answer to some operation on a list of numbers.

    If the input.txt file has the following:

    min: 1,2,3,5,6
    max: 1,2,3,5,6
    avg: 1,2,3,5,6

    Your program should generate an output.txt file as following:

    The min of [1, 2, 3, 5, 6] is 1
    The max of [1, 2, 3, 5, 6] is 6
    The avg of [1, 2, 3, 5, 6] is 3.4

    Assume that the only operations given in the input file are 'min', 'max' and 'avg', and that the operation is always followed by a list of comma seperated integers. 

    You should define a functions min, max and average that take in a list of integers and return the max, min or average of the list. 
    Your program should handle any combination of operations, any lengths of input numbers. You can assume that the list of input numbers are always valid ints, and is never empty. 


    <BONUS Optional Challenge>

    Change your program to also handle the operation 'px' where x is a number from 10 to 90 and defines the x percentile of the list of numbers. For example:

    input.txt:

    min: 1,2,3,5,6
    max: 1,2,3,5,6
    avg: 1,2,3,5,6
    p90: 1,2,3,4,5,6,7,8,9,10
    sum: 1,2,3,5,6
    min: 1,5,6,14,24
    max: 2,3,9
    p70: 1,2,3

    Your output.txt should read:

    The min of [1, 2, 3, 5, 6] is 1
    The max of [1, 2, 3, 5, 6] is 6
    The avg of [1, 2, 3, 5, 6] is 3.4
    The 90th percentile of [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] is 9
    The sum of [1, 2, 3, 5, 6] is 17
    The min of [1, 5, 6, 14, 24] is 1
    The max of [2, 3, 9] is 9
    The 70th percentile of [1, 2, 3] is 2

'''
