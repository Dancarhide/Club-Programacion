import random

opc = ["piedra", "papel", "tijera"]
com = random.choice(opc)
jugador = input("¿Piedra, papel o tijera? ").lower()
print(f"Computadora elijio {com}.")

if jugador not in opc:
    print("que intentas?")
elif jugador == com:
    print("Empate")
elif jugador == "piedra" and com == "tijera":
    print("Ganaste")
elif jugador == "papel" and com == "piedra":
    print("Ganaste")
elif jugador == "tijera" and com == "papel":
    print("Ganaste")
else:
    print("Perdiste")
    