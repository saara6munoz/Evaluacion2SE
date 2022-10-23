package supermercado;

import java.util.ArrayList;

public class Bebestible extends Producto{
    //atributos
    private String sabor;
    private ArrayList<Bebestible> listaBebestibles = new ArrayList<>();
    
    //constructores
    public Bebestible() {
    }

    public Bebestible(String sabor, String nombre, float precio, String descripcion) {
        super(nombre, precio, descripcion);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public void bebestibles(){
        Bebestible bebestible1 = new Bebestible ("Cola", "Coca-Cola", 2100, "Bebida de 3L");
        Bebestible bebestible2 = new Bebestible("Naranja", "Fanta", 1500, "Bebida de 2L");
        Bebestible bebestible3 = new Bebestible("Papaya", "Pap", 1600, "Bebida de 2.5L");
        listaBebestibles.add(bebestible1);
        listaBebestibles.add(bebestible2);
        listaBebestibles.add(bebestible3);
    } 
    public void listar(){
        for (Bebestible b : listaBebestibles) {
            if (b instanceof Bebestible) {
                System.out.println("nombre del bebestible: " + b.nombre);
                System.out.println("precio del bebestible: " + b.precio);
                System.out.println("descripción del bebestible: " + b.descripcion);
                System.out.println("sabor del bebestible: " + b.sabor);
            }
        }
    }
   
}
