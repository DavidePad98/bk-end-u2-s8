package bkendu2s8.u2s8.Composite;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private String titolo;
    private List<String> autori;
    private double prezzo;
    private List<Object> contenuti;

    public Libro(String titolo, List<String> autori, double prezzo) {
        this.titolo = titolo;
        this.autori = autori;
        this.prezzo = prezzo;
        this.contenuti = new ArrayList<>();
    }

    public void aggiungiContenuto(Object contenuto) {
        contenuti.add(contenuto);
    }

    public int numeroPagine() {
        int numPagine = 0;
        for (Object contenuto : contenuti) {
            if (contenuto instanceof Pagine) {
                numPagine++;
            } else if (contenuto instanceof Sezioni) {
                numPagine += ((Sezioni) contenuto).numeroPagine();
            }
        }
        return numPagine;
    }
}
