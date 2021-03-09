
package figura;

import java.util.Scanner;

public class Figura {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base,altura,n=0;
             System.out.println("\t\tRectangulo");
                System.out.println("Ingrese la base");
                base=sc.nextInt();
                System.out.println("Ingrese la altura");
                altura=sc.nextInt();
                  int res=base*altura;
          System.out.println("El Area es : "+res);
    }
    
}
