#ejercicio3

suma = 0

calificacion_baja = 99999

for i in range(1, 11):
    calificacion = float(input(f"{i}. Digite una calificacion: "))

    suma = suma + calificacion

    if calificacion < calificacion_baja:
        calificacion_baja = calificacion

calificacion_promedio = suma / 10

print("----------------------------------------")
print("La calificacion promedio es:", calificacion_promedio)
print("La calificacion mas baja es:", calificacion_baja)