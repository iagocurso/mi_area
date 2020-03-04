/*13) Realiza una aplicación que nos pida un número de ventas a introducir,
después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. 
Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.*/

import java.util.Scanner;
public class Ejer13 {
   public static void main(String[]args){ 
       Scanner sc = new Scanner(System.in);
       System.out.println("introduce el numero de ventas");
       int cantidad=sc.nextInt();
       
       System.out.println("introduce el numero de ventas");
       int ventas=sc.nextInt();
       int sumacantidad=0;
            for(int i=0;i<cantidad;i++){
                System.out.println("introduce el precio de venta"+(i+1));
                int venta=sc.nextInt();
                sumacantidad=ventas+venta;
            }
            System.out.println(sumacantidad);
                
            }
    }
