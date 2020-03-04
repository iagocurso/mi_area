/*
18) Pide por teclado dos número y genera 10 números aleatorios entre esos números. 
Usa el método Math.random para generar un número entero aleatorio (recuerda el casting de double a int).
 */
import java.util.Scanner;
import java.lang.Math;
public class Ejer18 {
     public static void main(String[]args){
     Scanner sc = new Scanner(System.in);    
         int a;
         int b;
        
         System.out.println("introduce el primero numero");
         a=sc.nextInt();
         System.out.println("introduce el segundo numero");
         b=sc.nextInt();
         
         for(int i=0;i<10;i++){
             int aleatorio=(int)Math.floor(Math.random()*(a-b)+b);
             System.out.println(""+aleatorio);
         }
              
         
         
      
     }
     
    
}
