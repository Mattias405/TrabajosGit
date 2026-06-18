num = int(input("digite un numero en el rango del 1 al 3: "))
numTexto = " "
if num == 1:
    numTexto = "numero uno"
elif num == 2:
    numTexto = "numero dos"
elif num == 3:
    numTexto = "numero tres"
else:
    numTexto = "has ingresado un numero fuera del rango"
print(f"el numero ingresado es: {num} - {numTexto} ")