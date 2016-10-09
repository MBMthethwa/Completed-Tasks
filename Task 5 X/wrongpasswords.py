#Mbali Mthethwa



password = raw_input("Enter your password ")

listOfWrongPassword = []
f = open('wrongpasswords.txt','w')
count = 0

while password != "rusty":
	listOfWrongPassword.append(password)
	password = raw_input("Enter your password ")
	
if password == "rusty" :
        for i in range (0,len(listOfWrongPassword)):
                        wrongPassword = "Incorect password "  + str(i+1) + ": " + listOfWrongPassword[i]
                        f.write(wrongPassword + "\n ")
                        count = count + 1
                        if count == len(listOfWrongPassword):
                                f.write("Corect password entered on the " + str(count + 1) + "th entry.")
                        
f.close()
