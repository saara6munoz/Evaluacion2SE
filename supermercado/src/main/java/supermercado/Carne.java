package supermercado;

import java.util.ArrayList;

public class Carne extends Producto{
    //atributos
    public ArrayList<Carne> listaCarnes = new ArrayList<>();
    private float porcentajeGrasa;
    
    //constructores
    public Carne() {
    }

    public Carne(float porcentajeGrasa, String nombre, float precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.porcentajeGrasa = porcentajeGrasa;
    }
    
    //getters and stters
    public float getPorcentajeGrasa() {
        return porcentajeGrasa;
    }

    public void setPorcentajeGrasa(float porcentajeGrasa) {
        this.porcentajeGrasa = porcentajeGrasa;
    }
    //metodo que llena la lista de las carnes disponibles
    public ArrayList<Carne> carnes(){
        Carne carne1 = new Carne(12,"Pollo",1500, "Truto de pollo");
        Carne carne2 = new Carne(14, "Vacuno", 2600, "Posta negra");
        Carne carne3 = new Carne(7, "Cerdo", 1800, "Chuleta de cerdo");
        listaCarnes.add(carne1);
        listaCarnes.add(carne2);
        listaCarnes.add(carne3);
        return listaCarnes;
    } 
    //método que lista las carnes disponibles
    public void listar(){
        for (Carne c : listaCarnes) {
            if (c instanceof Carne) {
                System.out.println("nombre de la carne: " + c.nombre);
                System.out.println("precio de la carne: " + c.precio);
                System.out.println("descripción carne: " + c.descripcion);
                System.out.println("porcentaje de grasa de la carne: " + c.porcentajeGrasa);
            }
        }
    }
    //método que encuentra el objeto carne segun su nombre
    public String findByName(String nombre, ArrayList<Carne> listaCarnes) {
    for (Carne c : listaCarnes) {
        if (c.getNombre().equals(nombre)) {
            return c.toString(); 
        }
    }
        return null;
    }

    @Override
    public String toString() {
        return "Carne{" + "Nombre=" + getNombre() +" Precio="+ getPrecio()+ " Descripción= "+ getDescripcion()+", porcentajeGrasa=" + porcentajeGrasa + '}';
    }
    public void agregarComentarios(String com){
        System.out.println("El comentario añadido es: "+com);
    }
    public void agregarComentarios(String com, float precio){
        System.out.println("El comentario añadido es: "+com+"y el precio notificado asociado es: "+precio);
    }
}
