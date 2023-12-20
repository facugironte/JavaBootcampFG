import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tiempo: ");
        String tiempo = scanner.next();

        System.out.print("Ingrese la temperatura: ");
        int temp = scanner.nextInt();

        if (tiempo.equals("Soleado")){
            if (temp <= 15){
                System.out.println("Caminar y tomar sol.");
            } else if (temp > 15 && temp <= 25){
                System.out.println("Caminar.");
            } else {
                System.out.println("Caminar con campera.");
            }
        } else if (tiempo.equals("Lluvia") && (temp <10)){
            System.out.println("Quedarse en casa o salir con paraguas y campera.");
        } else if (tiempo.equals("Nieve") && (temp <10)){
            System.out.println("Esquiar.");
        } else {
            System.out.println("No hay actividades para realizar.");
        }
    }
}
