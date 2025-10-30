public class EmojisDecorador extends MensajeDecorador {
    public EmojisDecorador(Mensaje mensaje) {
        super(mensaje);
    }

    @Override
    public String mostrar() {
        return "💀 " + mensaje.mostrar() + " 💀";
    }
}
