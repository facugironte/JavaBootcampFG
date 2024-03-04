package desafio2;

import java.util.Scanner;

public class VoladorSinContrato implements Volador{

    private Scanner scanner = new Scanner(System.in);

    @Override
    public void solicitarAterrizaje() {
        String respuesta;
        do {
            System.out.print("Ingrese 'SI' o 'NO' para aprobar o no el aterrizaje: ");
            respuesta = scanner.nextLine().toUpperCase();
        } while (!respuesta.equals("SI") && !respuesta.equals("NO"));

        if(respuesta.equals("SI")){
            System.out.println(this.toString() + ": Aterrizaje aprobado: Pista 2.");
        } else {
            System.out.println(this.toString() + ": Aterrizaje NO aprobado.");
        }

    }
}
