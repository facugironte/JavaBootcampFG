import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una oración (no puede estar vacía): ");
        String oracion = scanner.nextLine();

        ArrayList repetidas = new ArrayList<String>();
        ArrayList unicas = new ArrayList<String>();
        ArrayList palabras = new ArrayList<>(Arrays.asList(oracion.split(" ")));
        ArrayList letras = new ArrayList<Character>();

        for (Object palabra : palabras){
            if (!unicas.contains(palabra)){
                unicas.add(palabra);
            } else{
                repetidas.add(palabra);
            }
        }

        Collections.sort(palabras);

        for (char letra : oracion.toCharArray()){
            if (letra != ' '){
                letras.add(letra);
            }
        }
        Collections.sort(letras);

        System.out.println("Palabras: " + palabras.size());
        if (repetidas.size() > 0 ){
            System.out.println("Se repiten palabras.");
        } else {
            System.out.println("No se repiten palabras");
        }
        System.out.println("Palabras ordenadas: " + palabras);
        System.out.println(letras);


    }
}