import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        final long N_HILOS = 3;
        ArrayList<Hilo> hilos = new ArrayList<>();

        for (long i = 1; i <= N_HILOS; i++) {
            hilos.add(new Hilo(new Tarea()));
        }

        for (Hilo hilo : hilos) {
            hilo.start();
            // Hacemos que se unan a la cola
            try {
                hilo.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Fin de ejecucion del programa principal");
    }
}