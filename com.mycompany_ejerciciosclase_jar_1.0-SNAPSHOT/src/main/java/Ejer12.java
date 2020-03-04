/*
 12) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
 */
public class Ejer12 {
     public static void main(String[]args){
       int contador=0; 
       int variabletres=contador%3;
       int variabledos=contador%2;
     
        while(contador<=100){
         if(variabledos==0){
          System.out.println("es divisible entre 2->"+contador);
          contador++;
         }else if(variabletres==0){
          System.out.println("es divisible entre 3->"+contador);
          contador++;
         }else{
             contador++;
         }
        }
      } 
    }

