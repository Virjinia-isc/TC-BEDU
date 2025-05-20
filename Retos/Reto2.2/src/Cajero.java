import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        var saldo = 1000.0;
        int opcion;

        //Repetir menú
        do {
            //Menu de opciones
            System.out.println("\n Bienvenido al cajero🏧");
            System.out.println("1.----Consultar saldo");
            System.out.println("2.----Depositar dinero");
            System.out.println("3.----Retirar dinero");
            System.out.println("4.----Salir");
            System.out.println("\n Elije una opción");

            opcion = scanner.nextInt();//Elije opción seleccionada

            switch (opcion) {
                case 1 -> {

                    System.out.println("Tu saldo actual es de: $" + saldo);
                }
                case 2 -> {
                    System.out.println("Ingresa el monto a depositar: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("Por favor, ingresa una cantidad mayor a 0.");
                        continue;
                    }
                    saldo += deposito;
                    System.out.println("✅ Deposito realizado satisfactoriamente \nSu saldo actual es de: $" + saldo);
                }
                case 3 -> {
                    System.out.println("Ingresa el monto que deseas retirar");
                    double retiro = scanner.nextDouble();

                    if (retiro <= 0) {
                        System.out.println("Por favor, ingresa un monto válido");
                        continue;
                    }

                    if (retiro > saldo) {
                        System.out.println("❌ No cuentas con la cantidad ingresada \n tu saldo es de: $" + saldo);
                    } else {
                        saldo -= retiro;
                        System.out.println("Dinero retirado exitosamente \nSu saldo actua es de: $" + saldo);
                    }
                }
                case 4 -> {
                    System.out.println("Gracias por usar el cajero automático");
                }
                default -> {
                    System.out.println("Selecciona una opción válida");
                }
            }
        } while (opcion != 4);
        scanner.close();
    }
}