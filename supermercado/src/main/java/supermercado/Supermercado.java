
package supermercado;

import java.util.Scanner;
public class Supermercado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        while(!salir){
            System.out.println("**LA COMPLETA FERIA**");
            System.out.println("Bienvenido al Menú");
            System.out.println("1. Comprar ");
            System.out.println("2. Productos disponibles ");
            System.out.println("3. Eliminar productos ");
            System.out.println("4. Salir ");
            
            System.out.println("Ingresa una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("¿Que producto desea comprar?");
                    break;
                case 2:
                    System.out.println("Los productos disponibles son:");
                    break;
                case 3:
                    System.out.println("¿Que desea eliminar? ");
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Elija una opcion entre 1 y 4 ");
            }
        }
        
     System.out.println("Fin del menú ");
    }
}
