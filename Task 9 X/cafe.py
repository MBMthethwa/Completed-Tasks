#Mbali Mthethwa


menu = ['drink','bread','polony','cheese']

stock = {
'drink' : 15 ,
'bread' : 13 ,
'polony' : 35,
'cheese' : 89
}


def calculate_total_stock():
                total = 0
                price = 0
                for i in range(0,len(menu)):
                        name = menu[i]
                        price = stock[name]
                        total = total + price
                
                return total
	
print  calculate_total_stock()
