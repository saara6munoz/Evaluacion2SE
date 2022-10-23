
package supermercado;

import java.util.Scanner;
public class Supermercado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        do{ 
            System.out.println("**LA COMPLETA FERIA**");
            System.out.println("Bienvenido al Menú"); 
            System.out.println("1. Agregar nuevos productos");
            System.out.println("2. Listar productos ");
            System.out.println("3. Añadir productos al carrito");
            System.out.println("4. Salir ");
            
            System.out.println("Ingresa una opcion: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("¿Cuántos productos desea agregar?");
                    int numero = entrada.nextInt();
                    int i = 0;
                    while(i < numero){
                        Carrito carrito = new Carrito();
                        carrito.agregarProducto(entrada);
                        i ++;
                    }
                    System.out.println("Se han ingresado los productos exitosamente");
                    break;
                case 2:
                    System.out.println("Los productos disponibles son:");
                    Verdura verdura = new Verdura();
                    verdura.verduras();
                    verdura.listar();
                    Carne carne = new Carne();
                    carne.carnes();
                    carne.listar();
                    Bebestible bebestible = new Bebestible();
                    bebestible.bebestibles();
                    bebestible.listar();
                    break;
                case 3:
                    Carrito c = new Carrito();
                    c.agregarCarro(entrada);

                    
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Elija una opcion entre 1 y 4 ");
           }}
        while(opcion<4);
        System.out.println("Fin del menú ");
    }
}
