/*16) Escribe una aplicación con un String que contenga una contraseña cualquiera. 
Después se te pedirá que introduzcas la contraseña, con 3 intentos. 
Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo “Enhorabuena”.
Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
 */
import java.util.Scanner;
public class Ejer16 {
    public static void main(String[]args){   
    Scanner sc = new Scanner(System.in);
    String contra="hola";
    String intento="";
  
    
    for(int contador=1;!intento.equals(contra)&&contador<4;contador++){
        
         System.out.println("introduce contraseña");
         intento=sc.next();
        
         if(intento.equals(contra)){
            System.out.println("enhorabuena");
            contador=4; 
         }else{
         
         System.out.println("ha fallado " +contador);
        }     
       
    }       
}   
}      

