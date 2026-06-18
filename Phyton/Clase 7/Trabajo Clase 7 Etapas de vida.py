edad = int(input("digite su edad: "))

if edad > 100:
        print("Error: La edad no puede exceder los 100 años.")
else:
    if 1 <= edad <= 10:
        print("tu infancia es increible")
    elif 10 < edad <= 19:
        print("muchos cambios y muchos estudios")
    elif 19 < edad <= 29:
        print("encuentras amor y trabajo")
    elif 29 < edad <= 59:
        print("cumples metas y logros, ere maduro")
    elif edad >= 60:
        print("mucha sabiduria y experiencia")
    else:
        print("edad no valida")