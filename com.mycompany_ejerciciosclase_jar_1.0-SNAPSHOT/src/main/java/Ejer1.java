/* 1) Declara dos variables numéricas (con el valor que desees), 
muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
*/

import java.util.Scanner;
public class Ejer1 {
    public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("introduce el primer valor");
    double valor=sc.nextInt();
    System.out.println("introduce el segundo valor");
    double valor2=sc.nextInt();
    double suma=valor+valor2;
    double resta=valor-valor2;
    double multiplicacion=valor*valor2;
    double division=valor/valor2;
    double resto=valor%valor2;
    
    System.out.println("suma"+suma);
    System.out.println("resta"+resta);
    System.out.println("multiplicacion"+multiplicacion);
    System.out.println("division"+division);
    System.out.println("resto"+resto);
    
    
    }
}
    