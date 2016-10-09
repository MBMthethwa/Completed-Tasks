#Mbali Mthethwa
numberOfNights = 0
city = ""
days = 0
def hotel_cost(numberOfNights):
	numberOfNights = int(raw_input("Enter the number of nights for your holidays "))
	totalCost = numberOfNights * 475.00
	return totalCost
	
def options():
	print 
	print("d -  Enter d to travel from Johannesburg to Durban ")
	print( "j  - Enter j to travel from Durban to Johannesburg ")
	print( "c  - Enter c to travel from Johannesburg to Cape town ")
	print ("q  - Enter q to quit ")
	
	

def plane_cost(city):
	options()
	city = raw_input("Enter the city ")
	while city != "q":
		if city == "d":
			return 499.00
		elif city == "j":
			return 1043.00
		elif city == "c":
			return 1073.00
		else:
			return "unrecognised option "
	return 0
	
def car_rental(days):
        days = int(raw_input("Enter the number of days you want to rent a car "))
        return days * 165.00
	
def holiday_cost(numberOfNights,city,days):
	totalHolidayCost = hotel_cost(numberOfNights) + plane_cost(city) + car_rental(days)
	return totalHolidayCost
	
print(str(holiday_cost(numberOfNights,city,days)))
	
	
