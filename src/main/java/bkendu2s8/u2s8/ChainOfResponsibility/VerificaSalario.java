package bkendu2s8.u2s8.ChainOfResponsibility;

public class VerificaSalario extends CheckStipendio{
    @Override
    public void check(Ufficiali u) {
        if (u.getRuolo().equals("TENENTE")){
            this.nextCheck(u);
        } else {
            System.err.println("Riservato agli admin!");
        }
    }
}
