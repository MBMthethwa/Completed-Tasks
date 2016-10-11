#Mbali Mthethwa

def calculate_min(listInt):
    return min(listInt)

def calculate_max(listInt):
    return max(listInt)

def calculate_average(listInt):
    return sum(listInt) / len(listInt) 
    




fileOutput = open('output.txt','w')
fileInput = open('input.txt','r')
 


while True:
    line = fileInput.readline().rstrip()
    if not line:
        break

    splitedLine = line.split(':')
    decision = splitedLine[0]
    listInt = splitedLine[1]
    
    
    newListInt = listInt.split(',')

    listInteger = []
    for i in range(0,len(newListInt)):
        listInteger.append(int(newListInt[i]))
        
    if decision == "min":
        fileOutput.write("The min of " +  str(listInteger) + " is " + str(calculate_min(listInteger)) + "\n")
    elif decision == "max":
        fileOutput.write("The max of " +  str(listInteger) + " is " + str(calculate_max(listInteger)) + "\n")
    elif decision == "avg":
        fileOutput.write("The avg of " + str(listInteger) + " is " + str(calculate_average(listInteger)) + "\n")
    
    
        
fileOutput.close()

        


        
        
        
    

    

