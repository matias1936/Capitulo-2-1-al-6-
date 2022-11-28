
package mayoramenor;

import java.util.Scanner;


public class Mayoramenor {

 
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int n1, n2;
       int mayor, menor;
       
       System.out.println("Ingrese un numero: ");
       n1 = sc.nextInt();
       System.out.println("Ingrese otro numero: ");
       n2 = sc.nextInt();
       
       mayor = n1 > n2 ? n1 : n2; 
       menor = n1 < n2 ? n1 : n2;
       System.out.println (mayor + ", " + menor);
    }
    }
    

