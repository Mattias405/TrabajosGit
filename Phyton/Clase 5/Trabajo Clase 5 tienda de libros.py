print("digite los siguientes datos del libro")
nombre = input("digite el nombre del libro: ")
id = int(input("digite el id del libro: "))
precio = float(input("digite el precio del libro: "))
envioGratuito = input("indicar si el libro es gratuito (True/False)")
if envioGratuito == 'True':
    envioGratuito = True
elif envioGratuito == 'False':
    envioGratuito = False
else:
    envioGratuito = "el valor es incorrecto, debe escribir True/False"
print(f'''
        nombre: {nombre}
        Id: {id}
        Precio: {precio}
        Envio Gratuito: {envioGratuito}
''')