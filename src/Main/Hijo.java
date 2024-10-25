public class Hijo extends Padre implements Madre, Tio, Hermano {
    private String nombre= "Juan Carlos";
    private double billetera;
    private Celular celular;

    public Hijo(String nombre, Celular celular, Auto auto) {
        super(auto);
        this.nombre = nombre;
        this.celular = celular;
        this.billetera = 0;
    }

    @Override
    public void cantar() {
        super.cantar();
        System.out.println(" y Asi canta "+ nombre);
    }

    public void conducirAuto(Auto auto) {
        System.out.println("Conduciendo un auto de un amigo: " + auto.getModelo() + ", patente " + auto.getPatente());
    }

    @Override
    public void bailar() {
        System.out.println("Se bailar como mi madre ♪ ♫ ♪");
    }

    @Override
    public int jugarLoteria() {
        billetera += FORTUNA;
        System.out.println("Heredaste la Fortuna de " + FORTUNA + " de tu madre La Rosa!!");
        return NROSUERTE;
    }

    @Override
    public void heredarDinero(double money) {
        billetera += money;
        System.out.println("Tio Lucas te regala estos dolaritos");
    }

    @Override
    public void jugarFutbol() {
        System.out.println("Se jugar futbol gracias a mi hermano");
    }

    @Override
    public int hacerGoles() {
        return 3; 
    }

    public double getBilletera() {
        return billetera;
    }
}
