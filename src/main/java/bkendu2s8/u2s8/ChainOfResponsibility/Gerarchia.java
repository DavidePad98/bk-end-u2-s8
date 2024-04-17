package bkendu2s8.u2s8.ChainOfResponsibility;

public enum Gerarchia {
     GENERALE(5000, null), TENENTE(1000,  "CAPITANO"),CAPITANO(2000, "MAGGIORE"), MAGGIORE(3000,"COLONNELLO"), COLONNELLO(4000, "GENERALE"), ;

    private final int stipendio;
    private final String responsabile;

    Gerarchia(int stipendio,  String responsabile) {
        this.stipendio = stipendio;
        this.responsabile = responsabile;
    }
}
