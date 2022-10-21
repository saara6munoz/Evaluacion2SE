package supermercado;

public class Verdura extends Producto{
    //atributos
    private String tipoVerdura;

    //constructores
    public Verdura() {
    }

    public Verdura(String tipoVerdura, String nombre, float valor, String descripcion) {
        super(nombre, valor, descripcion);
        this.tipoVerdura = tipoVerdura;
    }
    
    //gettes and setters

    public String getTipoVerdura() {
        return tipoVerdura;
    }

    public void setTipoVerdura(String tipoVerdura) {
        this.tipoVerdura = tipoVerdura;
    }
}
