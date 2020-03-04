/*
14) Realiza una aplicación que nos calcule una ecuación de segundo grado. 
Debes pedir las variables a, b y c por teclado y comprobar antes que el discriminante (operación en la raíz cuadrada).
Para la raíz cuadrada usa el método sqlrt de Math. Te recomiendo que uses mensajes de traza.
 */
import java.util.Scanner;
public class Ejer14 {
   public static void main(String[]args){ 
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        int c;
        
        
        System.out.println("introduce valor a");
        a=teclado.nextInt();
        System.out.println("introduce valor b");
        b=teclado.nextInt();
        System.out.println("introduce valor c");
        c=teclado.nextInt();
        double discriminante=Math.pow(b, 2)-(4*a*c);
        if (discriminante>0){        
        double x1 = (-b + Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double x2 = (-b - Math.sqrt((b*b)-(4*a*c)))/(2*a);
        System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
        
       
   }
    
}
