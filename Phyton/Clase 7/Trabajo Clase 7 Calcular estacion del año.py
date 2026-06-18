mes = int(input("digite un numero de mes del 1 al 12: "))
estacion = None

if mes == 1 or mes == 2 or mes == 3:
    estacion = "verano"
elif mes == 4 or mes == 5 or mes == 5:
    estacion = "otoño"
elif mes == 6 or mes == 7 or mes == 9:
    estacion = "invierno"
elif mes == 10 or mes == 11 or mes == 12:
    estacion = "verano"
else:
    print("fuera del digito indicado")