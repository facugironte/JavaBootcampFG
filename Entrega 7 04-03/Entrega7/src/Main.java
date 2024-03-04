import desafio1.AppAlumnos;
import desafio2.*;
import desafio3.CollectionCustom;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //Test desafio 1
        /*AppAlumnos app = new AppAlumnos();

        app.crearAlumnos(2);
        app.mostrarAlumnos();*/

        //Test desafio 2
        /*ArrayList<Volador> voladores = new ArrayList<Volador>();

        voladores.add(new VoladorContrato());
        voladores.add(new VoladorSinContrato());
        voladores.add(new VoladorSinContrato());
        voladores.add(new VoladorContrato());

        for(Volador v: voladores){
            v.solicitarAterrizaje();
        }*/

        //Test desafio 3

        CollectionCustom<Integer> customCollection = new CollectionCustom<>();


        customCollection.addFirst(1);
        customCollection.addLast(2);
        customCollection.add(3);
        System.out.println("Size: " + customCollection.size());

        int removed = customCollection.remove(2);
        System.out.println("Size despues de remover: " + customCollection.size());


        customCollection.add(1);
        customCollection.add(1);
        customCollection.add(1);
        customCollection.add(1);
        customCollection.removeAll();
        System.out.println("Size despues de vaciar: " + customCollection.size());


        System.out.println(customCollection.empty());





    }
}