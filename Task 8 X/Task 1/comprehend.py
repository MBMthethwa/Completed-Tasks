#Mbali Mthethwa

message = "HI:HOW:R:U:TODAY:."

listStrings = message.split(":")

newListStrings = [element.lower() for element in listStrings]
newSentece =""

for i in range(0,len(newListStrings)):
	newSentece = newSentece +  newListStrings[i] + " "
	

 	
print newSentece.capitalize()[:len(newSentece) - 3] + newListStrings[i]
