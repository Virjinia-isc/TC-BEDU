package hospital;

import java.sql.SQLOutput;

public class Paciente {
    String nombrePaciente;
    int edad;
    String numeroExpediente;

    public void mostrarInf(){
        System.out.println("Informacion del paciente");
        System.out.println("Paciente: " + nombrePaciente);
        System.out.println("Edad: " + edad);
        System.out.println("Expediente: " + numeroExpediente);
    }

}
