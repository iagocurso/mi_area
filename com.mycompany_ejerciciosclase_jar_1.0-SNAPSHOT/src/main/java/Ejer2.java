/*2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. 
Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
 */

import java.util.Scanner;
public class Ejer2 {
    public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("introduce el primer valor");
    double valor=sc.nextInt();
    System.out.println("introduce el segundo valor");
    double valor2=sc.nextInt();
    
    if (valor < valor2){
        System.out.println("el segundo valor es el mayor"+valor2);
    }else if(valor2 < valor){
        System.out.println("el primer valor es el mayor"+valor);
    }else if(valor2==valor){
        System.out.println("tienen el mismo valor");
    }else{
    System.out.println("error al introducir valor");
    }
}    
}