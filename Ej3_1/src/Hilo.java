public class Hilo extends Thread {
    // Con PREFIJO y el estado del contador en un
    // momento dado construimos los nombres de hilos
    private static final String PREFIJO = "T";
    private static int contador = 0;
    private int numero; // Autoincrementado a partir de 1

    // Construimos con el constructor Thread(<tarea>)
    // y cambiamos luego el nombre del hilo
    public Hilo(Runnable tarea) {
        super(tarea);
        setNumero(++contador);
        setName(getNombre());
    }

    // Metodo que nos devuelve el nombre actual del hilo
    // que creamos
    public String getNombre() {
       return PREFIJO + numero;
    }

    // Tiramos una excepcion si el numero no
    // tiene el formato que queremos
    public void setNumero(int numero) {
        if (numero <= 0)
            throw new IllegalArgumentException(String.format("El numero debe ser >= 1 [numero = %d]", numero));
        this.numero = numero;
    }
}
