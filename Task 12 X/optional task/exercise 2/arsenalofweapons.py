#Mbali Mthethwa

class Weapon(object):
    def __init__(self, name, damageValue):
        self.name = name
        self.samageValue = damageValue



class GrenadeLauncher(Weapon):
    def __init__(self, noise):
        self.noise = "boom"

    
class AK47(Weapon):
    def __init__(self, noise):
        self.noise = "bang"
        
grenadeLauncher = GrenadeLauncher("noise")
noise = grenadeLauncher.noise
print "The noise of GrenadeLauncher is " + noise


aK47 = AK47("noise")
noise = aK47.noise
print "The noise of AK47 is " + noise
