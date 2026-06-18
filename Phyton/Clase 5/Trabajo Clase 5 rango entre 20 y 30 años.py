edad = int(input("digite su edad: "))
veinte = edad >= 20 and edad < 30
print(veinte)
treinta = edad >= 30 and edad < 40
print(treinta)

if veinte or treinta:
    if veinte:
        print('estas dentro del rango de (20\') años')
    elif treinta:
       print('estas dentro del rango de (30\'0 años')
    else:
       print("no estas dentro del rango")
else:
    print("no estas dentro del rango de los (20´0) a (30´0) años")
