import java.util.Scanner;
public class Calculadora {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);    
    
    double valoruno;
    double primervalor;
    
    System.out.println("bienvenido a la calculadora de Iago");
   

       System.out.println("introduce el valor");
        primervalor=sc.nextDouble(); 
           
    System.out.println("signo");
        String calculo=sc.next();
    switch(calculo){
        case "+" :
            System.out.println("introduce un valor");
            valoruno=sc.nextDouble();
            double suma=primervalor+valoruno;
            System.out.println("suma es "+suma);
            
            break;
        case "-":
            System.out.println("introduce un valor");
            valoruno=sc.nextDouble();
            double resta=primervalor-valoruno;
            System.out.println("resta es "+resta);
           
            break;
        case "*":
            System.out.println("introduce un valor");
            valoruno=sc.nextDouble();
           double multiplicacion=primervalor*valoruno;
            System.out.println("multiplicaccion es "+multiplicacion);
           
           break;
        case "/":
            System.out.println("introduce un valor");
            valoruno=sc.nextDouble();
            double division=primervalor/valoruno;
            System.out.println("division es "+division);
            break;
        case"r":
           double raiz = (float) Math.sqrt(primervalor);
           System.out.println("la raiz cuadrada es "+raiz);
           break;
        case "p":
            if(primervalor<=1){
                System.out.print("el numero"+primervalor+"no es primo");
            }else{
                double primo = (float) Math.sqrt(primervalor);
                int contador=0;
                for(double i=primo;i>1;i--){
                    if(primervalor %i==0){
                        contador++;
                    }
                    }
                if (contador<1){
                    System.out.println("el numero "+primervalor+" es primo");
                }else{
                    System.out.println("el numero "+primervalor+" no es primo");
                }
            }
           
                  break;
           
        case "f":
            double factorial=1;
            while(primervalor!=0){
               factorial=factorial*primervalor; 
               primervalor--;
            }
            System.out.println("el factorial es " +factorial);
           break;
        case "e":
            System.out.println("Ingrese el exponente");
            int exponente = sc.nextInt();
            int resultado = (int) Math.pow(primervalor, exponente);
            System.out.println(primervalor + " elevado a la " + exponente + " es igual a " + resultado);
           
           
           
        }        
    }
}
