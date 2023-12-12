public class Ejercicio3 {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 20;
        int n3 = 30;

        int total = n1+n2+n3; /*Pide el "total", no aclara, se entiende que es la suma de los 3*/
        int promedio = total / 3;
        float reston1n2 = n2%n1;


        System.out.println("a) " + total);
        System.out.println("b) " + promedio);
        System.out.println("c) " + reston1n2);

    }
}
