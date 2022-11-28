
package ej2.pkg3;

import java.util.Scanner;


public class Ej23 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Introduzca un numero:");
        int n1 = sc.nextInt();
        System.out.println("Introduzca un segundo numero:");
        int n2 = sc.nextInt();
        if (n1 == n2) {
            System.out.println("Los números ingresados son iguales.");
        } else {
              if (n1>n2){
            System.out.println(n1+ " es mayor que " +n2);
        } else {
            System.out.println(n2 + " es mayor que " + n1);
        }
      
    }
    

    }
}
