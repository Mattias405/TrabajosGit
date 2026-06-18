#a = 10
#b = 5
#print(f"No intercambio: a = {a}, b = {b}")
#a, b = b, a
#print(f"Intercambio: a = {a}, b = {b}")
a = 10
b = 5
print(f"Antes del intercambio: a = {a}, b = {b}")
temporal = a
a = b
b = temporal
print(f"Después del intercambio: a = {a}, b = {b}")