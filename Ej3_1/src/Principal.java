import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        final long N_HILOS = 3;
        ArrayList<Hilo> hilos = new ArrayList<>();

        // Iteramos la creacion de hilos
        for (long i = 1; i <= N_HILOS; i++) {
            hilos.add(new Hilo(new Tarea()));
        }

        // Iteramos su arranque (casi simultaneo)
        for (Hilo hilo : hilos) {
            hilo.start();
        }
    }
}