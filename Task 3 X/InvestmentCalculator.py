#Mbali Mthethwa

import math


p = int(raw_input("Enter amount that you want to deposit "))
i = int(raw_input("Enter the interest rate "))
t = int(raw_input("Enter the number of years of the investment "))
interest = raw_input("Do you want simple or compound interest ")

r = i / 100
if interest == "simple" :
	a = p * (1 + r * t)
	print a
elif interest == "compound" :
	a = p + math.pow((1 + r), t)
	print a
else:
	print "You must choose between compound and simple interest"
