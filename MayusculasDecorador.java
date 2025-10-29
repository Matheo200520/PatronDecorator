public class MayusculasDecorador extends MensajeDecorador {
    public MayusculasDecorador(Mensaje mensaje) {
        super(mensaje);
    }

    @Override
    public String mostrar() {
        return mensaje.mostrar().toUpperCase();
    }
}
