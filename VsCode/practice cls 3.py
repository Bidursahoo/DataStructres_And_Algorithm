#!/usr/bin/env python
# coding: utf-8

# In[16]:


#123: 110 :05 :100
a,b,c,d = "123:110:05:100".split(":")
a,b,c,d = [int(a),int(b),int(c),int(d)]
avg = (a+b+c+d)/4
print("Average",avg)


# In[9]:


a = 11
b = 4
b=b<<1
print(b)


# In[5]:


a = int(input("Enter the first number:"))
b = int(input("Enter the first number:"))
c = int(input("Enter the first number:"))
if(a>b) and (a > c):
    print("A is the greatest")
    if(b>c):
        print("B is greater")
else:
    print("C is greater")


# In[11]:


n = int(input("ENter the number :"))
if(n<=15):
    if(n == 10):
        print("Play Cricket")
    elif(n>10):
        print("Play Kabbadi")
else:
    print("You don't play")


# In[14]:


a = "BidurSahoo"
for i in a:
    print(i,"",end="--")


# In[15]:


for i in range(2,101):
    if(i%2 == 0):
        print("Even number" , end="||")
    else:
        print("Odd number" , end="||")


# In[5]:


# Q1
#  Write a program to calculate the electricity bill (accept number of unit from user) according to the following criteria :

#              Unit                                                     Price  
# First 100 units                                               no charge
# Next 100 units                                              Rs 5 per unit
# After 200 units                                             Rs 10 per unit
# (For example if input unit is 350 than total bill amount is Rs2000)



a = int(input("Enter your unit:"))
price = 0
for u in range(a+1):
    if(u>=0) and (u <= 100):
        pass
    elif(u> 100) and (u<=200):
        price+=5
    else:
        price+=10
print(price)


# In[11]:


# Q2.
# Write a program to check whether the last digit of a number( entered by user ) is 
# divisible by 3 or not.


a = int(input("Enter a number"))
temp = a%10
if(temp%3 == 0):
    print("Divisible by three")
else:
    print("Not Divisible")


# In[13]:


# Q3. Write a program to display "Hello" if a number entered by user is a multiple of five , otherwise print "Bye".

a = int(input("Enter your number"))
if(a%5 == 0):
    print("Hello ")
else:
    print("Byeee")


# In[14]:


# Q4.

# A company decided to give bonus to employee according to following criteria:
#     Time period of Service                Bonus
#     More than 10 years             10%
#     >=6 and <=10                   8%
#     Less than 6 years              5%
#     Ask user for their salary and years of service and print the net bonus amount.





sal = int(input("Enter your salary:"))
service = int(input("Input your salary:"))
if(service > 10):
    sal = sal*1.1
    print("Net bonus is",0.1*sal)
elif(service >=6) and (service <=10):
    sal = sal*1.08
    print("Net bonus is",0.08*sal)
else:
    sal = sal *1.05
    print("Net bonus is",0.05*sal)
print("Your net salary is",sal)


# In[3]:


# Q5.
#       Write a program to display all prime numbers within a range

a = int(input("ENter the starting"))
b = int(input("Enter your second"))
# if(a ==0):
#     print("zero is none")
#     a+=1
#     print("! is prime")
for i in range(a,b):
    temp = 0
    for j in range(2,i//2):
        if(i%j == 0):
            temp=1
            break
    if(temp == 1):
        print(i,"is notprime")
    else:
        print(i,"is prime")


# In[4]:


# Q6.
#  Write a python program that takes a number.
# 1.	If the number is divisible by 3, it should return “Fizz”.
# 2.	If it is divisible by 5, it should return “Buzz”.
# 3.	If it is divisible by both 3 and 5, it should return “FizzBuzz”.
# 4.	Otherwise, it should return the same number.

a = int(input("Enter a number"))
if (a%3==0) and (a%5 != 0):
    print("Fizz")
elif (a%5==0) and (a%3 != 0):
    print("Buzz")
elif (a%3==0) and (a%5 == 0):
    print("FizzBuzz")
else:
    print("Your number",a)


# In[6]:


# Q7.
#      Write a program for checking the speed of drivers. This function should have one parameter: speed.
# 1.	If speed is less than 70, it should print “Ok”.
# 2.	Otherwise, for every 5km above the speed limit (70), it should give the driver one demerit point and print the total number of demerit points. For example, if the speed is 80, it should print: “Points: 2”.
# 3.	If the driver gets more than 12 points, the function should print: “License suspended


speed = int(input("Enter your speed:"))
if speed < 70:
    print("Ok")
else:
    temp = 70
    point = 0
    for i in range(13):
        if(temp < speed):
            temp += 5
            point +=1
        else:
            break
    if(temp < speed):
            print("License Suspended")
    else:
        print("Your point",point)
        
    
        


# In[ ]:




