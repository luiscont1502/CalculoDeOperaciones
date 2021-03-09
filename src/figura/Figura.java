
package figura;

import java.util.Scanner;

public class Figura {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base,altura,n=0;
           System.out.println("\t\tCuadrado");
                System.out.println("Ingrese el lado del cuadrado");
                int a=sc.nextInt();
                 int res =a*a;
          System.out.println("El area es : "+res);
    }
    
}
