murcielago = {'m': '0', 'u': '1', 'r': '2', 'c': '3', 'i': '4', 'e': '5', 'l': '6', 'a': '7', 'g': '8', 'o': '9'}
palabra = input("Teclea la frase o palabra: ")
palabra= palabra.lower()
encriptado = ''
for letra in palabra:
    if letra in murcielago:
        encriptado = encriptado+ murcielago[letra]
    else:
        encriptado = encriptado + letra
encriptado= encriptado.upper()
print(encriptado)