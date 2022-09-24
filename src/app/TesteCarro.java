package app;

import entities.Carro;
import entities.Roda;

public class TesteCarro {
    public static void main(String[] args) {

        Roda r = new Roda("Aro 14 Kromma KR-1410", "Pirelli");

        Carro c = new Carro(2021, "Honda Civic", "Honda", r);

        System.out.println("Ficha técnica:");
        System.out.printf("Fabricante: %s\n", c.getFabricanteMarca());
        System.out.printf("Modelo: %s\n", c.getModelo());
        System.out.printf("Ano de fabricação: %d\n", c.getAnoFabricacao());
        System.out.printf("Marca do pneu: %s\n", r.getMarcaPneu());
        System.out.printf("Aro da roda: %s\n", r.getAro());
    }
}
