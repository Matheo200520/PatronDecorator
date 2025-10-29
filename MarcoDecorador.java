public class MarcoDecorador extends MensajeDecorador {
    public MarcoDecorador(Mensaje mensaje) {
        super(mensaje);
    }

    @Override
    public String mostrar() {
        String contenido = mensaje.mostrar();
        String borde = "*".repeat(contenido.length() + 4);
        return borde + "\n| " + contenido + " |\n" + borde;
    }
}
