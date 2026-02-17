name = "Achchu"
p_word = "2020"

username = input("Enter username: ")
password = input("Enter password: ")
role = input("Enter role (Admin/User): ")


if username == name and password == p_word:
    print("Login success ")

    
    if role == "admin":
        print("Welcome to your admin panel")
    elif role == "user":
        print("Welcome to your user dashboard")
    else:
        print("Invalid role ")
else:
    print("Invalid username or password ")
