public class Cofre {
    private Mensaje mensaje;

    public Cofre(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public void escribir(char nombre) {
        mensaje.escribir(nombre);
    }

    @Override
    public String toString() {
        return "Cofre: " + mensaje;
    }
}
