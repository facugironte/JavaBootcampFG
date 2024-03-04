package desafio2;

public class VoladorContrato implements Volador{
    @Override
    public void solicitarAterrizaje() {
        System.out.println(this.toString() + ": Aterrizaje aprobado. Pista 1.");
    }
}
