package bkendu2s8.u2s8.Composite;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Sezioni implements Functions {
    private String nome;
    private List<Functions> elementi;

    public Sezioni(String nome) {
        this.nome = nome;
        this.elementi = new ArrayList<>();
    }

    public void aggiungiElemento(Object elemento) {
        elementi.add((Functions) elemento);
    }

    public int numeroPagine() {
        int numPagine = 0;
        for (Object elemento : elementi) {
            if (elemento instanceof Pagine) {
                numPagine++;
            } else if (elemento instanceof Sezioni) {
                numPagine += ((Sezioni) elemento).numeroPagine();
            }
        }
        return numPagine;
    }
}
