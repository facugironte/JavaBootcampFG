package desafio1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppAlumnos {

    private Scanner scanner;
    private static ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    public void crearAlumnos(int cargas){
        scanner = new Scanner(System.in);

        for(int i = 0; i < cargas; i++){
            nuevoAlumno();
        }
    }

    private void nuevoAlumno(){
        String nombre = solicitarNombre();
        String apellido = solicitarApellido();
        int nroExamen = solicitarNroExamen();
        float nota = solicitarNota();

        Alumno alumno = new Alumno(nombre, apellido, nota, nroExamen);

        alumnos.add(alumno);

    }

    private int solicitarNroExamen() {
        System.out.print("Ingrese nro. examen: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Por favor, ingrese un número entero válido.");
            System.out.print("Ingrese nro. examen: ");
            scanner.next();
        }
        int nroEx = scanner.nextInt();
        scanner.nextLine();
        return nroEx;
    }
    private String solicitarApellido() {
        System.out.print("Ingrese el apellido del alumno: ");
        return scanner.nextLine();
    }
    private String solicitarNombre() {
        System.out.print("Ingrese el nombre del alumno: ");
        return scanner.nextLine();

    }
    private float solicitarNota() {

        float nota;
        do {
            System.out.print("Ingrese su nota (debe estar entre 0 y 10): ");
            while (!scanner.hasNextFloat()) {
                System.out.println("Por favor, ingrese un número flotante válido para la nota.");
                System.out.print("Ingrese su nota (debe estar entre 0 y 10): ");
                scanner.next();
            }
            nota = scanner.nextFloat();
            scanner.nextLine();

            if (nota < 0 || nota > 10) {
                System.out.println("La nota ingresada no está en el rango válido (debe estar entre 0 y 10).");
            }
        } while (nota < 0 || nota > 10);

        return nota;
    }

    public void mostrarAlumnos() {
        mostrarNotaMasAlta();
        mostrarNotaMasBaja();
        mostrarAlumnosPromocionaron();
        mostrarAlumnosNoPromocionaron();
    }

    private void mostrarAlumnosPromocionaron() {
        float promociona = 7;
        System.out.println("Los alumnos que promocionaron son: ");
        for(Alumno al: alumnos){
            if(al.getNota() >= promociona){
                System.out.println("- " + al.getNombre() + " " + al.getApellido() + ": " + al.getNota());
            }
        }
    }

    private void mostrarAlumnosNoPromocionaron() {
        float promociona = 7;
        System.out.println("Los alumnos que no promocionaron son: ");
        for(Alumno al: alumnos){
            if(al.getNota() < promociona){
                System.out.println("- " + al.getNombre() + " " + al.getApellido() + ": " + al.getNota());
            }
        }
    }

    private void mostrarNotaMasAlta() {
        float notaMasAlta = 0;

        ArrayList<Alumno> alumnosAlta = new ArrayList<Alumno>();

        for(Alumno al: alumnos){
            float nota = al.getNota();
            if(nota > notaMasAlta){
                notaMasAlta = nota;
                alumnosAlta.clear();
                alumnosAlta.add(al);
            } else if (notaMasAlta == al.getNota()){
                alumnosAlta.add(al);
            }
        }
        System.out.println("Los alumnos con nota más alta son: ");
        for(Alumno al: alumnosAlta){
            System.out.println("- " + al.getNombre() + " " + al.getApellido() + ": " + al.getNota());
        }

    }

    private void mostrarNotaMasBaja() {
        float notaMasBaja = 10;

        ArrayList<Alumno> alumnosBaja = new ArrayList<Alumno>();

        for(Alumno al: alumnos){
            float nota = al.getNota();
            if(nota < notaMasBaja){
                notaMasBaja = nota;
                alumnosBaja.clear();
                alumnosBaja.add(al);
            } else if (notaMasBaja == al.getNota()){
                alumnosBaja.add(al);
            }
        }
        System.out.println("Los alumnos con nota más baja son: ");
        for(Alumno al: alumnosBaja){
            System.out.println("- " + al.getNombre() + " " + al.getApellido() + ": " + al.getNota());
        }

    }

}
