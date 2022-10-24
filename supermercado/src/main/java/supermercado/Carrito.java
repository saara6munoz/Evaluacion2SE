package supermercado;

import java.util.ArrayList;
import java.util.Scanner;


public class Carrito implements CalcularDesc{
    //atributos
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    public ArrayList<String> listaCarrito = new ArrayList<>();
     
    //getters and setters
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    public Carrito() {
        listaProductos = new ArrayList<>();
    }

    //método para validar la igualdad del nombre ingresado 
    public boolean validarProducto(String nombre) {
        return listaProductos.stream().anyMatch(p -> (p.nombre.equals(nombre)));
    } 
    //método que verifica si contiene el nombre y elimina el producto
    public boolean validarCarrito(String nombre) {
        for (String s : listaCarrito){
            System.out.println(s);
            if(s.contains(nombre)){
                return true;
            }
        }
        return false;
    } 
    
    public void agregarProducto(Scanner sc) {
        System.out.println("Ingrese el nombre del producto : ");
        String nombre = sc.next();
        boolean existe = this.validarProducto(nombre);
        if (existe) {
            System.out.println("El producto ya fue ingresado anteriormente");
            System.out.println("Se han añadido 2 "+nombre);
        } else {
            System.out.println("ingrese el precio del producto: ");
            float precio = sc.nextInt();
            System.out.println("ingrese la descripción del producto: ");
            String descripcion = sc.next();
            System.out.println("Ingrese el número de la categoría correspondiente:\n"
                    + "1) Carne\n "
                    + "2) Verdura\n "
                    + "3) Bebestible\n ");
            int cat = sc.nextInt();
            switch (cat) {
                case 1:
                    Carne c = new Carne();
                    System.out.println("¿cual es el porcentaje de grasa del producto? : ");
                    float grasa = sc.nextFloat();
                    listaProductos.add(new Carne(grasa, nombre, precio, descripcion));
                    System.out.println("¿Desea agregar un comentario? : ");
                    String com = sc.next();
                    c.agregarComentarios(com);
                    System.out.println("¿Desea agregar un comentario asociado a un precio?: ");
                    float precioCom = sc.nextFloat();
                    c.agregarComentarios(com, precioCom);
                    break;
                case 2:
                    System.out.println("¿Qué tipo de verdura es? : ");
                    String tipo = sc.next();
                    listaProductos.add(new Verdura(tipo, nombre, precio, descripcion));
                    break;
                case 3:
                    System.out.println("¿que sabor es? : ");
                    String sabor = sc.next();
                    listaProductos.add(new Bebestible(sabor, nombre, precio, descripcion));
                    break;
            }
        }
    }
    public void eliminarProducto(String nombre) {
        int i = 0;
        for (String p : listaCarrito) {
            boolean existe = this.validarCarrito(nombre);
            if (existe) {
                i = 1;
                listaCarrito.remove(p);
            }
        }
        if (i == 0) {
            System.out.println("El producto no existe");
        } else {
            System.out.println("el producto ha sido eliminado");
        }
    }
    
