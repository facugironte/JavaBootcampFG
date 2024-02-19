import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        float unNumero;
        float dosNumero;
        float resultado;
        String operacion;
        String[] operaciones = {"+", "-", "*", "/", "%"};

        while (true) {
            System.out.print("Ingrese un número: ");
            try {
                unNumero = scanner.nextFloat();
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Ingreso inválido.");
                scanner.next();
            }
        }

        while (true) {
            System.out.print("Ingrese otro número: ");
            try {
                dosNumero = scanner.nextFloat();
                break;
            } catch (InputMismatchException exception) {
                System.out.println("Ingreso inválido.");
                scanner.next();
            }
        }

        while (true){
            System.out.print("Ingrese una operación [+, -, *, /, %]: ");
            operacion = scanner.next();

            boolean esOperacion = false;

            for(String op: operaciones){
                if(operacion.equals(op)){
                    esOperacion = true;
                    break;
                }
            }
            if (!esOperacion){
                System.out.println("No ingreso una operación, intentelo nuevamente.");
            } else{
                break;
            }
        }

        switch (operacion) {
            case "+":
                resultado = unNumero + dosNumero;
                System.out.println(resultado);
                break;
            case "-":
                resultado = unNumero - dosNumero;
                System.out.println(resultado);
                break;
            case "*":
                resultado = unNumero * dosNumero;
                System.out.println(resultado);
                break;
            case "/":
                if (dosNumero != 0) {
                    resultado = unNumero / dosNumero;
                    System.out.println(resultado);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            case "%":
                resultado = unNumero % dosNumero;
                System.out.println(resultado);
                break;
            default:

        }


    }
}