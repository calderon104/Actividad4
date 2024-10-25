public class Auto {
    private String patente;
    private String modelo;
    private double combustible;

    public Auto(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
        this.combustible = 50.0; // tanque lleno
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    public double getCombustible() {
        return combustible;
    }
}
