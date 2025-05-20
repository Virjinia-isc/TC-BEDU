//Importar paquete java.util
//Scanner para leer datos ingresados por el usuario

import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Solicitamos datos
        System.out.println("Nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.println("Precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.println("Cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        //Calculamos total
        double totalSinDesc=precioUnitario * cantidad;

        //Aplicación de descuento?
        var aplicaDesc = totalSinDesc > 500;
        double descuento = aplicaDesc ? totalSinDesc * 0.15 : 0;

        //Total
        double totalConDesc = totalSinDesc - descuento;

        //Mostrar
        System.out.println("\n Resumen de compra: ");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Total sin descuento: $" + totalSinDesc);
        System.out.println("¿Aplica descuento?: " + aplicaDesc);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDesc);

        scanner.close();

    }
}
