public class Padre {
    private String nombre = "Papa";
    protected String apellido = "Lopez"; 

    private Casa casa;
    private Auto auto;

    public Padre(Auto auto) {
        this.auto = auto;
        construirCasa();
        comprarAuto(auto);
    }

    private void construirCasa() {
        this.casa = new Casa("Centro, 2 pisos");
    }

    private void comprarAuto(Auto auto) {
        this.auto = auto;
    }

    public void cantar() {
        System.out.println("Asi canta tu padre, Don " + apellido);
    }

    public Auto getAuto() {
        return auto;
    }

    public Casa getCasa() {
        return casa;
    }
}
