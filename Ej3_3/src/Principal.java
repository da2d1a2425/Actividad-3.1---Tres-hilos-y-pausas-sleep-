import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Thread> hilos = new ArrayList<>();
        Cofre cofre = new Cofre(new Mensaje());
        for (int i = 0; i < 3; i++) {
            hilos.add(new Thread(new Tarea(cofre),
                    Character.toString('A' + i)));
        }

        for (Thread hilo : hilos) {
            hilo.start();
            try {
                hilo.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(cofre);

    }
}