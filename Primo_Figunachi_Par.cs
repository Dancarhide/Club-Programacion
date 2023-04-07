using System;

class Hello
{
    static void Main()
    {
        int Numero;
        bool EsPrimo=true;
        String resultado= "";
        Console.WriteLine("Teclea el numero: ");
        Numero=int.Parse(Console.ReadLine());
        for(int x=2;x<Numero;x++){
            if(Numero%x==0){
                EsPrimo=false;
                
            }
        }
        if(EsPrimo==true){
            resultado = ("El numero "+Numero+" es primo");
        }else{
            resultado = ("El numero "+Numero+" no es primo");
        }
        bool esfi=false;
        int a=0;
        int b=1;
        int c;
        while(b<=Numero){
            if(b==Numero){
                esfi=true;
                break;
            }
            c=a+b;
            a=b;
            b=c;
        }
        if(esfi==true){
            resultado = resultado+ (", es de Figonacci");
        }else{
           resultado = resultado+ (", no es de Figonacci");
        }


        if(Numero%2==0){
            resultado = resultado+ (" y es par");
        }else{
            resultado = resultado+ (" y no es par");
        }
        Console.WriteLine(resultado);

        
    }
}