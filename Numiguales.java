
package numiguales;

import java.util.Scanner;


public class Numiguales {

 
    public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   
   System.out.println ("Introduzca un número.");
 
    int n1 = sc.nextInt();
     System.out.println(" Introduzca un segundo numero.");
     int n2 = sc.nextInt();
   
     if (n1 == n2){
         System.out.println ("los numeros son iguales");
     } else {
         System.out.println("Los numeros son distintos");
    }
    }
}

