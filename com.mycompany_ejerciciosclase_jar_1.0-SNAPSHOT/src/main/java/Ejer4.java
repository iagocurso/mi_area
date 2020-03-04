/*4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
 */
import javax.swing.JOptionPane;
public class Ejer4 {
public static void main(String[]args){
        
      
    String nombre=JOptionPane.showInputDialog("Como te llamas");
     System.out.println("Bienvenido "+nombre);    
}
}