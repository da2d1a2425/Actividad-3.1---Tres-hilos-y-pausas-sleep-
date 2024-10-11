import java.security.SecureRandom;

public class Tarea implements Runnable{
    private final int TIEMPO1 = 3000;
    private final int N_MENSAJES = 10;
    private SecureRandom random = new SecureRandom();
    @Override
    public void run() {
        for (int i = 0; i < N_MENSAJES; i++) {
            int r = random.nextInt(TIEMPO1);
            System.out.println("Soy el hilo " +
                    Thread.currentThread().getName());
            try {
                Thread.sleep(r);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
