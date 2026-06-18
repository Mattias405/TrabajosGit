n = int(input("Ingrese la cantidad de números: "))

suma_pares = 0
cant_pares = 0
suma_impares = 0
cant_impares = 0

for i in range(n):
    num = int(input("Ingrese un número: "))

    if num % 2 == 0:
        suma_pares += num
        cant_pares += 1
    else:
        suma_impares += num
        cant_impares += 1

if cant_impares > 0:
    prom_impares = suma_impares / cant_impares
else:
    prom_impares = 0

print("Suma de números pares:", suma_pares)
print("Cantidad de números pares:", cant_pares)
print("Promedio de números impares:", prom_impares)