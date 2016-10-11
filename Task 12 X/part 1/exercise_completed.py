#Mbali Mthethwa

import math

class Vector(object):
    def __init__(self,x,y):
        self.x = x
        self.y = y
    
    def addition(self, x, y):
        return x + y

    def subtraction(self, x, y):
        return (x - y)

    def s_multiply(self, x, y):
        return (x * y)



    def dist(self,x,y):   
        return math.sqrt((x2 - x1)**2 + (y2 - y1)**2)

    def  __cmp__(self):
        if self.x == self.x:
            return True
        else:
            return False


    def __str__(self):
        return "X = " + str(self.x) + " , Y = " + str(self.y)
    
class MyComplex(Vector):

    vector = Vector(10,20)
    print  str(vector.x) + " Multiply by " + str(vector.y) + " is equal to " + str(vector.s_multiply(vector.x, vector.y))
    print vector.__str__()
