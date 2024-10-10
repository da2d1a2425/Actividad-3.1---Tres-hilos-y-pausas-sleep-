public class Hilo extends Thread {
    private static final String PREFIJO = "T";
    private static int contador = 0;
    private int numero; // Autoincrementado a partir de 1

    public Hilo(Runnable tarea) {
        super(tarea);
        setNumero(++contador);
        setName(getNombre());
    }

    public String getNombre() {
       return PREFIJO + numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0)
            throw new IllegalArgumentException(String.format("El numero debe ser >= 1 [numero = %d]", numero));
        this.numero = numero;
    }
}
