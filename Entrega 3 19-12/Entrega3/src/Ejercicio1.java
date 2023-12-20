import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        String usuarioCorrecto = "facu";
        String contraseñaCorrecta = "123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese usuario: ");
        String usuarioIngresado = scanner.next();

        System.out.print("Ingrese contraseña: ");
        String contraseñaIngresada = scanner.next();

        if ((usuarioCorrecto.equals(usuarioIngresado)) && (contraseñaIngresada.equals(contraseñaCorrecta))){
            System.out.println("Bienvenido al sistema!");
        } else {
            System.out.println("Credenciales incorrectas.");
        }

    }
}