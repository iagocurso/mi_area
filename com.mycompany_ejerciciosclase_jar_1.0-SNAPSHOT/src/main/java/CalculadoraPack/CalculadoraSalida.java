
package CalculadoraPack;

/**
 *
 * @author arna
 */
import java.util.Scanner;
public class CalculadoraSalida {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);   
    double a;
    double b;
    int calculo=0;
    System.out.println("bienvenido a la calculadora de Iago");
   

       System.out.println("introduce el valor");
        a=sc.nextDouble(); 
           
       System.out.println("introduce un segundo valor");
       b=sc.nextDouble();
       
       switch(calculo){
           case 1:
               suma();
               break;
           case 2:
               resta();
             break;
           
           case 3:
               multiplicacion();
               break;
           case 4:
               division();
               break;
           default:
               System.out.println("introduce un valor correcto");
         }
    }
}
