import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int total = 0;
        int min = 0;
        int max = 0;
        int ingreso;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese un número entero (0 para terminar): ");
            ingreso = scanner.nextInt();
            if (ingreso != 0){
                total += ingreso;
                if (ingreso < min || min == 0){
                    min = ingreso;
                }
                if (ingreso > max || max == 0){
                    max = ingreso;
                }
            } else {
                break;
            }
        }

        if(min == 0 && max == 0){
            System.out.println("No se ingresaron valores enteros distintos de 0.");
        } else {
            System.out.println("El total es: " + total);
            System.out.println("El mayor es: " + max);
            System.out.println("El menor es: " + min);
        }
    }
}