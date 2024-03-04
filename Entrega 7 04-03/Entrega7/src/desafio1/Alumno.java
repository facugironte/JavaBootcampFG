package desafio1;

public class Alumno {
    private String nombre;
    private String apellido;
    private float nota;
    private int numeroExamen;


    public Alumno(String nombre, String apellido, float nota, int numeroExamen){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
        this.numeroExamen = numeroExamen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getNota() {
        return nota;
    }

    public int getNumeroExamen() {
        return numeroExamen;
    }


}
