package entities;

public class Carro {
    private int anoFabricacao;
    private String modelo;
    private String fabricanteMarca;
    private Roda roda;

    public Carro(int anoFabricacao, String modelo, String fabricanteMarca, Roda roda){
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.fabricanteMarca = fabricanteMarca;
        this.roda = roda;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricanteMarca() {
        return fabricanteMarca;
    }

    public Roda getRoda() {
        return roda;
    }

    public void setRoda(Roda roda) {
        this.roda = roda;
    }
}
