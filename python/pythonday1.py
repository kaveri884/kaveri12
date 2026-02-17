Python 3.14.2 (tags/v3.14.2:df79316, Dec  5 2025, 17:18:21) [MSC v.1944 64 bit (AMD64)] on win32
Enter "help" below or click "Help" above for more information.
>>> print("kavi")
kavi
>>> name"kavi"
SyntaxError: invalid syntax
>>> name="kavi"
>>> print(name)
kavi
>>> print("name")
name
>>> type(name)
<class 'str'>
>>> name=10
>>> type(name)
<class 'int'>
>>> name="10"
>>> type(name)
<class 'str'>
>>> name='kavi'
>>> type(name)
<class 'str'>
>>> name=kavi
Traceback (most recent call last):
  File "<pyshell#12>", line 1, in <module>
    name=kavi
NameError: name 'kavi' is not defined
>>> id=50
>>> name=kavi
Traceback (most recent call last):
  File "<pyshell#14>", line 1, in <module>
    name=kavi
NameError: name 'kavi' is not defined
>>> id=301
>>> name="kavi"
>>> age=24
>>> print("my id is",id)
my id is 301
>>> print("my name is",name)
my name is kavi
>>> print("my age is",age)
my age is 24
1001=id
SyntaxError: cannot assign to literal here. Maybe you meant '==' instead of '='?
print("my age is"+str(age))
my age is24
print("my id is","my name is","my age is")
my id is my name is my age is
print("my id is",id,"my name is",name,"my age is",age)
my id is 301 my name is kavi my age is 24
print("my id is",id,"\n","my name is",name,"\n","my age is",age)
my id is 301 
 my name is kavi 
 my age is 24
print("my id is",id,"\nmy name is",name,"\nmy age is",age)
my id is 301 
my name is kavi 
my age is 24
