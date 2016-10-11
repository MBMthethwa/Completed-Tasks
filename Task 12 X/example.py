#Welcome to the example file for Object Orientated Programming (Part 2).
#Please ensure that you have read through the task file (pdf) before continuing here as some of
#the examples and explanations assume you have done so.

#************* HELP *****************
# REMEMBER THAT YOU IF YOU EVER NEED ANY HELP AT ALL, EMAIL US ON HELP@HYPERIONDEV.COM
#************************************

#==== SOME MORE OOP ====

#Now that you know a bit about classes and the objects that you can make from them,
#let's look at what inheritance is. Please read through the Task pdf for an explanation.
#The example below should help reinforce the idea.

#==============================
# Cow-Themed Inheritance
#==============================
class Animal(object): #(base)Animal is inheriting from object
    '''
    Animal class docstring
    '''
    def __init__(self, color):
        self.color = color

    def get_color(self):
        return self.color

    def make_noise(self):
        pass

class Cow(Animal): #(derived)Cow is Inheriting from Animal
    '''
    An example of inheritance (see reading).
    This class inherits its constructor and the get_color method from Animal,
    and every instance of Cow is also an instance of Animal.
    '''
    _noise = 'moo'

    def make_noise(self):
        '''
        An example of a method that is defined by the base class and overwritten by the derived class
        '''
        print self._noise

    def sleep(self):
        '''
        An example of a method that is defined for the derived class but not the base class
        '''
        print 'zzz'


pink_cow = Cow('pink')
print pink_cow.get_color()
pink_cow.make_noise()
pink_cow.sleep()

assert isinstance(pink_cow, Cow) #True
assert isinstance(pink_cow, Animal) #True, all cows are animals
pink_animal = Animal(pink_cow) #You can cast base classes to derived classes and vice versa
assert isinstance(pink_animal, Animal) #True
assert isinstance(pink_animal, Cow) #False - not all animals are cows

#=========== End of Cow-Themed Inheritance ============


#We highly recommend attempting the exercises below:

#============ Exercise 1 (Optional) ==========
#In this exercise we will be defining a simple education structure of members of a university
#Create a file called university.py.
#In this file define a Person class which should instantiate a name.
#Now, using inheritance, create another two classes - lecturer and student.
#Lecturer should have an additional attribute called "Occupation", and student should have
#"StudentNumber".
#Using __str__, make both the lecturer and student print out what they are as well as their
#occupation/student number (whichever is applicable).
#Create some objects to show that it works.


#============ Exercise 2 (Optional) ==========
#Now we're going to create an arsenal of weapons!
#Create a class called "Weapon", which should take a name and damage value.
#Create two derived classes - GrenadeLauncher and AK47.
#Each of these classes should have a noise attribute. The AK47 should have "bang!"
#and GrenadeLauncher "boom!". Follow the structure in the Cow example to
#get these weapons to print out their noises and damage values.


