package supermercado;

import java.util.ArrayList;
import java.util.Scanner;


public class Carrito implements CalcularDesc{
    //atributos
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private ArrayList<Verdura> listaCarrito = new ArrayList<>();
     
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
    
    public boolean validarCarrito(String nombre) {
        return listaCarrito.stream().anyMatch(p -> (p.nombre.equals(nombre)));
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
                    System.out.println("¿cual es el porcentaje de grasa del producto? : ");
                    float grasa = sc.nextFloat();
                    listaProductos.add(new Carne(grasa, nombre, precio, descripcion));
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
        for (Producto p : listaProductos) {
            boolean existe = this.validarProducto(nombre);
            if (existe) {
                i = 1;
                listaProductos.remove(p);
            }
        }
        if (i == 0) {
            System.out.println("El producto no existe");
        } else {
            System.out.println("el producto ha sido eliminado");
        }
    }
    
    public void agregarCarro(Scanner sc){
        System.out.println("Ingrese el número de la categoría correspondiente:\n"
                        + "1) Carne\n "
                        + "2) Verdura\n "
                        + "3) Bebestible\n ");
        int cat = sc.nextInt();
        switch (cat) {
            case 1:
                Carne ca = new Carne();
                System.out.println("Ingrese el nombre de la carne: ");
                String nombre = sc.next();
                ca.carnes();
                System.out.println(ca.findByName(nombre, ca.listaCarnes));
                break;
            case 2:
                System.out.println("Ingrese el nombre de la verdura: ");

                break;
            case 3:
                System.out.println("Ingrese el nombre del bebestible: ");

                break;
        }
    }
                    
    @Override
    public void precioFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void totalProductos() {
        System.out.println("");
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
}
