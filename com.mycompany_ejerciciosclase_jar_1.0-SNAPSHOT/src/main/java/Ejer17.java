/*
17) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no. Usa un switch para ello.
 */
import java.util.Scanner;
public class Ejer17 {
    public static void main(String[]args){ 
    Scanner sc = new Scanner(System.in);

    
        System.out.println("introduce un dia");
    String semana=sc.nextLine();
    switch (semana){
        case "lunes":            
        case "martes": 
        case "miercoles":
        case "jueves":
        case "viernes":          
            System.out.println("es laboral");
            break;
        case "sabado":
        case "domingo":
            System.out.println("es festivo");
            break;
        default:
            System.out.println("dia incorrecto");          
                  
               
           
    }
    
    }
}
