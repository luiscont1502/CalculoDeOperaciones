
package figura;

import java.util.Scanner;

public class Figura {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int base,altura,n=0;
          
        do{
        System.out.println("\t\t\tMenu");
        System.out.println("Seleccione la operacion a realizar");
        System.out.println("\t1.- Cuadrado");
        System.out.println("\t2.- Rectangulo");
        System.out.println("\t3.- Triangulo");
        System.out.println("\t0.- Salir");
        System.out.println("Escoja la opcion");
        n=sc.nextInt();
        switch(n){
           
            case 0:
                System.out.println("Gracias por visitarnos");
                break;
            case 1:
                System.out.println("\t\tCuadrado");
                System.out.println("Ingrese el lado del cuadrado");
                int a=sc.nextInt();
                Cuadrado(a);
                break;
            case 2:
                System.out.println("\t\tRectangulo");
                System.out.println("Ingrese la base");
                base=sc.nextInt();
                System.out.println("Ingrese la altura");
                altura=sc.nextInt();
                Rectangulo(base,altura);
                break;
            case 3:
                  System.out.println("\t\tTriangulo");
                System.out.println("Ingrese la base");
                base=sc.nextInt();
                System.out.println("Ingrese la altura");
                altura=sc.nextInt();
                Triangulo(base, altura);
                break;
            default:
                System.out.println("No se encuentra en la lista de operaciones");
                break;
        }
            
        }while(n!=0);
    }
      public static void Cuadrado(int a){
        int res =a*a;
          System.out.println("El area es : "+res);
        }
      public static void Rectangulo(int a, int b){
      int res=a*b;
          System.out.println("El Area es : "+res);
      }
      public static void Triangulo(int a, int b){
          float res=(a*b)/2;
          System.out.println("El area es :" +res);
      }
    
}
