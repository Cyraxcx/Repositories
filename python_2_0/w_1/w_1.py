
a = int(input("Enter side a: "))
b = int(input("Enter side b: "))
c = int(input("Enter side c: "))


if (a > (b + c)) or (b > (a + c)) or (c > (b + a)):
    print(" There is no such triangle ")
elif (a == b or a == c or b == c):
    print(" The triangle is isosceles ")
elif (a == b == c):
    print(" The triangle is equilateral ")
elif (a != b != c):
    print(" The triangle is versatile ")

