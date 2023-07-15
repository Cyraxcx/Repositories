from math import sqrt

number = int(input(" Enter a number: "))

i = 2
maximum = 100000
minimum = 0
if(number > minimum or number <= maximum):
    while i <= sqrt(number):
        if number % i == 0:
            print("composite number")
            break
        i += 1
    else:
        print("the number is simple")


