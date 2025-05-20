public class Main {
    public static void main(String[] args){

        Pasajero pasajero = new Pasajero ("Ana Martinez", "P543795");

        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        boolean reservado = vuelo.reservarAsiento(pasajero);
        if (reservado){
            System.out.println("Reserva realizada satisfactoriamente.\n");
        } else {
            System.out.println("No se pudo realizar la reserva.\n");
        }

        System.out.println(vuelo.obtenerItinerario());

        //Cancelar reserva
        System.out.println("Cancelando reserva...\n");
        vuelo.cancelarReserva();

        //Mostrar itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        //Realizar nueva reservación
        vuelo.reservarAsiento("Mario Gonzalez", "P543795");
        System.out.println(vuelo.obtenerItinerario());
    }
}