    public void agregarCarro(Scanner sc){ 
       int cat;
        do{
            System.out.println("Ingrese el número de la categoría correspondiente:\n"
                        + "1) Carne\n "
                        + "2) Verdura\n "
                        + "3) Bebestible\n "
                        + "4) Ver la lista de mis productos\n "
                        + "5) Eliminar productos de mi carrito \n "
                        + "6) Total de mi compra\n "
            );
            cat = sc.nextInt();
            switch (cat) {
            case 1:
                int contador = 1;
                boolean bucle = true;
                Carne ca = new Carne();
                System.out.println("Ingrese el nombre de la carne: ");
                String nombre = sc.next();
                ca.carnes();
                System.out.println(ca.findByName(nombre, ca.listaCarnes));
                listaCarrito.add(ca.findByName(nombre, ca.listaCarnes));
                while(bucle){
                System.out.println("Desea añadir otro alimento de la categoría carne? SI/NO");
                String op = sc.next();
                if (op.equals("SI")){
                    contador++;
                    System.out.println("Ingrese el nombre de la carne: ");
                    String nombre1 = sc.next();
                    System.out.println(ca.findByName(nombre1, ca.listaCarnes));
                    listaCarrito.add(ca.findByName(nombre1, ca.listaCarnes));
                    System.out.println("Existen "+contador+" productos de la categoría carne");
                }else{
                    System.out.println("Presione una tecla para volver al menú de selección de categorías");
                    sc.next();
                    bucle = false;
                }}
                break;
            case 2:
                int contador1 = 1;
                boolean bucle1 = true;
                Verdura v = new Verdura();
                System.out.println("Ingrese el nombre de la verdura: ");
                String nombre1 = sc.next();
                v.verduras();
                System.out.println(v.findByName(nombre1, v.listaVerduras));
                listaCarrito.add(v.findByName(nombre1, v.listaVerduras));
                while(bucle1){
                System.out.println("Desea añadir otro alimento de la categoría carne? SI/NO");
                String op = sc.next();
                if (op.equals("SI")){
                    contador1++;
                    System.out.println("Ingrese el nombre de la carne: ");
                    String nombre2 = sc.next();
                    System.out.println(v.findByName(nombre2, v.listaVerduras));
                    listaCarrito.add(v.findByName(nombre2, v.listaVerduras));
                    System.out.println("Existen "+contador1+" productos de la categoría carne");
                }else{
                    System.out.println("Preseione una tecla para volver al menú de selección de categorías");
                    sc.next();
                    bucle1 = false;
                }}
                break;
            case 3:
                int contador2 = 1;
                boolean bucle2 = true;
                Bebestible b = new Bebestible();
                System.out.println("Ingrese el nombre del bebestible: ");
                String nombre2 = sc.next();
                b.bebestibles();
                System.out.println(b.findByName(nombre2, b.listaBebestibles));
                listaCarrito.add(b.findByName(nombre2, b.listaBebestibles));
                while(bucle2){
                System.out.println("Desea añadir otro alimento de la categoría bebestible? SI/NO");
                String op = sc.next();
                if (op.equals("SI")){
                    contador2++;
                    System.out.println("Ingrese el nombre del bebestible: ");
                    String nombre3 = sc.next();
                    System.out.println(b.findByName(nombre3, b.listaBebestibles));
                    listaCarrito.add(b.findByName(nombre3, b.listaBebestibles));
                    System.out.println("Existen "+contador2+" productos de la categoría bebestible");
                }else{
                    System.out.println("Preseione una tecla para volver al menú de selección de categorías");
                    sc.next();
                    bucle2 = false;
                }}
                break;
            case 4:
                System.out.println(listaCarrito.toString());
                break;
            case 5:
                System.out.println("Ingrese el nombre del producto que desea eliminar");
                nombre = sc.next();
                eliminarProducto(nombre);
                System.out.println(listaCarrito.toString());
                break;
            default:
                System.out.println("El numero de la categoria seleccionada esta fuera de rango");
            }}
        while(cat<5);
        System.out.println("Fin del menú");}
                    
    @Override
    public void precioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void totalProductos() {
        System.out.println(listaCarrito.toString());
        }

    @Override
    public void calcularIva(double iva, float precio) {
        System.out.println("El precio con iva del producto es: "+(iva * precio));
        }    

    @Override
    public void descCarne(double carne, float precio) {
        System.out.println("El precio aplicando el descuento de la carne es: "+(carne * precio));
        }

    @Override
    public void descBebestible(double bebestible, float precio) {
        System.out.println("El precio aplicando el descuento del bebestible es: "+(bebestible * precio));
            
        }

    @Override
    public String toString() {
        return "Carrito{" + "listaProductos=" + listaProductos + ", listaCarrito=" + listaCarrito + '}';
    }
    
}
