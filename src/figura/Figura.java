
package figura;

import java.util.Scanner;

public class Figura {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base,altura,n=0;
           System.out.println("\t\tTriangulo");
                System.out.println("Ingrese la base");
                base=sc.nextInt();
                System.out.println("Ingrese la altura");
                altura=sc.nextInt();
                float res=(base*altura)/2;
          System.out.println("El area es :" +res);
          
    }
    
}
