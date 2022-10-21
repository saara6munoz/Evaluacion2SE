package supermercado;

public class Verdura {
    private String lechuga, tomate, beterraga;

    public Verdura() {
    }

    public Verdura(String lechuga, String tomate, String beterraga) {
        this.lechuga = lechuga;
        this.tomate = tomate;
        this.beterraga = beterraga;
    }

    public String getLechuga() {
        return lechuga;
    }

    public void setLechuga(String lechuga) {
        this.lechuga = lechuga;
    }

    public String getTomate() {
        return tomate;
    }

    public void setTomate(String tomate) {
        this.tomate = tomate;
    }

    public String getBeterraga() {
        return beterraga;
    }

    public void setBeterraga(String beterraga) {
        this.beterraga = beterraga;
    }
    
}
