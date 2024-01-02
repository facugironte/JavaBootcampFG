import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una oración: ");
        String oracion = scanner.nextLine();

        Map<Character, Integer> caracteres = new HashMap<>();

        for (char c : oracion.toCharArray() ){
            if (c!=' '){
                caracteres.put(c, caracteres.getOrDefault(c, 0) + 1);
            }
        }

        int maxValue = 0;
        char caracter = ' ';

        for(Map.Entry<Character, Integer> entry : caracteres.entrySet()){
            if (entry.getValue() > maxValue){
                maxValue = entry.getValue();
                caracter = entry.getKey();
            }
        }

        System.out.println("El caracter más repetido es '" + caracter + "' con " + maxValue + " aparicion(es).");
    }
}
