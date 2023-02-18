
print("Dijita cualquier numero")
num = int(input())
primo = True
fi = False
n=1
nn = 1
i = int

if num % 2 == 0:
    print(num, ' es par')
else:
    print(num,' no es par')



for i in range (2,num):
    if (num%i==0):
        primo = False


if(primo==True):
    print("Es primo")
if(primo==False):
    print("No es primo")
    


for i in range(num):
    n, nn = nn, n + nn
    if nn== num:
        print(num, "Es de la serie de Fibonacci.")
        fi = True
        break


if fi== False:
    print("No es de la serie de Fibonacci")

     

