package supermercado;

import java.util.ArrayList;
import java.util.Scanner;


public class Carrito implements CalcularDesc{
    //atributos
    private ArrayList<Producto> listaProductos;
    
    //getters and setters
    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
    //se crea metodo que crea una lista de productos 
    public Carrito() {
        listaProductos = new ArrayList<>();
    }

    //método para validar la igualdad del nombre ingresado 
    public boolean validarProducto(String nombre) {
        for (Producto p : listaProductos) {
            if (p.nombre.equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    
    public void agregarProducto(Scanner sc) {}
    
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
