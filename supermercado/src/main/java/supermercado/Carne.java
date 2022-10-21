package supermercado;

public class Carne {
    private String pollo, vacuno, cerdo;

    public Carne() {
    }

    public Carne(String pollo, String vacuno, String cerdo) {
        this.pollo = pollo;
        this.vacuno = vacuno;
        this.cerdo = cerdo;
    }

    public String getPollo() {
        return pollo;
    }

    public void setPollo(String pollo) {
        this.pollo = pollo;
    }

    public String getVacuno() {
        return vacuno;
    }

    public void setVacuno(String vacuno) {
        this.vacuno = vacuno;
    }

    public String getCerdo() {
        return cerdo;
    }

    public void setCerdo(String cerdo) {
        this.cerdo = cerdo;
    }

   
}
