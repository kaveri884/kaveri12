unit = int(input("Units: "))

if 0 < unit < 90:
    amount = unit * 7
    print(f"Bill amount: Rs. {amount}")
elif unit < 150:
    amount = unit * 10
    print(f"Bill amount: Rs. {amount}")
elif unit < 300:
    amount = unit * 15
    print(f"Bill amount: Rs. {amount}")
else:
    print("Extra charge.")
