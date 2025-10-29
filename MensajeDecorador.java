public abstract class MensajeDecorador implements Mensaje {
    protected Mensaje mensaje;

    public MensajeDecorador(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String mostrar() {
        return mensaje.mostrar();
    }
}
