class Student(object):

        def __init__(self, age, name, gender, grades):
                self.age = age
                self.name = name
                self.gender = gender
                self.grades = grades
                
        def compute_average(self):
                average = sum(self.grades)/len(self.grades)
                print "The average for student " + self.name + " is " + str(average)

        def check_male(self):
                if self.gender == "Male":
                        return True
                else:
                        return False


philani = Student(20, "Philani Sithole", "Male", [64,65])
sarah = Student(19, "Sarah Jones", "Female", [82,58])

mbali = Student(24, "Mbali Mthethwa", "Female", [80,85])
print mbali.check_male()

students = []
students.append(philani)
students.append(sarah)
students.append(mbali)

for student in students:
        student.compute_average()
        
        



# Add in your new objects and logic here, and above.
