
package ej2.pkg5;
import java.util.Locale;
import java.util.Scanner;

public class Ej25 {

   
    public static void main(String[] args) {
       
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.US);
            System.out.println("Introduzca un numero decimal, puede ser positivo o negativo.");
            double num = sc.nextDouble();
            if (-1 < num && num > 1 && num != 0) {
                System.out.println("El numero introducido no es casi-cero.");
            } else {
                System.out.println ("El numero es casi-cero.");
                
            }
            
        }
  
    }
    

