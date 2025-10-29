public class MensajeSimple implements Mensaje {
    private String texto;

    public MensajeSimple(String texto) {
        this.texto = texto;
    }

    @Override
    public String mostrar() {
        return texto;
    }
}
