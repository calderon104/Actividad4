public class Celular {
    private String compania;
    private String numero;
    private double saldo;

    public Celular(String compania, String numero, double saldo) {
        this.compania = compania;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public String getCompania() {
        return compania;
    }

    public double getSaldo() {
        return saldo;
    }
}
