#Mbali Mthethwa
    
class Person(object):   
    def __init__(self, name):
        self.name = name



class Lecture(Person):
    def __init__(self, Occupation):
        self.Occupation = Occupation

    def __str__(self):
        person = Person(name)
        print "Name :" + person.name + "\n" +"Occupation : " + self.Occupation




class Student(Person):
    def __init__(self, StudentNumber):
        self.StudentNumber = StudentNumber

    def __str__(self):
        person = Person(name)
        print "Name :" + person.name + "\n" + "student Number : "  + str(self.StudentNumber)

option = raw_input('Are you student or lecture ')
if option == 'student':
    name = raw_input('Enter your name ')
    studentNumber = int(raw_input('Enter your student number '))
    person = Student(studentNumber)
    print person.__str__()
elif option == 'lecture':
    name = raw_input('Enter your name ')
    occupation = raw_input('Enter your occupation ')
    lecture = Lecture(occupation)
    print lecture.__str__()
