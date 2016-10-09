#Mbali Mthethwa
import math


listName = [4,5,67,78,89,78,90,24]

def stndDvtn(listName):
    averg = (sum(listName)) / (len(listName))
    totalSqr = 0
    for i in range(0,len(listName)) :
            totalSqr = totalSqr + (math.pow((listName[i] - averg),2))
            std = math.sqrt(totalSqr / len(listName))
    return std

file = open('output.txt','w')

file.write( " The minimum of " + str(listName) + " is " + str(min(listName)) + "\n")
file.write( " The maximum of " + str(listName) + " is " + str(max(listName))+ "\n")
file.write( " The average of " + str(listName) + " is " + str((sum(listName)) / (len(listName))) + "\n") 
file.write( " The sum of " + str(listName) + " is " + str(sum(listName))+ "\n")
file.write( " The standard deviation of " + str(listName) + " is " + str(stndDvtn(listName))+ "\n")
            
    

file.close()
	
