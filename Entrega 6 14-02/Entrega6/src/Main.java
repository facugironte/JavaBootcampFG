import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float unNumero;
        float dosNumero;
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

        mostrarResultado(unNumero, dosNumero, operacion);

    }



    public static void mostrarResultado(float numeroUno, float numeroDos, String operacion){
        float resultado;

        switch (operacion) {
            case "+":
                resultado = sumar(numeroUno, numeroDos);
                System.out.println(numeroUno + operacion + numeroDos + " = " + resultado);
                break;
            case "-":
                resultado = restar(numeroUno, numeroDos);
                System.out.println(numeroUno + operacion + numeroDos + " = " + resultado);
                break;
            case "*":
                resultado = multiplicar(numeroUno, numeroDos);
                System.out.println(numeroUno + operacion + numeroDos + " = " + resultado);
                break;
            case "/":
                if (numeroDos != 0) {
                    resultado = dividir(numeroUno, numeroDos);
                    System.out.println(numeroUno + operacion + numeroDos + " = " + resultado);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
                break;
            case "%":
                resultado = resto(numeroUno, numeroDos);
                System.out.println(numeroUno + operacion + numeroDos + " = " + resultado);
                break;
        }
    }

    public static float dividir(float numeroUno, float numeroDos){
        return numeroUno/numeroDos;
    }

    public static float sumar(float numeroUno, float numeroDos){
        return numeroUno+numeroDos;
    }

    public static float restar(float numeroUno, float numeroDos){
        return numeroUno-numeroDos;
    }

    public static float multiplicar(float numeroUno, float numeroDos){
        return numeroUno*numeroDos;
    }

    public static float resto(float numeroUno, float numeroDos){
        return numeroUno%numeroDos;
    }
}