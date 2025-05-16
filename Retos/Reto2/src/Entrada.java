public class Entrada {
    String evento;
    double precioEntrada;


    public Entrada(String evento, double precioEntrada) {
        this.evento = evento;
        this.precioEntrada = precioEntrada;
    }

    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precioEntrada);
    }
}