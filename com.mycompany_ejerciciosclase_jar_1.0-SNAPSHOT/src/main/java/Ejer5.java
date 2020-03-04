/*
Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
(recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
 */
import javax.swing.JOptionPane;
public class Ejer5 {
     public static void main(String[]args){
     
        double pi=3.14;
             
        String numero=JOptionPane.showInputDialog("Como te llamas");
        System.out.println(Double.parseDouble(numero)*pi );
     }
    } 
