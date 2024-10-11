public class Mensaje {
    private char[] contenido;
    private int pos;           // Rango: [0,2]

    public Mensaje() {
        contenido = new char[3];
        setPos(0);
    }

    public void escribir(char nombre) {
        contenido[pos] = nombre;
        setPos(pos + 1);
    }

    private void setPos(int pos) {
        if (pos < 0 || pos > 2)
            throw new IllegalArgumentException(
                    String.format("El numero debe estar en el rango [0,%d]. [pos = %d]", contenido.length, pos));
        this.pos = pos;
    }

    @Override
    public String toString() {
        return String.valueOf(contenido);
    }
}
