max_points = [25, 25, 50, 25, 100]
assignments = ['hw ch 1', 'hw ch 2', 'quiz   ', 'hw ch 3', 'test']
students = {'#Max': max_points}

def print_menu():
    print "1. Add student"
    print "2. Remove student"
    print "3. Print grades"
    print "4. Record grade"
    print "5. Print Menu"
    print "6. Exit"

def print_all_grades():
    print '\t',
    for i in range(len(assignments)):
        print assignments[i], '\t',
    print
    keys = students.keys()
    keys.sort()
    for x in keys:
        print x, '\t',
        grades = students[x]
        print_grades(grades)

def print_grades(grades):
    for i in range(len(grades)):
        print grades[i], '\t', '\t',
    print

print_menu()
menu_choice = 0
while menu_choice != 6:
    print
    menu_choice = input("Menu Choice (1-6): ")
    if menu_choice == 1:
        name = raw_input("Student to add: ")
        students[name] = [0] * len(max_points)
    elif menu_choice == 2:
        name = raw_input("Student to remove: ")
        if name in students:
            del students[name]
        else:
            print "Student:", name, "not found"
    elif menu_choice == 3:
        print_all_grades()
    elif menu_choice == 4:
        print "Record Grade"
        name = raw_input("Student: ")
        if name in students:
            grades = students[name]
            print "Type in the number of the grade to record"
            print "Type a 0 (zero) to exit"
            for i in range(len(assignments)):
                print i + 1, assignments[i], '\t',
            print
            print_grades(grades)
            which = 1234
            while which != -1:
                which = input("Change which Grade: ")
                which = which - 1
                if 0 <= which < len(grades):
                    grade = input("Grade: ")
                    grades[which] = grade
                elif which != -1:
                    print "Invalid Grade Number"
        else:
            print "Student not found"
    elif menu_choice != 6:
        print_menu()