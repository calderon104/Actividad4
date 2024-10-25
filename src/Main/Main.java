public class Main {
    public static void main(String[] args) {
        // Crear autos
        Auto cascajo = new Auto("123LATA", "Renault 12");
        Auto fordFocus = new Auto("999POWR", "Ford Focus");

        Celular celular = new Celular("Movistar", "123456789", 20.0);

        Padre padre = new Padre(fordFocus);
        System.out.println("Papa me deja esta casa en zona: : " + padre.getCasa().getZona());

        Hijo juanCarlos = new Hijo("Juan Carlos", celular, cascajo);
        System.out.println("Papa me deja este auto: " + juanCarlos.getAuto().getModelo());

        juanCarlos.conducirAuto(fordFocus);

        juanCarlos.jugarFutbol();

        juanCarlos.bailar();

        System.out.println("SALIO EL NUMERO DE LA SUERTE: " + juanCarlos.jugarLoteria());
        System.out.println("Billetera de Juan Carlos: " + juanCarlos.getBilletera());

        juanCarlos.cantar();

        juanCarlos.heredarDinero(2000);
        System.out.println("Billetera de Juan Carlos: " + juanCarlos.getBilletera());

        System.out.println("Jugando al Futbol, Hoy has hecho " + juanCarlos.hacerGoles() + " goles");
    }
}
