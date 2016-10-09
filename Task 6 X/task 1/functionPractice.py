#Mbali Mthethwa

def sumAll(n):
        total = 0
        for i in range(1,n + 1 ):
                total = total + i
        return total

n = int(raw_input("Enter the number "))
total = sumAll(n)
print str(total)
		
