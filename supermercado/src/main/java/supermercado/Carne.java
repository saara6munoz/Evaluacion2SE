package supermercado;

public class Carne extends Producto{
    //atributos
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
}