package entities;

public class Roda {
    private String aro;
    private String marcaPneu;

    public Roda(String aro, String marcaPneu){
        this.aro = aro;
        this.marcaPneu = marcaPneu;
    }

    public String getAro() {
        return aro;
    }

    public void setAro(String aro) {
        this.aro = aro;
    }

    public String getMarcaPneu() {
        return marcaPneu;
    }

    public void setMarcaPneu(String marcaPneu) {
        this.marcaPneu = marcaPneu;
    }
}
