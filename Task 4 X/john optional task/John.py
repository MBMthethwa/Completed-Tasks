#Mbali Mthethwa 

numberOfTries = int(raw_input("How many time do you want to enter the correct name "))
listName = []


for i in range(0,numberOfTries):
        userInput = raw_input("Enter your name ")
        if userInput != "john":
                listName.append(userInput)  

        else:
                print listName
                break