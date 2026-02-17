# Student Information
student_id = 30001
student_name = "kavi"
student_grade = "10A"
student_nic = 2001302670

print("***************")
output = f"student id is {student_id}\nstudent name is {student_name}\nstudent grade is {student_grade}\nstudent nic number is {student_nic}"
print(output)

print("***************")
output = "student id is {}\nstudent name is {}\nstudent grade is {}\nstudent nic number is {}".format(student_id, student_name, student_grade, student_nic)
print(output)

print("***************")
output = "student id is {0}\nstudent name is {1}\nstudent grade is {2}\nstudent nic number is {3}".format(student_id, student_name, student_grade, student_nic)
print(output)

print("***************")
output = "student id is {1}\nstudent name is {3}\nstudent grade is {2}\nstudent nic number is {0}".format(student_name, student_nic, student_id, student_grade)
print(output)

print("***************")
output = "student id is %s\nstudent name is %s\nstudent grade is %s\nstudent nic number is %s" % (student_id, student_name, student_grade, student_nic)
print(output)
