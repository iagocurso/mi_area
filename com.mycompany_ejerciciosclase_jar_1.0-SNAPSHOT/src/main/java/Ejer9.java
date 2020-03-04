/*9) Lee un número por teclado que pida el precio de un producto (puede tener decimales)
y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
 */
import java.util.Scanner;
public class Ejer9 {
    
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    final int valorf= 21;
    System.out.println("introduce el primer valor");
    double valor=sc.nextInt();
    double resul=(valorf/100)*valor;
       
    
    System.out.println("el resultado es "+resul);

}
}
