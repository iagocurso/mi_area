/*6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
 */
import java.util.Scanner;
public class Ejer6 {
    public static void main(String[]args){
               
        Scanner sc=new Scanner(System.in);
        System.out.println("ingresa un valor");
        double valor=sc.nextInt();
        int valor2=2;
        double resul= valor%valor2;
        if (resul==0){
            System.out.println("si es divisible");
        }else
            System.out.println("no,no lo es");
           
        }
        
    }

