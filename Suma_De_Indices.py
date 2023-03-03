l1 = []
Cuantos_numeros =  input("Cuantos numeros tendra la lista: ")
Cuantos = int(Cuantos_numeros)
for i in range(0,Cuantos):
    num = input("Teclea un numero para sumar: ")
    n= int(num)
    l1.append(n)
l2i = input("Teclea el numero objetivo: ")
l2 = int(l2i)
arr = [l1,l2]
print(arr)
c = 0
for i in range(0,Cuantos):
    for x in range(i,Cuantos):
        if l1[i] != l1[x]:
            if l1[i] + l1[x] == l2:
                if c<=0:
                    print(i," , ",x)
                    c=1
                
                
                
            


