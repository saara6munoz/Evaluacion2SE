package supermercado;

import java.util.ArrayList;

public class Verdura extends Producto{
    //atributos 
    public ArrayList<Verdura> listaVerduras = new ArrayList<>();
    private String tipoVerdura; //raiz - hortalizas - bulbo

    //constructores
    public Verdura() {
    }

    public Verdura(String tipoVerdura, String nombre, float precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.tipoVerdura = tipoVerdura;
    }
    
    
    //gettes and setters
    public String getTipoVerdura() {
        return tipoVerdura;
    }

    public ArrayList<Verdura> getListaVerduras() {
        return listaVerduras;
    }
    //método que crea 3 productos de la clase verdura
    public void verduras(){
        Verdura verdura1 = new Verdura ("Bulbo", "Cebolla", 3000, "Producto en malla");
        Verdura verdura2 = new Verdura("Raiz", "Papa", 2000, "Producto que se pesa");
        Verdura verdura3 = new Verdura("Hortaliza", "Coliflor", 1500, "Producto con stock limitado");
        listaVerduras.add(verdura1);
        listaVerduras.add(verdura2);
        listaVerduras.add(verdura3);
    } 
    //método que lista la clase verdura
    public void listar(){
        for (Verdura v : listaVerduras) {
            if (v instanceof Verdura) {
                System.out.println("nombre de la verdura: " + v.nombre);
                System.out.println("precio de la verdura: " + v.precio);
                System.out.println("descripción verdura: " + v.descripcion);
                System.out.println("tipo de verdura: " + v.tipoVerdura);
            }
        }
    }
    public String findByName(String nombre, ArrayList<Verdura> listaVerduras) {
    for (Verdura v : listaVerduras) {
        if (v.getNombre().equals(nombre)) {
            return v.toString(); 
        }
    }
        return null;
    }

    @Override
    public String toString() {
        return "Verdura{" +  "Nombre=" + getNombre() +" Precio="+ getPrecio()+ " Descripción= "+ getDescripcion()+", tipoVerdura=" + tipoVerdura + '}';
    }
}
