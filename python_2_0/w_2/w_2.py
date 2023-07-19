import fractions

num1 = fractions.Fraction(input(" Enter a fraction (../..): "))
num2 = fractions.Fraction(input(" Enter a fraction (../..): "))

while(True):
    ent = int(input("Sum, enter 1. Product, enter 2:  "))
    if(ent == 1):
        sum = num1 + num2

    elif (ent == 2):
        sum = num1 * num2
    break
print(sum)

