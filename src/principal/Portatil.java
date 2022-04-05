package principal;

public class Portatil {
    private final String marca="HP";
    private int numSerie;
    private String modelo;

    public Portatil(int numSerie, String modelo) {
        this.numSerie = numSerie;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Portatil{" +
                "marca='" + marca + '\'' +
                ", numSerie=" + numSerie +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
