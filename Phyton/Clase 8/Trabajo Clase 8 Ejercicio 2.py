#ejercicio2

conteo_positivos = 0
conteo_negativos = 0
conteo_neutros = 0

for i in range(1, 11):
    num = int(input(f"{i}. Digite un numero: "))

    if num == 0:
        conteo_neutros = conteo_neutros + 1
    else:
        if num > 0:
            conteo_positivos = conteo_positivos + 1
        else:
            conteo_negativos = conteo_negativos + 1

print("----------------------------------------")
print("La cantidad de positivos es:", conteo_positivos)
print("La cantidad de negativos es:", conteo_negativos)
print("La cantidad de neutros es:", conteo_neutros)