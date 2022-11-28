
package cualesmayor;

import java.util.Scanner;


public class cualesmayor {

 
    public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   
   System.out.println ("Introduzca un número.");
 
    int n1 = sc.nextInt();
     System.out.println(" Introduzca un segundo numero.");
     int n2 = sc.nextInt();
   
     if (n1 > n2){
         System.out.println (n1 + "Es mayor que " + n2);
     } else {
         System.out.println(n2 + "Es mayor que " + n1);
    }
    }
}

