suma = 0

for i in range(1, 6):
    print("Salario del empleado", i)

    horas = float(input("Digite las horas trabajadas: "))
    tarifa = float(input("Digite la tarifa por hora: "))

    salario = horas * tarifa

    print("El salario es: $", salario)

    suma += salario

print("La suma de todos los salarios es:", suma)