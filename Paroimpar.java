
package paroimpar;

import java.util.Scanner;


public class Paroimpar {

 
    public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   int num;
   System.out.println ("Introduzca un número.");
 
   num = sc.nextInt();
   if (num % 2 ==0 ) {
       System.out.println(" El número introducido es par.");
     } else { 
    System.out.println("El numero introducido es impar.");
    }
    }
}

