package supermercado;

import java.util.Date;

public class Carne extends Producto{
    //atributos
    private Date fechaVencimiento;
    
    //constructores
    public Carne() {
    }

    public Carne(Date fechaVencimiento, String nombre, float valor, String descripcion) {
        super(nombre, valor, descripcion);
        this.fechaVencimiento = fechaVencimiento;
    }
    
    //getters and stters
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
    
}