package supermercado;

public class Bebestible extends Producto{
    //atributos
    private String sabor;
    
    //constructores
    public Bebestible() {
    }

    public Bebestible(String sabor, String nombre, float valor, String descripcion) {
        super(nombre, valor, descripcion);
        this.sabor = sabor;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
   
}
