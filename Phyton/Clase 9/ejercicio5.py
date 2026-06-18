num = int(input("Digite un número: "))

while num < 0:
    num = int(input("Error. Digite un número mayor o igual a 0: "))

factorial = 1

for i in range(1, num + 1):
    factorial *= i

print("El factorial es:", factorial)