package supermercado;

public class Bebestible {
    private String bebida, jugo, agua, saborizante;

    public Bebestible() {
    }

    public Bebestible(String bebida, String jugo, String agua, String saborizante) {
        this.bebida = bebida;
        this.jugo = jugo;
        this.agua = agua;
        this.saborizante = saborizante;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getJugo() {
        return jugo;
    }

    public void setJugo(String jugo) {
        this.jugo = jugo;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public String getSaborizante() {
        return saborizante;
    }

    public void setSaborizante(String saborizante) {
        this.saborizante = saborizante;
    }
    
    
}
