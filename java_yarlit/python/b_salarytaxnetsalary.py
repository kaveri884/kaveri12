b_salary = int(input("Enter your basic salary: "))

if b_salary >= 100000:   
    tax = b_salary * 0.05
elif b_salary >= 80000:
    tax = b_salary * 0.03
else:
    tax = 0

print("Basic salary\t", b_salary)
print("Tax\t", tax)
print("Net salary\t", b_salary - tax)
