public class Ejecutar {
    public static void main(String[] args) {
        Mensaje mensaje = new MensajeSimple("Hola, Matheo!");

        // Sin decoración
        System.out.println("Mensaje original: " + mensaje.mostrar());

        // Decorador 1: Mayúsculas
        Mensaje mensajeMayus = new MayusculasDecorador(mensaje);
        System.out.println("Mensaje en mayúsculas: " + mensajeMayus.mostrar());

        // Decorador 2: Emojis
        Mensaje mensajeEmojis = new EmojisDecorador(mensajeMayus);
        System.out.println("Mensaje con emojis: " + mensajeEmojis.mostrar());

        // Decorador 3: Marco
        Mensaje mensajeMarco = new MarcoDecorador(mensajeEmojis);
        System.out.println("mensaje con marco:");
        System.out.println( mensajeMarco.mostrar());
    }
}
