import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese cantidad de horas: ");
        int horasIngresadas = scanner.nextInt();

        int horasSemana = 7*24;
        int horasDia = 24;

        int semanas = 0;
        int dias = 0;
        int horas = 0;

        while (horasIngresadas >= horasSemana){
            semanas += 1;
            horasIngresadas -= horasSemana;
        }

        while (horasIngresadas >= horasDia){
            dias += 1;
            horasIngresadas -= horasDia;
        }

        if (horasIngresadas > 0){
            horas = horasIngresadas;
        }

        System.out.println("Semanas: " + semanas);
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);


    }
}