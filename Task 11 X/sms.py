#Mbali Mthethwa
#An SMS Simulation

class SMSMessage:
    smsStore = []   
    def __init__(self, hasBeenRead, messageText, fromNumber):
        self.fromNumber = fromNumber
        self.hasBeenRead = False
        self.messageText = messageText

    def MarkAsRead(self):
        hasBeenRead = True
        return hasBeenRead

    def add_sms(self,smsobj): 
        smsStore.append(smsobj)
        return smsStore

    def get_count(self):
        return len(smsStore)

    def get_message(self, index):
        for i in range(0,len(smsStore)):
            if smsStore[index] == smsStore[i]:
                smsStore[index].hasBeenRead = True
                msg = smsStore[index]
        return msg.messageText

    def get_unread_messages(self):
        unreadMessages = []
        print "Number of total unread Messages "
        for mesege in smsStore:
            mgs = mesege
            if mgs.hasBeenRead == False:
                unreadMessages.append(msg)

        return unreadMessages

        
    def remove(self):
        smsStore.clear()


userChoice = raw_input("What would you like to do - read/send/quit?")

smsobject = SMSMessage(True,"",0)
smsStore = []
while userChoice != "quit":
    if userChoice == "read":
        #Place your logic here
        index = int(raw_input("Enter the index of the message you want to read "))
        msg = smsobject.get_message(index)
        print msg
    elif userChoice == "send":
        #Place your logic here
        messageText = raw_input("write your message here ")
        fromNumber = int(raw_input("write the numbers you want to send message here "))
        smsobject = SMSMessage(False,messageText,fromNumber)
        smsobject.add_sms(smsobject)
        
    elif userChoice == "quit":
        print "Goodbye"
        break
    else:
        print "Oops - incorrect input"
        
    userChoice = raw_input("What would you like to do - read/send/quit?") 
