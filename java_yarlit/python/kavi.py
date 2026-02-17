print("kavi")
id=3001
name="kavi"
age=24
print("my id is",id)
print("my name is",name)
print("my age is",age)
type(id)
print(type(id))

print("***************")
output=f"my name is {name}\nmy id is{id}\nmy age is{age}"
print(output)

print("***************")
output="my name is {}\nmy id is{}\nmy age is{}".format (name,id,age)
print(output)

print("***************")
output="my name is {0}\nmy id is{1}\nmy age is{2}".format (name,id,age)
print(output)

print("***************")
output="my name is {2}\nmy id is{0}\nmy age is{1}".format (name,id,age)
print(output)

print("***************")
output=("my name is%s\nmy id is%d\nmy age is%d" %(name,id,age));
print(output)
