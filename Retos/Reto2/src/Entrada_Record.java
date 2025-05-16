public record Entrada_Record(String evento, double precioEntrada){
    public void mostrarInformacion() {
        System.out.println("Evento: " + evento + " | Precio: $" + precioEntrada);
    }
}
