valor = int(input("digite un valor: "))
valorMinimo = 0
valorMaximo = 5
dentroRango =  valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f"el valor {valor} esta dentro del rango")
else:
    print(f"el valor {valor} esta fuera del rango")